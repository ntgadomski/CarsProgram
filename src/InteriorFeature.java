/**
 * InteriorFeature Class that utilizes interface Feature to manipulate fields.
 *
 * @author Nickolas Gadomski
 */
public class InteriorFeature implements Feature {

  // Declare local Variables
  private String interiorFeature;

  /** Default Constructor initializes "InteriorFeature". */
  public InteriorFeature() {
    this.interiorFeature = "Generic";
  }

  /**
   * This Constructor is to utilize the local variable.
   *
   * @param interiorFeature local String
   */
  public InteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  /**
   * Accessor that Implements method definitions.
   *
   * @return local String interiorFeature
   */
  public String getFeature() {
    return this.interiorFeature;
  }

  /**
   * Mutator that sets method definitions.
   *
   * @param feature String
   */
  public void setFeature(String feature) {
    this.interiorFeature = feature;
  }

  /**
   * toString Method used to call String Definitions.
   *
   * @return  toString String
   */
  // Override the toString() method
  public String toString() {
    return "interior [" + this.interiorFeature + "]";
  }
}
