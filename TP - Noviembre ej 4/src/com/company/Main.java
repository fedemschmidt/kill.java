package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList <Persona> todos = new ArrayList<Persona>();
    }

    public Persona mejor (ArrayList <Persona> todos){
        Persona m = todos.get(0);
        for(int i=1; i!=todos.size(); i++){
            if(m.getch()<todos.get(i).getch()) m = todos.get(i);
        }
        return m;
    }

    public Persona peor (ArrayList <Persona> todos){
        Persona p = todos.get(0);
        for(int i=1; i!=todos.size(); i++){
            if(p.getch()>todos.get(i).getch()) p = todos.get(i);
        }
        return p;
    }
}
