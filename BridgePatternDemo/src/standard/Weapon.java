package standard;

/**
 * 武器
 */
public abstract class Weapon {

    public abstract String getName();
    protected WeaponImpl weaponiml;
    public Weapon(WeaponImpl weaponiml) {
        this.weaponiml = weaponiml;
    }
}
