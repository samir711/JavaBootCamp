public class PatternA {

    public static void main(String[] args) {

        //Pattern A
//        for(int i=1 ; i <= 8;i++) {
//
//            for(int j = 0; j< i;j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
        //Pattern B

//        for(int i = 5; i>0 ; i--) {
//            for(int j=i ; j > 0; j--) {
//                System.out.print("*");
//            }
//
//            System.out.println(" ");
//
//        }

        //Pattern C
//        for(int i = 5; i>0 ; i--) {
//            for(int j=i ; j > 0; j--) {
//                System.out.print(j);
//            }
//
//            System.out.println(" ");
//
//        }
        //Pattern D
//        for(int i = 5; i>0 ; i--) {
//            for(int j=0 ; j < i ; j++) {
//
//                System.out.print(y);
//            }
//
//            System.out.println(" ");
//
//        }
        for(int i = 5; i>0 ; i--) {
            for(int j=0 ; j < i ; j++) {


                System.out.print(j + 1);
            }

            System.out.println(" ");

        }

    }
}
