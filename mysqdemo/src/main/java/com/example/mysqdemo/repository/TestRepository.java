package com.example.mysqdemo.repository;

import com.example.mysqdemo.model.Tests;
import com.example.mysqdemo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zulup on 1/19/2018.
 */
@Repository
public interface TestRepository extends JpaRepository<Tests,Integer> {
    Tests findByName(String name);
}
