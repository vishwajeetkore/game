public class Player1 {
    private String name;
    private String weapon;
    private int health;

    public Player1(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if(health <0 || health >100)
        {
            this.health = 100;
        }
        else {
            this.health = health;
        }
    }

    public void damagebygun1()
    {
        this.health -= 30;
        if(this.health <= 0)
        {
            this.health = 0;
        }
        System.out.println("the player 1 is shot by gun 1 the health reduce 30, new health is " + this.health);

        if(this.health == 0)
        {
            System.out.println(getName()+" is dead ");
        }
    }

    public void damagebygun2()
    {
        this.health -= 50;
        if(this.health <= 0)
        {
            this.health = 0;
        }
        System.out.println("the player 1 is shot by gun 2 the health reduce 30, new health is " + this.health);

        if(this.health == 0)
        {
            System.out.println(getName()+" is dead ");
        }
    }

    public  void heal(){
        if(this.health <=0)
        {
            System.out.println("the "+getName()+ "is dead heal is not possible ");
        }
        else{
            this.health = 100;
            System.out.println("health is "+this.health);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
























