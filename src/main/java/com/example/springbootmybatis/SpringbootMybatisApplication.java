package com.example.springbootmybatis;

import com.example.springbootmybatis.mapper.CountryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@SpringBootApplication
@Import({TodayConfiguration.class,TomorrowConfiguration.class})
@EnableAutoConfiguration
//@Configuration
public class SpringbootMybatisApplication implements CommandLineRunner {
	@Autowired
	private CountryMapper countryMapper;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("------------countryMapper-------------"+countryMapper);
		countryMapper.selectAll();
	}
}
