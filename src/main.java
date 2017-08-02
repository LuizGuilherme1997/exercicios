import java.util.Scanner;

/**
 * Created by lggui on 30/07/2017.
 */
public class main  {
    public static void main(String[] args) {
     Media media = new Media();
     double[] numeros = media.convertToDoubleArray(args);
     double result =  media.calcularMedia(numeros);
      System.out.println(result);
    }

}





