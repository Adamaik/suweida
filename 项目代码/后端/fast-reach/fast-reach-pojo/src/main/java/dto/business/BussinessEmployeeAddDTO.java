package dto.business;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BussinessEmployeeAddDTO {
    private int employeeId;
    private String name;
    private String account;//账号
    private String password;//密码
    private String phoneNumber;
    private String gender;//0是男，1是女
    private int permission;//是超级管理员还是普通员工

}
