package entity;

import lombok.Data;

@Data
public class Customer {
    private int id;
    private String account;
    private String password;
    private String phone;
}
