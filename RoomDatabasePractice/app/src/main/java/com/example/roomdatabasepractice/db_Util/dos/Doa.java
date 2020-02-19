package com.example.roomdatabasepractice.db_Util.dos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.roomdatabasepractice.db_Util.tables.Contacts;

import java.util.List;

@Dao
public interface Doa {
    @Insert
    public long insertContacts(Contacts contacts);

    @Update
    public void updateContact(Contacts contacts);

    @Delete
    public void delete(Contacts contacts);

    @Query("select * from contact")
    public List<Contacts> getContacts();

}
