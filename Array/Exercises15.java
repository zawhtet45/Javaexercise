import java.util.Arrays;
public class Exercises15{
    public static void main(String[] args){
        double[] tempForecast = {26.0,24.5,22.3};
        double[] tempForecastCopy = Arrays.copyOf(tempForecast,2);
              System.out.println(Arrays.toString(tempForecastCopy));
    }
}