public class RoofTopSolarEnergyMonitorDataTypes {
    public static void main(String[] args) {
        int panelId = 101;
        double energyGeneratedKWh = 0.0;
        int numberOfSolarPanels = 10;
        char systemStatus = 'A';

        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated: " + energyGeneratedKWh + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfSolarPanels);
        System.out.println("System Status: " + systemStatus);
    }
}