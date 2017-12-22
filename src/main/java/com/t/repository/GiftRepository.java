package com.t.repository;

import com.t.entity.Gift;
import com.t.entity.GiftType;
import com.t.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by frostmouns on 2017/12/18.
 */
@Repository
public interface GiftRepository extends JpaRepository<Gift, Integer> {
    List<Gift> findByGiftType(GiftType type);

    Gift findByOwner(User user);

    Gift findByBuyer(User user);
}
