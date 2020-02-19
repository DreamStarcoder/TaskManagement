package com.example.roomdatabasepractice.db_Util.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.roomdatabasepractice.db_Util.dos.Doa;
import com.example.roomdatabasepractice.db_Util.tables.Contacts;

@Database(entities = {Contacts.class},version = 1)
public abstract class ContactsDB extends RoomDatabase {
    public abstract Doa contactDAO();
}
