package temperaturaDesafio;

public class TemperaturasGlobais {
    public static void main (String [] args){

        String listCoutriens [] = {"Londres","Madrid","Nueva York", "buenos Aires", "Asuncion","São Paulo","Lima","Santiago de Chile","Lisboa","Tokio"};
        int temperatura[] [] = {{-2,33}, {-3,32}, {-8,27},{4,37}{6,42},{5,43}, {0,39},{-7,26}{-1,31},{-10,35}};

        int minTemp = 0;
        int minCountry = 0;
        int maxTemp = 0;
        int maxCountry = 0;

        for ( int i =0; i< 10; i += 1){
            if (temperatura [i][0] < minTemp) {
                minTemp = temperatura [i] [0];
                minCountry = i;
            }
            if (temperatura [i][1] > maxTemp) {
                maxTemp = temperatura [i][1];
                maxCountry = i;
            }
        }
        System.out.println("Temperatura mais baixa foi em " + listCoutriens[minCountry]+ "com:" + temperatura[minCountry] [0]);
        System.out.println("Temperatura mais alta foi em "+ listCoutriens[maxCountry]+ "com:" + temperatura [maxCountry][1]);
    }
}
