public class Main {
    public static void main(String[] args) {
        // Benutzereingaben für Sensor, Intervall und Dateinamen (Beispielwerte)
        Sensor selectedSensor = new Barometric1000PressureSensorImpl();
        int selectedInterval = 1000;
        String selectedFilename = "sensor_data.csv";

        // CsvWriter erstellen und starten
        CsvWriter csvWriter = new CsvWriter(selectedSensor, selectedInterval, selectedFilename);
        csvWriter.run();
    }
}