package mssgER;

import java.io.Serializable;

public class Wmessage implements Serializable {
	private static final long serialVersionUID = -1323139009255772554L;
	String message;
	int ipAddress;
	String pubKey;
	boolean encrTrue;
	int timeStamp;

	
	Wmessage(String message, int ipAddress, String pubKey, boolean encrTrue, int timeStamp) {
		this.message=message;
		this.ipAddress=ipAddress;
		this.pubKey=pubKey;
		this.encrTrue=encrTrue;
		this.timeStamp=timeStamp;
		
	}
}
