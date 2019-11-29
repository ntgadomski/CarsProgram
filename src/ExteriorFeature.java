/**
 * ExteriorFeature Class that utilizes interface Feature to manipulate fields.
 *
 * @author Nickolas Gadomski
 */
public class ExteriorFeature implements Feature {

  // Declare local variables
  private String exteriorFeature;

  /** Default Constructor initializes "ExteriorFeature". */
  public ExteriorFeature() {
    this.exteriorFeature = "Generic";
  }

  /**
   * Constructor utilizing local String exteriorFeature.
   *
   * @param exteriorFeature String
   */
  public ExteriorFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }

  /**
   * Accessor that implements method definitions.
   *
   * @return local String exteriorFeature
   */
  public String getFeature() {
    return this.exteriorFeature;
  }

  /**
   * Mutator that sets method definitions.
   *
   * @param feature String
   */
  public void setFeature(String feature) {
    this.exteriorFeature = feature;
  }

  /**
   * toString Method used to call String Definitions.
   *
   * @return toString String
   */
  // Override the toString() method
  public String toString() {
    return "Exterior [" + this.exteriorFeature + "]";
  }
}
