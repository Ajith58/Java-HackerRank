import java.util.Scanner;   
import java.util.Date;

public class solution {
     
    Date d = new Date();
    System.out.println(d);
    
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}