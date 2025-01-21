public class ArcadeGame {
    public String gameName;
    public int numberOfTokens;
    public boolean isMultiplayer;

    public ArcadeGame(String pgameName, int pnumberOfTokens, boolean pisMultiplayer){
        gameName = pgameName;
        numberOfTokens = pnumberOfTokens;
        isMultiplayer = pisMultiplayer;
    }

    public void printInfo(){
        System.out.println("Game Name: " + gameName);
        System.out.println("Number Of Tokens: " + numberOfTokens);
        System.out.println("Multiplayer: " + isMultiplayer);
    }
}
