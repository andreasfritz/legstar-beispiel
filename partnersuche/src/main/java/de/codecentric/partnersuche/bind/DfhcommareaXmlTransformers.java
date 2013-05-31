package de.codecentric.partnersuche.bind;

import com.legstar.coxb.transform.AbstractXmlTransformers;
import com.legstar.coxb.transform.HostTransformException;

/**
 * XML Transformers provider for Dfhcommarea.
 *
 */
public class DfhcommareaXmlTransformers extends AbstractXmlTransformers {

    /**
     * Create a set of directional transformers.
     * @throws HostTransformException if transformer cannot be created
     */
    public DfhcommareaXmlTransformers() throws HostTransformException {
        super(new DfhcommareaXmlToHostTransformer(),
                new DfhcommareaHostToXmlTransformer());
    }

}
