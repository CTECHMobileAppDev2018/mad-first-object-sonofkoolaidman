public class PlayerArray {
  public static void main(String[] args) {
    
    //creates array of players
    Player[] playerArray = new Player[4];
    
    //int playerCount = 0;
    //while (playerCount < 5) 
    Player player0 = new Player();
    player0.setName("Max Kiger");
    
    playerArray[0] = player0; //adds player 0 to array
    
    Player player1 = new Player();
    player1.setName("Mr Barcuts");
    
    playerArray[1] = player1;
    
    for(int i = 0;i < playerArray.length; i++) {
      if (playerArray[i] != null) {
       System.out.println("Player" + i + " name is: " + playerArray[i].getName()); 
      }
    }
    
  }
}