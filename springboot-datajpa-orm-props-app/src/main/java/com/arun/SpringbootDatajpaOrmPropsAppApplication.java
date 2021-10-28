package com.arun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.arun.entity.ResourceDtls;
import com.arun.repository.ResourceDtlsRepository;


@SpringBootApplication
public class SpringbootDatajpaOrmPropsAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootDatajpaOrmPropsAppApplication.class, args);
		ResourceDtlsRepository resourceDtlsRepository=context.getBean(ResourceDtlsRepository.class);
		ResourceDtls resource=new ResourceDtls();
		//resource.setResourceId(103);
		resource.setResourceName("dhoni");
		resource.setResourceSkills("java");
		resource.setResourceExp("5 years");
		
		ResourceDtls resource1= new ResourceDtls();
		resource1.setResourceName("yuvaraj");
		resource1.setResourceSkills("java");
		resource1.setResourceExp("5 years");
		
		resourceDtlsRepository.save(resource);
		resourceDtlsRepository.save(resource1);
		
		if(resource!=null || resource1!=null)
		{
			System.out.println("Record Saved....");
		}
		else
		{
			System.out.println("Record not saved");
		}
		
	}

}
