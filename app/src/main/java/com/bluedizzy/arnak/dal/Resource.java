package com.bluedizzy.arnak.dal;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

import com.bluedizzy.arnak.pojo.Category;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by Itai on 11/19/2016.
 */
public class Resource<T> {
    private SQLiteOpenHelper _helper;
    public Context _context;

    public Resource(Context context) throws ClassNotFoundException {
        _context = context;

        if (((ParameterizedType)(getClass()
                .getGenericSuperclass()))
                .getActualTypeArguments()[0]
                .getClass()
                .equals(Category.class)) {
            this._helper = new CategoryDBHelper(_context);
        } else {
            throw new ClassNotFoundException("No such DBHelper");
        }
    }

    public boolean create(T t) {
        return this._helper.insert()
    }

    public boolean read(T t) {
        return true;
    }

    public boolean update(T t) {
        return true;
    }

    public boolean delete(T t) {
        return true;
    }

    public boolean createOrUpdate(T t) {
        return true;
    }

    public List<T> getAll() {
        return null;
    }

    public List<T> getAll(int limit) {
        return null;
    }
}
