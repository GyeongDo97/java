package Pack;

import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/*
//Server3)
//IP�ּҸ� �Է��Ҽ��ִ� â
//���۵� �� �����ϴ� ��ư Ȱ��ȭ ���۹�ư ��Ȱ��ȭ
//������ ������ ��
//������ ���� ä�� ��� �ʿ����
class ClientThread extends Thread{
	Socket socket;
	Server server;
	static String ns;
	LinkedList<Socket> chat = new LinkedList<Socket>();
	ClientThread(LinkedList<Socket> chat, Socket socket, Server server){
		this.socket = socket;
		this.chat = chat;
		this.server = server;
	}
	@Override
	public void run() {
		try {
			InputStream inputstream = socket.getInputStream();
			byte[] name = new byte[32];
			int nsize = inputstream.read(name);
			ns = new String(name, 0, nsize, StandardCharsets.UTF_8);

			while(true) {
				if(socket == null) {
					server.textArea.appendText(" ���� �������ϴ�.\n");
				}
				//���ŷ
				byte[] data = new byte[512];
				
				int size = inputstream.read(data);
				String s = new String(data, 0, size, StandardCharsets.UTF_8);
				System.out.println(s + " ������ ����");
				new ChatThread(chat, s, ns).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
			server.textArea.appendText(ns + " ���� �������ϴ�.\n");
		}
	}
}
class ChatThread extends Thread{
	String s;
	LinkedList<Socket> chat = new LinkedList<Socket>();
	ChatThread(LinkedList<Socket> chat, String s, String ns){
		this.chat = chat;
		this.s = ns+" : "+s;
	}
	@Override
	public void run() {
		
		for (Socket socket2 : chat) {
			//System.out.println(chat2);
			try {
				
				System.out.println(socket2.getInetAddress() + " ������");
				OutputStream outputStream = socket2.getOutputStream();
				byte[] data = s.getBytes(StandardCharsets.UTF_8);//�ѱ�
				outputStream.write(data);
				System.out.println("������ ����");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
class ConnectThread extends Thread{
	Server server;
	ConnectThread(Server server){
		this.server = server;
	}
	@Override
	public void run() {
		LinkedList<Socket> chat = new LinkedList<Socket>();
		try {
			ServerSocket mss = new ServerSocket();
			System.out.println("���� ���� ���� ����");
			mss.bind(new InetSocketAddress("localhost", 5001));
			//mss.bind(new InetSocketAddress(InetAddress.getLocalHost(), 5001));
			System.out.println("���ε� �Ϸ�");
			
			while(true) {
				// ���ŷ
				Socket ss = mss.accept();
				chat.add(ss);
				//System.out.println(ss.getInetAddress() + " ������");
				server.textArea.appendText(ss.getInetAddress() + " ���� �����߽��ϴ�.\n");
				//��ũ�帮��Ʈ ������
				new ClientThread(chat, ss, server).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class Server extends Application{
	Button btn1 = new Button("���� ����");
	TextArea textArea = new TextArea();
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300); // â ũ��
		root.setSpacing(15);
		//-------------------------------------
		// �� ������ ��� �ڵ尡 ��
		// ��� 2
		
		root.getChildren().addAll(btn1, textArea);
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				new ConnectThread(Server.this).start();
			}
		});
		
		//-------------------------------------
		Scene scene = new Scene(root);
		arg0.setScene(scene); // ���� ���������� ����
		arg0.setTitle("Server"); // ����
		arg0.show(); // â ���

	}

	public static void main(String[] args) {
		launch();
	}
}
*/


/*
//Server2)
class ClientThread extends Thread{
	Socket socket;
	ClientThread(Socket socket){
		this.socket = socket;
	}
	public void run() {
		try {
			InputStream inputStream = socket.getInputStream();

			while(true) {
				byte[] data = new byte[512];
				int size = inputStream.read(data);
				String s = new String(data, 0, size);
				System.out.println(s + " ����Ÿ ����");				
			}
		} catch (Exception e) {

		}
	}
}
class ConnectThread extends Thread{
	public void run() {
		try {
			ServerSocket mss = new ServerSocket();
			System.out.println("���� ���� ���� ����");
			mss.bind(new InetSocketAddress(InetAddress.getLocalHost(), 5001));
			System.out.println("���ε� �Ϸ�");
			while(true) {
				//���ŷ
				Socket ss = mss.accept();
				System.out.println("������");
				new ClientThread(ss).start();
			}
			//����ó���� �Ѵ�. ���ŷ
		} catch (Exception e) {
			
		}
	}
}
public class Server extends Application{
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(10);
		//------------------------------------
		Button btn1 = new Button("��������");
		Button btn2 = new Button("��ư2");
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				new ConnectThread().start();
			}
		});

		root.getChildren().addAll(btn1, btn2);
		//------------------------------------
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("Server");
		arg0.show();
	}
	public static void main(String[] args) {
		launch();//blocking
	}
}
*/

/*
//Server1)
public class Server {
	public static void main(String[] args) {
		System.out.println("Server start");
		try {
			//������ ���� ����
			ServerSocket mss = new ServerSocket();
			System.out.println("���� ���� ���� ����");
			mss.bind(new InetSocketAddress(InetAddress.getLocalHost(), 5001));
			//���� �ٸ� IP ���� ��Ʈ��ũ����� ���ؼ��� ������ ��ȭ���� Ǯ����Ѵ�.
			//InetAddress.getLocalHost() - �̿��ؼ� �ڽ� IP�ޱ�
			System.out.println("���ε� �Ϸ�");

			Socket ss = mss.accept();
			//mss.accept - ���ŷ �Լ�
			
			System.out.println("������");
			InputStream inputStream = ss.getInputStream();
			
			byte[] data = new byte[512];
			
			int size = inputStream.read(data);
			//���ŷ �Լ�

			String s = new String(data, 0, size);
			System.out.println(s + " ����Ÿ ����");

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		new Scanner(System.in).nextInt();
	
		System.out.println("Server End");
	}
}
*/