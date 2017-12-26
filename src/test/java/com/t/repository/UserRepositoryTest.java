package com.t.repository;

import com.t.JpaConfigration;
import com.t.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import java.util.List;

/**
 * Created by frostmouns on 2017/12/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JpaConfigration.class})
public class UserRepositoryTest {
    private static Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);

    @Autowired
    private UserRepository userRepository;

    @Test
    public void add(){
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setWxName("loveme"+i);
            user.setDevice("iphone6");
            user.setWxAccount("99");
            userRepository.save(user);
        }
    }

    @Test
    public void testFindByWxNameOrDevice() throws Exception {
        List<User> userList = userRepository.findByWxNameOrDevice("www2", "iphone6");
        for (User i:userList) {
            logger.info("**********************************"+i.toString());
        }
        Assert.notNull(userList);
    }


    @Test
    public void testFindByIsPlayerTrue() throws Exception {
//        List<User> userList = userRepository.findByIsPlayerTrue();
//        for (User i:userList) {
//            logger.info("**********************************"+i.toString());
//        }
//        Assert.notNull(userList);
    }

    @Test
    public void testFindByIsPlayerTrueOrderByNicknameDesc() throws Exception {
//        List<User> userList = userRepository.findByIsPlayerTrueOrderByNicknameDesc();
//        for (User i:userList) {
//            logger.info("**********************************"+i.toString());
//        }
//        Assert.notNull(userList);
    }
}