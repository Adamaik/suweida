package dto.business;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BussinessEmployeeEditDTO {
    private int id;
    private String name;
    private String account;//账号
    private String password;//密码
    private String phoneNumber;
    private String gender;//0是男，1是女
    private int permission;//是超级管理员还是普通员工

}
