package com.wp.dao.daoImpl;

import com.wp.dao.UserDAO;
import com.wp.vo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/11/23 0023.
 */
public class UserDAOImpl implements UserDAO {
    private Connection conn;
    private PreparedStatement pst;

    public UserDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<User> findAll() throws Exception {
        List<User> userlist = new ArrayList<User>();
        ResultSet rst = null;
        String sql = "select * from User";
        this.pst = this.conn.prepareStatement(sql);
        rst = this.pst.executeQuery();
        while(rst.next()){
            User user = new User();
            user.setS_id(rst.getString(1));
            user.setS_name(rst.getString(2));
            user.setS_birth(rst.getString(3));
            user.setS_sex(rst.getString(4));
            userlist.add(user);
        }
        return userlist;
    }
}
