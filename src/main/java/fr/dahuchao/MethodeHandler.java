package fr.dahuchao;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.google.gson.Gson;

@Component
public class MethodeHandler extends TextWebSocketHandler {

	@Override
	public void handleTextMessage(WebSocketSession session, TextMessage message) {
		try {
			// ...
			System.out.println("test: " + message.toString());
			MethodeMessage moyen = new MethodeMessage("CB", "Carte bancaire",
					"/icon.png", "/paiement/cb");
			Gson gson = new Gson();
			session.sendMessage(new TextMessage(gson.toJson(moyen)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
