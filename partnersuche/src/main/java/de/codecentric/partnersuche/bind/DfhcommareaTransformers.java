package de.codecentric.partnersuche.bind;

import com.legstar.coxb.transform.AbstractTransformers;
import com.legstar.coxb.transform.HostTransformException;
import com.legstar.coxb.transform.HostTransformStatus;
import de.codecentric.partnersuche.Dfhcommarea;

/**
 * Transformer provider for Dfhcommarea java data object.
 *
 */
public class DfhcommareaTransformers extends AbstractTransformers {

    /**
     * Create a set of directional transformers.
     */
    public DfhcommareaTransformers() {
        super(new DfhcommareaJavaToHostTransformer(),
                new DfhcommareaHostToJavaTransformer());
    }

    /**
     * Transforms host data to java data object with a specific host character
     * set.
     * 
     * @param hostData a byte array containing host data
     * @param hostCharset the host character set
     * @return a Java value object
     * @throws HostTransformException if transformation fails
     */
    public Dfhcommarea toJava(final byte[] hostData, final String hostCharset)
            throws HostTransformException {
        return getHostToJava().transform(hostData, hostCharset);
    }

    /**
     * Transforms host data to java data object.
     * 
     * @param hostData a byte array containing host data
     * @return a Java value object
     * @throws HostTransformException if transformation fails
     */
    public Dfhcommarea toJava(final byte[] hostData)
            throws HostTransformException {
        return getHostToJava().transform(hostData);
    }

    /**
     * Transforms host data to java data object with a specific host character
     * set.
     * 
     * @param hostData a byte array containing host data
     * @param hostCharset the host character set
     * @param status will contain information on the transformation after it is
     *            executed
     * @return a Java value object
     * @throws HostTransformException if transformation fails
     */
    public Dfhcommarea toJava(final byte[] hostData, final String hostCharset,
            final HostTransformStatus status) throws HostTransformException {
        return getHostToJava().transform(hostData, hostCharset, status);
    }

    /**
     * Transforms host data to java data object.
     * 
     * @param hostData a byte array containing host data
     * @param status will contain information on the transformation after it is
     *            executed
     * @return a Java value object
     * @throws HostTransformException if transformation fails
     */
    public Dfhcommarea toJava(final byte[] hostData,
            final HostTransformStatus status)
            throws HostTransformException {
        return getHostToJava().transform(hostData, status);
    }

    /**
     * Transforms host data to java data object with a specific host character
     * set.
     * 
     * @param hostData a byte array containing host data
     * @param offset index of first byte to process in hostData
     * @param hostCharset the host character set
     * @return a Java value object
     * @throws HostTransformException if transformation fails
     */
    public Dfhcommarea toJava(final byte[] hostData, final int offset,
            final String hostCharset)
            throws HostTransformException {
        return getHostToJava().transform(hostData, offset, hostCharset);
    }

    /**
     * Transforms host data to java data object.
     * 
     * @param hostData a byte array containing host data
     * @param offset index of first byte to process in hostData
     * @return a Java value object
     * @throws HostTransformException if transformation fails
     */
    public Dfhcommarea toJava(final byte[] hostData, final int offset)
            throws HostTransformException {
        return getHostToJava().transform(hostData, offset);
    }

    /**
     * Transforms host data to java data object with a specific host character
     * set.
     * 
     * @param hostData a byte array containing host data
     * @param offset index of first byte to process in hostData
     * @param hostCharset the host character set
     * @param status will contain information on the transformation after it is
     *            executed
     * @return a Java value object
     * @throws HostTransformException if transformation fails
     */
    public Dfhcommarea toJava(final byte[] hostData, final int offset,
            final String hostCharset,
            final HostTransformStatus status) throws HostTransformException {
        return getHostToJava().transform(hostData, offset, hostCharset, status);
    }

    /**
     * Transforms host data to java data object.
     * 
     * @param hostData a byte array containing host data
     * @param offset index of first byte to process in hostData
     * @param status will contain information on the transformation after it is
     *            executed
     * @return a Java value object
     * @throws HostTransformException if transformation fails
     */
    public Dfhcommarea toJava(final byte[] hostData, final int offset,
            final HostTransformStatus status)
            throws HostTransformException {
        return getHostToJava().transform(hostData, offset, status);
    }
}
