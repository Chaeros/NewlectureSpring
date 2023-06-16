package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;

//<context:component-scan base-package="spring.di.ui, spring.di.entity"/> 역할
@ComponentScan("spring.di.ui")
//setting.xml 과 같은 환경설정을 위한 클래스임을 나타냄
@Configuration
public class NewlecDIConfig {
	
	@Bean
	public Exam exam() {
		return new NewlecExam();
	}
	
}
