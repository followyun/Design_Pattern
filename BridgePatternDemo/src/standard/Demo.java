package standard;

/**
 */
public class Demo {
        public static void test(){
            Monster monster = new Monster("飞科大魔王");
            Player player = new Player("小狗");
            Weapon weapon = new HotWeaponImpl(new BazookaWeaponImpl());
            player.attack(monster, weapon);
        }
}
