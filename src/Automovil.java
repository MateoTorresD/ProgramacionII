public class Automovil {
    //atributos - propiedades - estados

    //la clase principal de java es object
    //el bytecode esta en medio del programa fuente y el programa objeto


    private String marca;
    private String modelo;
    private String color;
    private String cilindraje;

    //constructores

    //debe llevar el mismo nombre de la clase y empieza con mayuscula
    //puede recibir parametros

    public Automovil() {
    }

    public Automovil(String marca) {
        this.marca = "bmw";
    }

    public Automovil(String marca, String modelo) {
        this.marca= marca;
        this.modelo = modelo;
    }

    //metodos set y get

    public String getMarca() {
        return marca;
    }

    /*public void setMarca(String marca) {
        this.marca = marca;
    }*/

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

   /* public void setModelo(String modelo) {
        this.modelo = modelo;
    }*/

    //metodos propios y de calculo

    public String verDetalle(){
        String dv = "La marca del auto es: " +this.getMarca()+ "\n" + "El cilindraje del auto es: " + this.getCilindraje() + "\n" +
                "El color del auto es: " +this.getColor() +"\n" + "El modelo del auto es: "+this.getModelo();
        return dv;
    }

    //modificacion de metodos nativos

}
