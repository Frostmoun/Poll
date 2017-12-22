package com.t.repository;

import com.t.entity.GiftType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by frostmouns on 2017/12/18.
 */
@Repository
public interface GiftTyeRepository extends JpaRepository<GiftType, Integer> {
}
