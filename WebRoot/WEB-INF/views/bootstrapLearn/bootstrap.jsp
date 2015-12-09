<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>

 <div class="container">
      <h2>表格</h2>
      <p> .table 为任意表格添加基本样式 (只有横向分隔线):</p>            
      <table  class="table table-striped  table-bordered table-hover table-condensed">
        <thead>
          <tr>
            <th>#</th>
            <th>Firstname</th>
          </tr>
        </thead>
        <tbody>
          <tr class="active">
            <td>1</td>
            <td>Anna</td>
          </tr>
          <tr class="active">
            <td>2</td>
            <td>Debbie</td>
          </tr>
          <tr class="active">
            <td>3</td>
            <td>John</td>
          </tr>
           <tr class="active">
            <td>4</td>
            <td>John</td>
          </tr>
           <tr class="active">
            <td>5</td>
            <td>John</td>
          </tr>
           <tr class="active">
            <td>6</td>
            <td>John</td>
          </tr>
          
        </tbody>
      </table>
    </div>


</body>
</html>
