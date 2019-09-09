package com.rue.room.repository;

import com.rue.room.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room,Long> {

    Room findAllByRoomNumber(String roomNumber);
}
