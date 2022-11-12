public class Main {
    public static void main(String[] args) throws Exception {
//        Earth earth = new Earth();
//        earth.printDiameter();

        Planet planet = new Planet() {
            @Override
            public void printPlanetName(String name) throws Exception {
                System.out.println(name);
            }
        };
        planet.printPlanetName("Earth");
        System.out.println(ISolarSystem2.numberOfPlanetsInSolarSystem); // public static final interface variable
    }
}
