public class Player2 extends  Player1{

    private int health;
    public boolean armour;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void damagebygun1() {
        if(armour)
        {
            this.health -= 20;
            if(this.health <=0)
            {
                this.health = 0;
            }
            System.out.println("the armour is on. got hit by gun 1. health is reduced by 20. new health is : "+this.health);
        }
        if(!armour)
        {
            this.health -= 30;
            if(this.health <=0)
            {
                this.health = 0;
            }
            System.out.println("he armour is off. got hit by gun 1. health is reduced by 30. new health is : "+this.health);
        }
        if(this.health == 0)
        {
            System.out.println(getName()+" player is dead");
        }
    }

    public void damagebygun2() {
        if (armour) {
            this.health -= 40;
            if (this.health <= 0) {
                this.health = 0;
            }
            System.out.println("the armour is on. got hit by gun 2. health is reduced by 40. new health is : " + this.health);
        }
        if (!armour) {
            this.health -= 50;
            if (this.health <= 0) {
                this.health = 0;
            }
            System.out.println("he armour is off. got hit by gun 2. health is reduced by 50. new health is : " + this.health);
        }
        if (this.health == 0) {
            System.out.println(getName() + " player is dead");
        }
    }

    @Override
    public void heal() {
        super.heal();

    }
}
