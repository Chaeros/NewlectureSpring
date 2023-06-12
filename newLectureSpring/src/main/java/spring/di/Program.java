package spring.di;

import spring.di.entity.*;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {
		public static void main(String[] args) {
			Exam exam=new NewlecExam();
			ExamConsole console = new InlineExamConsole(exam);  // exam 객체를 DI 하고있다.
			//ExamConsole console = new GridExamConsole(exam);
			console.print();
		}
}
