jQuery(document).ready(function(){		
	var _validata = false;
	
	var top = ($(document).height() - $("#loginPane").height())/2;
	$("#loginPane").css("marginTop", top);
	$("#loginPane").fadeIn();
	
	$("#security").on("submit", loginFromSubmit);
	
	function loginFromSubmit()
	{
		if(_validata)
		{
			return;
		}
		if($("#userName").val() == "" || $("#psw").val() == "")
		{
			return;
		}
		
		$("#userName").attr("disable", false);
		$("#psw").attr("disable", false);
		$("#loginButton").attr("disable", false);
		
		var _url = "/api/0/security/validate";
		$.ajax({
			type: "POST",
			url: _url,
			data: { loginName: $("#userName").val(), password: $("#psw").val()}
		})
		.success(
			function()
			{
				$("#userName").attr("disable", false);
				$("#psw").attr("disable", false);
				$("#loginButton").attr("disable", false);
				_validata = true;
				
				$("#board").animate({
					opacity: 0
				}, 500);
				
				$("logo").animate(
				{ top: 90 }, 500, function(){
					$("#security").eq(0).submit();
				});			
			})
			.fail(
				function()
				{
					LoginError();
					//shake();
					$("#userName").attr("disable", false);
					$("psw").attr("disable", false);
					$("loginButton").attr("disable", false);
				}		
				);	
	}
	
	function LoginError()
	{
		
	}
	
	function shake()
	{
		
	}
});