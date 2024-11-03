public enum Transport {
    CAR(0.1),
    BUS(0.05),
    TRUCK(0.02);

    private final double Km;

    Transport(double Km) {
        this.Km = Km;
    }

    public double calculateTravelCost(double distance) {
        return distance * Km;
    }
}
