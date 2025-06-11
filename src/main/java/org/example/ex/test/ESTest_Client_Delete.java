package org.example.ex.test;

import org.apache.http.HttpHost;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.GetIndexResponse;

public class ESTest_Client_Delete {
    public static void main(String[] args) throws Exception {

        RestHighLevelClient esClient = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost",9200,"http"))
        );

        DeleteIndexRequest request = new DeleteIndexRequest("user2");

        AcknowledgedResponse response = esClient.indices().delete(request, RequestOptions.DEFAULT);

        boolean acknowledged = response.isAcknowledged();
        System.out.println("acknowledged : " + acknowledged);

        esClient.close();

    }
}
