package com.example.yamada_pc.test_sql;

/**
 * Created by yamada-PC on 2016/11/07.
 */

public class Note {
    protected int id;
    protected String note;
    protected String lastupdate;

    public Note(int id, String note, String lastupdate){
        this.id = id;
        this.note = note;
        this.lastupdate = lastupdate;
    }

    public String getNote(){
        return note;
    }

    public String getLastupdate(){
        return lastupdate;
    }

    public int getId(){
        return id;
    }

}
