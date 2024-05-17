package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Customer {
    private int id;
    private String name;
    private String phoneNumber;
    private String password;
    private String account;
    private int money;
}
