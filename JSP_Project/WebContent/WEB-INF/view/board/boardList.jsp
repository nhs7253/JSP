<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table  border>
		<caption>게시판 출력</caption>		
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>조회수</th>
			<th>날짜</th>
		</tr>
		<c:forEach items="${requestScope.selectBoard}" var="select">
			<tr>
				<th>${select.boardNumber }</th>
				<th>${select.boardTitle }</th>
				<th>${select.boardHit }</th>
				<th>${select.boardDate }</th>
			</tr>
		</c:forEach>
	</table>
	
	<form name="input" action="${initParam.rootPath }/displaySelectNum.do"> <%--${in~~는 web.xml에서 설정한 것 displaySelectNum 는 컨트롤러(BoardController)에서 변수 설정한 이름 --%>
	    <input type="number" name="displayNum" maxlength="10"> <%--@RequestMapping("/displaySelectNum")에서 지정한 이름으로 --%>
	    <input type="submit" value="검색">
	</form>
	
	<br><br>
	<h2>추가할 내용을 기입하는 input 창</h2>
	<form name="input" action="${initParam.rootPath }/inserUserData.do"> 
	   제목 : <input type="text" name="boardTitle"> <br> 
	   내용 : <textarea name="boardText" cols="150" rows="20"></textarea> <br>
	    	<input type="submit" value="입력">
	</form>
	
	<br><br>
	<h2>수정할 내용을 기입하는 input 창</h2>
	<form name="input" action="${initParam.rootPath }/updateBoardData.do"> 
	  수정 목록 번호 : <input type="number" name="boardNumber"> <br>  
	  수정 제목 : <input type="text" name="boardTitle"> <br> 
	  수정 내용 : <textarea name="boardText" cols="150" rows="20"></textarea> <br>
	          <input type="submit" value="입력">
	</form>
	
	
	<br><br>
	<h2>삭제할 Table 키값을 기입하는 input 창</h2>
	<form name="input" action="${initParam.rootPath }/deleteBoardDate.do"> 
	  삭제 목록 번호 : <input type="number" name="keyNumber"> 
	          <input type="submit" value="입력">
	</form>
	
	
</body>
</html>