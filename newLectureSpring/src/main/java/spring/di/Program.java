package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.*;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {
		public static void main(String[] args) {
			//ExamConsole console = new InlineExamConsole(exam);  // exam 객체를 DI 하고있다.
			//ExamConsole console = new GridExamConsole(exam);
			//console.setExam(exam);
			
			ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
			
			Exam exam= context.getBean(Exam.class);
			System.out.println(exam.toString());
			ExamConsole console = (ExamConsole) context.getBean("console");
			//ExamConsole console = context.getBean(ExamConsole.class);
			console.print();
			
			//List<Exam> exams=new ArrayList<>();
			//exams.add(new NewlecExam(1,1,1,1));
			
			List<Exam> exams = (List<Exam>) context.getBean("exams");
			
			for(Exam e:exams)
				System.out.println(e);
		}
}