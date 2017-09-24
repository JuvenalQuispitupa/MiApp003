package com.juvenalquispitupa.miapp003.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.juvenalquispitupa.miapp003.MySQLiteOpenHelper;
import com.juvenalquispitupa.miapp003.models.AlumnoModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alumno on 24/09/2017.
 */

public class AlumnoDao {

    private SQLiteDatabase sqLiteDataBase;
    private MySQLiteOpenHelper sqLiteOpenHelper;

    public AlumnoDao(MySQLiteOpenHelper sqLiteOpenHelper)
    {
        this.sqLiteOpenHelper = sqLiteOpenHelper;
        this.sqLiteDataBase = sqLiteOpenHelper.getWritableDatabase();
    }

    public AlumnoDao(Context contexto)
    {
        this.sqLiteOpenHelper = sqLiteOpenHelper;
        this.sqLiteDataBase = sqLiteOpenHelper.getWritableDatabase();
    }
    public long insertarAlumno(AlumnoModel alumno)
    {

        ContentValues valoresInsertar = new ContentValues();
        valoresInsertar.put(AlumnoModel.ID_FIELD,alumno.getId());
        valoresInsertar.put(AlumnoModel.NOMBRE_FIELD,alumno.getNombres());
        valoresInsertar.put(AlumnoModel.APELLIDOP_FIELD,alumno.getApellidoP());
        valoresInsertar.put(AlumnoModel.APELLIDOM_FIELD,alumno.getApellidoM());
        valoresInsertar.put(AlumnoModel.EMAIL_FIELD,alumno.getEmail());
        valoresInsertar.put(AlumnoModel.RUTAFOTO_FIELD,alumno.getFotoruta());

        long result = sqLiteDataBase.insert(AlumnoModel.TABLE_NAME,null, valoresInsertar);

        return result;

    }
    public int actualizarAlumno(AlumnoModel alumno)
    {
        ContentValues valoresInsertar = new ContentValues();
        //valoresInsertar.put(AlumnoModel.ID_FIELD,alumno.getId());
        valoresInsertar.put(AlumnoModel.NOMBRE_FIELD,alumno.getNombres());
        valoresInsertar.put(AlumnoModel.APELLIDOP_FIELD,alumno.getApellidoP());
        valoresInsertar.put(AlumnoModel.APELLIDOM_FIELD,alumno.getApellidoM());
        valoresInsertar.put(AlumnoModel.EMAIL_FIELD,alumno.getEmail());
        valoresInsertar.put(AlumnoModel.RUTAFOTO_FIELD,alumno.getFotoruta());

        String WhereClause = AlumnoModel.ID_FIELD+"=?";
        String[] WhereArgs = {String.valueOf(alumno.getId())};

        //Retorna la cantidad de filas acutalizadas
        //retorna cero si no acutalizo nada


        int result = sqLiteDataBase.update(AlumnoModel.TABLE_NAME,valoresInsertar,WhereClause, WhereArgs);

        return result;

    }

    public int eliminarAlumno(AlumnoModel alumno)
    {
        ContentValues valoresInsertar = new ContentValues();
        valoresInsertar.put(AlumnoModel.ID_FIELD,alumno.getId());

        String WhereClause = AlumnoModel.ID_FIELD+"=?";
        String[] WhereArgs = {(String.valueOf(alumno.getId()))};


        int result = sqLiteDataBase.delete(AlumnoModel.TABLE_NAME,WhereClause, WhereArgs);

        return result;

    }
    public List<AlumnoModel> listarAlumno(AlumnoModel alumno)
    {
        String [] fields =  {
                AlumnoModel.ID_FIELD,
                AlumnoModel.NOMBRE_FIELD,
                AlumnoModel.APELLIDOP_FIELD,
                AlumnoModel.APELLIDOM_FIELD,
                AlumnoModel.EMAIL_FIELD,
                AlumnoModel.RUTAFOTO_FIELD
        };
        Cursor cursor = sqLiteDataBase.query(AlumnoModel.TABLE_NAME,fields,null,null,null,null,null,null);

        return  ConvertCursorLista(cursor);
    }



    public List<AlumnoModel> ConvertCursorLista(Cursor mCursor) {
        List<AlumnoModel> arrlista = new ArrayList<>();
        if (mCursor.moveToFirst()) {
            do {
                AlumnoModel modelo = new AlumnoModel();
                modelo.setId(mCursor.getInt(mCursor.getColumnIndex(AlumnoModel.ID_FIELD)));
                modelo.setNombres(mCursor.getString(mCursor.getColumnIndex(AlumnoModel.NOMBRE_FIELD)));
                modelo.setApellidoP(mCursor.getString(mCursor.getColumnIndex(AlumnoModel.APELLIDOP_FIELD)));
                modelo.setApellidoM(mCursor.getString(mCursor.getColumnIndex(AlumnoModel.APELLIDOM_FIELD)));
                modelo.setEmail(mCursor.getString(mCursor.getColumnIndex(AlumnoModel.EMAIL_FIELD)));
                modelo.setFotoruta(mCursor.getString(mCursor.getColumnIndex(AlumnoModel.RUTAFOTO_FIELD)));
                arrlista.add(modelo);
            }
            while (mCursor.moveToNext());
        }
        return arrlista;
    }
}
