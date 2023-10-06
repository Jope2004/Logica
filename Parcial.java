public class Parcial {
    static int numHotel() {
        int hotel = (int) (Math.random() * 7 + 1);
        return hotel;
    }

    static int numHoras() {
        int hora = (int) (Math.random() * 24 + 1);
        return hora;
    }

    static int numPisos() {
        int pisos = (int) (Math.random() * 15 + 1);
        return pisos;
    }

    static void Luz() {
        int luces = (int) (Math.random() * 3 + 1);
        switch (luces) {
            case 1:
                double halogena = 0.25;
                System.out.println("El tipo de luz es halogena y su valor es: " + halogena);
                break;
            case 2:
                double led = 0.50;
                System.out.println("El tipo de luz es led y su valor es: " + led);
                break;
            case 3:
                double multiled = 1.0;
                System.out.println("El tipo de luz es multiled y su valor es: " + multiled);
                break;
            default:
                System.out.println("Tipo de luz desconocido");
                break;
        }
    }

    public static void main(String[] args) {
        int numHoteles = 5; 

        for (int i = 1; i <= numHoteles; i++) {
            System.out.println("Hotel " + i);
            int numeroHotel = numHotel();
            System.out.println("Número de hotel: " + numeroHotel);

            int numeroHoras = numHoras();
            System.out.println("Número de horas: " + numeroHoras);

            int numerPisos = numPisos();
            System.out.println("Número de pisos: " + numerPisos);

            Luz();

            int cantidadLuz = (numerPisos * 3);
            int LuzHotel = (cantidadLuz*numerPisos);

            



            

        }
    }
}
