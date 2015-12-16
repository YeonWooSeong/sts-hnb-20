<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<LINK REL="stylesheet" type="text/css" href="${css}/board.css"/>	

<script type="text/javascript">
$(function() {
	event1.detail(context+'/event/boardList/1');
});

var event1 = {
		detail : function(url) {
				$.getJSON(url,	
				function(data){
				var table = '<div id="boardList"><h1 align=center style="color:white;margin-bottom:30px">회원목록</h1><TABLE id="tab_borderList">'
				+'<TR ALIGN=CENTER><TD WIDTH=10%><B>번호</B></TD><TD WIDTH=20%><B>아이디</B></TD><TD WIDTH=20%><B>회원명</B></TD><TD WIDTH=30%>'
				+'<B>이메일</B></TD><TD WIDTH=18%><B>가입일</B></TD></TR><c:forEach var="member" items="${memberList}" varStatus="status">'
				+'<TR><TD WIDTH=10% ALIGN=CENTER>${status.index+1}</TD><TD WIDTH=20% ALIGN=CENTER>${member.id}</TD><TD WIDTH=20% ALIGN=CENTER>'
				+'<A HREF="BoardContent.jsp">${member.name}</A></TD><TD WIDTH=30% ALIGN=LEFT>${member.email}</TD><TD WIDTH=18% '
				+'ALIGN=CENTER>${member.regdate}</TD></TR></c:forEach></TABLE></div>'
				$('.mainView').empty();
				$('.mainView').html(table);
				
				
				event.style();
				$('#changeInfo').click(function() {
					event.updateForm();
				});
				$('#remove').click(function() {
					event.remove('${member.id}');
				});
			});
		}
		
		
}



</script>








<!-- 전체 레코드 숫자 - ((현재 페이지 번호 -1))*한 페이지당 레코드 수 _ 현재 게시물 출력 순서  게시판 순번 역순으로 표시방법
count-((nowPage-1)*rowPerPage+status.index)

${context}/event/memberSearch/1"  1은 최신 페이지의 1을 가르킴  만약에 1이 없다면, 경로가 다 나오게 됨. 1 = {pageNo}로 가려짐
-->