/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Isaac Ruiz
 */
import java.util.Objects;

public class CFdatos {
    private final String dato;
    private final String tipo;

    public CFdatos(String dato, String tipo) {
        this.dato = dato;
        this.tipo = tipo;
    }
    
    public String convertir(){
        float res = 0;
        float valor;
        String resvalor;
    try {
    valor = Float.parseFloat(dato);
    // Operaciones con el valor float
    } catch (NumberFormatException e) {
        return("La cadena no es un número válido.");
    }
        
    switch(tipo){
        case "Celsius":{
            res = (valor * 9/5) + 32;
        }
            break;

        case "Fahrenheit":{
            res = (valor - 32) * 5 / 9;
        }
            break;
        default:{
            
        }
            break;
    }
        resvalor = String.valueOf(res);
        return resvalor;
    }

    public String getDato() {
        return dato;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dato, tipo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CFdatos datos = (CFdatos) o;
        return Objects.equals(dato, datos.dato) && Objects.equals(tipo, datos.tipo);
    }

    @Override
    public String toString() {
        return "CFdatos{" + "dato=" + dato + ", tipo=" + tipo + '}';
    }
}
