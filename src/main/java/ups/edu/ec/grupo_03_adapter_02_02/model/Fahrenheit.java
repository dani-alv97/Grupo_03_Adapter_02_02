/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.grupo_03_adapter_02_02.model;

/**
 *
 * @author Grupo 3
 */
public class Fahrenheit {
    
    private double temperatura;

    public void medirTemperatura(double temperatura){
        this.temperatura =  (temperatura - 32) / 1.8;
    }
    
    public double getTemperatura() {
        return temperatura;
    }
}
