package com.example.beanlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeanlearnApplication {
	public static void main(String[] args) {
//		Bubblesort bubblesort=new Bubblesort();
//		BinarySearchImpl binarySearch=new BinarySearchImpl(bubblesort);


		ApplicationContext applicationContext=SpringApplication.run(BeanlearnApplication.class, args);
		BinarySearchImpl binarySearch=applicationContext.getBean(BinarySearchImpl.class);
		int x=binarySearch.binarySearch(new int[]{1,2,3},3);
		System.out.println(x);
	}

}
