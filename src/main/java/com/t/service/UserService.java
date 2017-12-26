package com.t.service;

import com.alibaba.fastjson.JSON;
import com.t.entity.Gift;
import com.t.entity.GiftType;
import com.t.entity.Player;
import com.t.entity.User;
import com.t.json.Statistics;
import com.t.repository.GiftRepository;
import com.t.repository.GiftTyeRepository;
import com.t.repository.PlayerRepository;
import com.t.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by frostmouns on 2017/12/18.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private GiftRepository giftRepository;
    @Autowired
    private GiftTyeRepository giftTypeRepository;

    public String playerRegister(Player player){
        playerRepository.save(player);
        return "1";
    }

    public String findUser(Integer id){

        userRepository.findOne(id);
        return "1";
    }

    public String getAllPlayers() {
        List<Player> playerList = playerRepository.findAll();
        return JSON.toJSONString(playerList);
    }

    public String getStatistics() {
        GiftType type = giftTypeRepository.findOne(1);
        List<Gift> gifts = giftRepository.findByGiftType(type);
        int tickets = 0;
        for (Gift i:gifts) {
            tickets += i.getCount();
        }
        int sumOfplayer = playerRepository.findAll().size();
        int pageView = 100;
        Statistics data = new Statistics(sumOfplayer, tickets, pageView);
        return JSON.toJSONString(data);
    }

    public String getPlayersByNumOrNickname(String target) {
        //List<Player> playerList = playerRepository.findByNicknameOrNumberLike(target);
        //return JSON.toJSONString(playerList);
        return "1";
    }

    public String donateGift(String giftType, String nickname) {
        String wxname = "aaa";
        //Player player = playerRepository.findByNickname(nickname);
        User user = userRepository.findByWxName(wxname);
        Gift gift = giftRepository.findByBuyer(user);
        //gift.setOwner(player);
        Gift data = giftRepository.save(gift);
        return JSON.toJSONString(data);
    }


}
