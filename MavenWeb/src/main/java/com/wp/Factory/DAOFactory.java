package com.wp.Factory;

import com.wp.dao.UserDAO;
import com.wp.dao.daoImpl.UserDAOImpl;

import java.sql.Connection;

/**
 * Created by Administrator on 2019/11/23 0023.
 */
public class DAOFactory {
    public static UserDAO getDAOFactory(Connection conn){
        return new UserDAOImpl(conn);
    }
}
