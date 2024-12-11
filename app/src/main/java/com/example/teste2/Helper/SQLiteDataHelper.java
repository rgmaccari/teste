package com.example.trabalho2obimestre.Helper;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.teste2.Helper.SeedData;
import com.example.teste2.Model.ItemLista;

import java.util.ArrayList;

public class SQLiteDataHelper extends SQLiteOpenHelper {

    public SQLiteDataHelper(@Nullable Context context, @Nullable String name,
                            @Nullable SQLiteDatabase.CursorFactory factory, int version){
        super(context, name, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL
                ("CREATE TABLE PESSOA (id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT,  telefone TEXT, " +
                        "email TEXT, " +
                        "cpf TEXT, " +
                        "senha TEXT)");
        SeedData.insertInitialData(sqLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}