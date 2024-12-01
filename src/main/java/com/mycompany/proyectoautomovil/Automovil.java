/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoautomovil;

import com.mycompany.proyectoautomovil.Auto.Automoviles;
import com.mycompany.proyectoautomovil.Auto.enumeration.Color;
import com.mycompany.proyectoautomovil.Auto.enumeration.TipoAuto;
import com.mycompany.proyectoautomovil.Auto.enumeration.TipoCombustible;

/**
 *
 * @author DELL
 */
public class Automovil {

    public static void main(String[] args) {
        
        Automoviles objAuto = new Automoviles ("Chevroley", 2021, 2.5, TipoAuto.CIUDAD, TipoCombustible.DIESEL, 4, 5, 190, Color.NEGRO, 0 );
        
        objAuto.imprimir();
        objAuto.acelerar(20);
           
        objAuto.desacelerar(50);
           
           

    }
}
