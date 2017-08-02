/**
 * Created by lggui on 01/08/2017.
 */
public class Media {

    public double calcularMedia(double[] valores) {
        double soma= 0.00;
        for(int i =0;i<valores.length;i++){
            soma+=valores[i];
        }
        return soma/valores.length;
    }

    public double[] convertToDoubleArray(String[] valores) {
        double[] convertedValues = new double[valores.length];
        for (int i=0;i<valores.length;i++){
             convertedValues[i] = Double.parseDouble(valores[i]);
         }
            return convertedValues;
    }
}
