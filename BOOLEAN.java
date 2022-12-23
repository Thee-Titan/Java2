

public class BOOLEAN {
    static boolean bDef;
    public static void main(String[] args){
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("The boolean value of b1 is: " + b1);
        System.out.println("The boolean value of b2 is: " + b2);
        System.out.println("The boolean value of bDef is: " + bDef);//here, we see that the default value of
        //a boolean primitive data type is FALSE. we had to initialize bDef as a global variable in line 4
        //coz as a local variable, it would have resulted in an error stating that bDef would have to be initialized with a false value.

        boolean b3 = !b1;
        System.out.println("The boolean value of b3 is: " + b3);

        int i1 = 0;
        boolean b4 = (i1 != 0);
        System.out.println("The value of b4 is: " + b4); //see if there is any way this can be paired with if statements
        //to achieve anything interesting.

        String sBoolean = "true";
        boolean parsedValue = Boolean.parseBoolean(sBoolean);
        System.out.println("Parsed: " + parsedValue);
    }
}
