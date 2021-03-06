import java.util.ArrayList;

public class MagicDriver
{
    public static void main(String[] args)
    {
        //create an object
        Dragon happy = new Dragon("Happy", 20, false, true, 20);
        Dragon nobody = new Dragon();
        Monster ogre = new Monster("OgreBob", 15, true, "air");
        Monster nothing = new Monster();

        System.out.printf("Watch out, there are %d enemies attacking! %n%n", Enemy.countEnemies);

        //Creating an ArrayList
        ArrayList<Enemy> enemyArrayList = new ArrayList<>();
        enemyArrayList.add(happy);
        enemyArrayList.add(nobody);
        enemyArrayList.add(ogre);
        enemyArrayList.add(nothing);

        for(int i = 0; i < enemyArrayList.size(); i++)
        {
            System.out.println(enemyArrayList.get(i));
        }


/*
        Enemy[] enemyList = {happy, nobody, ogre, nothing};

        System.out.println(ogre.mightReact());
        System.out.println(nothing.mightReact());
        System.out.println(ogre.compareTerrain());
        System.out.println(nothing.compareTerrain());

        System.out.println();
        for (Enemy e: enemyList)
        {
            System.out.println(e.toString());
            System.out.println();
        }//end loop to print out the list of enemies
*/
/*

        //print out the object via toString

        System.out.println(happy.toString());
        System.out.println(nobody.toString());

        nobody.setWingspan(-2);
        System.out.println(nobody.toString());


 */
/*
        System.out.println(ogre.toString());
        System.out.println(nothing.toString());
        System.out.println();
        //test getters and setters
        happy.setName("Sad");
        System.out.println();
        System.out.println("Happy is now called " + happy.getName());
        System.out.println(happy.toString());
*/
    }// end main method
}//end driver class
