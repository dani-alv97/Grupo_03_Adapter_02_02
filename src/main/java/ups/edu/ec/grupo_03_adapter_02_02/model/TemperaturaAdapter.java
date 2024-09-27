/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.grupo_03_adapter_02_02.model;

/**
 *
 * @author Grupo 3
 */
public class TemperaturaAdapter implements ITemperatura{

    private CelsiusAdaptee celsiusAdapter = new CelsiusAdaptee();
    private FahrenheitAdaptee fahrenheir = new FahrenheitAdaptee();
    private double temp= 0;
    
    @Override
    public double registroTemperatura(String dispositivo, double temperatura) {
        temp = 0;
        if(dispositivo.equals("Celsius")){
            celsiusAdapter.medirTemperatura(temperatura);
            temp = celsiusAdapter.getTemperatura();
        }else if (dispositivo.equals("Fahrenheit")){
            fahrenheir.medirTemperatura(temperatura);
            temp = fahrenheir.getTemperatura();
        }
        return temp;
    }
    
}
