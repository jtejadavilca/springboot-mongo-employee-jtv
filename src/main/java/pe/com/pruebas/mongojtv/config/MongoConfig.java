package pe.com.pruebas.mongojtv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages="pe.com.pruebas.mongojtv.repository")
public class MongoConfig extends AbstractMongoConfiguration {
  
    @Override
    protected String getDatabaseName() {
        return "cjavadatabasex";
    }
  
    @Bean
    @Override
    public MongoClient mongoClient() {
        return new MongoClient("localhost", 27017);
    }
}
