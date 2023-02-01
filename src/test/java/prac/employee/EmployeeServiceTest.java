package prac.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

public class EmployeeServiceTest {

    private EmployeeMapper mapper;

    @Test
    void selectEmployee () {

        System.out.println(mapper.getTime());
    }
}
