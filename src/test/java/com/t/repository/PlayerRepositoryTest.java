package com.t.repository;

import com.t.JpaConfigration;
import com.t.entity.Player;
import com.t.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by frostmouns on 2017/12/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JpaConfigration.class})
public class PlayerRepositoryTest {
    private static Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);

    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private UserRepository userRepository;

    @Test
    public void add(){
        User user = userRepository.findByWxName("love0");
        Player player = new Player();
        player.setNickname("haasdasd");
        player.setNumber("3000号");
        player.setPhone("110123");
        player.setSlogan("PHP是最好的语言");
        player.setUser(user);
        playerRepository.save(player);
    }

    @Test
    public void query(){
        //logger.info("21311111111111111111111"+playerRepository.findByNickname("ha").toString());
        //playerRepository.findByNickname("ha");
        List<Player> players = playerRepository.findByNicknameLike("h");

//        for (Player i: players) {
//            System.out.print("asdasdasdasd"+i.toString());
//            logger.info("dasdasdasdasdasd"+i.toString());
//        }

        Assert.assertEquals("ha", playerRepository.findByNickname("ha").getNickname());
    }


}