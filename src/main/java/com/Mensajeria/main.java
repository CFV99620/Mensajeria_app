package com.Mensajeria;
import java.sql.Connection;

public class main {

    public static void main(String[] args) {

        Conexion conn = new Conexion();

        try(Connection cnx = conn.get_connection()){

        }catch(Exception e){
            System.out.println(e);
        }

    }

}
