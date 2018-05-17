public class Methods {

    // public - Visible to EveryOne
    // private - Visible only to class
    // protected - Visible to the package all all subclasses
    // static
    // final

     //modifier return-type  method-name(Parameter list) {
     // body
    // }


    private int score = 5;
    public static void main(String[] args) {
        System.out.println("Hello World");
        SayHello();
        int result = MiniumNumber(4,5);
        System.out.println(result);

    }

    public static void SayHello() {
        System.out.println("Hello Java");
        System.out.println("How are you ?");
    }

    public static int MiniumNumber(int num1, int num2) {
        int min;
        if( num1 > num2){
            min = num2;
        }else {
            min = num1;
        }
        return min;
    }

}
