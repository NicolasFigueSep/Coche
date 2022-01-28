/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Alumno Tarde
 */
public class Furgoneta extends Vehiculo{
    private int capacidadCarga;
    private int plazasExtra;
    
    public Furgoneta(int capacidadCarga, int plazasExtra){
        super();
        this.capacidadCarga = capacidadCarga;
        this.plazasExtra = plazasExtra;
        
    }
    public int getCapacidad(){
        return capacidadCarga;
    }
    public int getPlazas(){
        return plazasExtra;
    }
    @Override
    public String toString(){
        return(super.getDatos() + " Capacidad Carga " + getCapacidad() + "\nPlazas Extra " + getPlazas());
    }
}
