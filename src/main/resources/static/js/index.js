$(function() {
	$('.sy5_a a').click(function(){
		var index = $(this).index();
		 $(this).addClass('ahover').siblings().removeClass('ahover');
		 $(".sy5_con").eq(index).show().addClass('active').siblings().removeClass('active').hide();
	});
	});
	
$(function() {
	$('.sy3_btn_con').click(function(){
		var index = $(this).index();
		 $(this).addClass('sy3_btn_con_mainh').siblings().removeClass('sy3_btn_con_mainh');
		 $(".sy3_text_con").eq(index).show().addClass('active').siblings().removeClass('active').hide();
		 $(".sy3_tp").eq(index).show().addClass('active').siblings().removeClass('active').hide();
	});
	});
$(function() {
	$('.lgbtn').click(function(){
		$(".huibg").show();
		$(".login_alert").show();
		$(".rg_alert").hide();
		$(".find_alert").hide();
	});
	$('.regbtn').click(function(){
		$(".huibg").show();
		$(".rg_alert").show();
		$(".login_alert").hide();
		$(".find_alert").hide();
	});
	$('.yiyou').click(function(){
		$(".login_alert").show();
		$(".rg_alert").hide();
		$(".find_alert").hide();
	});
	$('.ljzc').click(function(){
		$(".login_alert").hide();
		$(".rg_alert").show();
		$(".find_alert").hide();
	});
	$('.wangmi').click(function(){
		$(".find_alert").show();
		$(".login_alert").hide();
		$(".rg_alert").hide();
	});
	$('.lg_btn input').click(function(){
		$(".huibg").hide();
		$(".login_alert").hide();
		$(".rg_alert").hide();
		$(".find_alert").hide();
	});
	$('.huibg').click(function(){
		$(".huibg").hide();
		$(".login_alert").hide();
		$(".rg_alert").hide();
		$(".find_alert").hide();
	});
	});
	
	
