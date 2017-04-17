/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeinversionesclase10;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int telefono;
    private int edad;
    private String email;
    private int cedula;
    private ArrayList<Asset> assets;

    public Cliente(String nombre, String apellido, int telefono, int edad, String email, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.email = email;
        this.cedula = cedula;
        this.assets = new ArrayList<>();
    }

    public void addAsset(Asset asset){
        this.assets.add(asset);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Asset> getAssets() {
        return assets;
    }

    public void setAssets(ArrayList<Asset> assets) {
        this.assets = assets;
    }
    
    
    
}
