//https://www.w3schools.com/java/java_operators.asp
public class oprator {
    public static void main(String[] args) {

        int x = 5 ;
        int y = 5 ;

//        x+y
//        x-y
//        x*y
//        x/y
//       x % y
//        --x
        x += 5;   // add 5 to x
        x -= 5;   // substrate 5 to x


        x = 5;

        System.out.println(x==5  && y == 6);
        System.out.println(x!=y || 2==2);

        if (x+y < 11){
            System.out.println("the number is too small");
        }else if( x+y > 11){
            System.out.println("the number is big");
        }else {
            System.out.println("number is 11");
        }


//        for(int i = 0; i < -10; i++){
//            System.out.println(i);
//        }
//
//        while( x == 5){
//            System.out.println(x);
//            x = 6;
//        }

        int length = 10;

        for (int row=0; row < length;row++){
            for (int space = 0; space<row;space++){
                System.out.print(' ');
            }
            System.out.println("*");
        }
    }


}



//*       0
// *      1
//  *     2
//   *
//    *

