public class Dragon extends Enemy
{
    //instance variables
    boolean hasFire;

    //constructors
    public Dragon(String name, int might, boolean isHostile, boolean hasFire)
    {
        super(name, might, isHostile);
        this.hasFire = hasFire;
    }// end full constructor

    public Dragon()
    {
        super();
        hasFire = false;
    }//end null constructor


    //toString   this is the test output method

    @Override
    public String toString()
    {
        return super.toString() +
                "\n\thasFire = " + hasFire;
    } // end toString (there is only one!)
}//end dragon classs
