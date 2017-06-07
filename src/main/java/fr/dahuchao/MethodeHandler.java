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
			Gson gson = new Gson();
			MethodeDemande demande = gson.fromJson(message.getPayload(),
					MethodeDemande.class);
			System.out.println("demande: " + demande);
			MethodeMessage moyen = new MethodeMessage("CB", "Carte bancaire",
					"/icon.png", "/paiement/cb");
			session.sendMessage(new TextMessage(gson.toJson(moyen)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
