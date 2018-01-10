package com.frankmoley.project.data.repository;

import com.frankmoley.project.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Zul Qarnain on 1/2/2018.
 */
@Repository
public interface RoomRepository extends CrudRepository<Room,Long> {
    Room findByNumber(String number);
}
