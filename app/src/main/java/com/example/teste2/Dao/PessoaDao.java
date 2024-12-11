package com.example.teste2.Dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import com.example.teste2.Model.Pessoa;

import java.util.ArrayList;

public class PessoaDao implements IGenericDao<Pessoa>{
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase db;
    private String colunas[] = {"id", "nome", "telefone", "email", "cpf", "senha"};
    private String tabela = "pessoa";
    private Context context;
    private static PessoaDao instancia;

    public static PessoaDao getInstancia(Context context){
        if(instancia == null){
            instancia = new PessoaDao(context);
            return instancia;
        }else{
            return instancia;
        }
    }

    private PessoaDao(Context context){
//        this.context = context;
//        openHelper = new SQLiteDataHelper(this.context, "DB_UpClass", null, 1);
//        dataBase = openHelper.getWritableDatabase();
    }

    @Override
    public long insert(Pessoa obj) {
        return 0;
    }

    @Override
    public long update(Pessoa obj) {
        return 0;
    }

    @Override
    public long delete(Pessoa obj) {
        return 0;
    }

    @Override
    public Pessoa getById(long id) {
        return null;
    }

    @Override
    public ArrayList<Pessoa> getAll() {
        return null;
    }
}
