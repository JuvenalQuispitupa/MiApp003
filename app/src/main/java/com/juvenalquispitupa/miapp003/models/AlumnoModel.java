package com.juvenalquispitupa.miapp003.models;

/**
 * Created by Alumno on 24/09/2017.
 */

public class AlumnoModel {


    public static final String TABLE_NAME="alumno";
    public static final String ID_FIELD="id";
    public static final String NOMBRE_FIELD="nombre";
    public static final String APELLIDOP_FIELD="ap";
    public static final String APELLIDOM_FIELD="am";
    public static final String EMAIL_FIELD="email";
    public static final String RUTAFOTO_FIELD="rutafoto";




    private int id;
    private String nombres;
    private String apellidoP;
    private String apellidoM;
    private String email;
    private String fotoruta;

    public int getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public String getEmail() {
        return email;
    }

    public String getFotoruta() {
        return fotoruta;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFotoruta(String fotoruta) {
        this.fotoruta = fotoruta;
    }

    public AlumnoModel(int id, String nombres, String apellidoP, String apellidoM, String email, String fotoruta) {
        this.id = id;
        this.nombres = nombres;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.email = email;
        this.fotoruta = fotoruta;
    }
    public AlumnoModel() {

    }
}
