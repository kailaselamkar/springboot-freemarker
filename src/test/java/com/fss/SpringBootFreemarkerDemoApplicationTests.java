package com.fss;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fss.controller.HelloController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.validation.support.BindingAwareConcurrentModel;

@SpringBootTest
class SpringBootFreemarkerDemoApplicationTests {

	@Autowired
	private HelloController helloController;

	@Test
	void testSayHello() {
		
		assertEquals("hello", helloController.hello(new BindingAwareConcurrentModel(), "Kailas"));
	}

	@Test
	void testSayHello2() {
		
		assertEquals("hello", helloController.hello(new BindingAwareConcurrentModel(), "Kailas"));
	}


}
