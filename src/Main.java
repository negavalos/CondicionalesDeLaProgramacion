public class Main {
    public static void main(String[] args) {
        //tarea de if condicional
        int numeroIf = 0;
        if(numeroIf > 0 ){
            System.out.println("El numero " + numeroIf+ " es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero " + numeroIf+ " es negativo");
        }else {
            System.out.println("El numero es " + numeroIf);
        }

        //tarea de while
        int numeroWhile = 0;
        while (numeroWhile < 3){
            numeroWhile ++;
            System.out.println("NumeroWhile: " + numeroWhile);
        }

        //tarea Do while
        int numeroDoWhile = 7;
        do{
            numeroDoWhile ++;
            System.out.println("NumeroDoWhile: " + numeroDoWhile);
        }while(numeroWhile == numeroDoWhile);

        //tarea for
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("NumeroFor: " + numeroFor);
        }

        //tarea switch
        var estacion = "OTOÑO";
        switch (estacion){
            case "VERANO":
                System.out.println("Estamos en la estacion verano");
                break;
            case "INVIERNO":
                System.out.println("Estamos en la estacion invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Estamos en la estacion primavera");
                break;
            case "OTOÑO":
                System.out.println("Estamos en la estacion otoño");
                break;
            default:
                System.out.println("No hay estaciones");
        }


    }


}
