package standard;

/**
 * 万家
 */
public class Player {
    private String name;
    public void attack(Monster monster, Weapon weapon){
        System.out.println("【玩家】"+name+"使用"+weapon.getName()+"攻击"+monster.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(String name) {
        this.name = name;
    }
}
