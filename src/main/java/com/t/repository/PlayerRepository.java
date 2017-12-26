package com.t.repository;

import com.t.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by frostmouns on 2017/12/19.
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

    List<Player> findByNicknameLike(String nickname);

    Player findByNickname(String nickname);
}
