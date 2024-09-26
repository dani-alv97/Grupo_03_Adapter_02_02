/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.grupo_03_adapter_02_02.controller;

import java.text.DecimalFormat;
import ups.edu.ec.grupo_03_adapter_02_02.model.TemperaturaAdapter;

/**
 *
 * @author Grupo 3
 */
public class ControllerTemperatura {

    private String[] listaTemperatura;

    public ControllerTemperatura() {
        listaTemperatura = new String[3];
    }

    public String[] getListaTemperatura() {
        return listaTemperatura;
    }

    public void registrarTemperatura(String dispositivo, double temperatura) {
        DecimalFormat df = new DecimalFormat("0.00");
        var temperaturaAdapter = new TemperaturaAdapter();
        var temp = temperaturaAdapter.registroTemperatura(dispositivo, temperatura);
        if (dispositivo.equals("Celsius")) {
            listaTemperatura[0] = dispositivo;
            listaTemperatura[1] = df.format(temperatura);
            listaTemperatura[2] = df.format(temp);
        }else if (dispositivo.equals("Fahrenheit")){
            listaTemperatura[0] = dispositivo;
            listaTemperatura[1] = df.format(temp);
            listaTemperatura[2] = df.format(temperatura);
        }

    }

}
