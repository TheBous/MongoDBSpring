package myPackage.businessLogic;

/**
 * Created by thebous on 03/07/17.
 */
public class PhoneCounter {

    private static Integer Counter = 0;

    public static Integer incrementCounter(){
        return Counter++;
    }

}
