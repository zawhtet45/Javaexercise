import java.util.Arrays;
public class Exercises16{
    public static void main(String[] args){
    double[] tempForecast = {26.0,24.5,22.3};
    double[] tempForecastCopy = new double[tempForecast.length];
        for(int i = 0; i < tempForecast.length; i++){
            tempForecastCopy[i] = tempForecast[i];
            if(tempForecastCopy[i] == 24.5)
            System.out.println(tempForecastCopy[i]);
        }
    }
}