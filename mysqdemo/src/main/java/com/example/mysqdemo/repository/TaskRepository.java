package com.example.mysqdemo.repository;

import com.example.mysqdemo.model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * Created by Zul Qarnain on 1/10/2018.
 */
@Transactional
public interface TaskRepository  extends JpaRepository<Tasks,Integer>{

}
