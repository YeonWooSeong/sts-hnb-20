var popup = {
		open : function(btn) {
			$(btn).magnificPopup({
				type:'inline',
				midClick: true,
				preloader:false,
				modal:true,
				closeContentPos:true,
				fixedContentPos:true,
				alignTop:false, /*최상단 위치인데 가운데로 위치시키려면.*/
				showCloseBtn:true
			});
		},
		close : function(btn) {
			$(btn).click(function(e) {
				e.preventDefault();
				$.magnificPopup.close();
			});
		}	
};