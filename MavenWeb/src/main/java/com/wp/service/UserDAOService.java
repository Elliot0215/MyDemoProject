package com.wp.service;
import com.wp.vo.User;
import java.util.*;
/**
 * Created by Administrator on 2019/11/23 0023.
 */
public interface UserDAOService {
    public List<User> findall() throws Exception;
}
