package Inheritance;

public class Box{

    double h;
    double l;
    double w;

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //cube
    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

    Box(double l,double h, double w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void display(){
        System.out.println("Running the box");
    }

    public static void main(String[] args) {
        // Box box = new Box();

        // System.out.println(box.l + " "+ box.w + " "+ box.h);

        // Box cube = new Box(4);

        // System.out.println(cube.l + " " + cube.w + " " + cube.h);

        // Box rec = new Box(4,5.2,6.5);

        // System.out.println(rec.l + " " + rec.w + " " + rec.h);

        // Box objpara = new Box(cube);

        // System.out.println(objpara.l + " " + objpara.w + " " + objpara.h);

        
    }
}

