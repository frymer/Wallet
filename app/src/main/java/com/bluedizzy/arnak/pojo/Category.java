package com.bluedizzy.arnak.pojo;

import java.util.Date;

/**
 * Created by Itai on 11/19/2016.
 */
public class Category {
    private String _name;
    private Category _top;
    private Date _lastUsed;


    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public Category getTop() {
        return _top;
    }

    public void setTop(Category top) {
        this._top = top;
    }

    public Date getLastUsed() {
        return _lastUsed;
    }

    public void setName(Date lastUsed) {
        this._lastUsed = lastUsed;
    }
}