public class ConvertingNumericTypes {
        public static void main (String[] args){
            int intValue1 =56;
            int intValue2 = intValue1;
            System.out.println("The 2nd integer is:" + intValue2);

            long longValue1 = intValue1;//when WIDENING, the casting syntax isn't important coz the smaller values can always fit into the bigger data types.
            System.out.println("The long value is:" + longValue1);

            short shortValue1 = (short) intValue1;
            System.out.println("The Short value is:" + shortValue1);

            int intValue3 = 1024;
            byte byteValue1 = (byte) intValue3;//when NARROWING always be careful of the casting syntax.    
            System.out.println("The Byte value is: " + byteValue1);//Here, the conversion basically fails, and you have lost data. This
            //shows the difference and the danger between widening, which is safe, and narrowing, where there is a risk of losing data.

            double doubleValue = 3.9999999999d;
            int intValue4 = (int) doubleValue;
            System.out.println("Double to integer conversion yields: " + intValue4); //Double to Integer conversion
            //yields truncation. Very interesting stuff!



        }


    }


