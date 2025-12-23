package com.ChattingApp.ChattingAppBackend.Config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {
    private static final String MONGO_URI = "mongodb+srv://phuclnoucamp5002942_db_user:UCo7c3REhcJEzhCh@tingting.sspibcu.mongodb.net/TingTing?retryWrites=true&w=majority";

    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create(MONGO_URI);
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient(), "TingTing");
    }
}
