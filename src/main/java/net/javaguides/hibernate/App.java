package net.javaguides.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		
		SpringApplication.run(App.class, args);
		//StudentDao studentDao = new StudentDao();

		// Student s = new Student("Remesh", "Fadare", "rameshfad@gmail.com");

		// save
		// studentDao.saveStudent(s);

		// get
		// List<Student> student=studentDao.getStudent();
		//
		// for(Student s1:student){
		// System.out.println(s1);
		// }

		// delete
		// for(Student s1:student){
		// studentDao.delect(s1);
		// }

		// getById
		// Student student1=studentDao.getStudentById(6);

		// update
		// student1.setEmail("heinhtetaungcu@gmail.com");
		// studentDao.update(student1);

		/**************** HQL **********************/

		// studentDao.updateStudent(student1);
		// studentDao.deleteStudent(8);

		// System.out.println(studentDao.getStudent(6));

	}
}
