package mssgER;

import java.io.IOException;
import java.net.ServerSocket;

public class MssgServer {
	
	private ServerSocket mssgServer;
	public void StringServer(int port) throws IOException {
		mssgServer = new ServerSocket(port);
	}


	public static void main(String[] args) {
		
	}
	
}
