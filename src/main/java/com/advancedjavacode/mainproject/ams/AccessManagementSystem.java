package com.advancedjavacode.mainproject.ams;

import com.advancedjavacode.mainproject.entities.Group;
import com.advancedjavacode.mainproject.entities.User;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AccessManagementSystem {
    private final Set<User> users = new HashSet<>();
    private final Map<Group, Set<User>> groupsMemberships = new HashMap<>();


    public void addUser(User user) {
        if (!users.add(user)) {
            System.out.println("already added user!!! " + " " + user);
        }
    }


    public void createGroup(Group group) {
        groupsMemberships.putIfAbsent(group, new HashSet<>());
    }

    public void addUserToGroup(User user, Group group) {
        Set<User> members = groupsMemberships.get(group);
        if (members == null) {
            System.out.println("group does not exists!!! " + " " + group.getGroupName());
        }
        if (!members.add(user)) {

            System.out.println("user already added to group!!" + " " + user);
        }
    }


    public void printUsers() {
        System.out.println("All Users added :");
        users.forEach(System.out::println);
    }

    public void printGroups() {
        System.out.println("All Groups added :");
        groupsMemberships.forEach((group, members) -> {
            System.out.println(group);
            members.forEach(member -> System.out.println(" " + member));
        });
    }




}
