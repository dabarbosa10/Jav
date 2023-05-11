package Dog;

public class Dog { //class declaration
    //Instance Variables
    String name;
    String breed;
    int age;
    String color;

    //Constructor, Declaration of class
    public Dog(String name, String breed, int age, String color){
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.color=color;
    }
    //Methods:
    public String getName(){
        return name;
    }

    public String getBreed(){
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
    @Override public String toString() {
        return("Hi my name is " + this.getName()+
                ".\n My breed, age and color are: "
                +this.getBreed()+ ", " +this.getAge()
                + ", "+ this.getColor());

    }

    public void pr(){
        System.out.println("My name is: "+this.getName()+" guaauuu");
    }
}
