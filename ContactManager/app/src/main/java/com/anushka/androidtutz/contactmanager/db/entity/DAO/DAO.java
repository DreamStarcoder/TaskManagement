package com.anushka.androidtutz.contactmanager.db.entity.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.anushka.androidtutz.contactmanager.db.entity.tables.Contact;

import java.util.List;

@Dao
public interface DAO {
    @Insert
    public long setContacts(Contact contact);

    @Delete
    public void deleteContact(Contact contact);

    @Update
    public void setUpdate(Contact contact);

    @Query("SELECT * from contacts ")
    public List<Contact> getContacts();

    @Query("SELECT * from contacts where id=:contactID")
    public Contact getContacts(long contactID);

}
