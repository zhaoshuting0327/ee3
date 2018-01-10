package cn.e3mall.freemarker;

import cn.e3mall.pojo.Student;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

/**
 * Created by Administrator on 2017/11/16.
 */
public class FreeMarkerTest {

    public static void main(String[] args) throws IOException, TemplateException {

        //创建一个模板文件
        //创建一个Configuration对象
        /*设置模板文件保存目录
        * 模板文件的编码格式，一般都是utf-8
        * 加载一个模板文件，创建一个模板对象
        * 创建一个数据集。可以是pojo可以是map，推荐使用map
        * 创建Writer对象，指定输出文件路径及文件名
        * 生成静态页面
        * 关流*/
        Configuration configuration=new Configuration(Configuration.getVersion());

        configuration.setDirectoryForTemplateLoading(new File("F:/ideaWorkspace/ee3/e3-item-web/src/main/webapp/WEB-INF/ftl"));

        configuration.setDefaultEncoding("utf-8");

//        Template template = configuration.getTemplate("hello.ftl");
        Template template = configuration.getTemplate("student.ftl");

        List<Student> list=new ArrayList<>();

        list.add(new Student(1,"susan",11,"ss1"));
        list.add(new Student(1,"susan1",11,"ss2"));
        list.add(new Student(1,"susan2",11,"ss2"));
        list.add(new Student(1,"susan3",11,"ss3"));
        list.add(new Student(1,"susan4",11,"s7s"));
        list.add(new Student(1,"susan5",11,"8ss"));


        Map data=new HashMap();

        data.put("list",list);
        data.put("hello","hhhhhh");

        //添加日期类型

        data.put("data",new Date());

        Student student=new Student(1,"susan",11,"ss");


        data.put("student",student);
        data.put("hello","hello sss");
        data.put("val",null);
        Writer writer=new FileWriter(new File("F:/ideaWorkspace/student.html"));

        template.process(data,writer);

        writer.close();
    }
    }

