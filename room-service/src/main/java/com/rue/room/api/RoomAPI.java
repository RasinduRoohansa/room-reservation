package com.rue.room.api;

import com.rue.room.entity.Room;
import com.rue.room.repository.RoomRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/rooms")
public class RoomAPI {

    @Autowired
    private RoomRepository roomRepository;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<Room> findAll(@RequestParam(value = "roomNumber",required = false) String roomNumber){
        if (StringUtils.isNotEmpty(roomNumber)){
           return  Collections.singletonList(this.roomRepository.findAllByRoomNumber(roomNumber));
        }else{
            return (List<Room>) roomRepository.findAll();
        }
    }
}
