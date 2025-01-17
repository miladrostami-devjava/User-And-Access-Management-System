package com.advancedjavacode;

import com.advancedjavacode.mainproject.ams.AccessManagementSystem;
import com.advancedjavacode.mainproject.entities.Group;
import com.advancedjavacode.mainproject.entities.User;

import java.util.Collections;

public class MainApp
{
    public static void main(String[] args) {


        AccessManagementSystem system = new AccessManagementSystem();

        User user1 = new User(1,"milad rostami","miladrostami24@gamil.com");
        User user2 = new User(2,"reza zare","zarereza@gamil.com");
        User user3 = new User(3,"ali zare","zarereza@gamil.com", Collections.singleton("admin"));



system.addUser(user1);
system.addUser(user2);
system.addUser(user3);

        Group group1 = new Group(101,"javaDev group");
        Group group2 = new Group(101,"Js group");
        Group group3 = new Group(103,"sql group");

        system.createGroup(group1);
        system.createGroup(group2);
        system.createGroup(group3);




        system.addUserToGroup(user1,group1);
        system.addUserToGroup(user1, group2);
        system.addUserToGroup(user2,group2);
        system.addUserToGroup(user3,group3);


        system.printUsers();
        system.printGroups();


    }

}
