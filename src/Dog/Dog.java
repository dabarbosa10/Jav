public class Dog { //class declaration
    //Instance Variables
    String name;
    String breed;
    int age;
    String color;

    //Constructor, Declaration of class
    public Dog(String name, String breed, int age, String Color){
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

}
