package prac.start.employee;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    public List<Employee> selectEmployees();

    public String getTime();
}
