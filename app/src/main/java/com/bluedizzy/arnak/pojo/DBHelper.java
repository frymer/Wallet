package com.bluedizzy.arnak.pojo;

/**
 * Created by Itai on 11/19/2016.
 */
public interface DBHelper<T> {
    boolean insert(T t);
    boolean update(T t);
    boolean delete(T t);
    boolean select(String query);
}
