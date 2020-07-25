public class speedCalculator {

    public static void main(String[] args){

        long toMilesPerHour=toMilesPerHour(5);
    }

    public static long toMilesPerHour(double kilometersPerHour){


        if(kilometersPerHour<0){
            return -1;
        }
        else if(kilometersPerHour>0){
            long milesPerHour=(long)(1.6* kilometersPerHour);
            System.out.println("The conversion of KM/hr into Miles/hr is " +milesPerHour);
        return toMilesPerHour();
        }
    }
}
