package com.example.teste;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class DataHelper {

    // Atributos
    private static final String DATABASE_NAME = "Prova";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "tbcontatos";
    private Context context;
    private SQLiteDatabase db;
    private SQLiteStatement insertStmt;
    private static final String INSERT = "INSERT INTO " + TABLE_NAME + "(nome,telefone,email) VALUES (?,?,?)";

    // Construtor da classe
    public DataHelper (Context context)
    {
        this.context = context;
        OpenHelper openHelper = new OpenHelper(this.context);
        this.db = openHelper.getWritableDatabase();
        this.insertStmt = this.db.compileStatement(INSERT);
    }

    // Método de Insert no Banco de dados
    public long Insert(String nome,String email, String Telefone)
    {
        this.insertStmt.bindString(1, nome);
        this.insertStmt.bindString(2, Telefone);
        this.insertStmt.bindString(3, email);

        return this.insertStmt.executeInsert();
    }

    // Método para exclusão de todos os registros
    public void Deleteid(String number)
    {
        this.db.delete(TABLE_NAME, "id = ?", new String[]{String.valueOf(number)});
    }

    public Cursor consulta(String id){


        String sql = "SELECT id,nome,email,telefone FROM "+TABLE_NAME+" WHERE id="+id;

        Cursor cursor = this.db.rawQuery(sql, null);

     return cursor;

    }

    public void UpdateId(String nome, String email, String telefone,String number){
        String sql = "update "+TABLE_NAME+" SET nome = "+nome+",email = "+ email+",telefone = "+ telefone+ " where id = "+number;
        db.execSQL(sql);
    }


    // Retorna lista com todos os itens cadastrados no banco de dados
    public List<String> SelectAll()
    {
        List<String> list = new ArrayList<String>();

        Cursor cursor = this.db.query(TABLE_NAME, new String[] { "id","nome", "telefone","Email" }, null, null, null, null, "id");

        if (cursor.moveToFirst()) {
            do {
                list.add(cursor.getInt(0) +" - " + cursor.getString(1) +"-"+ cursor.getString(2) +"-"+ cursor.getString(3));
            } while (cursor.moveToNext());
        }

        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }

        return list;
    }

    // Classe responsável pelo gerenciamento e criação do banco de dados
    private static class OpenHelper extends SQLiteOpenHelper
    {
        OpenHelper(Context context)
        {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            String sql = "CREATE TABLE [tbcontatos] ([id] INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT,[nome] VARCHAR(60) ,[telefone] VARCHAR(60) ,[email] Varchar(60))";
            db.execSQL(sql);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.w("Example", "Upgrading database, this will drop tables and recreate.");
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
            onCreate(db);
        }
    }
}