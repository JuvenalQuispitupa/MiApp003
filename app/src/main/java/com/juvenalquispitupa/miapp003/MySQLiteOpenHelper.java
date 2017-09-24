package com.juvenalquispitupa.miapp003;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.juvenalquispitupa.miapp003.models.AlumnoModel;

/**
 * Created by Alumno on 24/09/2017.
 */

public class MySQLiteOpenHelper extends SQLiteOpenHelper
{
    private static  final String TAG ="ju";
    private static final String NOMBRE_BD = "mydb.db";
    private static final int VERSION_BD = 1;

    private static StringBuilder sbCreate = new StringBuilder()
            .append("CREATE TABLE "+ AlumnoModel.TABLE_NAME+" ( ")
            .append(AlumnoModel.ID_FIELD+ " INTEGER PRIMARY KEY, ")
            .append(AlumnoModel.NOMBRE_FIELD+ " TEXT, ")
            .append(AlumnoModel.APELLIDOP_FIELD + " TEXT, ")
            .append(AlumnoModel.APELLIDOM_FIELD+ " TEXT, ")
            .append(AlumnoModel.EMAIL_FIELD+ " TEXT, ")
            .append(AlumnoModel.RUTAFOTO_FIELD+ " TEXT) ");



    public MySQLiteOpenHelper(Context context) {
        super(context, NOMBRE_BD, null, VERSION_BD);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d(TAG, "onCreate: db.execSQL(sbCreate.toString()); ");


        db.execSQL(sbCreate.toString());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
