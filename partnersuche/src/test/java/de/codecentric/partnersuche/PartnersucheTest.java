package de.codecentric.partnersuche;

import org.junit.Assert;
import org.junit.Test;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.module.client.MuleClient;
import org.mule.tck.junit4.FunctionalTestCase;

public class PartnersucheTest extends FunctionalTestCase {

	@Test
	public void test() throws MuleException {

		Dfhcommarea dfhcommarea = new ObjectFactory().createDfhcommarea();
		dfhcommarea.setPartnerNr("1234567890");

		MuleMessage muleMessage = new MuleClient(muleContext).send(
				"vm://partnersuche", dfhcommarea, null);

		Object payload = muleMessage.getPayload();
		Assert.assertTrue("Payload ist keine Dfhcommarea",
				payload instanceof Dfhcommarea);

		dfhcommarea = (Dfhcommarea) payload;
		Assert.assertEquals("Max", dfhcommarea.getVorname());
		Assert.assertEquals("Mustermann", dfhcommarea.getName());
	}

	@Override
	protected String getConfigResources() {
		return "src/main/app/partnersuche.xml";
	}

}
