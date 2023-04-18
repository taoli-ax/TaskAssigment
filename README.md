# TaskAssigment
Base On SpringMVC

- 蜗牛的node.js课程是，前端查询+分页，后端异步处理数据，采用传统三层架构的小练习
- 蜗牛的springmvc(SSM)是一个前端列表查询+分页功能，后端处理请求，查询数据的小练习


**Hint**
- 如果要返回一个页面应该是用`@Controller`而不是`@ResController`

## Bug Fix
**执行sql时遇到外键错误和语法错误**  
- 请检查html表单提交时的name属性是否和pojo中的字段名一致！
- 因为前端页面jquery发送ajax: `$("#form").serializer()`表单封装的`name`属性映射到后端pojo
- controller中接收的参数是pojo类`public String index(Cup cup)`，这时两边名字如果不一样，直接可以看到某些字段值为0或null,据此反推也可看到哪里出错


**数据库的列顺序跟sql语句的插入顺序保持一致**

- `insert into orders values(col_a,col_b,col_c)`
- 数据库order表的列也是 `col_a`,`col_b`,`col_c`
- 否则会发生错误！


### pageNation
第二次写pageNation，逻辑一样
总体思路 ： 前端利用ajax发送pageNum到后端查询数据
- 前端**orderList**接口，发送查询的`ajax`请求，查询所有数据
- 利用 `onclick` 方法绑定标签，并调用接口 `onclick=orderList(页码)`
- 后端集成 `pagehelper`查询 接受查询参数 当前页：`pageNum`,每页条数：`pageSize`
- 后端返回包含`PageInfo`这个对象，可以提供上一页等全面的信息供使用
- 循环第二步



### 遗留问题
- 没有完成`OrdersVO`对于`project_name`的展示，依然只展示`id`
- mybatis关联查询这个知识点
- jquery的ajax请求规范
