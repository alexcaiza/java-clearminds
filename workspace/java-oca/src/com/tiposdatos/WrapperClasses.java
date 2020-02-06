package com.tiposdatos;

public class WrapperClasses
{
    public static void main(String[] args)
    {
        Byte B1 = new Byte((byte) 10);     //Constructor which takes byte value as an argument
        Byte B2 = new Byte("10");          //Constructor which takes String as an argument
        //Byte B3 = new Byte(10);     //Constructor which takes byte value as an argument
 
        //Byte B3 = new Byte("abc");      //Run Time Error : NumberFormatException
 
        //Because, String abc can not be parse-able to byte
 
        Short S1 = new Short((short) 20);   //Constructor which takes short value as an argument
        Short S2 = new Short("20");         //Constructor which takes String as an argument
 
        Integer I1 = new Integer(30);     //Constructor which takes int value as an argument
        Integer I2 = new Integer("30");   //Constructor which takes String as an argument
 
        Long L1 = new Long(40);      //Constructor which takes long value as an argument
        Long L2 = new Long("40");    //Constructor which takes String as an argument
 
        Float F1 = new Float(12.2f);      //Constructor which takes float value as an argument
        Float F2 = new Float("15.6");   //Constructor which takes String as an argument
        Float F3 = new Float(15.6d);    //Constructor which takes double value as an argument
 
        Double D1 = new Double(17.8d);       //Constructor which takes double value as an argument
        Double D2 = new Double("17.8");     //Constructor which takes String as an argument
        Double D3 = new Double(17.8f);
        Double D4 = new Double(17L);
        Double D5 = new Double(17);
        Double D6 = new Double((short)17);
        Double D7 = new Double((byte)17);
 
        Boolean BLN1 = new Boolean(false);       //Constructor which takes boolean value as an argument
        Boolean BLN2 = new Boolean("true");      //Constructor which takes String as an argument
        Boolean BLN3 = new Boolean("tRuE");      //TRUE
        Boolean BLN4 = new Boolean(null);      //FALSE
 
        Character C1 = new Character('D');      //Constructor which takes char value as an argument
        //Character C2 = new Character("abc");    //Compile time error : String abc can not be converted to character
    }
}
