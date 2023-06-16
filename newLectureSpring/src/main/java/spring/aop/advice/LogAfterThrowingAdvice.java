package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

// ThrowsAdvice는 다른 것들과 달리 어떤예외가 발생하느냐에 따라 함수 인자가 달라지기때문에 구현해야할 추상 메소드가 없다.
public class LogAfterThrowingAdvice implements ThrowsAdvice{
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		System.out.println("예외가 발생하였습니다.: " +e.getMessage());
	}
}
