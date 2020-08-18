public class Dragon
{
    //instance variables
    String dragonName;
    int might;
    boolean isHostile;

    //constructors
    public Dragon(String dragonName, int might, boolean isHostile)
    {
        this.dragonName = dragonName;
        this.might = might;
        this.isHostile = isHostile;
    }// end full constructor

    public Dragon()
    {
        dragonName = null;
        might = 0;
        isHostile = true;
    }//end null constructor

    //getters
    public String getDragonName()
    {
        return dragonName;
    }//end getDragonName

    public int getMight()
    {
        return might;
    }

    //setters
    public void setDragonName(String dragonName)
    {
        this.dragonName = dragonName;
    }

    public void setMight(int might)
    {
        this.might = might;
    }
    //toString   this is the test output method

    @Override
    public String toString()
    {
        return "This Dragon has:" +
                "\n\tName = " + dragonName +
                "\n\tmight = " + might +
                "\n\tisHostile = " + isHostile;
    } // end toString (there is only one!)
}//end dragon classs
