package com.example.mysqdemo.repository;

import com.example.mysqdemo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Zul Qarnain on 1/10/2018.
 */
@Repository
public interface TaskRepository  extends JpaRepository<Todo,Integer>{
    void findByUid(int id);
}
