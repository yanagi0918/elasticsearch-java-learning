package org.example.ex.test;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;

public class ESTest_Client_Create {
    public static void main(String[] args) throws Exception {

        RestHighLevelClient esClient = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost",9200,"http"))
        );

        CreateIndexRequest request = new CreateIndexRequest("user2");
        CreateIndexResponse response = esClient.indices().create(request, RequestOptions.DEFAULT);

        boolean acknowledged = response.isAcknowledged();
        System.out.println("acknowledged : " + acknowledged);

        esClient.close();

    }
}
