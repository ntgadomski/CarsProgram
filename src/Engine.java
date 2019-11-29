import java.util.Date;

/**
 * Engine Interface that is implemented by Class ManufacturedEngine.
 *
 * @author Nickolas Gadomski
 */
interface Engine {

  void setEngineCylinders(int engineCylinders);

  void setEngineManufacturedDate(Date date);

  void setEngineManufacturer(String engineManufacturer);

  void setEngineMake(String engineMake);

  void setEngineModel(String engineModel);

  void setDriveTrain(String driveTrain);

  void setEngineType(String fuel);
}
