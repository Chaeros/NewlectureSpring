package spring.aop;


import java.lang.reflect.Method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.Proxy;
import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;
import spring.di.NewlecDIConfig;

public class Program {

	public static void main(String[] args) {
		
		//ApplicationContext context = new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/setting.xml");
		
		Exam proxy = (Exam) context.getBean("proxy");
		
		
		/*
		 * Exam exam = new NewlecExam(1,1,1,1);
		 * 
		 * //주입하는 인터페이스에 따라 반환형을 설정한다. 여기서 proxy는 exam과 같은 기능으로 사용, //단, exam과 달리
		 * 로그/트랜잭션 등의 추가 기능이 더 수행된다. //(주입할 객체, 사용할 인터페이스, 위아래 추가할 곁다리 업무를 수행할 핸들러) Exam
		 * proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), new
		 * Class[] {Exam.class}, new InvocationHandler() {
		 * 
		 * @Override public Object invoke(Object proxy, Method method, Object[] args)
		 * throws Throwable {
		 * 
		 * long start=System.currentTimeMillis();
		 * 
		 * //실제 업무를 담당하는 메소드를 불러옴, args는 파라미터 Object result = method.invoke(exam, args);
		 * 
		 * long end=System.currentTimeMillis();
		 * 
		 * String message=(end-start)+"ms 시간이 걸렸습니다.";
		 * 
		 * System.out.println(message);
		 * 
		 * 
		 * return result; }
		 * 
		 * });
		 * 
		 * 
		 * System.out.printf("total is %d\n", exam.total());
		 * System.out.printf("avg is %f\n", exam.avg());
		 */
		
		System.out.printf("total is %d\n", proxy.total());
		System.out.printf("avg is %f\n", proxy.avg());
		
	}

}
