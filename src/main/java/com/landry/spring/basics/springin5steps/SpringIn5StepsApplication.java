package com.landry.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {

		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		//int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		///System.out.println(result);

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		applicationContext.getBean(BinarySearchImpl.class);
	}

}
