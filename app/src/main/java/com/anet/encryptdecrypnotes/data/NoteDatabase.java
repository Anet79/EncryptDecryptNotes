package com.anet.encryptdecrypnotes.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.anet.encryptdecrypnotes.dao.NoteDao;
import com.anet.encryptdecrypnotes.entities.NoteEntity;

@Database(entities = {NoteEntity.class}, version = 1, exportSchema = false)
public abstract class NoteDatabase extends RoomDatabase {
    public abstract NoteDao noteDao();

    private static volatile NoteDatabase INSTANCE;

    public static NoteDatabase getInstance(final Context context) {
        synchronized (NoteDatabase.class) {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                        NoteDatabase.class,
                        "Notes-Secure").build();
            }
        }
        return INSTANCE;
    }

}
