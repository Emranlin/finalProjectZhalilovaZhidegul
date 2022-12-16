package service.impl;

import enums.Gender;
import model.Book;
import model.User;
import service.UserService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserSeviceImpl implements UserService {
     private List<User>users=new ArrayList<>();
    @Override
    public String createUser(List<User> users) {
        for (User user : users) {
            Long id=new Scanner(System.in).nextLong();
            if(user.getId().equals(id)){
            String userName=new Scanner(System.in).nextLine();
            if(user.getName().equals(userName)){
            String surName=new Scanner(System.in).nextLine();
            if (user.getSurname().equals(surName)){
            String email=new Scanner(System.in).nextLine();
            if(user.getEmail().equals(email)){
            String phoneNUmber=new Scanner(System.in).nextLine();
            if (user.getPhoneNumber().equals(phoneNUmber)) {
                Gender gender = Gender.valueOf(new Scanner(System.in).next());
                if (user.getGender().equals(gender)) {
                    BigDecimal money = new Scanner(System.in).nextBigDecimal();
                    if (user.getMoney().equals(money)) {
                        User user1 = new User(id, userName, surName, email, phoneNUmber, gender, money);
                        users.add(user1);
                    }

                    return "Successful created";
                }
            }

