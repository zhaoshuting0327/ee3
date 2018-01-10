package cn.e3mall.item.controller;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/17.
 */
@Controller
public class HtmlGenController {

    @Autowired
    private FreeMarkerConfig freeMarkerConfig;

    @RequestMapping("/genhtml")
    @ResponseBody
    public String genHtml() throws IOException, TemplateException {
        Configuration configuration = freeMarkerConfig.getConfiguration();

        //加载模板对象
        Template template = configuration.getTemplate("hello.ftl");
        //创建一个数据集
        Map map=new HashMap();
        map.put("hello","sdsada");
        //指定文件输出的路径及文件名
//        Writer out=new FileWriter("F:/ideaWorkspace/ee3/e3-item-web/src/main/webapp/WEB-INF/ftl");
        Writer out=new FileWriter("F:/ideaWorkspace/student2.html");
        //输出文件
        template.process(map,out);
        //关闭流
        out.close();

        return  "ok";
    }

}
