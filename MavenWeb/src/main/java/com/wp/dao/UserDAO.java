package com.wp.dao;
import com.wp.vo.User;
import java.util.*;

/**
 * Created by Administrator on 2019/11/23 0023.
 */
public interface UserDAO {
    public List<User> findAll() throws Exception;
}
