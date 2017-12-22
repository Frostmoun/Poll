package com.t.controller;

/**
 * Created by frostmouns on 2017/12/18.
 */

import com.alibaba.fastjson.JSON;
import com.t.entity.Player;
import com.t.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private UserService userService;

    //报名
    @GetMapping(value = "/register/player")
    public String register(Player player){
        userService.playerRegister(player);
        return null;
    }

    //查询所有的选手
    @GetMapping(value = "/getPlayers")
    public String showAllPlayers(){
        String data = userService.getAllPlayers();
        return "callback(" + data + ")";
    }
    //统计票数
    @GetMapping(value = "/getStatistics")
    public String showStatistics(){
        String data = userService.getStatistics();
        return "callback(" + data + ")";
    }

    //通过编号,昵称,寝室号模糊搜索player
    @GetMapping(value = "/searchLike")
    public String showSearchResult(String s){
        String data = userService.getPlayersByNumOrNickname(s);
        return "callback(" + data + ")";
    }

    //送礼物
    @GetMapping(value = "/donate")
    public String donateGift(String giftType, String player){
        String data = userService.donateGift(giftType, player);
        return "callback(" + data + ")";
    }


    //查询所有joke列表
    @GetMapping(value = "/result/getJokeList")
    public String show(){
        Integer id = new Integer("qwe");
        String data = userService.findUser(id);
        return "callback(" + JSON.toJSONString(data) + ")";
    }

}
