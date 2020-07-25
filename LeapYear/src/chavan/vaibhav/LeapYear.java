package chavan.vaibhav;

public class LeapYear {

    public static boolean isLeapYear(int year){

        boolean leap=false;

        if(year>0 && year<9999){
            if(year%4==0){

                if(year%100==0){

                    if(year%400==0){

                        return true;
                    }
                }
            }


        }
        else {
            return false;
        }


    }


}
