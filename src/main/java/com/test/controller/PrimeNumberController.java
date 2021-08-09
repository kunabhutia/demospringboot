package com.test.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import com.test.model.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeNumberController {
	
	@RequestMapping("/{id}")
    public ResponseEntity<Data> getPrime(@PathVariable("id") int id)
    {
    	Data data=new Data();
		data.setInitial(id);
		List<Integer> collect = new ArrayList<>();
		for (int i = 0; i < id; i++) {
			if (isPrime(i)) {
				collect.add(i);
			}
		}
		data.setPrimes(collect.toString());
		return ResponseEntity.ok(data);
    }
	public static boolean isPrime(int number) {

		if (number <= 1) return false; // 1 is not prime and also not composite

		return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
	}
}
