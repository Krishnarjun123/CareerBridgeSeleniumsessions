public class DataTypes {
    public static void main(String[] args) {

    DataTypes obj=new DataTypes();
    obj.addition ();
    obj.subtraction();
    obj.addwithparameters( 10, 20);
    }
//methods or functions
    public static void addition (){
        int d=3;
        int e=6;
        int f=d+e;
        System.out.println(f);
    }

public static void subtraction(){

        int g=2;
        int h=1;
        int i=g-h;
        System.out.println(i);
    }
    public void addwithparameters (int a, int b){
        int d=a+b;
        System.out.println(d);
    }
}
