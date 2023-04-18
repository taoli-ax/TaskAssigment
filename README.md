# TaskAssigment
Base On SpringMVC


**Hint**
- 如果要返回一个页面应该是用`@Controller`而不是`@ResController`

## Bug Fix
**执行sql时遇到外键错误和语法错误**  
- 请检查html表单提交时的name属性是否和pojo中的字段名一致！
- 因为前端页面jquery发送ajax: `$("#form").serializer()`表单封装的`name`属性映射到后端pojo
- controller中接收的参数是pojo类`public String index(Cup cup)`，这时两边名字如果不一样，直接可以看到某些字段值为0或null,据此反推也可看到哪里出错
