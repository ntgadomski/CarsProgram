import java.util.Date;

/**
 * Vehicle Class that utilizes the Interfaces Engine and Chassis.
 *
 * @author Nickolas Gadomski
 */
@SuppressWarnings("Annotator")
public class Vehicle implements Engine, Chassis {

  private final Date vehicleManufacturedDate;
  private String vehicleManufacturer;
  private final String vehicleMake;
  private final String vehicleModel;
  private final Chassis vehicleFrame;
  private final String vehicleType;
  String driveTrain;
  private final Engine vehicleEngine;

  /** Default constructor initializes "Vehicle". */
  public Vehicle() {
    // Initialize Vehicle
    this.vehicleManufacturedDate = new Date();
    this.vehicleManufacturer = "Generic";
    this.vehicleMake = "Generic";
    this.vehicleType = "None";
    this.vehicleModel = "Generic";
    this.vehicleFrame = new VehicleFrame();
    this.vehicleEngine = new ManufacturedEngine();
    this.vehicleEngine.setEngineType("88 AKI");
    this.vehicleEngine.setDriveTrain("2WD: Two-Wheel Drive");
  }

  /**
   * This Overloaded Constructor is initiating the variables for "Vehicle".
   *
   * @param vehicleManufacturer String
   * @param vehicleManufacturedDate Date
   * @param vehicleMake String
   * @param vehicleModel String
   * @param vehicleType String
   * @param vehicleFrame Chassis Object
   * @param engine Engine Object
   */
  @SuppressWarnings("Annotator")
  public Vehicle(
      String vehicleManufacturer,
      Date vehicleManufacturedDate,
      String vehicleMake,
      String vehicleModel,
      String vehicleType,
      Chassis vehicleFrame,
      Engine engine) {

    // Initialize vehicle
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleEngine = engine;
    this.vehicleType = vehicleType;
  }

  /**
   * Mutator that sets method definitions.
   *
   * @param engineCylinders local Integer
   */
  @Override
  public void setEngineCylinders(int engineCylinders) {
    vehicleEngine.setEngineCylinders(engineCylinders);
  }

  /**
   * Mutator that sets method definitions.
   *
   * @param date Date
   */
  @Override
  public void setEngineManufacturedDate(Date date) {
    vehicleEngine.setEngineManufacturedDate(date);
  }

  /**
   * Mutator that sets method definitions.
   *
   * @param manufacturer String
   */
  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.vehicleManufacturer = manufacturer;
  }

  /**
   * Mutator that sets method definitions.
   *
   * @param engineMake local String
   */
  @Override
  public void setEngineMake(String engineMake) {
    this.vehicleEngine.setEngineMake(engineMake);
  }

  /**
   * Mutator that sets method definitions.
   *
   * @param engineModel local String
   */
  @Override
  public void setEngineModel(String engineModel) {
    this.vehicleEngine.setEngineModel(engineModel);
  }

  /**
   * Mutator that sets method definitions.
   *
   * @param driveTrain local String
   */
  @Override
  public void setDriveTrain(String driveTrain) {
    this.vehicleEngine.setDriveTrain(driveTrain);
  }

  /**
   * Mutator that sets method definitions.
   *
   * @param fuel String
   */
  @Override
  public void setEngineType(String fuel) {
    this.vehicleEngine.setEngineType(fuel);
  }

  /**
   * Accessor that Implements method definitions.
   *
   * @return local Chassis Object
   */
  @Override
  public Chassis getChassisType() {
    return vehicleFrame;
  }

  /**
   * Mutator that sets method definitions.
   *
   * @param vehicleChassis local String
   */
  @Override
  public void setChassisType(String vehicleChassis) {
    this.vehicleFrame.setChassisType(vehicleChassis);
  }

  /**
   * toString Method used to call String Definitions.
   *
   * @return toString String
   */
  public String toString() {
    // Print instance description.
    return "Manufacturer Name   : "
        + this.vehicleManufacturer
        + "\n"
        + "Manufactured Date   : "
        + this.vehicleManufacturedDate.toString()
        + "\n"
        + "Vehicle Make        : "
        + this.vehicleMake
        + "\n"
        + "Vehicle Model       : "
        + this.vehicleModel
        + "\n"
        + "Vehicle Type        : "
        + this.vehicleType
        + "\n"
        + vehicleEngine.toString();
  }
}
