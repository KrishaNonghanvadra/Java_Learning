class A {
    final int num = 10;// final variable must be initlize while declaring
    String name;

    A (){

    }

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("object is destroyed");
    }
}

class WrapperExample{
    public static void main(String[] args){

        // Integer num = new Integer(45);
        // Integer num = 45; // create as object
        
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a + " "+ b);//not swapping

        Integer c = 11;
        Integer d = 22;
        swap(c,d);
        System.out.println(c + " " + d); // still not swapping

        final float pi = 3.14f; // now we can't change value of pi

        final A obj = new A(); //object is non-primitive data type 
        // here you change the properties of A class but can't reassign the obj to other object

        final A krisha = new A("Krisha Nonghanavdra");
        krisha.name = "other name"; // I can do this
        // krisha  = new A("other object"); // can't do this
        
        A obje;

        for(int i=0;i<1000000;i++){
            obje = new A("random name");
        }

    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

