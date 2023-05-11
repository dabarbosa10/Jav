package Company;

public class Company {
    //Instances
    static String sw_name;
    static float sw_price;

    public static void set(String n, float p){
        sw_name=n;
        sw_price=p;
    }

    public static void get(){
        System.out.println("The name of the Company is: " + sw_name);
        System.out.println("The price of the software is: "+sw_price);
    }

}
