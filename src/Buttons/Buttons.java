package Buttons;
import java.awt.*;
public class Buttons {

        public Buttons(){

            Frame myFrame=new Frame("See the button!");
            Panel myPanel =new Panel();
            Button myButton = new Button("Press me!");
            myFrame.add(myPanel);
            myPanel.add(myButton);
            myFrame.pack();
            myFrame.setVisible(true);


    }
}
