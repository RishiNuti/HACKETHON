public class RooftopSolarEnergyMonitorMethods {
    public void calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        double totalEnergy = morningEnergy + eveningEnergy;
        System.out.println("Total energy generated: " + totalEnergy + " kWh");

    }
        public static void main(String[] args) {
            RooftopSolarEnergyMonitorMethods monitor = new RooftopSolarEnergyMonitorMethods();
            monitor.calculateTotalEnergy(5.0, 7.0);
        }
}