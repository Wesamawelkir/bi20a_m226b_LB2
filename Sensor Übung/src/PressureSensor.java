public abstract class PressureSensor extends Sensor {
    private String unit;
    protected double measurementValue;

    public PressureSensor(String unit) {
        this.unit = unit;
    }

    @Override
    public Double getValue() {
        return measurementValue;
    }

    @Override
    public String getUnit() {
        return unit;
    }
}