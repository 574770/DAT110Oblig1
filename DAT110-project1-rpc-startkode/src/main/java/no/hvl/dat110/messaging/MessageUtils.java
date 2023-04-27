package no.hvl.dat110.messaging;

import java.util.Arrays;

import no.hvl.dat110.TODO;

public class MessageUtils {

	public static final int SEGMENTSIZE = 128;

	public static final int MESSAGINGPORT = 8080;
	public static final String MESSAGINGHOST = "localhost";
	
	public static byte[] encapsulate(Message message) {
		
		byte[] segment = new byte[SEGMENTSIZE];
		byte[] data;
		
		// TODO - START
		
		data = message.getData(); 
		segment[0] = (byte)data.length; 
		
		// encapulate/encode the payload data of the message and form a segment
		// according to the segment format for the messagin layer
		
		for(int i = 0; i < data.length; i++) {
			
			segment[i+1] = data[i]; 
			
		}
		
//		if (true)
//			throw new UnsupportedOperationException(TODO.method());
			
		// TODO - END
		return segment;
		
	}

	public static Message decapsulate(byte[] segment) {
		
		
		byte[]data = new byte[segment[0]]; 
		// TODO - START
		// decapsulate segment and put received data into a message
		for(int i = 0; i < data.length; i++) {
			data[i] = segment[i+1]; 
		}
		
		Message message = new Message(data); 
//		if (true)
//			throw new UnsupportedOperationException(TODO.method());
		
		// TODO - END
		
		return message;
		
	}
	
}
