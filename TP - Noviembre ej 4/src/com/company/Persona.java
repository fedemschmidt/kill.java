package com.company;

import java.util.HashMap;

public class Persona {
    String nombre;
    String apellido;
    int dni;
    int ch;
    HashMap<Bebida, Integer> lista = new HashMap<Bebida, Integer>();

    public int getch() {
        return ch;
    }

    public void calcular_hidratacion(){
        int x = 0;
        for(Bebida i : lista.keySet()){
            x = x + i.getcp() - i.getcn()*lista.get(i);
        }
        ch = x;
    }
}
