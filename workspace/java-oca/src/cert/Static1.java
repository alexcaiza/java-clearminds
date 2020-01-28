package src.cert;

class Order3 {
    final String value1 = "1";
    static String value2 = "2";
    String value3 = "3";
    
    {
        //value1 = "d";
        value3 = "f";
        value2 = "e";
    }
    
    static {
        value2 = "h";
        //value1 = "g";
        //value3 = "i";
    }
}

public class Static1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        final String value1 = "1";
        final String value2 = "2";
        
        String value3 = "3";
        
        {
            //value1 = "d";
            value3 = "f";
        }
        
        //static {
            //value2 = "h";
            //value1 = "h";
        //}

    }

}
