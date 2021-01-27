package com.zhukov.demo4;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

@SpringBootApplication
public class Demo4Application {
	public static void main(String[] args) {
		ApiContextInitializer.init();
		TelegramBotsApi telegram = new TelegramBotsApi();

		BotAbarmot botAbarmot = new BotAbarmot();
		try {
			telegram.registerBot(botAbarmot);
 		} catch (TelegramApiRequestException e){
			e.printStackTrace();
		}

//		SpringApplication.run(Demo4Application.class, args);
	}
}