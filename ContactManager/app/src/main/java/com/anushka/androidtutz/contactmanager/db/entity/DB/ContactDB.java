package com.anushka.androidtutz.contactmanager.db.entity.DB;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.anushka.androidtutz.contactmanager.db.entity.DAO.DAO;
import com.anushka.androidtutz.contactmanager.db.entity.tables.Contact;

@Database(entities = {Contact.class},version = 1)
public abstract class ContactDB extends RoomDatabase {
    public abstract DAO getDAO();
}
