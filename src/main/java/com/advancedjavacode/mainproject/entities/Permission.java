package com.advancedjavacode.mainproject.entities;

import java.util.Objects;

public class Permission {
    private final int permissionId;
    private final String permissionName;

    public Permission(int permissionId, String permissionName) {
        this.permissionId = permissionId;
        this.permissionName = permissionName;
    }

    public int getPermissionId() {
        return permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Permission that = (Permission) o;
        return permissionId == that.permissionId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(permissionId);
    }

    @Override
    public String toString() {
        return "Permission{" +
                "permissionId=" + permissionId +
                ", permissionName='" + permissionName + '\'' +
                '}';
    }
}
