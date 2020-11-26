package com.example.demo;

import org.junit.Test;

import java.time.LocalDateTime;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println(LocalDateTime.now()+"票列表接口");
	}

	private static final String TASK_QUEUE_NAME = "task_queue";

// ​public  void main( ) throws Exception {
//   ​ConnectionFactory factory = new ConnectionFactory();
//   ​factory.setHost("localhost");
//   ​try (Connection connection = factory.newConnection();
//        ​Channel channel = connection.createChannel()) {
//       ​channel.queueDeclare(TASK_QUEUE_NAME, true, false, false, null);
//
//       ​String message = String.join(" ", argv);
//
//       ​channel.basicPublish("", TASK_QUEUE_NAME,
//					​MessageProperties.PERSISTENT_TEXT_PLAIN,
//					​message.getBytes("UTF-8"));
//       ​System.out.println(" [x] Sent '" + message + "'");
//   ​}
// ​}

}
