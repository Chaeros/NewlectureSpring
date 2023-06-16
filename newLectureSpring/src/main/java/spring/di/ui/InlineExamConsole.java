package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component("console")
public class InlineExamConsole implements ExamConsole {
	
	@Autowired
	/* @Autowired(required=false) */
	/* @Qualifier("exam2") */
	private Exam exam;
	
	public InlineExamConsole() {
		System.out.println("constructor");
	}
	
	public InlineExamConsole(Exam exam) {
		System.out.println("overloaded constructor");
		this.exam = exam;
	}

	@Override
	public void print() {
		if(exam==null)
			System.out.printf("total is %d, avg is %f\n", 0, 0.0);
		else
			System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
	}

	//@Autowired를 통해 스프링에서 해당 객체가 컨테이너에 있는지 확인하고 있으면 자동 주입해준다.
	//단 xml에 context 네임스페이스 추가와 Autowired 어노테이션에 대응되는 객체가 있는지 확인하라는 구문을 추가해야한다.
	@Override
	public void setExam(Exam exam) {
		System.out.println("setter injection");
		this.exam = exam;
	}
}
