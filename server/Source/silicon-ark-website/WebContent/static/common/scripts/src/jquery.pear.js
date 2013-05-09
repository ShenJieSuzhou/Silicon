$.fn.pear = function(opt)
{
    var defaultOpt = {
        cellWidth: 500,
        cellHeight: 300,
        cellPadding: 15
    };
    opt = $.extend(defaultOpt, opt);
    this.addClass("pear");
    
    var $li = this.children("li");
    $li.width(opt.cellWidth).height(opt.cellHeight).css("margin", opt.cellPadding);

    $li.mouseenter(function(e){
        $(this).find("#title").stop(true, true).slideDown("fast");
    });
    
    $li.mouseleave(function(e){
        $(this).find("#title").stop(true, true).slideUp("fast");
    });
    
    return this;
};