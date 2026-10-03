public class RoofTopSolarEnrgyMonitorIfElseCondition {
    public static void main(String[] args) {
        int panelId = 101;
        double energyGeneratedKWh = 10.0;
        int numberOfSolarPanels = 10;
        char systemStatus = 'A';

        if (energyGeneratedKWh > 10) {
            System.out.println("Good energy is being generated.");
        } else {
            System.out.println("Low energy is being generated.");
        }
    }
}
