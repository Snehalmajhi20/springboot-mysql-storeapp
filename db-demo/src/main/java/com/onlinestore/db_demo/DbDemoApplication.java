package com.onlinestore.db_demo;

import java.lang.foreign.ValueLayout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.onlinestore.db_demo.entity.StoreInformation;
import com.onlinestore.db_demo.repository.StoreInformationRepository;

@SpringBootApplication
public class DbDemoApplication implements CommandLineRunner{

	@Autowired
	StoreInformationRepository storeInformationRepository;
	public static void main(String[] args) {
		SpringApplication.run(DbDemoApplication.class, args);
	}
	@Override
	public void run(String...args) {
		StoreInformation storeInformationOne = new StoreInformation(
				"Amazon", "All clothes are avaibles", "7894566");
		StoreInformation storeInformationTwo = new StoreInformation(
				"Flipkart", "All type of books are avaibles", "154789");
		StoreInformation storeInformationThree = new StoreInformation(
				"Meesho", "All value for money items are avaibles", "15444444");
		StoreInformation storeInformationFour = new StoreInformation(
				"Myntra", "All types of fashion are avaibles", "59845685");
		storeInformationRepository.save(storeInformationOne);
		storeInformationRepository.save(storeInformationTwo);
		storeInformationRepository.save(storeInformationThree);
		storeInformationRepository.save(storeInformationFour);

		storeInformationRepository.findByStoreName("Amazon").forEach(System.out::println);
		storeInformationRepository.findByStoreDetail("All types of fashion are avaibles").forEach(System.out::println);
		storeInformationRepository.findByStorePhoneNumber("154789").forEach(System.out::println);
		storeInformationRepository.findById(2).ifPresent(System.out::println);
		System.out.println(storeInformationRepository.count());

	}

}
