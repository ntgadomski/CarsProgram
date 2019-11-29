/**
 * VehicleFrame Class that utilizes Interface Chassis.
 *
 * @author Nickolas Gadomski
 */
public class VehicleFrame implements Chassis {

  private String vehicleFrameType;

  /** Default Constructor initializes "VehicleFrame". */
  public VehicleFrame() {

    this.vehicleFrameType = "Unibody";
  }
  // Overloaded constructor for objects of class VehicleFrame

  /**
   * Constructor utilizing local String vehicleFrameType.
   *
   * @param vehicleFrameType local String
   */
  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  /**
   * Accessor that Implements method definitions.
   *
   * @return this
   */
  // Declare method definitions
  public Chassis getChassisType() {
    return this;
  }

  /**
   * Mutator that sets method definitions.
   *
   * @param vehicleFrameType local String
   */
  public void setChassisType(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  /**
   * toString Method used to call String Definitions.
   *
   * @return toString String
   */
  // Override the toString method
  public String toString() {
    // Print instance descriptions
    return "Chassis    :  " + Chassis.chassis + "\n" + "vehicle Frame : " + this.vehicleFrameType;
  }
}
