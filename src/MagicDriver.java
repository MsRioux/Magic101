public class MagicDriver
{
    public static void main(String[] args)
    {
        //create an object
        Dragon happy = new Dragon("Happy", 20, false, true);
        Dragon nobody = new Dragon();
        //print out the object via toString
        System.out.println(happy.toString());
        System.out.println(nobody.toString());
        System.out.println();
        //test getters and setters
        happy.setName("Sad");
        System.out.println();
        System.out.println("Happy is now called " + happy.getName());
        System.out.println(happy.toString());

    }// end main method
}//end driver class
