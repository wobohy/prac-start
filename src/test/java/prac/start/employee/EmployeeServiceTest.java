package prac.start.employee;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    private EmployeeMapper mapper;

    @Test
    @DisplayName("직원 전체 조회")
    void selectEmployee () {
        List<Employee> emplList = mapper.selectEmployees();
        for (Employee employee : emplList) {
            System.out.println(employee);
        }
    }

    @Test
    @DisplayName("DB연결 확인용 현재 시간 조회")
    void selectToday () {
        String today = mapper.getTime();
        System.out.println(today);
    }
}
