package com.wp.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Administrator on 2019/11/20 0020.
 */
public class GetDBConnection {
    private  static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private  static final String DB_URL = "jdbc:mysql://192.168.59.200:3306/testing?useUnicode=true&characterEncoding=utf8";
    private  static final String USERNAME = "root";
    private  static final String PASSWORD = "root";
    private static Connection conn;
    public GetDBConnection(){
        try {
            Class.forName(DB_DRIVER);
            this.conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Connection getConn(){
        return this.conn;
    }

    public void Close(){
        if(this.conn != null){
            try {
                this.conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
