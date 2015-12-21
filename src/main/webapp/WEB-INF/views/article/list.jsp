<%@ page language='java' contentType='text/html; charset=UTF-8' pageEncoding='UTF-8'%>
<LINK REL='stylesheet' type='text/css' href='${css}/board.css'/>	
	
	<style>
	.white-popup {
  position: relative;
  background: #FFF;
  padding: 20px;
  width: auto;
  max-width: 500px;
  margin: 20px auto;
}
	</style>
<a href="#test-popup" class="open-popup-link">Show inline popup</a>
<a href="mobile-friendly-page.html" data-mfp-src="#test-popup" class="open-popup-link">Show inline popup</a>	
	
	
	<div id="test-popup" class="white-popup mfp-hide">
  Popup content
</div>
<script type='text/javascript'>

$(function() {
	board.init('142','1');
	  $('.open-popup-link').magnificPopup({
		  type:'inline',
		  midClick: true
		  });
	});
	var board = {
		init : function(pageNo,themeNo) {
			$.getJSON(context+'/article/list/'+pageNo+'/'+themeNo,function(data) {
				
				var table = "<div id='boardList'><h1 align=center style='color:white;margin-bottom:30px'>자유게시판</h1>"
				+"<TABLE id='tab_borderList'>"
				+"<TR ALIGN=CENTER><TD WIDTH=8%><B>번호</B></TD>"
				+"<TD WIDTH=40%><B>제 목</B></TD>"
				+"<TD WIDTH=20%><B>내 용</B></TD>"
				+"</TR>"
				$.each(data.list,function(index,value) {
					table += "<TR><TD WIDTH=10% ALIGN=CENTER>"+(index+1)+"</TD>"
					+"<TD WIDTH=10% ALIGN=CENTER>"+this.usrSubject+"</TD>"
					+"<TD WIDTH=10% ALIGN=CENTER>"+this.usrContent+"</A></TD>"
				
				});			
				table +="</TABLE></div>"
				table +='<div style="width:100px;margin:auto"><a href="'+context+'/article/write">글쓰기</a><div>';
				$('.mainView').html(table);
			});	
		}
	
	};
</script>