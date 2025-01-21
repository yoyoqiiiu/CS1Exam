public class Arcade {
    //declaration section
    public String name;
    public boolean isOpen;
    public int yearFounded;

    public int randomInt;
    public String gameName;
    public double randNum;

    public ArcadeGame classicGame;
    public ArcadeGame myfavGame;

    //psvm
    public static void main(String[] args) {
        System.out.println("Hello World! Good luck on your exams! ");
        Arcade pixelParadise = new Arcade();
    }

    //constructor method
    public Arcade(){
        name = "Pixel Paradise";
        isOpen = true;
        yearFounded = 1985;
        System.out.println("Welcome to " + name + "! It is " + isOpen + " that we are open. We were founded in " + yearFounded + ". ");
        yearFounded = 2008;
        System.out.println("Welcome to " + name + "! It is " + isOpen + " that we are open. We were founded in " + yearFounded + ". ");

        spinForTokens();
        gameOfTheDay("Pacman");
        displayScores();
        ticketMultiplier();

        System.out.println("This is a classic...");
        ArcadeGame classicGame = new ArcadeGame("Pinball", 2, false);
        classicGame.printInfo();
        System.out.println("But this is my favorite! ");
        ArcadeGame myfavGame = new ArcadeGame("Pacman", 1, false);
        myfavGame.printInfo();
    }

    //methods
    public void spinForTokens(){
        randomInt = (int) (Math.random() * 50) + 1;
        System.out.println("You spun the wheel and you won " + randomInt + " tokens! ");
    }
    public void gameOfTheDay(String gameName){
        System.out.println("Today's game of the day is " + gameName + ". ");
    }
    public void displayScores(){
        for (int x=1;x<6;x=x+1){
            System.out.println(x);
        }
        for (int x=200;x<1101;x=x+300){
            System.out.println(x);
        }
        for (int x=6;x>-1;x=x-1){
            System.out.print(x + ", ");
        }
    }
    public void ticketMultiplier(){
        randNum = (double) (Math.random());
        if (randNum < 0.25){
            System.out.println("You've won 10 extra tickets. ");
        } else if (randNum >= 0.25 && randNum < 0.5){
            System.out.println("You've won 50 extra tickets. ");
        } else if (randNum >= 0.5 && randNum < 0.75) {
            System.out.println("You've doubled your tickets. ");
        } else if (randNum >= 0.75 && randNum < 1) {
            System.out.println("You've tripled your tickets. ");
        }
    }
}
