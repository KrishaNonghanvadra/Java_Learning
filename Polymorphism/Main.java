package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shap = new Shape();
        Circle cir = new Circle();
        Square squ = new Square();
        Triangle tri = new Triangle();

        // shap.area();
        // cir.area();
        // squ.area();
        // tri.area();

        Shape sh_cir = new Circle();

        sh_cir.area();
        // Area is : 3.14 * r * r
    }
}
