package com.rakib.passwordmanager.entity;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class User implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private long uId;
    private long passId;
    private String name;
    private String email;
    private String password;

    public User(long passId, String name, String email, String password) {
        this.passId = passId;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    @Ignore
    public User(long uId, long passId, String name, String email, String password) {
        this.uId = uId;
        this.passId = passId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public long getuId() {
        return uId;
    }

    public void setuId(long uId) {
        this.uId = uId;
    }

    public long getPassId() {
        return passId;
    }

    public void setPassId(long passId) {
        this.passId = passId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
