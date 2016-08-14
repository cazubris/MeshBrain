/*
 * Duplicate plan in java, recreate with offsets
 * send changes via mavlink.
 */
package meshbrain;

import java.util.ArrayList;

/**
 *
 * @author cazub
 */
public class Waypoint {
    public Double Lat = 0.0;
    public Double Lon = 0.0;
    public Double Alt = 0.0;
    public Double Heading = 0.0;
    public ArrayList<String> ActionList;
}
