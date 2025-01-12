package org.example;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        ConnectionString connectionString= new ConnectionString("mongodb+srv://myAtlasDBUser:Anikest%2A1%40@myatlasclusteredu.sfkkm.mongodb.net/?retryWrites=true&w=majority&appName=myAtlasClusterEDU");
        MongoClientSettings settings=MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .serverApi(ServerApi.builder()
                        .version(ServerApiVersion.V1)
                        .build())
                .build();
        MongoClient mongoClient= MongoClients.create(settings);


    }

}