package vaulsys.protocols.iso8583v87;

import vaulsys.protocols.base.ProtocolMessageValidator;

import org.apache.log4j.Logger;

public class ISO8583v87ProtocolMessageValidator implements ProtocolMessageValidator {

    transient Logger logger = Logger.getLogger(ISO8583v87ProtocolMessageValidator.class);

    @Override
    public boolean validateIntegrity() {
    	return true;
    }

    @Override
    public void makeValidate() {
    }
}