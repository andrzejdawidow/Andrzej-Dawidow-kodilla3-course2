package com.kodilla3.testing3;

import com.kodilla3.testing3.user.SimpleUser;

public class TestingMain3 {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
