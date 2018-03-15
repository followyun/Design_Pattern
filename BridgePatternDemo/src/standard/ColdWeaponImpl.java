package standard;

/**
 */
public class ColdWeaponImpl extends Weapon {
    @Override
    public String getName() {
        return "冷兵器" + weaponiml.getName();
    }

    public ColdWeaponImpl(WeaponImpl weaponiml) {
        super(weaponiml);
    }
}
