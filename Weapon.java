public class Weapon {
  
  private String type;
  private int damage;
  
  // constructor for weapon
  Weapon() {
   this.damage = 40;
  }
  // check if weapon name is longer than 0
  public void setType(String weaponType) {
    
    if (weaponType.length() < 1) {
     this.type = "invalid";
     return;
    }
    
    this.type = weaponType;
  }
  // getting name
  public String getType() {
   return this.type; 
  }
  
  
  public void setDamage(int weaponDamage) {
    if (weaponDamage > 100) {
     this.damage = 100;
     return;
    }
    if (weaponDamage < 0) {
      this.damage = 0;
      return;
    }
    this.damage = weaponDamage;
  }
  public int getDamage() {
    return this.damage;
  }
}