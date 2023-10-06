
public class Parcial {
    static int numHotel() {
        int hotel[] = {(int) (Math.random() * 7 + 1)};
        return hotel[0];
    }
    static int numHoras() {
        int Hora[] = {(int) (Math.random() * 23 + 1)};
        return Hora[0];
    }
    static int numPisos() {
        int Pisos[] = {(int) (Math.random() * 15 + 1)};
        return Pisos[0];
    }
    static int Luz() {
        int Luces = (int) (Math.random() * 3 + 1);
        switch (Luces) {
            case 1:
             double halogena = 0.25;
             System.out.println("El tipo de luz es, halogena y suvalor es : "+ halogena);
                
                break;
            case 2: 
            double led = 0.50;
            System.out.println("El tipo de luz es, led y su valor es : "+ led);
                break;
            case 3:
            double multiled = 1;
            System.out.println("El tipo de luz es, multiled y suvalor es : "+ multiled);
            default:
                break;
        }
        return Luces;
    }

    public static void main(String[] args) {
        int numeroHotel = numHotel();
        System.out.println("Número de hotel: " + numeroHotel);

        int numeroHoras = numHoras ();
        System.out.println("Numero de horas: "+ numeroHoras);

        int numerPisos = numPisos();
        System.out.println("Numero de pisos "+ numerPisos); 

        System.out.println( Luz() );


    }
}
