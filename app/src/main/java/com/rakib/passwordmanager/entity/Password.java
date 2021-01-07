package com.rakib.passwordmanager.entity;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Password implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String userName;
    private String password;

    public Password(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Ignore
    public Password(int id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
