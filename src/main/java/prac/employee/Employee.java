package prac.employee;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Getter
@Builder
public class Employee {
    private String empId;       // 사원번호
    private String empName;     // 직원명
    private String empNo;       // 주민번호
    private String email;       // 이메일
    private String phone;       // 전화번호
    private String deptCode;    // 부서코드
    private String jobCode;     // 직급코드
    private String salLevel;    // 급여등급
    private String salary;      // 급여
    private String bonus;       // 보너스율
    private String managerId;   // 관리자사번
    private Date hireDate;      // 입사일
    private Date entDate;       // 퇴사일
    private String entYn;       // 재직여부
}
