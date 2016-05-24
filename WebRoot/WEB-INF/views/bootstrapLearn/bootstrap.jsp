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

 <!-- <div class="container">
      <h2>表格</h2>
      <p> .table 为任意表格添加基本样式 (只有横向分隔线):</p>            
      <table  class="table table-striped table-hover table-condensed table-bordered">
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
          </tr>
        </thead>
        <tbody>
          <tr class="active success">
            <td>1</td>
            <td>Anna</td>
          </tr>
          <tr class="active info">
            <td>2</td>
            <td>Debbie</td>
          </tr>
          <tr class="active warning">
            <td>3</td>
            <td>John</td>
          </tr>
           <tr class="active danger">
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
    </div> -->
    
    
    <div class="container">
<form role="form">
   <label >帮助文本实例</label>
	<div class="row">
	   <div class="col-lg-2">
	    <input class="form-control" type="text" placeholder="">
	    <span class="class="help-block"">一个较长的帮助文本块，超过一行，
		   需要扩展到下一行。本实例中的帮助文本总共有两行。</span>
		
	   </div>

	      
	</div>
	
  
</form>

    
    </div>


</body>
</html>
