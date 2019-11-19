import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<Animal>();
        animales = nueva_mascotap(animales);
        while (true) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Bienvenido");
            System.out.println("");
            System.out.println("1 - Añadir una nueva mascota");
            System.out.println("2 - Cambiar dueño de una mascota");
            System.out.println("3 - Reportar fallecimiento de una mascota");
            System.out.println("4 - Mostrar lista de mascotas");
            System.out.println("5 - Saludar");
            System.out.println("6 - Alimentar");
            int o = scn.nextInt();
            switch(o){
                case 1:
                    animales = nueva_mascota(animales);
                    break;
                case 2:
                    animales = nuevo_dueño(animales);
                    break;
                case 3:
                    animales = death(animales);
                    break;
                case 4:
                    lista(animales);
                    break;
                case 5:
                    animales = saludar_main(animales);
                    break;
                case 6:
                    animales = alimentar(animales);
                    break;
                default:
                    System.out.println("Error");
                    System.out.println("Error");
                    System.out.println("Error");
                    System.out.println(" ");
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }
    }

    public static ArrayList<Animal> nueva_mascota(ArrayList<Animal> animales){
        Scanner scn = new Scanner(System.in);
        String xx;
        System.out.println("Que tipo de animal es la nueva mascota?");
        String x = scn.nextLine();
        System.out.println("Cual es su dueño?");
        String d = scn.nextLine();
        System.out.println("Y su nombre?");
        String n = scn.nextLine();
        switch (x) {
            case "perro": {
                Animal animal_nuevo = new Perro(n, d);
                animales.add(animal_nuevo);
                break;
            }
            case "gato": {
                Animal animal_nuevo = new Gato(n, d);
                animales.add(animal_nuevo);
                break;
            }
            case "pajaro":
            case "pajarito":
                System.out.println("Es cantor?");
                xx = scn.nextLine();
                if (xx.equals("si")) {
                    System.out.println("Como es su canto?");
                    n = scn.nextLine();
                    Animal animal_nuevo = new Pajaro(xx, n, d);
                    animales.add(animal_nuevo);
                } else {
                    Animal animal_nuevo = new Pajaro(n, d);
                    animales.add(animal_nuevo);
                }
                break;
            case "pez":
            case "basura":
                animales.add(new Pez_q_pruscino_odia(n, d));
                break;
            default:
                System.out.println("Error");
                break;
        }
            return animales;
    }

    public static ArrayList<Animal> nuevo_dueño(ArrayList<Animal> animales){
        Scanner scn = new Scanner(System.in);
        System.out.println("Quien cambio su dueño?");
        String s = scn.nextLine();
        for(int i=0; i!=animales.size(); i++){
            if(animales.get(i).getnombre().equals(s)){
                System.out.println("Cual es el nuevo dueño?");
                animales.get(i).setdueño(scn.nextLine());
            }
        }
        return animales;
    }

    public static ArrayList<Animal> death(ArrayList<Animal> animales){
        Scanner scn = new Scanner(System.in);
        System.out.println("Quien murio?");
        String s = scn.nextLine();
        for(int i=0; i!=animales.size(); i++){
            if(animales.get(i).getnombre().equals(s)){
                animales.remove(i);
            }
        }
        return animales;
    }

    public static void lista(ArrayList<Animal> animales){
        for(int i=0; i!=animales.size(); i++){
            animales.get(i).mostrar();
        }
    }

    public static ArrayList<Animal> saludar_main(ArrayList<Animal> animales){
        Scanner scn = new Scanner(System.in);
        String x;
        String n;
        System.out.println("Quien es usted?");
        x = scn.nextLine();
        System.out.println("A quien va a saludar?");
        n = scn.nextLine();
        for(int i=0; i!=animales.size(); i++){
            if(n.equals(animales.get(i).getnombre())){
                animales = animales.get(i).saludar(x, n, animales);
            }
        }
        return animales;
    }

    public static ArrayList<Animal> alimentar(ArrayList<Animal> animales){
        Scanner scn = new Scanner(System.in);
        String n;
        System.out.println("A quien va a alimentar?");
        n = scn.nextLine();
        for(int i=0; i!=animales.size(); i++){
            if(n.equals(animales.get(i).getnombre())){
                animales.get(i).alimentar(n);
            }
        }
        return animales;
    }













    public static ArrayList<Animal> nueva_mascotap(ArrayList<Animal> animales){
        Animal animal_nuevo = new Perro("la", "yo");
        animales.add(animal_nuevo);
        animal_nuevo = new Perro("e", "yo");
        animales.add(animal_nuevo);
        return animales;
    }
}