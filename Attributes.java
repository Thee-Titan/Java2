public class Attributes {
    int x = 5;//an attribute is a variable which is also called a field. In this case, x is an attribute of
    //Attributes class. So in the section below, we have created an object within the Attributes class
    //and have linked this object to our globally declared attribute; x. So we have printed our object
    //which has been parsed to x and hence it prints out the value of x.


    public static void main (String[] args){
        Attributes myObj = new Attributes();
        Attributes myObj1 = new Attributes();
        System.out.println (myObj.x);
        myObj1.x = 38;
        System.out.println (myObj1.x);// we can change the value of our attribute in one object without affecting its
        //value in another object all within the same class of objects. Really interesting stuff!



    }

}
