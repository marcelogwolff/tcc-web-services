package addressing;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import javax.xml.ws.handler.MessageContext;

/**
 * Classe que responsável por lidar dom os headers recebidos na mensagem SOAP
 * Ela será usada para retirar os headers messageID e ReplyTo
 * 
 */
public class AddressingJavaLocal {
	
	private static final Logger log = Logger.getLogger("AddressingJavaLocal");

	private String messageId;
	private String relatesTo;
	private String Action;
	private String replyTo;
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getRelatesTo() {
		return relatesTo;
	}
	public void setRelatesTo(String relatesTo) {
		this.relatesTo = relatesTo;
	}
	public String getAction() {
		return Action;
	}
	public void setAction(String action) {
		Action = action;
	}
	public String getReplyTo() {
		return replyTo;
	}
	public void setReplyTo(String replyTo) {
		this.replyTo = replyTo;
	}
	
	public AddressingJavaLocal obtemHeaders(MessageContext messageContext) {
		String addressingHeadersString = messageContext.get("javax.xml.ws.addressing.context.inbound").toString();
		log.info(addressingHeadersString);
		addressingHeadersString = addressingHeadersString.
				replace("[", "").
				replace("]", "").
				replace("MessageId:", "MessageId=").
				replace("Action:", "Action=").
				replace("ReplyTo:", "ReplyTo=").
				replace("RelatesTo:","RelatesTo=").trim();
		log.info(addressingHeadersString);
		String[] addressingHeadersArray = addressingHeadersString.split(",");
		
		List<String> headersList = Arrays.asList(addressingHeadersArray);
		
		for(String header: headersList) {
			String[] headerArray = header.split("=");
			
			if(headerArray[0].trim().equals("MessageId")) {
				this.setMessageId(headerArray[1].trim());
			}
			if(headerArray[0].trim().equals("RelatesTo")) {
				this.setRelatesTo(headerArray[1].trim());
			}
		}
		
		return this;
	}

}
