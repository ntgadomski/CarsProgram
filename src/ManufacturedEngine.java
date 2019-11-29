import java.util.Date;

/**
 * ManufacturedEngine Class that utilizes Interface Engine to manipulate fields.
 *
 * @author Nickolas Gadomski
 */
@SuppressWarnings("ALL")
public class ManufacturedEngine implements Engine {
  private String engineModel;
  private String engineType;
  private int engineCylinders;
  private String engineMake;
  private Date engineManufacturedDate;
  private String driveTrain;
  private String engineManufacturer;

  /** Default Constructor initializes "ManufacturedEngine". */
  public ManufacturedEngine() {
    // initialize vehicle
    this.engineManufacturer = "Generic";
    this.engineManufacturedDate = new Date();
    this.engineMake = "Generic";
    this.engineModel = "generic";
    this.engineCylinders = 0;
    this.engineType = "85 ARI";
    this.driveTrain = "2wd: Two-Wheel Drive";
  }

  /**
   * This Overloaded Constructor is initiating the variables for "ManufacturedEngine".
   *
   * @param engineManufacturer String
   * @param engineManufacturerDate Date
   * @param engineMake String
   * @param engineModel String
   * @param driveTrain String
   * @param engineCylinders Integer
   * @param engineType String
   */
  public ManufacturedEngine(
      String engineManufacturer,
      Date engineManufacturerDate,
      String engineMake,
      String engineModel,
      String driveTrain,
      int engineCylinders,
      String engineType) {

    // initialize vehicle

    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturerDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.driveTrain = driveTrain;
    this.engineType = engineType;
    this.engineCylinders = engineCylinders;
  }

  // Declare method definitions

  /**
   * Mutator that sets method definitions.
   *
   * @param engineModel local String
   */
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  /**
   * Mutator that sets method definitions.
   *
   * @param fuel String
   */
  public final void setEngineType(String fuel) {
    this.engineType = fuel;
  }

  /**
   * Mutator that sets method definitions.
   *
   * @param engineCylinders local Integer
   */
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  /**
   * Mutator that sets method definitions.
   *
   * @param engineMake local String
   */
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  /**
   * Mutator that sets method definitions.
   *
   * @param date Date
   */
  public final void setEngineManufacturedDate(Date date) {
    this.engineManufacturedDate = date;
  }

  /**
   * Mutator that sets method definitions.
   *
   * @param driveTrain local String
   */
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  /**
   * Mutator that sets method definitions.
   *
   * @param manufacturer String
   */
  public final void setEngineManufacturer(String manufacturer) {
    this.engineManufacturer = manufacturer;
  }

  /**
   * toString Method used to call String Definitions.
   *
   * @return toString String
   */
  // Override the toString()

  public String toString() {
    // Print instance description

    return "Engine Manufacturer : "
        + this.engineManufacturer
        + "\n"
        + "Engine Manufactured : "
        + this.engineManufacturedDate.toString()
        + "\n"
        + "Engine Make : "
        + this.engineMake
        + "\n"
        + "Engine Model : "
        + this.engineModel
        + "\n"
        + "Engine Type : "
        + this.engineType
        + "\n"
        + "Engine Cylinders : "
        + this.engineCylinders
        + "\n"
        + "Drive Train : "
        + this.driveTrain;
  }
}
