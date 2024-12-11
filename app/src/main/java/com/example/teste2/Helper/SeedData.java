package com.example.teste2.Helper;

import android.database.sqlite.SQLiteDatabase;

public class SeedData {
    public static void insertInitialData(SQLiteDatabase db) {
        db.execSQL("INSERT INTO ALUNO (nome, telefone, email, cpf, senha) VALUES" +
                "(null, null, null, null, null)");
    }

}
