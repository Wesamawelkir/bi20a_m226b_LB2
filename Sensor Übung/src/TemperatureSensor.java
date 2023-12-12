public abstract class TemperatureSensor extends Sensor {
    private String unit;
    protected double measurementValue;

    public TemperatureSensor(String unit) {
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