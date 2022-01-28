/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Alumno Tarde
 */
public class Vehiculo {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero;
    private boolean climatizador;
    public Vehiculo() {
        ruedas=4;
        largo=2000;
        ancho=250;
        motor=1600;
        peso_plataforma=700;
    }
    //Sintaxis getters public "dato a devolver" nombre con getCosaQueDevuelva
    // no recibe parametros
    public String getLargo(){
        return "largo: " + largo;
    }
    
    public String getRuedas(){
        return "ruedas: " + ruedas;
    }
    
    public String getColor(){
        return "color: "+color;
    }
    // Sintaxis de setters: public void nombre con setCosaQueDevuelva
    public void setColor(String color){
        this.color = color;
    }
    public String getAsientos(){
        String asientos;
        if(asientos_cuero){
            asientos=" con asientos de cuero";
        }
        else
        {
            asientos=" sin asientos de cuero";
        }
        return asientos;
    }
    public void setAsientos(String asientos_cuero){
        if(asientos_cuero.equalsIgnoreCase("si")){
            this.asientos_cuero = true;
        }
        else if(asientos_cuero.equalsIgnoreCase("no")){
            this.asientos_cuero = false;
        }
    }
    public String getPeso(){
        int peso_carroceria = 500;
        this.peso_total = peso_plataforma + peso_carroceria;
        if(asientos_cuero){
            this.peso_total += 50;
            
        }
        if(climatizador){
            this.peso_total += 20;
        }
        return(" peso total de " + this.peso_total + " kg");
    }
    public String getClimatizador(){
        String climatz;
        if(this.climatizador){
            climatz = " con climatizador";
        }
        else{
            climatz = " sin climatizador";
        }
        return climatz;   
    }
    public void setClimatizador(String climatz){
        if(climatz.equalsIgnoreCase("si")){
            this.climatizador = true;
        }
        else if(climatz.equalsIgnoreCase("no")){
            this.climatizador = false;
        }        
    }
    public String getDatos(){
        return ("Coche con: " + getRuedas() + getColor() + getAsientos() + getPeso()
                + "\n" + getClimatizador());
    }
}
