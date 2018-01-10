import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/13.
 */
public class TestSolrJ {

 /*   public static void main(String[] args) throws IOException, SolrServerException {

        //创建SolorServer对象，创建一个连接
        SolrServer solrServer=new HttpSolrServer("http://192.168.25.131:8080/solr/collection1");

        //创建一个文档对象SolrInputDocument

        SolrInputDocument document=new SolrInputDocument();

        document.addField("id","doc01");
        document.addField("item_title","商品测试01");
        document.addField("item_price",100);

        solrServer.add(document);

        solrServer.commit();

    }
*/

/*    public static void main(String[] args) throws IOException, SolrServerException {
        SolrServer solrServer= new HttpSolrServer("http://192.168.25.131:8080/solr/collection1");

   *//*     solrServer.deleteById("item_title");

        solrServer.deleteByQuery("id:doc01");

        solrServer.commit();*//*

        SolrQuery solrQuery=new SolrQuery();

       //solrQuery.set("*:*");

        solrQuery.set("q","*:*");

        QueryResponse query = solrServer.query(solrQuery);
        SolrDocumentList results = query.getResults();

        System.out.println("查询结果总记录数："+results.getNumFound());

        for (SolrDocument solrDocument :results){
            System.out.println(solrDocument.get("id"));
            System.out.println(solrDocument.get("item_title"));
            System.out.println(solrDocument.get("item_sell_point"));
        }


    }*/

    public static void main(String[] args) throws SolrServerException {

        SolrServer solrServer= new HttpSolrServer("http://192.168.25.131:8080/solr/collection1");

        SolrQuery solrQuery=new SolrQuery();

        solrQuery.set("手机");
        solrQuery.setStart(0);
        solrQuery.setRows(20);
        solrQuery.set("df","item_title");
        solrQuery.setHighlight(true);
        solrQuery.setHighlightSimplePre("<em>");
        solrQuery.setHighlightSimplePost("</em>");

        QueryResponse query = solrServer.query(solrQuery);

        SolrDocumentList results = query.getResults();
        for (SolrDocument solrDocument :results){

            //没写完
            Map<String,Map<String,List<String>>> highlighting=query.getHighlighting();

            System.out.println(solrDocument.get("id"));
            System.out.println(solrDocument.get("item_title"));
            System.out.println(solrDocument.get("item_sell_point"));
        }

    }
}
