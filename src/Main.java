public class Main {
    public static void main(String[] args) {

        // Primitive and non primitive(reference data)


//        Primitive
        int x = 987;
        long l = 321354345;  //long   It is a 64 bit integer and ranges from -2^63 to +(2^63)-1
        short s = 10;          // short   However it’s 2 times smaller than the integer datatype. Its minimum range is -32,768 and maximum range is 32,767
        boolean y = true;    // boolean
        double d = 1.658;  //double    It has a range of -2^31 to (2^31)-1.
        char c = 'B';       // char
        byte a = 10;       // It’s an 8 bit signed two’s complement . The range of values are -128 to 127
        System.out.println("primitive  :" + x);

//        reference data
        int [] arr = {10,34,456,67,78};
        String word = "hi";
//        class like : class main in top
//        interface : it obligate classes to follow some rule

        System.out.println("non promitive  " + arr);

        System.out.println("non promitive  " + word.indexOf('h'));
        System.out.println("non promitive  " + word.charAt(1));


    }
}