import java.util.Date;

/**
 * Class Car the extends class Vehicle and handles the creation of the car.
 *
 * @author Nickolas Gadomski
 */
public final class Car extends Vehicle {

  // Declare local variables
  private final Feature[] feature;
  private final int carAxle;

  // Constructor for objects of class Vehicle

  /** Default Constructor initializes "Car". */
  public Car() {

    // initialize vehicle
    super();

    // This sets the features and axle
    this.feature = new Feature[]{
      new InteriorFeature("No Interior Features"), new ExteriorFeature("No Exterior Features")
    };
    this.carAxle = 2;
  }

  // Constructor for objects of class Vehicle
  /**
   * This Overloaded Constructor is initiating the variables for "Car".
   *
   * @param vehicleManufacturer String
   * @param vehicleManufactureDate Date
   * @param vehicleMake String
   * @param vehicleModel String
   * @param vehicleType String
   * @param vehicleFrame Chassis Object
   * @param vehicleEngine Engine Object
   * @param feature Feature Object
   * @param carAxle Integer
   */
  public Car(
      String vehicleManufacturer,
      Date vehicleManufactureDate,
      String vehicleMake,
      String vehicleModel,
      String vehicleType,
      Chassis vehicleFrame,
      Engine vehicleEngine,
      Feature[] feature,
      int carAxle) {

    // Initialize vehicle
    super(
        vehicleManufacturer,
        vehicleManufactureDate,
        vehicleMake,
        vehicleModel,
        vehicleType,
        vehicleFrame,
        vehicleEngine);

    //noinspection Annotator
    this.feature = feature;
    this.carAxle = carAxle;
  }

  /**
   * Method used to generate for loop list of car Exterior Features.
   *
   * @return exteriorList (for loop)
   */
  // Declare local get list for getExteriorFeatures
  public String getExteriorFeatures() {

    // Declaring local variables for comma separated list

    StringBuilder exteriorList = new StringBuilder();
    // Read the features into a comma separated list

    for (Feature value : this.feature) {
      if (value instanceof ExteriorFeature) {
        if (exteriorList.length() == 0) {
          exteriorList.append(value);
        } else {
          exteriorList.append("\n            :").append(value);
        }
      }
    }
    // Return tokenized string

    return exteriorList.toString();
  }

  /**
   * Method used to generate for loop list of car Interior Features.
   *
   * @return interiorList (for loop)
   */

  // Declare local get list for InteriorFeatures
  public String getInteriorFeatures() {

    // Declare local variable for comma separated list
    StringBuilder interiorList = new StringBuilder();

    // Read the features into a comma separated list.
    for (Feature value : this.feature) {
      if (value instanceof InteriorFeature) {
        if (interiorList.length() == 0) {
          interiorList.append(value);
        } else {
          interiorList.append("\n        :").append(value);
        }
      }
    }

    return interiorList.toString();
  }

  /**
   * toString Method used to combine car list and output to console.
   *
   * @return list (for loop)
   */
  public String toString() {

    // Declare local variable for comma separated list.
    StringBuilder list = new StringBuilder();

    // Read the features into a comma separated list.
    for (Feature value : this.feature) {
      if (list.length() == 0) {
        list.append(value);
      } else {
        list.append("\n     :").append(value);
      }
    }

    // Print instance description
    return super.toString() + "\n" + "Features      :" + list + "\n" + "Car Axle      : " + carAxle;
  }
}
