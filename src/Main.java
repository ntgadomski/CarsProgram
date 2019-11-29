import java.util.Date;

/**
 * Main Class is utilized for testing code from other classes and outputting to console. @Author
 * Nickolas Gadomski
 */
@SuppressWarnings("ALL")
class Main {

  /**
   * Main Method used for testing.
   * @param args String
   */
  public static void main(String[] args) {

    // Test the default constructor / print instance attributes
    Car c1 = new Car();
    System.out.println(
        "**********************************************************************************");
    System.out.println(c1);

    // Test the overloaded constructor / print instance attribute
    System.out.println(
        "**********************************************************************************");
    // Seed the features with subclasses
    Feature[] f = {
      new InteriorFeature("AM/FM Radio"),
      new ExteriorFeature("Wood Panels"),
      new InteriorFeature("Air Conditioning"),
      new ExteriorFeature("MoonRoof")
    };

    // Create overloaded Car instance
    Car c2 =
        new Car(
            "Honda",
            new Date(1325599999999L),
            "Honda",
            "Prelude",
            "Coupe",
            new VehicleChassis("Unibody"),
            new ManufacturedEngine(
                "Honda", new Date(), "H-Series", "H23A1", "2WD: Two-Wheel Drive", 4, "88 AKI"),
            f,
            2);
    System.out.println(c2);

    // Test the default constructor / print instance attributes
    System.out.println(
        "**********************************************************************************");
    Vehicle v =
        new Car(
            "Honda",
            new Date(1325599999999L),
            "Honda",
            "Prelude",
            "Coupe",
            new VehicleChassis("Unibody"),
            new ManufacturedEngine(
                "Honda", new Date(), "H-Series", "H23A1", "2WD: Two-Wheel Drive", 4, "88 AKI"),
            f,
            2);
    System.out.println(((Car) v).getExteriorFeatures());

    // Test the instanceOf operator / separates interior or exterior features
    System.out.println(
        "**********************************************************************************");
    System.out.println("Exterior Features       : " + c2.getExteriorFeatures());
    System.out.println("Interior Features       : " + c2.getInteriorFeatures());
    System.out.println(
        "**********************************************************************************");

    // Test the default constructor / print instance attributes
    System.out.println(
        "**********************************************************************************");
    Vehicle v1 = new Vehicle();
    System.out.println(v1);

    // Test the overloaded constructor / print instance attribute
    System.out.println(
        "**********************************************************************************");
    Vehicle v2 =
        new Vehicle(
            "Honda",
            new Date(1325599999999L),
            "Honda",
            "Prelude",
            "Coupe",
            new VehicleChassis("Unibody"),
            new ManufacturedEngine(
                "Honda", new Date(), "H-Series", "H23A1", "2WD: Two-Wheel Drive", 4, "88 AKi"));

    System.out.println(v2);
    System.out.println(
        "**********************************************************************************");
    v2.setEngineCylinders(6);
    System.out.println(v2);
    System.out.println(
        "**********************************************************************************");

    // Test the default constructor / print instance attributes.
    System.out.println(
        "**********************************************************************************");
    ExteriorFeature ef1 = new ExteriorFeature();
    System.out.println(ef1);

    // Test the overloaded constructor / print instance attributes.
    System.out.println(
        "**********************************************************************************");
    ExteriorFeature ef2 = new ExteriorFeature("Fog Lamps");
    System.out.println(ef2);
    System.out.println(
        "**********************************************************************************");

    // Test the default constructor / print instance attributes.
    System.out.println(
        "**********************************************************************************");
    InteriorFeature if1 = new InteriorFeature();
    System.out.println(if1);

    // Test the overloaded constructor / print instance attributes.

    System.out.println(
        "**********************************************************************************");
    InteriorFeature if2 = new InteriorFeature("Climate Control");
    System.out.println(if2);

    // Test the case for equal() method.
    System.out.println(
        "**********************************************************************************");

    // Test the default constructor / print instance attribute
    ManufacturedEngine me1 = new ManufacturedEngine();
    System.out.println(me1);

    // Test the default constructor / print instance attributes
    System.out.println(
        "**********************************************************************************");
    ManufacturedEngine me2 =
        new ManufacturedEngine(
            "Honda",
            new Date(1325599999999L),
            "H-Series",
            "H23A1",
            "2WD: Two-Wheel Drive",
            4,
            "88 AKI");
    System.out.println(me2);
    System.out.println(
        "**********************************************************************************");

    VehicleChassis vc1 = new VehicleChassis();
    System.out.println(vc1);

    // Test the overloaded constructor / print instance attribute
    System.out.println(
        "**********************************************************************************");

    VehicleChassis vc2 = new VehicleChassis("Test Chassis");
    System.out.println(vc2);
    System.out.println(
        "**********************************************************************************");

    // Test the default constructor / print instance attributes
    System.out.println(
        "**********************************************************************************");
    VehicleFrame vf1 = new VehicleFrame();
    System.out.println(vf1);

    // Test the overloaded constructor / print instance attributes
    System.out.println(
        "**********************************************************************************");
    VehicleFrame vf2 = new VehicleFrame("ladder Frame");
    System.out.println(
        "**********************************************************************************");
  }
}
