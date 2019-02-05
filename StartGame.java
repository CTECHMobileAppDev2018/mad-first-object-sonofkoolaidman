
public class StartGame {
  
  public static void main(String[] args) {
   
    Player player1 = new Player();
    player1.setName("Mr. Bartucz");
    
    System.out.println("Player1 name is: " + player1.getName());
    
    // this won't work until you create a getHealth method in your object. Uncomment it when you do.
    System.out.println(player1.getName() + "'s health is: " + player1.getHealth());
    
    Player player2 = new Player();
    player2.setName("Max Kiger");
    
    System.out.println("Player2 name is: " + player2.getName());
    
    System.out.println(player2.getName() + "'s health is: " + player2.getHealth());
    
    Weapon weapon1 = new Weapon();
    weapon1.setType("Sword");
    
    System.out.println("Avalible weapon is: " + weapon1.getType());
    
    System.out.println(weapon1.getType() + "'s damage is: " + weapon1.getDamage());
  }  
  
}