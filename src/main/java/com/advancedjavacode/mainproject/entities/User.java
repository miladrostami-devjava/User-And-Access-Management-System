package com.advancedjavacode.mainproject.entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class User {
    private final int id;
    private final String username;
    private final String email;
   private    Set<String> roles = new HashSet<>();



    public User(int id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }


    public User(int id, String username, String email, Set<String> roles) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles != null ? roles : new HashSet<>();
    }


    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Set<String> getRoles() {
        return roles;
    }



    public void addRole(String role) {
        if (roles == null) {
            roles = new HashSet<>();
        }
        roles.add(role);
    }


    @Override
    public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;
User user = (User) o;
return id == user.id && username.equals(user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", roles=" + roles +
                '}';
    }
}
