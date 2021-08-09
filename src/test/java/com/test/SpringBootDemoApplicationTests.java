package com.test;

import com.test.controller.PrimeNumberController;
import com.test.model.Data;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {

	@Test
	public void contextLoads() {
	}
	@InjectMocks
PrimeNumberController primeNumberController;
	@Test
	public void test() {
		ResponseEntity<Data> testData=primeNumberController.getPrime(10);
			Assert.notNull(testData);
	}

}
