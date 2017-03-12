$(function() {
	$(".tj_head_btn").toggle(function(){
		$(".tj_main_lf").animate({left:'-200px'},"slow");
		$(".tj_main_rt").animate({paddingLeft:'0px'},"slow");
	},function(){
		$(".tj_main_lf").animate({left:'0px'},"slow");
		$(".tj_main_rt").animate({paddingLeft:'200px'},"slow");
	})
});

//充值切换
$(function() {
	$('.caiwu_tl a').click(function(){
		var index = $(this).index();
		 $(this).addClass('ahover').siblings().removeClass('ahover');
		 $(".caiwu_con").eq(index).show().addClass('active').siblings().removeClass('active').hide();
	});
	});
	
$(function() {
	$(".renzhengbtn").click(function(){
		$(".huibg").show();
		$(".renzheng_alert").show();
	});
	$(".cha").click(function(){
		$(".huibg").hide();
		$(".renzheng_alert").hide();
		$(".geren_alert").hide();
		$(".qiye_alert").hide();
		$(".tuiguang_alert").hide();
		$(".gaoji_alert").hide();
	});
	$(".huibg").click(function(){
		$(".huibg").hide();
		$(".renzheng_alert").hide();
		$(".qiye_alert").hide();
		$(".geren_alert").hide();
		$(".tuiguang_alert").hide();
		$(".teding").hide();
		$(".gaoji_alert").hide();
		$(".tjgg_alert").hide();
	});
	$(".geren").click(function(){
		$(".geren_alert").show();
		$(".renzheng_alert").hide();
		$(".qiye_alert").hide();
	});
	$(".qiye").click(function(){
		$(".qiye_alert").show();
		$(".renzheng_alert").hide();
		$(".geren_alert").hide();
	});
	$(".geren_btn input").click(function(){
		 $(".huibg").hide();
		 $(".renzheng_alert").hide();
		 $(".geren_alert").hide();
		 $(".qiye_alert").hide();
		 $(".tuiguang_alert").hide();
	});
	$(".biji").click(function(){
		$(".tuiguang_alert").show();
		$(".huibg").show();
	});
	$(".xinjian_tg").click(function(){
		$(".tuiguang_alert").show();
		$(".huibg").show();
	});
	$(".xinjiantuig").click(function(){
		$(".tuiguang_alert").show();
		$(".huibg").show();
	});
});


$(function() { 
		$('.mwui-switch-btn').each(function() {
			$(this).bind("click", function() { 
				var btn = $(this).find("span");
				var change = btn.attr("change");
				btn.toggleClass('off'); 

				if(btn.attr("class") == 'off') { 
					$(this).find("input").val("0");
					btn.attr("change", btn.html()); 
					btn.html(change);
				} else { 
					$(this).find("input").val("1");
					btn.attr("change", btn.html()); 
					btn.html(change);
				}  

				return false;
			});
		});

		
	});
	
//创建广告
$(function() {
	$('.shijianduan').click(function(){
		 $(this).addClass('shijianduan_h').siblings().removeClass('shijianduan_h');
		
	});
	 $('.teding_dian').click(function(){
		 $(this).toggleClass('teding_dianh');
		
	}); 
	 $('.quanxuan').click(function(){
		  $('.teding_dian').addClass('teding_dianh');
		
	}); 
	$('.qingchu').click(function(){
		  $('.teding_dian').removeClass('teding_dianh');
		
	}); 
	
	$('.teding_anniu').click(function(){
		  $('.huibg').show();
		  $('.teding').show();
	}); 
	$('.td_btn a').click(function(){
		  $('.huibg').hide();
		  $('.teding').hide();
	}); 
	$('.duihao').click(function(){
		 $(this).toggleClass('duihao_h');
		
	});
	$('.gj_all').click(function(){
		 $('.duihao').addClass('duihao_h');
		
	});
	$('.gj_anniu').click(function(){
		  $('.huibg').show();
		  $('.gaoji_alert').show();
	}); 
	$('.tjgg').click(function(){
		  $('.huibg').show();
		  $('.tjgg_alert').show();
	}); 
	$('.tjgg_success a').click(function(){
		  $('.huibg').hide();
		  $('.tjgg_alert').hide();
	});
	});
	

//规格切换
$(function() {
	$('.guige_rt a').click(function(){
		var index = $(this).index();
		 $(this).addClass('ahover').siblings().removeClass('ahover');
		 $(".guige_con").eq(index).show().addClass('active').siblings().removeClass('active').hide();
	});
	$('.xinxiliu_tl a').click(function(){
		var index = $(this).index();
		 $(this).addClass('ahover').siblings().removeClass('ahover');
		 $(".xxl_con").eq(index).show().addClass('active').siblings().removeClass('active').hide();
	});
	$('.zutu_tl a').click(function(){
		var index = $(this).index();
		 $(this).addClass('ahover').siblings().removeClass('ahover');
		 $(".zutucon").eq(index).show().addClass('active').siblings().removeClass('active').hide();
	});
	$('.bofang_main').click(function(){
		 $(this).addClass('bofang_main_h').siblings().removeClass('bofang_main_h');
		
	});
	});
//定向
 $('.dx_duoxuan a').click(function(){
		 $(this).toggleClass('ahover');
		
	});
$('.danxuan a').click(function(){
		 $(this).addClass('ahover').siblings().removeClass('ahover');
		
	});
$(function() {
	$('.xingqu_dy').click(function(){
		 $('.xingqu').show();
		
	});
	$('.xingqubuxian').click(function(){
		 $('.xingqu').hide();
		
	});
	$('.shengshibtn').click(function(){
		 $('.shengshi').show();
		
	});
	$('.shengshibuxian').click(function(){
		 $('.shengshi').hide();
		
	});
});
//新增
$(".guige_ul .zengjia").live("click",function () {
	var ozj=$(this).parents(".zli").html();
	$(this).parents(".zli").after("<li class='zli'>"+ozj+"</li>");
})


