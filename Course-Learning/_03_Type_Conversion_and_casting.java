public class _03_Type_Conversion_and_casting{
    public static void type_conversion(){
        byte a = 10;
        int b = a;
        float c = a;
        
        System.out.println(c);
        System.out.println(b);
    }

    public static void type_casting(){
        int a = 800;
        byte b = (byte)a;

        System.out.println(b);
    }

    public static void Case_of_promotion(){
        byte a = 10;
        byte b = 3;
        int c = a / b;
        float d = a/b; // 10/3 = 3.333 but the result will be 3 because the result of a/b is int and then it will be converted into float so the result will be 3.0

        System.out.println(c);
        System.out.println(d);
    }

    public static void main(String[] args) {
        type_conversion();
        type_casting();
        Case_of_promotion();
    }
}

//*! Type Conversion
//* Type conversion is a type of data which can be converted easily
//* For an example, we can easily convert a byte into an int
//* Because all possible values which are contained in a byte are also contained in an int

//*! Type Casting
//* Type casting is a type of data which can be converted but not easily
//* Before converting we need to use a special syntax to convert it that is (data_type)variable_name 
//* Imagine we want to convert an int into a byte, even if the int value is 10, we need to use a special syntax to convert it into a byte because the range of int is larger than the range of byte. 
//* if the int value is 300 which is out of range of byte so in this case the result that we will get is int_value/byte_range = 300/256 in this case 44 will be the remainder so our byte result will be 44

//*! Case of promotion
//* byte + byte
//*     ↓
//* int + int
//*     ↓
//* int


//* int + double
//*     ↓
//* double


//* int + float
//*     ↓
//* float