import java.util.ArrayList;

public class Main {
    public static void main(String[] argum){
        Mesa m1 = new Mesa();
        Mesa m2 = new Mesa();
        Mesa m3 = new Mesa();

        Plato p1 = new Plato();
        Plato p2 = new Plato();
        Plato p3 = new Plato();
        Plato p4 = new Plato();
        Plato p5 = new Plato();
        Plato p6 = new Plato();

        Sucursal s1 = new Sucursal();
        p1.setPedido(1);
        p1.setNmesa(1);
        p1.setCant(1);

        p2.setNombre("Ravioles rellenos con carne");
        p2.setPedido(2);
        p2.setNmesa(2);
        p2.setCant(2);

        p2.setNombre("Ravioles rellenos con carne");
        p2.setPedido(2);
        p2.setNmesa(2);
        p2.setCant(2);

        p3.setNombre("Pizza a la piedra");
        p3.setPedido(3);
        p3.setNmesa(3);
        p3.setCant(3);

        p4.setNombre("polenta con salsa fileto");
        p4.setPedido(4);
        p4.setNmesa(4);
        p4.setCant(4);

        p5.setNombre("Arroz primavera");
        p5.setPedido(5);
        p5.setNmesa(5);
        p5.setCant(5);

        p6.setNombre("Milanesa con pure de papa");
        p6.setPedido(3);
        p6.setNmesa(3);
        p6.setCant(4);

        s1.setCantmesas(3);
        s1.addplato(p1);
        s1.addplato(p2);
        s1.addplato(p6);
        s1.addmesa(m1);
        s1.addmesa(m2);
        s1.addmesa(m3);

        m1.addplato(p1);
        m2.addplato(p2);
        m3.addplato(p6);

        s1.register();

        s1.cantplatos();
    }
}