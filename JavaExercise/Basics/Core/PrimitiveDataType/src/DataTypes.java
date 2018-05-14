public class DataTypes {

    public static void main(String[] args) {
        System.out.println("New Module");

//        byte - -128 : 127
//        short - -32768 : 32767
//        int -  2,147,483,648 : 2,147,483,647
//        long
//        float 231.5f
//        double 231.5
//        boolean true : false
//        char - 'A'
//        byte myByte = 58;
//        System.out.println(myByte);

          int mInt = 22/7;
          float mFloat = 22/ 7.0f;
          double mDouble = 22 / 7d;

        System.out.println( "Int value is : " + mInt);
        System.out.println( "Float value is : " + mFloat);
        System.out.println( "Double value is : " + mDouble);
        boolean isActive = false;
        System.out.println(isActive);
        char mChar = 'a';
        String mValue = Integer.toHexString(mChar);
        System.out.println(mChar);
        System.out.println(mValue);

        char mUniCode = '\u0099';
        System.out.println(mUniCode);

        String mString = "I am a String";
        System.out.println("Answer is : " + mString);

        String fakeValue = "22.987";
        String fakeValueTwo = "33.8";

        System.out.println( fakeValue + fakeValueTwo);







    }
}
