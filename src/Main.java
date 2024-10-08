//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil ();

        auto.setMarca("Mercedes");
        auto.setModelo("AMG");
        auto.setColor("Rojo");
        auto.setCilindraje("2000");

        System.out.println("Detalles del auto:\n" + auto.verDetalle());

    }
}