package com.t.repository;

import com.t.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by frostmouns on 2017/12/18.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByWxNameOrDevice(String name, String device);

    User findByWxName(String wxname);

}
