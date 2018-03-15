package standard;

/**
 * 热兵器
 */
public class HotWeaponImpl extends Weapon {
    @Override
    public String getName() {
        return "热兵器" + weaponiml.getName();
    }

    public HotWeaponImpl(WeaponImpl weaponiml) {
        super(weaponiml);
    }
}
