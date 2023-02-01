package prac.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import prac.employee.EmployeeMapper;
import prac.employee.EmployeeService;

@SpringBootApplication
public class StartApplication {

	public static void main(String[] args) {

		//SpringApplication.run(StartApplication.class, args);

		EmployeeService service = new EmployeeService();
		System.out.println(service.selectToday());
	}

}
