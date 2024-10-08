//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil ("bmw");

        //auto.setMarca("Mercedes");
        auto.setModelo("AMG");
        auto.setColor("Rojo");
        auto.setCilindraje("2000");

        System.out.println("Detalles del auto:\n" + auto.verDetalle());

        Automovil auto2 = new Automovil("Mercedes","ML 200");
        //auto2.setMarca("Mercedes");
        //auto2.setModelo("AMG");
        auto2.setColor("Rojo");
        auto2.setCilindraje("2000");

        System.out.println("Segundo auto\n " + auto2.verDetalle());

    }
}