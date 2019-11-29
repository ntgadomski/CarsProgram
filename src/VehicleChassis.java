/**
 * Class VehicleChassis utilizes Interface Chassis.
 *
 * @author Nickolas Gadomski
 */
@SuppressWarnings("ALL")
public class VehicleChassis implements Chassis {

  private String chassisName;

  /** Default Constructor initializes "VehicleChassis". */
  public VehicleChassis() {
    this.chassisName = Chassis.chassis;
  }

  /**
   * Constructor utilizing local String chassisName.
   *
   * @param chassisName Sting
   */
  // Overloaded constructor
  public VehicleChassis(String chassisName) {
    this.chassisName = chassisName;
  }

  /**
   * Accessor that Implements method definitions.
   *
   * @return chassis Method
   */
  // Fix end bracket
  public Chassis getChassisType() {
    this.chassisName = chassis;
    return getChassisType();
  }

  /**
   * Mutator that sets method definitions.
   *
   * @param vehicleChassis String
   */
  // Implementing interface methods
  public void setChassisType(String vehicleChassis) {
    this.chassisName = vehicleChassis;
  }

  /**
   * toString Method used to call String Definitions.
   *
   * @return toString String
   */
  // Now override the toString() method
  public String toString() {
    return "Chassis Name  : " + this.chassisName;
  }
}
