package com.wp.Factory;

import com.wp.service.UserDAOService;
import com.wp.service.serviceimpl.UserDAOServiceImpl;

/**
 * Created by Administrator on 2019/11/23 0023.
 */
public class ServiceFactory {
    public static UserDAOService getUserDAOServiceImpl(){
        return new UserDAOServiceImpl();
    }
}
