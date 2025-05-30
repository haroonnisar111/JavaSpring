package com.example.demo;

import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);}

		@Bean
		public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
      return runner->{
      // createStudent(studentDAO);
      // createMultipleStudents(studentDAO);
		  getStudentById(studentDAO);
		};
	}

	private void getStudentById(StudentDAO studentDAO) {
		Student st=studentDAO.findbyId(1);
		System.out.println(st);
	}

	private void createStudent(StudentDAO studentDAO) {
		Student student=new Student("haroon","nisar","haroon@gmail.com");
		studentDAO.save(student);
		System.out.println("saved student id: "  + student.getId());
	}
	public  void  createMultipleStudents(StudentDAO studentDAO){
		Student student1=new Student("ulfat","auyooob","ulfat@gmail.com");
		Student student2=new Student("sharaf","sh","sharaf@gmail.com");
		Student student3=new Student("jahan","shafaq","jahan@gmail.com");
		studentDAO.save(student1);
		studentDAO.save(student2);
		studentDAO.save(student3);

		System.out.println("saved student id: "  + student1.getId());
		System.out.println("saved student id: "  + student2.getId());
		System.out.println("saved student id: "  + student3.getId());



	}

}
