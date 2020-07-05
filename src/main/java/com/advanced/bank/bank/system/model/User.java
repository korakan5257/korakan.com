package com.advanced.bank.bank.system.model;

import com.advanced.bank.bank.system.model.enums.UserType;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class User {

    private Long id;

    private UserType userType;

    private Set<Object> accounts;

    private String firstName;

    private String egn;

    private String mobileNumber;

    private List<Objects> addresses;

    private String email;

    private String password;

}
