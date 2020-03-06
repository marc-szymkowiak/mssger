package mssgER;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MssgServer {
	
	private ServerSocket mssgServer;
	public void StringServer(int port) throws IOException {
		mssgServer = new ServerSocket(port);
	}


	public static void main(String[] args) {
		
	}
	
	private void connectServer() {
		while (true) {
			Socket socket = null;
			try {
				socket = mssgServer.accept();
				interconnect(socket);
			}
			catch (IOException e) {
				e.printStackTrace();
				
			}
			finally {
				if (socket != null)
					try {
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
		}
	} 
	
	private void interconnect(Socket socket) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(socket
				.getInputStream()));
		PrintStream out = new PrintStream(socket.getOutputStream());
		String s;
		
		while(in.ready()) {
			
		}
	}

	
}

