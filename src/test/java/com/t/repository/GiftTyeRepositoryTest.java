package com.t.repository;

import com.t.JpaConfigration;
import com.t.entity.GiftType;
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
 * Created by frostmouns on 2017/12/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JpaConfigration.class})
public class GiftTyeRepositoryTest {
    private static Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);

    @Autowired
    private GiftTyeRepository giftTypeRepository;

    @Test
    public void add(){
        for (int i = 0; i < 10; i++) {
            GiftType g = new GiftType();
            g.setName("礼物"+i);
            g.setPhoto(1111111+i);
            g.setPrice(9.99*i);
            giftTypeRepository.save(g);
        }
    }

    @Test
    public void query(){
        List<GiftType> typeList = giftTypeRepository.findAll();
        for (GiftType i:typeList) {
            logger.info("???????????????????????????"+i.toString());
        }
        Assert.notNull(typeList);
    }

    @Test
    public void updata(){
        GiftType type = giftTypeRepository.findOne(2);
        logger.info("##############"+type.toString());
        type.setPrice(23232323232.00);
        giftTypeRepository.saveAndFlush(type);
    }


}