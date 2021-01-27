package com.zhukov.demo4;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class BotAbarmot extends TelegramLongPollingBot {
    private static final String TOKEN = "1221112568:AAG4kFcibCTskpH0Jy8K3Q2VSmEbQE3FzS8";
    private static final String USERNAME = "Abarmot_1989_bot";

    public String getBotToken(){
        return TOKEN;
    }

    public String getBotUsername(){
        return USERNAME;
    }

    public void onUpdateReceived(Update update) {
        update.getUpdateId();
        SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());

        if (update.getMessage().getText().equals("ping")) {
            sendMessage.setText("pong");
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}
//        if (update.getMessage() !=null && update.getMessage().hasText()){
//            long chat_id = update.getMessage().getChatId();
//            try {
//                execute(new SendMessage(chat_id,
//                        "Hi" + update.getMessage().getText()));
//            } catch (TelegramApiException e){
//                e.printStackTrace();
//            }
//        }



