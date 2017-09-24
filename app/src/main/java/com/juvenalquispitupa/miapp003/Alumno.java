package com.juvenalquispitupa.miapp003;

/**
 * Created by Alumno on 24/09/2017.
 */

public class Alumno {
        private int Id;
    private String Nombres;
    private String ApellidoP;
    private String ApellidoM;
        private String Email;
        private int Nota;
        private String Foto;

        public Alumno(int p_id, String p_Nombres,String p_ApellidoP,String p_ApellidoM, String p_Email, int p_Nota, String p_Foto)
        {
            //this.Id = p_id;
            this.Nombres = p_Nombres;
        /*this.Email=p_Email;
        this.Nota=p_Nota;
        this.Foto = p_Foto;
        */
        }
        public String getNombres(){return Nombres;}
        public void setNombres(String p_Nombres){this.Nombres=p_Nombres;}



}
