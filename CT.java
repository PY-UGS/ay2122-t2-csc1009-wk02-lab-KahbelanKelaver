
public class CT {
    public static void main(String arg[]) 
    { 
        long milliseconds = System.currentTimeMillis();
        long seconds = milliseconds/1000;
        long currentSecond = seconds % 60;
        long minutes = seconds / 60;
        long currentMinute = minutes % 60;
        long hours = minutes / 60;
        long currentHour = hours % 24;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT ");
        

    }


}
