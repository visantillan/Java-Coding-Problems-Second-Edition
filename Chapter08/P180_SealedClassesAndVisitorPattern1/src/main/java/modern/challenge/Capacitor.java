package modern.challenge;

public class Capacitor implements ElectricComponent {

    private final int maxImpedance;
    private final int dielectricResistance;
    private final int coreTemperature;

    public Capacitor(int maxImpedance, int dielectricResistance, int coreTemperature) {
        this.maxImpedance = maxImpedance;
        this.dielectricResistance = dielectricResistance;
        this.coreTemperature = coreTemperature;
    }

    public int getMaxImpedance() {
        return maxImpedance;
    }

    public int getDielectricResistance() {
        return dielectricResistance;
    }

    public int getCoreTemperature() {
        return coreTemperature;
    }

    @Override
    public String accept(ElectricComponentVisitor visitor) {
        return visitor.visit(this);
    }
}