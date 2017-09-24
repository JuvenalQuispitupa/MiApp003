package com.juvenalquispitupa.miapp003;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Listado extends AppCompatActivity {

    public Button mBtnIrADetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

        mBtnIrADetalle = (Button)findViewById(R.id.btnIrADetalle);
        mBtnIrADetalle.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intento = new Intent(Listado.this, Detalle.class);
                startActivity(intento);
            }
        });
    }
}
