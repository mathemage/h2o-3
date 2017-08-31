package hex.pca;

/**
 * @author mathemage <ha@h2o.ai>
 *         created on 2.5.17
 */
public enum SVDImplementation {
  EVD_MTJ_DENSEMATRIX, EVD_MTJ_SYMM, MTJ, JAMA;
  final static SVDImplementation fastestImplementation = EVD_MTJ_SYMM;    // set to the fastest implementation
  
  public static SVDImplementation getFastestImplementation() {
    return fastestImplementation;
  }
}
