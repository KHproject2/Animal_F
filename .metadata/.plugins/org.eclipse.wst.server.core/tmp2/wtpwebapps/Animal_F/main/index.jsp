<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
  <head>
    <title>
      iFrame예제
    </title>
<<<<<<< HEAD
=======
    
    <script src="http://code.jquery.com/jquery-1.7.2.min.js" type="text/javascript"></script>
	<script src="js/jquery.cookie.js" type="text/javascript"></script>
    
    <style type="text/css">
		*{margin:0;padding:0}
		html,body{height:100%}
		body{display:table;width:100%}
		#header,#footer{display:table-row;width:100%;height:1px}
		#container{display:table-row;width:100%;height:100%}

		body{font-size:3em;color:#FFF}

		
		#header,#footer{background-color:#F00}
		#container{background-color:#0F0}
	</style>
	
	
>>>>>>> 2c5db7d1429a81399de3253d8dec0e254c089464
  </head>
  <body>
    <table width='1200px' border='1' bgcolor='#F0F0F0' align='center'style="border-collapse: collapse;">
		<tr>
			
			<td colspan="4">
				<table width='1200px'>
				<col width="200">  <col width="200"> <col width="200">
					<tr>
						<td >1 </td>
						<td align="center"><img src="./image/mainlogo.PNG"> </td>
						<td align="right" valign="top"> <a href="./index.jsp">Home</a>
							<a href="#">로그인</a>
							<a href="#">회원가입</a>
						 </td>
					</tr>
				</table>
			 </td>
		</tr>
      <tr bgcolor='#BDDD7D'>
        <td width='200' align='center'>
          <a href='../find/findboard.jsp' target='view'>찾습니다</a>
        </td>
        <td width='200' align='center'>
          <a href='../save/saveboard.jsp' target='view'>보호중입니다</a>
        </td>
        <td width='200' align='center'>
          <a href='#' target='view'>알바</a>
        </td>
        <td width='200' align='center'>
          <a href='../board/freeboard.jsp' target='view'>자유게시판</a>
        </td>
      </tr>
      
      <tr>
      <td colspan="4">
      	 <table width='100%' align='center'>
	      <tr>
	      	<td width="200px">
	      		<img src="./image/sidebar.PNG">
	      	</td>
	        <td>
	          <iframe width='1000px' height="600px" frameborder='0' scrolling='no' src='main.jsp' 
	               marginwidth='15px' marginheight='15px' name='view' hspace='0px' vspace='0px' >
	               
	         </iframe>
	         
<<<<<<< HEAD
	        </td>
	      </tr>
	      
	      <tr>
	    		<td colspan="2">
	    			<table width='100%' >
	    				<col width="150px"><col width="150px"><col width="350"><col width="150px">
	    				<tr>
	    					<td colspan="4">
	    						<img src="../board/image/line.PNG" width="100%">
	    					</td>
	    				</tr>
	    				<tr> 
	    					<td> 1</td>
	    					<td><img src="./image/mainlogo.PNG" width="200px" height="50px"></td>
	    					<td>왜안되니?</td>
	    					<td>2 </td>
	    				</tr>
	    			</table>
	    			
	    		</td>
	    		
	    	</tr>
    
   	 </table>
   	 </td>
     </tr>
    </table>    
=======
=======
		
		</script>
		

<<<<<<< HEAD
   
=======
  
	<div id="header">
		<table border='1' bgcolor='#F0F0F0' align='center'style="border-collapse: collapse; width: 100%">
			<tr height="10%">
				<td colspan="4">
					<table style="width: 100%">
					<col width="33%">  <col width="34%"> <col width="33%">
						<tr>
							<td >1 </td>
							<td align="center"><img src="./image/mainlogo.PNG"> </td>
							<td align="right" valign="top"> <a href="./index.jsp">Home</a>
								<a href="#">로그인</a>
								<a href="#">회원가입</a>
							 </td>
						</tr>
					</table>
				 </td>
			</tr>
	      <tr bgcolor='#BDDD7D' height="10%">
	        <td width='200' align='center'>
	          <a href='doc1.html' target='view'>찾습니다</a>
	        </td>
	        <td width='200' align='center'>
	          <a href='../save/saveboard.jsp' target='view'>보호중입니다</a>
	        </td>
	        <td width='200' align='center'>
	          <a href='#' target='view'>알바</a>
	        </td>
	        <td width='200' align='center'>
	         <!--  <a href='../board/freeboard.jsp' target='view'>자유게시판</a> -->
	        <button type="button" onclick="move()" id="fbmenu">자유게시판</button>
	  
>>>>>>> 2e2d39d4d2476ffa3ec2db54843e92e49f052990
	        </td>
	      </tr>
	      
>>>>>>> b2b423b752897f11e2467d40a82382fb36d62374

		<div id="header">
			<table border='1' bgcolor='#F0F0F0' align='center'style="border-collapse: collapse; width: 100%">
				<tr height="10%">
					<td colspan="4">
						<table style="width: 100%">
						<col width="33%">  <col width="34%"> <col width="33%">
							<tr>
								<td >1 </td>
								<td align="center"><img src="./image/mainlogo.PNG"> </td>
								<td align="right" valign="top"> <a href="./index.jsp">Home</a>
									<a href="#">로그인</a>
									<a href="#">회원가입</a>
								 </td>
							</tr>
						</table>
					 </td>
				</tr>
		      <tr bgcolor='#BDDD7D' height="10%">
		        <td width='200' align='center'>
		          <a href='doc1.html' target='view'>찾습니다</a>
		        </td>
		        <td width='200' align='center'>
		          <a href='../save/saveboard.jsp' target='view'>보호중입니다</a>
		        </td>
		        <td width='200' align='center'>
		          <a href='#' target='view'>알바</a>
		        </td>
		        <td width='200' align='center'>
		         <!--  <a href='../board/freeboard.jsp' target='view'>자유게시판</a> -->
		        <button type="button" onclick="move()" id="fbmenu">자유게시판</button>
		  
		        </td>
		      </tr>
		      
	
		      
		      </table>
		</div>
			
		<div id="container">
			
			<%-- <jsp:include page="./main.jsp" flush="false" /> --%>
				
		</div>
		
		<div id="footer">
			<table width="100%" border="1">
		   				<col width="20%"><col width="20%"><col width="40%"><col width="20%">
		   				<tr>
		   					<td colspan="4">
		   						<img src="../board/image/line.PNG" width="100%">
		   					</td>
		   				</tr>
		   				<tr> 
		   					<td> 1</td>
		   					<td><img src="./image/mainlogo.PNG" width="200px" height="50px"></td>
		   					<td>왜안되니?</td>
		   					<td>2 </td>
		   				</tr>
		   			</table>
		</div>	
 

	
	
>>>>>>> 2c5db7d1429a81399de3253d8dec0e254c089464
  </body>	
</html>