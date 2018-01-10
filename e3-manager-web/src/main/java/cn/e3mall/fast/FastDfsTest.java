package cn.e3mall.fast;

import cn.e3mall.common.utils.FastDFSClient;
import org.csource.common.MyException;
import org.csource.fastdfs.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * Created by Administrator on 2017/11/10.
 */
public class FastDfsTest {

/*    public static void main(String[] args) throws IOException, MyException {
        //创建一个配置文件，文件名随意，内容是tracker服务器地址
        //使用全局对象加载配置文件
        ClientGlobal.init("F:/ideaWorkspace/ee3/e3-manager-web/src/main/resources/conf/client.conf");

        //创建一个TrackerClient对象
        TrackerClient trackerClient=new TrackerClient();

        //通过TrackClient获取一个TrackerServer对象
        TrackerServer connection = trackerClient.getConnection();


        //创建一个StroageServer的引用，可以是nullStrorageServer

        StorageServer storageServer=null;
        //创建一个StorageClient，参数需要TrackerServer和

        StorageClient storageClient=new StorageClient(connection,storageServer);
        //使用StorageClient上传文件

        String[] str= storageClient.upload_file("D:/360安全浏览器下载/1.jpg","jpg",null);

        for (String s:str) {
            System.out.println(s);
        }*/


    public static void main(String[] args) throws Exception {

        FastDFSClient fastDFSClient=new FastDFSClient("F:/ideaWorkspace/ee3/e3-manager-web/src/main/resources/conf/client.conf");

        String s = fastDFSClient.uploadFile("D:/360安全浏览器下载/610_4701_0bf928ae29cde61.jpg");

        System.out.println(s);
        }

}
