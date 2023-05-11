package Box;

public class Box {
    //Instance Variables:
    double height;
    double width;
    double depth;

    public Box(double height, double width, double depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
    }

    public double getVolume(){
        return this.depth*this.width*this.height;

    }
}
