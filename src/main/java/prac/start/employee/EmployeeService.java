package prac.start.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper mapper;

    public void selectEmployees () {
        System.out.println(mapper.getTime());
    }

    public String selectToday() {
        return mapper.getTime();
    }
}
