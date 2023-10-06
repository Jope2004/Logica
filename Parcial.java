public class Parcial {
    
    static int numHoras() {
        int hora = (int) (Math.random() * 24 + 1);
        return hora;
    }

    static int numPisos() {
        int pisos = (int) (Math.random() * 15 + 1);
        return pisos;
    }

    static double getTipoLuz() {
        int luces = (int) (Math.random() * 3 + 1);
        double precioLuz = 0.0; 

        switch (luces) {
            case 1:
                precioLuz = 0.25;
                System.out.println("El tipo de luz es halógena y su valor es: " + precioLuz);
                break;
            case 2:
                precioLuz = 0.50;
                System.out.println("El tipo de luz es LED y su valor es: " + precioLuz);
                break;
            case 3:
                precioLuz = 1.0;
                System.out.println("El tipo de luz es multiled y su valor es: " + precioLuz);
                break;
            default:
                System.out.println("Tipo de luz desconocido");
                break;
        }

        return precioLuz;
    }

    public static void main(String[] args) {

        int numHoteles = (int) (Math.random() * 7 + 1);

        for (int i = 1; i <= numHoteles; i++) {
            System.out.println("Hotel " + i);
            int numeroHotel = numHotel();
            System.out.println("Número de hotel: " + numeroHotel);

            int numeroHoras = numHoras();
            System.out.println("Número de horas: " + numeroHoras);

            int numPisos = numPisos();
            System.out.println("Número de pisos: " + numPisos);

            double precioLuz = getTipoLuz();

            int cantidadLuz = numPisos * 3;
            double PrecioHora = cantidadLuz * precioLuz;

            System.out.println("El Hotel gasta $" + PrecioHora + " por hora");

              System.out.println();
        }
    }
}
