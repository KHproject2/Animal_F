<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
  <head>
    <title>
      iFrame예제
    </title>
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
  </body>	
</html>