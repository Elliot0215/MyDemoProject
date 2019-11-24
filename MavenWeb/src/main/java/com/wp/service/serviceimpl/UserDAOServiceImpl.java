package com.wp.service.serviceimpl;

import com.wp.Factory.DAOFactory;
import com.wp.service.UserDAOService;
import com.wp.vo.User;
import com.wp.dbc.GetDBConnection;

import java.util.List;

/**
 * Created by Administrator on 2019/11/23 0023.
 */
public class UserDAOServiceImpl implements UserDAOService{
    GetDBConnection db = new GetDBConnection();
    @Override
    public List<User> findall() throws Exception {
        try{
            return DAOFactory.getDAOFactory(this.db.getConn()).findAll();
        }catch (Exception e){
            throw e;
        }finally {
            this.db.Close();
        }
    }
}
