package com;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.MessageService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MessageServiceTest {
	MessageService ms = new MessageService();
	
	@Test
	public void testMessage() {
		System.out.println("hello");
		Assertions.assertEquals(ms.sayHello(), "hello");
	}
	
	@Test
	public void testLength() {
		Assertions.assertEquals(6,ms.calculteLength());
	}
	
	@Test
	public void testSurName() {
		Assertions.assertEquals("Kaulage",ms.getSurName());
	}
	
	@Test
	public void testHelloName() {
		Assertions.assertEquals("Hello Prasad",ms.sayHelloPrasad());
	}
	
	@Test
	public void testDate() {
		Assertions.assertEquals("09/22/2020",ms.getDate());
	}
	
}

