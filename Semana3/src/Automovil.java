public class Automovil {
    private String marca;
    private String modelo;
    private String color;
    private String cilindraje;

    //constructores
    public Automovil() {
    }

    public Automovil(String marca) {
        this.marca = marca;
    }

    public Automovil(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    //metodos set y get2
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    //metodos propios y de calculo
    public String verDetalle(){
        String details = "La marca: " + getMarca() + "\n" +
                "El modelo: " + this.modelo + "\n" +
                "El color: " + this.color + "\n" +
                "EL cilindraje: " + getCilindraje();
        return details;
    }
    //modificacion de metodos nativos
}

//bytecode se encuentra entre el programa fuente y el programa objeto