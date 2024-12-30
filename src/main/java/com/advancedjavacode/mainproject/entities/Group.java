package com.advancedjavacode.mainproject.entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Group
{


    private final int groupId;
    private final String groupName;
    private  Set<User> members ;


    public Group(int groupId, String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
    }


    public Group(int groupId, String groupName, Set<User> members) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.members = members != null ? members : new HashSet<>();
    }






    public int getGroupId() {
        return groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public Set<User> getMembers() {
        return members;
    }
    public void addMember(User user){
        if (members == null){
            members = new HashSet<>();
        }

        members.add(user);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return groupId == group.groupId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(groupId);
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", members=" + members +
                '}';
    }


}
