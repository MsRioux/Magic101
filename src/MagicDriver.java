public class MagicDriver
{
    public static void main(String[] args)
    {
        //create an object
        Dragon happy = new Dragon("Happy", 20, false);
        Dragon nobody = new Dragon();
        //print out the object via toString
        System.out.println(happy.toString());
        System.out.println(nobody.toString());
        System.out.println();
        //test getters and setters
        happy.setDragonName("Sad");
        System.out.println();
        System.out.println("Happy is now called " + happy.getDragonName());
        System.out.println(happy.toString());

    }// end main method
}//end driver class
