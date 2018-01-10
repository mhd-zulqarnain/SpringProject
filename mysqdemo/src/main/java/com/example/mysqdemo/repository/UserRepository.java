package com.example.mysqdemo.repository;

import com.example.mysqdemo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Zul Qarnain on 1/8/2018.
 */
@Repository
public interface UserRepository extends JpaRepository<Users,Integer>
{
        Users findByName(String name);
}
