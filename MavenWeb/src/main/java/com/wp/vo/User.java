package com.wp.vo;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/11/20 0020.
 */
public class User implements Serializable{
    private String s_id;
    private String s_name;
    private String s_birth;
    private String s_sex;

    public User() {
    }

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }

    public String getS_birth() {
        return s_birth;
    }

    public void setS_birth(String s_birth) {
        this.s_birth = s_birth;
    }
}
