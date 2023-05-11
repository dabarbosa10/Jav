import Buttons.Buttons;
import Dog.*;
import Company.*;
import Box.*;
import Buttons.*;
public class main {
    public static void main(String[] args) {
        Dog tuffy = new Dog("tuffy", "papillon", 5, "white");
        System.out.println(tuffy.toString());
        tuffy.pr();
        Company.set("Microsoft", (float) 324.032);
        Company.get();

        Box box1= new Box(2,2,2);
        System.out.println("Box volume: "+box1.getVolume()) ;
       // new Buttons();

    }
}