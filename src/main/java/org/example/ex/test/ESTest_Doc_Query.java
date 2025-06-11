package org.example.ex.test;

import org.apache.http.HttpHost;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.unit.Fuzziness;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.RangeQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.metrics.MaxAggregationBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.SortOrder;

public class ESTest_Doc_Query {
    public static void main(String[] args) throws Exception {

        RestHighLevelClient esClient = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost",9200,"http"))
        );

//        SearchRequest request = new SearchRequest();
//        request.indices("user2");
//
//        request.source(new SearchSourceBuilder().query(QueryBuilders.matchAllQuery()));
//
//        SearchResponse response = esClient.search(request, RequestOptions.DEFAULT);
//
//        SearchHits hits = response.getHits();
//        System.out.println(hits.getTotalHits());
//        System.out.println(response.getTook());
//
//        for (SearchHit hit : hits) {
//            System.out.println(hit.getSourceAsString());
//        }

//        SearchRequest request = new SearchRequest();
//        request.indices("user2");
//
//        request.source(new SearchSourceBuilder().query(QueryBuilders.termQuery("age",30)));
//
//        SearchResponse response = esClient.search(request, RequestOptions.DEFAULT);
//
//        SearchHits hits = response.getHits();
//        System.out.println(hits.getTotalHits());
//        System.out.println(response.getTook());
//
//        for (SearchHit hit : hits) {
//            System.out.println(hit.getSourceAsString());
//        }

//        SearchRequest request = new SearchRequest();
//        request.indices("user2");
//
//        SearchSourceBuilder builder = new SearchSourceBuilder().query(QueryBuilders.matchAllQuery());
//        builder.from(2);
//        builder.size(2);
//
//        request.source(builder);
//
//        SearchResponse response = esClient.search(request, RequestOptions.DEFAULT);
//
//        SearchHits hits = response.getHits();
//        System.out.println(hits.getTotalHits());
//        System.out.println(response.getTook());
//
//        for (SearchHit hit : hits) {
//            System.out.println(hit.getSourceAsString());
//        }

//        SearchRequest request = new SearchRequest();
//        request.indices("user2");
//
//        SearchSourceBuilder builder = new SearchSourceBuilder().query(QueryBuilders.matchAllQuery());
//        builder.sort("age", SortOrder.DESC);
//
//        request.source(builder);
//
//        SearchResponse response = esClient.search(request, RequestOptions.DEFAULT);
//
//        SearchHits hits = response.getHits();
//        System.out.println(hits.getTotalHits());
//        System.out.println(response.getTook());
//
//        for (SearchHit hit : hits) {
//            System.out.println(hit.getSourceAsString());
//        }

//        SearchRequest request = new SearchRequest();
//        request.indices("user2");
//
//        SearchSourceBuilder builder = new SearchSourceBuilder().query(QueryBuilders.matchAllQuery());
//        String[] excludes = {"age"};
//        String[] includes = {};
//        builder.fetchSource(includes,excludes);
//
//        request.source(builder);
//
//        SearchResponse response = esClient.search(request, RequestOptions.DEFAULT);
//
//        SearchHits hits = response.getHits();
//        System.out.println(hits.getTotalHits());
//        System.out.println(response.getTook());
//
//        for (SearchHit hit : hits) {
//            System.out.println(hit.getSourceAsString());
//        }

//        SearchRequest request = new SearchRequest();
//        request.indices("user2");
//
//        SearchSourceBuilder builder = new SearchSourceBuilder();
//        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
//
//        boolQueryBuilder.must(QueryBuilders.matchQuery("age",30));
//        boolQueryBuilder.must(QueryBuilders.matchQuery("sex","male"));
//        boolQueryBuilder.mustNot(QueryBuilders.matchQuery("sex","male"));
//
//        boolQueryBuilder.should(QueryBuilders.matchQuery("age",30));
//        boolQueryBuilder.should(QueryBuilders.matchQuery("age",40));
//
//        builder.query(boolQueryBuilder);
//
//        request.source(builder);
//
//        SearchResponse response = esClient.search(request, RequestOptions.DEFAULT);
//
//        SearchHits hits = response.getHits();
//        System.out.println(hits.getTotalHits());
//        System.out.println(response.getTook());
//
//        for (SearchHit hit : hits) {
//            System.out.println(hit.getSourceAsString());
//        }

//        SearchRequest request = new SearchRequest();
//        request.indices("user2");
//
//        SearchSourceBuilder builder = new SearchSourceBuilder();
//        RangeQueryBuilder rangeQuery = QueryBuilders.rangeQuery("age");
//
//        rangeQuery.gte(30);
//        rangeQuery.lt(50);
//
//        builder.query(rangeQuery);
//
//        request.source(builder);
//
//        SearchResponse response = esClient.search(request, RequestOptions.DEFAULT);
//
//        SearchHits hits = response.getHits();
//        System.out.println(hits.getTotalHits());
//        System.out.println(response.getTook());
//
//        for (SearchHit hit : hits) {
//            System.out.println(hit.getSourceAsString());
//        }

//        SearchRequest request = new SearchRequest();
//        request.indices("user2");
//
//        SearchSourceBuilder builder = new SearchSourceBuilder();
//        builder.query(QueryBuilders.fuzzyQuery("name","張").fuzziness(Fuzziness.ONE));
//
//        request.source(builder);
//
//        SearchResponse response = esClient.search(request, RequestOptions.DEFAULT);
//
//        SearchHits hits = response.getHits();
//        System.out.println(hits.getTotalHits());
//        System.out.println(response.getTook());
//
//        for (SearchHit hit : hits) {
//            System.out.println(hit.getSourceAsString());
//        }

//        SearchRequest request = new SearchRequest();
//        request.indices("user2");
//
//        SearchSourceBuilder builder = new SearchSourceBuilder();
//        MaxAggregationBuilder aggregationBuilder = AggregationBuilders.max("maxAge").field("age");
//
//        builder.aggregation(aggregationBuilder);
//
//        request.source(builder);
//        SearchResponse response = esClient.search(request, RequestOptions.DEFAULT);
//
//        SearchHits hits = response.getHits();
//        System.out.println(hits.getTotalHits());
//        System.out.println(response.getTook());
//
//        for (SearchHit hit : hits) {
//            System.out.println(hit.getSourceAsString());
//        }

        SearchRequest request = new SearchRequest();
        request.indices("user2");

        SearchSourceBuilder builder = new SearchSourceBuilder();
        AggregationBuilder aggregationBuilder = AggregationBuilders.terms("ageGroup").field("age");

        builder.aggregation(aggregationBuilder);

        request.source(builder);
        SearchResponse response = esClient.search(request, RequestOptions.DEFAULT);

        SearchHits hits = response.getHits();
        System.out.println(hits.getTotalHits());
        System.out.println(response.getTook());

        for (SearchHit hit : hits) {
            System.out.println(hit.getSourceAsString());
        }


        esClient.close();

    }
}
