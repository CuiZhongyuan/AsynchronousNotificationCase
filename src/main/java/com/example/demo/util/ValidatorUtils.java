package com.example.demo.util;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.groups.Default;
import java.util.Iterator;
import java.util.Set;

public class ValidatorUtils {
    private static Validator validator;

    public ValidatorUtils() {
    }

    public static void setValidator(Validator validator) {
        if (validator == null) {
            throw new IllegalArgumentException("validator can not be null");
        }
        ValidatorUtils.validator = validator;
    }

    public static void initDefaultValidator() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    public static void validateWithThrowException(Object data, Class<?>... groups) throws IllegalArgumentException {
        Set<ConstraintViolation<Object>> violations = validator.validate(data, groups);
        if (violations != null && !violations.isEmpty()) {
            StringBuilder message = new StringBuilder();
            Iterator var4 = violations.iterator();

            while(var4.hasNext()) {
                ConstraintViolation<Object> violation = (ConstraintViolation)var4.next();
                message.append(violation.getMessage() + ", ");
            }

            message.delete(message.length() - 2, message.length());
            throw new IllegalArgumentException(message.toString());
        }
    }

    public static void validateWithThrowException(Object data) throws IllegalArgumentException {
        validateWithThrowException(data, Default.class);
    }
}
