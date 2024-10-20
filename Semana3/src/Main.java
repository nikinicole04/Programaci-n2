public class Main {
    public static void main(String[] args) {
        Automovil bmw = new Automovil("BMW");
        /*bmw.setMarca("BMW"); //atributos mediante metodos
        bmw.setModelo("i22");
        bmw.setColor("Negro");
        bmw.setCilindraje("2000");*/

        Automovil bmw2 = new Automovil("Mercedes", "ML200"); //CADA OBJETO ES DISTINTO!!!!!
        /*bmw2.setMarca("BMW");
        bmw2.setModelo("i22");
        bmw2.setColor("Negro");
        bmw2.setCilindraje("2000");*/

        System.out.println("DATOS \n" + bmw.verDetalle());
        System.out.println("\n");
        System.out.println("DATOS \n" + bmw2.verDetalle());
    }
}