package Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
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

        // BoxWeight box6 = new Box();

        //reference a child to parent
        //there are many variables in both parent and child classes
        //you are given access to variables that are in the ref type i. e BoxWeight
        //hence you should have access to weight variable
        //thid also meeans that the one we are trying to access should be initialized 
        // but here when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
    }
}
