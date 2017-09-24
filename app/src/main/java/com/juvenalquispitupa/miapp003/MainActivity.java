package com.juvenalquispitupa.miapp003;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected Button mBtnIrAMantenimiento;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String query = "select sqlite_version() AS sqlite_version";
        SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase(":memory:", null);
        Cursor cursor = db.rawQuery(query, null);
        String sqliteVersion = "";
        if (cursor.moveToNext()) {
            sqliteVersion = cursor.getString(0);
            Toast.makeText(this, sqliteVersion, Toast.LENGTH_LONG).show();

        }

        mBtnIrAMantenimiento = (Button) findViewById(R.id.btnIrAMantenimiento);
        /*mBtnIrAMantenimiento.setOnClickListener((v)->{
            Intent intento = new Intent(MainActivity.this,Listado.class);
            startActivity(intento);
        });*/
        mBtnIrAMantenimiento.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intento = new Intent(MainActivity.this, Listado.class);
                startActivity(intento);
            }
        });


    }
}
