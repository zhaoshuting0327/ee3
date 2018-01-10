<html>

<head>

    <title>student</title>

</head>
<body>


<table>
    <tr>
        <th>ddd</th>
        <th>ddd</th>
        <th>ddd</th>
        <th>ddd</th>
    </tr>
    <#list list as s>

    <#if s_index % 2 ==0>
        <tr bgcolor="red"></tr>
    <#else >
        <tr bgcolor="#adff2f"></tr>
    </#if>


        <th>${s_index}</th>

        <th>${s.id}</th>
        <th>${s.name}</th>
        <th>${s.age}</th>
        <th>${s.address}</th>
</tr>


    </#list>
</table>


<br>

<#--当前日期：${date?string("yyyy/MM/dd")}-->
null值的处理：${val!"val wei null"}
判断val的值是否为null：<br>

<#if val??>

val中有值
<#else >
val中无值
</#if>

引用模板测试：

<#include "hello.ftl">



</body>

</html>