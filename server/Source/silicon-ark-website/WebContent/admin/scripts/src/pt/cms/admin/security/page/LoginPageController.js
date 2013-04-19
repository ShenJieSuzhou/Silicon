$ns("pt.cms.admin.security.page");

$import("pt.cms.admin.rest.RESTClient");

$include("$/pt/cms/admin/security/page/security.css");

pt.cms.admin.security.page.LoginPageController = function()
{
    var me = $extend(mx.page.PageController);
    var base = {};
    
    var _validated = false;
    
    me.restClient = null;
    
    base.pageDidLoad = me.pageDidLoad;
    me.pageDidLoad = function()
    {
        base.pageDidLoad();
        
        me.restClient = new pt.cms.admin.rest.RESTClient();
        
        var top = ($(document).height() - $("#loginPane").height()) / 2;
        $("#loginPane").css("marginTop", top);
        $("#loginPane").fadeIn();
        $("#userName").select();
        $("#security").on("submit", _loginForm_onsubmit);
    };
    
    function _shake()
    {
        var duration = 70;
        var offset = 20;
        var animation = $("#board").animate({ left: -offset }, duration);
        for (var i = 0; i < 4; i++)
        {
            animation = animation.animate({left: (i % 2 == 0 ? offset : -offset)}, duration);
        }
        animation.animate({ left: 0 }, duration, function(){
            setTimeout(function(){
                $("#psw").focus();
                $("#psw").select();
            }, 100);
        });
    }
    
    function _loginForm_onsubmit(e)
    {
        if (_validated)
        {
            return;
        }
        
        e.preventDefault();
        
        if ($("#userName").val() == "" || $("#psw").val() == "")
        {
            return;
        }
        
       
        $("#userName").attr("disabled", true);
        $("#psw").attr("disabled", true);
        $("#loginButton").attr("disabled", true);
        
        me.restClient.POST("security/validate", { loginName: $("#userName").val() , loginPassword: $("#psw").val()  })
            .success(function()
            {
                $("#userName").attr("disabled", false);
                $("#psw").attr("disabled", false);
                $("#loginButton").attr("disabled", false);
                _validated = true;
                
                $("#board").animate({
                    opacity: 0
                }, 500);
                
                $("#logo").animate({
                    top: 90
                }, 500, function()
                {
                    $("#security").eq(0).submit();
                });
            })
            .fail(function()
            {
                _shake();
                $("#userName").attr("disabled", false);
                $("#psw").attr("disabled", false);
                $("#loginButton").attr("disabled", false);
            });
    }
    
    return me.endOfClass(arguments);
};