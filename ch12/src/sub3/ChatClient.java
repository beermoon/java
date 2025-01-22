package sub3;

import java.net.Socket;

public class ChatClient {

	public static void main(String[] args) {
		
		System.out.println("[Client]");
		
		Socket socket = null;
				
		try {
			
			socket = new Socket("127.0.0.1",9001);
			
			Thread receiver = new ReceiverThread(socket);
			Thread sender = new SenderThread(socket);
			
			receiver.start();
			sender.start();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
//		System.out.println("Client 채팅 종료...");
		
		
	}
}
