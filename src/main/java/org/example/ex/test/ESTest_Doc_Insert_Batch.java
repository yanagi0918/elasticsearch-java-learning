package org.example.ex.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHost;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;

public class ESTest_Doc_Insert_Batch {
    public static void main(String[] args) throws Exception {

        RestHighLevelClient esClient = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost",9200,"http"))
        );

        BulkRequest request = new BulkRequest();
        request.add(new IndexRequest().index("user2").id("1001").source(XContentType.JSON, "name", "張三","age",30,"sex","male"));
        request.add(new IndexRequest().index("user2").id("1002").source(XContentType.JSON, "name", "李四","age",30,"sex","female"));
        request.add(new IndexRequest().index("user2").id("1003").source(XContentType.JSON, "name", "王五","age",40,"sex","male"));
        request.add(new IndexRequest().index("user2").id("1004").source(XContentType.JSON, "name", "王五1","age",40,"sex","female"));
        request.add(new IndexRequest().index("user2").id("1005").source(XContentType.JSON, "name", "王五2","age",50,"sex","male"));
        request.add(new IndexRequest().index("user2").id("1006").source(XContentType.JSON, "name", "王五3","age",50,"sex","male"));

        BulkResponse response = esClient.bulk(request, RequestOptions.DEFAULT);

        System.out.println(response.getTook());
        System.out.println(response.getItems());


        esClient.close();

    }
}
