package com.example.teste2.Dao;

import java.util.ArrayList;


public interface IGenericDao<T> {
    long insert(T obj);
    long update(T obj);
    long delete (T obj);
    T getById(long id);
    ArrayList<T> getAll();
}
