package com.ameen.countryServiceBack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CountryServiceBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountryServiceBackApplication.class, args);
	}
	
	//Frontend will communicate here
//	@Bean
//	public WebMvcConfigurer corsConfigurer(){
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry){
//				registry.addMapping("/**");
//			}
//		};
	//}

}
