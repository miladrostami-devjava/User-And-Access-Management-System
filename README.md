# User And Access Management System
## Description:

In this project, you will create a system for managing users, groups, and permissions. Each user can be added to different groups and have specific permissions.


## project Goal
The ultimate goal of this project:

The == function for comparing two objects in Java
The equals method function in the String class
The equals method function in the Object class


## Concepts covered:
Implement equals and hashCode for the User, Group, and Permission classes.
Use HashSet and HashMap to manage users and permissions.
Review the use of hashCode and hash code collisions.




## Class structure:
### User class:

Fields: id, username, email, roles.
Implement equals and hashCode based on id and username.


### Group class:

Fields: groupId, groupName, members.
Implement equals and hashCode based on groupId.

### Permission class:

Fields: permissionId, permissionName.
Implement equals and hashCode based on permissionId.


### Implementation tips:
####  Manage user access:
Store users in HashSet<User>.
Maintain related groups and users in HashMap<Group, HashSet<User>>.
Examine the behavior of equals and hashCode when adding users or permissions.


### Objective:
Test the performance of classes when storing in HashSet and searching in HashMap.
Understand how to use equals and hashCode to prevent duplicate addition of users or permissions.