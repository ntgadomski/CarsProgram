/**
 * Chassis Interface implemented by class VehicleChassis and VehicleFrame.
 *
 * @author Nickolas Gadomski
 */
public interface Chassis {

  // Declare constants

  String chassis = "Chassis";

  // Declare method definitions
  Chassis getChassisType();

  void setChassisType(String vehicleChassis);
}
