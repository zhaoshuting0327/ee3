import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CloudSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;

import java.io.IOException;

/**
 * Created by Administrator on 2017/11/15.
 */
public class SolorCloudtest {

/*    public static void main(String[] args) throws IOException, SolrServerException {

        //向索引库添加文档

        //创建一个集群的连接，应该使用CloudSolrServer创建
        //zkHost：zookeeper的地址列表

        //设置一个defaultCollection属性
        //创建一个文档对象
        //向文档中添加域
        //把文档写入索引库
        //提交·
        CloudSolrServer cloudSolrServer=new CloudSolrServer("192.168.25.131:2181,192.168.25.131:2182,192.168.25.131:2183");

        cloudSolrServer.setDefaultCollection("collection2");

        SolrInputDocument document=new SolrInputDocument();

        document.setField("id","solrcloud01");

        document.setField("item_title","测试一");

        document.setField("item_price",12);

        cloudSolrServer.add(document);

        cloudSolrServer.commit();



    }*/


    public static void main(String[] args) throws SolrServerException {

        //创建一个ClouldSolrServer对象
        CloudSolrServer cloudSolrServer=new CloudSolrServer("192.168.25.131:2181,192.168.25.131:2182,192.168.25.131:2183");
        //设置默认的Collection
        cloudSolrServer.setDefaultCollection("collection2");
        //创建一个查询对象
        SolrQuery query=new SolrQuery();
        //设置查询条件
        query.setQuery("*:*");
        //执行查询
        QueryResponse queryResponse = cloudSolrServer.query(query);
        //取查询结果
        SolrDocumentList results = queryResponse.getResults();
        //打印
        System.out.println("总记录数："+results.getNumFound());
    }
}
