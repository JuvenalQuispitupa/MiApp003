package com.juvenalquispitupa.miapp003;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.juvenalquispitupa.miapp003.dao.AlumnoDao;
import com.juvenalquispitupa.miapp003.models.AlumnoModel;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Detalle extends AppCompatActivity {

    public  static  final String  TAG= "Detalle";
    @BindView(R.id.btnCrear)
    Button btnCrear;
    @BindView(R.id.btnModificar)
    Button btnModificar;
    @BindView(R.id.btnEliminar)
    Button btnEliminar;
    @BindView(R.id.llBarraBotones)
    LinearLayout llBarraBotones;
    @BindView(R.id.etID)
    EditText etID;
    @BindView(R.id.ivFoto)
    ImageView ivFoto;
    @BindView(R.id.etNombre)
    EditText etNombre;
    @BindView(R.id.etApellidoP)
    EditText etApellidoP;
    @BindView(R.id.etApellidoM)
    EditText etApellidoM;
    @BindView(R.id.etEmail)
    EditText etEmail;
    @BindView(R.id.etNota)
    EditText etNota;
    @BindView(R.id.etFotoRuta)
    EditText etFotoRuta;
    @BindView(R.id.llDetalle)
    LinearLayout llDetalle;
    @BindString(R.string.labelHola)
    String mlabelHola;

    /*
        @BindView(R.id.etID) EditText mEtId;
        @BindView(R.id.etNombre) EditText mEtNombre;
        @BindView(R.id.etApellidoP) EditText mEtApellidoP;
        @BindView(R.id.etApellidoM) EditText mEtApellidoM;
        @BindView(R.id.etEmail) EditText mEtEmail;
        @BindView(R.id.etNota) EditText mEtNota;
        @BindView(R.id.etFotoRuta) EditText mEtFotoRuta;
        @BindView(R.id.ivFoto)    ImageView mIvFoto;
        @BindView(R.id.btnCrear)    Button mBtnCrear;
        //@BindString(R.id.)
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        ButterKnife.bind(this);

        /*/paso 1
        ButterKnife.bind(this);

        //paso 2*/

        MySQLiteOpenHelper openHelper = new MySQLiteOpenHelper(this);

        AlumnoDao productoDao = AlumnoDao(openHelper);

        AlumnoModel alumno = new AlumnoModel();

        alumno.setId(1);
        alumno.setNombres("juve");
        alumno.setApellidoP("Q");
        alumno.setApellidoM("Y");
        alumno.setEmail("Emaila gemai");
        alumno.setFotoruta("C://");

        long  resultado = productoDao.insertarAlumno(alumno);

        if(resultado!=-1)
        {
            //exito
            Log.i(TAG, "ok");
        }
        else
        {
            Log.i(TAG, "Error");
        }
        ;





    }

    //paso3
    @OnClick({R.id.btnCrear, R.id.ivFoto})
    public void onButtonClick() {
        Toast.makeText(this, mlabelHola, Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.btnCrear)
    public void onViewClicked() {
    }
}
