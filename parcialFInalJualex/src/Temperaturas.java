public class Temperaturas {
    
    
    public static int contarDiasCalurosos(int[][] matriz) {
        int contador = 0;
        for (int[] ciudad : matriz) {
            for (int temp : ciudad) {
                if (temp > 30) {
                    contador++;
                }
            }
        }
        return contador;
    }
    
    public static double promedioDiasFrescos(int[][] matriz) {
        int suma = 0;
        int contador = 0;
        for (int[] ciudad : matriz) {
                for (int temp : ciudad) {
                    if (temp < 20) {
                        suma += temp;
                        contador++;
                    }
                }
            }
            return contador > 0 ? (double) suma / contador : 0.0;
        }
        public static void imprimirTemperaturasExtremas(int[][] matriz) {
            System.out.println("Temperaturas extremas (<10°C o >35°C):");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    int temp = matriz[i][j];
                    if (temp < 10 || temp > 35) {
                        System.out.println("Ciudad " + i + ", Día " + j + ": " + temp + "°C");
                    }
                }
            }
        }

    public static void main(String[] args) {

        int[][] temperaturas = {
            {25, 32, 28, 19, 22, 31, 36},
            {18, 21, 29, 15, 10, 33, 37},
            {8, 12, 14, 11, 9, 13, 10}
        
        };
        System.out.println("Días calurosos (>30°C): " + contarDiasCalurosos(temperaturas));
        System.out.println("Días frescos(<20°C): " + promedioDiasFrescos(temperaturas));
    }
    
}