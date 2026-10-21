package Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight){
        super(l,h,w);
        //call the parent class constructor
        //used to initialize values paresenr in parent class
        this.weight = weight;
    }

    public static void main(String[] args) {
        // BoxWeight box1 = new BoxWeight();

        // System.out.println(box1.l + " "+ box1.weight);

        // BoxWeight box2 = new BoxWeight(2,3.3,4.6,5.9);

        Box box5 = new BoxWeight(2,3,4,5);
        double wid = box5.w;
        // double weig = box5.weight;
        // can't access child class propweties
    }
}
