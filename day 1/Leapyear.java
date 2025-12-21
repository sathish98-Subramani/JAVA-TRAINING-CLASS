public class Leapyear {
    public static void main(String[] args) {
        int year = 2020;
        boolean isLeap = false;

        if(year % 4 == 0) {
            if( year % 100 == 0) {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
}
