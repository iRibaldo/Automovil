/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoautomovil.Auto;

import com.mycompany.proyectoautomovil.Auto.enumeration.Color;
import com.mycompany.proyectoautomovil.Auto.enumeration.TipoAuto;
import com.mycompany.proyectoautomovil.Auto.enumeration.TipoCombustible;

/**
 *
 * @author DELL
 */
public class Automoviles {
    
    private String marca;
    private int modelo;
    private double motor;
    private TipoAuto tipoAutomovil;
    private TipoCombustible tipoCombustible;
    private int numPuertas;
    private int canAsientos;
    private int velocidadMaxima;
    private Color color;
    private int velocidadActual;

    public Automoviles() {
    }

    public Automoviles(String marca, int modelo, double motor, TipoAuto tipoAutomovil, TipoCombustible tipoCombustible, int numPuertas, int canAsientos, int velocidadMaxima, Color color, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoAutomovil = tipoAutomovil;
        this.tipoCombustible = tipoCombustible;
        this.numPuertas = numPuertas;
        this.canAsientos = canAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = velocidadActual;
    }
    
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public TipoAuto getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAuto tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getCanAsientos() {
        return canAsientos;
    }

    public void setCanAsientos(int canAsientos) {
        this.canAsientos = canAsientos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    public void acelerar (int aumento){
    
        if (velocidadActual + aumento > velocidadMaxima) {
            
            System.out.println("!!Advertencia!! No se puede acelerar más de la velocidad permitada");
            
        } else { velocidadActual += aumento;
                
                System.out.println("Su velocidad es de: " + velocidadActual + "Km/h");
        }
    
    }
    
    public void desacelerar(int descenso){
        
        if (velocidadActual - descenso < 0) {
            
            System.out.println("La velocidad minima de desaceleracion es de 0km/h");
              
        } else { velocidadActual -= descenso;
        
            System.out.println("La velocidad aldesacelerar es de: " + velocidadActual + "Km/h");
        }
        
    }
    
    public void imprimir (){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor);
        System.out.println("Tipo de Vehiculo: " + tipoAutomovil);
        System.out.println("Tipo de Combustible; " + tipoCombustible);
        System.out.println("El vehiculo tiene: " + numPuertas + "puertas");
        System.out.println("El vehiculo tiene: " + canAsientos + "asientos");
        System.out.println("La velocidad maxima es de: " + velocidadMaxima + "Km/h");
        System.out.println("El color del vehiculo es de: " + color);
        System.out.println("La velocidad actual del vehiculo es de: " + velocidadActual);
        
    
    }
    
}
