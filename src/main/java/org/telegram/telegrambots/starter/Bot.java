package org.telegram.telegrambots.starter;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {

	@Override
	public void onUpdateReceived(Update update) {
		   if (update.hasMessage() && update.getMessage().hasText()) {
		        SendMessage message = new SendMessage() // Create a SendMessage object with mandatory fields
		                .setChatId(update.getMessage().getChatId())
		                .setText(update.getMessage().getText());
		        try {
		            execute(message); // Call method to send the message
		        } catch (TelegramApiException e) {
		            e.printStackTrace();
		        }
		    }	
	}

	@Override
	public String getBotUsername() {
		// TODO Auto-generated method stub
		return "r1";
	}

	@Override
	public String getBotToken() {
		// TODO Auto-generated method stub
		return "873855862:AAHAokwLcH3WIlVlJyBx1Hum2JpKCjp1RYs";
	}

	
	
}
