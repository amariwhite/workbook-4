package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void checkIn_should_markRoomAsOccupiedAndDirty(){
        //arrange
        Room room = new Room(2, 124.00, false, false);
        //act
        room.checkIn();
        //assert
        boolean roomAvailable = room.isAvailable();
        assertTrue(roomAvailable);
    }

}