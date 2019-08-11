package controller;

import controller.base.BaseOut;
import lombok.Data;

@Data
public class User extends BaseOut {
    private String userName;
    private String password;
}
