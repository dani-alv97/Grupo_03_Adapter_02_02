/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.grupo_03_adapter_02_02.model;

/**
 *
 * @author Grupo 3
 */
public class TemperaturaAdapter implements Temperatura{

    private Celsius celsius = new Celsius();
    private Fahrenheit fahrenheir = new Fahrenheit();
    private double temp= 0;
    
    @Override
    public double registroTemperatura(String dispositivo, double temperatura) {
        temp = 0;
        if(dispositivo.equals("Celsius")){
            celsius.medirTemperatura(temperatura);
            temp = celsius.getTemperatura();
        }else if (dispositivo.equals("Fahrenheit")){
            fahrenheir.medirTemperatura(temperatura);
            temp = fahrenheir.getTemperatura();
        }
        return temp;
    }
    
}
