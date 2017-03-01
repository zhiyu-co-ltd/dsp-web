//切换
$(function() {
	$('.guanggao_echarts_tl a').click(function(){
		var index = $(this).index();
		 $(this).addClass('ahover').siblings().removeClass('ahover');
		 $(".guanggao_echarts_con").eq(index).show().addClass('xianshi').siblings().removeClass('xianshi').hide();
	});
	});
//echarts
require(
									[
										'echarts',
										'echarts/chart/line' // 使用柱状图就加载bar模块，按需加载
									],
									function(ec) {
										// 基于准备好的dom，初始化echarts图表
										var myChart9 = ec.init(document.getElementById('biaoge10'));
										var option = {
     tooltip: {
        trigger: "axis"
    },
    legend: {
        data: ["测试1", "测试2", "测试3", "测试4", "测试5", "测试6", "测试7"],
        y: "bottom"
    },
    toolbox: {
        show: false,
        feature: {
            mark: {
                show: true
            },
            dataView: {
                show: true,
                readOnly: true
            },
            magicType: {
                show: false,
                type: ["line", "bar"]
            },
            restore: {
                show: true
            },
            saveAsImage: {
                show: true
            }
        }
    },
    calculable: true,
    xAxis: [
        {
            type: "category",
            boundaryGap: false,
            data: ["00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"]
        }
    ],
    yAxis: [
        {
            type: "value",
            name: "次"
        }
    ],
    series: [
        {
            name: "测试1",
            type: "line",
            data: [11, 11, 15, 13, 12, 13, 10, 12, 32, 43, 54, 64, 23, 54, 23, 4, 54, 34, 45, 23, 43, 13, 23, 43]
        },
        {
            name: "测试2",
            type: "line",
            data: [1, 2, 2, 5, 3, 2, 4, 23, 53, 23, 54, 23, 34, 43, 23, 43, 43, 32, 43, 23, 23, 43, 12, 43]
        },
        {
            type: "line",
            name: "测试3",
            data: [12, 34, 33, 45, 54, 23, 14, 54, 65, 34, 54, 34, 54, 56, 76, 86, 34, 56, 67, 45, 34, 45, 56, 34]
        },
        {
            type: "line",
            name: "测试4",
            data: [23, 23, 45, 54, 56, 34, 24, 32, 45, 45, 34, 34, 45, 56, 34, 34, 55, 21, 34, 13, 34, 45, 23, 54]
        },
        {
            type: "line",
            name: "测试5",
            data: [24, 24, 23, 53, 34, 234, 34, 56, 45, 23, 45, 45, 32, 3, 34, 45, 54, 32, 21, 43, 45, 45, 32, 54]
        },
        {
            type: "line",
            name: "测试6",
            data: [24, 43, 54, 54, 32, 43, 53, 45, 43, 45, 56, 23, 5, 45, 45, 45, 23, 4, 45, 34, 54, 23, 45, 23]
        },
        {
            type: "line",
            name: "测试7",
            data: [14, 43, 24, 23, 45, 45, 32, 54, 45, 5, 43, 23, 54, 45, 23, 43, 45, 45, 23, 45, 23, 54, 65, 32]
        }
    
    ]
};
										myChart9.setOption(option);

									}
								);
								
require(
									[
										'echarts',
										'echarts/chart/line' // 使用柱状图就加载bar模块，按需加载
									],
									function(ec) {
										// 基于准备好的dom，初始化echarts图表
										var myChart11 = ec.init(document.getElementById('biaoge11'));
										var option = {
     tooltip: {
        trigger: "axis"
    },
    legend: {
        data: ["测试1", "测试2", "测试3", "测试4", "测试5", "测试6", "测试7"],
        y: "bottom"
    },
    toolbox: {
        show: false,
        feature: {
            mark: {
                show: true
            },
            dataView: {
                show: true,
                readOnly: true
            },
            magicType: {
                show: false,
                type: ["line", "bar"]
            },
            restore: {
                show: true
            },
            saveAsImage: {
                show: true
            }
        }
    },
    calculable: true,
    xAxis: [
        {
            type: "category",
            boundaryGap: false,
            data: ["00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"]
        }
    ],
    yAxis: [
        {
            type: "value",
            name: "次"
        }
    ],
    series: [
        {
            name: "测试1",
            type: "line",
            data: [11, 11, 15, 13, 12, 13, 10, 12, 32, 43, 54, 64, 23, 54, 23, 4, 54, 34, 45, 23, 43, 13, 23, 43]
        },
        {
            name: "测试2",
            type: "line",
            data: [1, 2, 2, 5, 3, 2, 4, 23, 53, 23, 54, 23, 34, 43, 23, 43, 43, 32, 43, 23, 23, 43, 12, 43]
        },
        {
            type: "line",
            name: "测试3",
            data: [12, 34, 33, 45, 54, 23, 14, 54, 65, 34, 54, 34, 54, 56, 76, 86, 34, 56, 67, 45, 34, 45, 56, 34]
        },
        {
            type: "line",
            name: "测试4",
            data: [23, 23, 45, 54, 56, 34, 24, 32, 45, 45, 34, 34, 45, 56, 34, 34, 55, 21, 34, 13, 34, 45, 23, 54]
        },
        {
            type: "line",
            name: "测试5",
            data: [24, 24, 23, 53, 34, 234, 34, 56, 45, 23, 45, 45, 32, 3, 34, 45, 54, 32, 21, 43, 45, 45, 32, 54]
        },
        {
            type: "line",
            name: "测试6",
            data: [24, 43, 54, 54, 32, 43, 53, 45, 43, 45, 56, 23, 5, 45, 45, 45, 23, 4, 45, 34, 54, 23, 45, 23]
        },
        {
            type: "line",
            name: "测试7",
            data: [14, 43, 24, 23, 45, 45, 32, 54, 45, 5, 43, 23, 54, 45, 23, 43, 45, 45, 23, 45, 23, 54, 65, 32]
        }
    
    ]
};
										myChart11.setOption(option);

									}
								);
require(
									[
										'echarts',
										'echarts/chart/line' // 使用柱状图就加载bar模块，按需加载
									],
									function(ec) {
										// 基于准备好的dom，初始化echarts图表
										var myChart12 = ec.init(document.getElementById('biaoge12'));
										var option = {
     tooltip: {
        trigger: "axis"
    },
    legend: {
        data: ["测试1", "测试2", "测试3", "测试4", "测试5", "测试6", "测试7"],
        y: "bottom"
    },
    toolbox: {
        show: false,
        feature: {
            mark: {
                show: true
            },
            dataView: {
                show: true,
                readOnly: true
            },
            magicType: {
                show: false,
                type: ["line", "bar"]
            },
            restore: {
                show: true
            },
            saveAsImage: {
                show: true
            }
        }
    },
    calculable: true,
    xAxis: [
        {
            type: "category",
            boundaryGap: false,
            data: ["00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"]
        }
    ],
    yAxis: [
        {
            type: "value",
            name: "%"
        }
    ],
    series: [
        {
            name: "测试1",
            type: "line",
            data: [11, 11, 15, 13, 12, 13, 10, 12, 32, 43, 54, 64, 23, 54, 23, 4, 54, 34, 45, 23, 43, 13, 23, 43]
        },
        {
            name: "测试2",
            type: "line",
            data: [1, 2, 2, 5, 3, 2, 4, 23, 53, 23, 54, 23, 34, 43, 23, 43, 43, 32, 43, 23, 23, 43, 12, 43]
        },
        {
            type: "line",
            name: "测试3",
            data: [12, 34, 33, 45, 54, 23, 14, 54, 65, 34, 54, 34, 54, 56, 76, 86, 34, 56, 67, 45, 34, 45, 56, 34]
        },
        {
            type: "line",
            name: "测试4",
            data: [23, 23, 45, 54, 56, 34, 24, 32, 45, 45, 34, 34, 45, 56, 34, 34, 55, 21, 34, 13, 34, 45, 23, 54]
        },
        {
            type: "line",
            name: "测试5",
            data: [24, 24, 23, 53, 34, 234, 34, 56, 45, 23, 45, 45, 32, 3, 34, 45, 54, 32, 21, 43, 45, 45, 32, 54]
        },
        {
            type: "line",
            name: "测试6",
            data: [24, 43, 54, 54, 32, 43, 53, 45, 43, 45, 56, 23, 5, 45, 45, 45, 23, 4, 45, 34, 54, 23, 45, 23]
        },
        {
            type: "line",
            name: "测试7",
            data: [14, 43, 24, 23, 45, 45, 32, 54, 45, 5, 43, 23, 54, 45, 23, 43, 45, 45, 23, 45, 23, 54, 65, 32]
        }
    
    ]
};
										myChart12.setOption(option);

									}
								);
					

require(
									[
										'echarts',
										'echarts/chart/line' // 使用柱状图就加载bar模块，按需加载
									],
									function(ec) {
										// 基于准备好的dom，初始化echarts图表
										var myChart13 = ec.init(document.getElementById('biaoge13'));
										var option = {
     tooltip: {
        trigger: "axis"
    },
    legend: {
        data: ["测试1", "测试2", "测试3", "测试4", "测试5", "测试6", "测试7"],
        y: "bottom"
    },
    toolbox: {
        show: false,
        feature: {
            mark: {
                show: true
            },
            dataView: {
                show: true,
                readOnly: true
            },
            magicType: {
                show: false,
                type: ["line", "bar"]
            },
            restore: {
                show: true
            },
            saveAsImage: {
                show: true
            }
        }
    },
    calculable: true,
    xAxis: [
        {
            type: "category",
            boundaryGap: false,
            data: ["00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"]
        }
    ],
    yAxis: [
        {
            type: "value",
            name: "次"
        }
    ],
    series: [
        {
            name: "测试1",
            type: "line",
            data: [11, 11, 15, 13, 12, 13, 10, 12, 32, 43, 54, 64, 23, 54, 23, 4, 54, 34, 45, 23, 43, 13, 23, 43]
        },
        {
            name: "测试2",
            type: "line",
            data: [1, 2, 2, 5, 3, 2, 4, 23, 53, 23, 54, 23, 34, 43, 23, 43, 43, 32, 43, 23, 23, 43, 12, 43]
        },
        {
            type: "line",
            name: "测试3",
            data: [12, 34, 33, 45, 54, 23, 14, 54, 65, 34, 54, 34, 54, 56, 76, 86, 34, 56, 67, 45, 34, 45, 56, 34]
        },
        {
            type: "line",
            name: "测试4",
            data: [23, 23, 45, 54, 56, 34, 24, 32, 45, 45, 34, 34, 45, 56, 34, 34, 55, 21, 34, 13, 34, 45, 23, 54]
        },
        {
            type: "line",
            name: "测试5",
            data: [24, 24, 23, 53, 34, 234, 34, 56, 45, 23, 45, 45, 32, 3, 34, 45, 54, 32, 21, 43, 45, 45, 32, 54]
        },
        {
            type: "line",
            name: "测试6",
            data: [24, 43, 54, 54, 32, 43, 53, 45, 43, 45, 56, 23, 5, 45, 45, 45, 23, 4, 45, 34, 54, 23, 45, 23]
        },
        {
            type: "line",
            name: "测试7",
            data: [14, 43, 24, 23, 45, 45, 32, 54, 45, 5, 43, 23, 54, 45, 23, 43, 45, 45, 23, 45, 23, 54, 65, 32]
        }
    
    ]
};
										myChart13.setOption(option);

									}
							);
							
require(
									[
										'echarts',
										'echarts/chart/line' // 使用柱状图就加载bar模块，按需加载
									],
									function(ec) {
										// 基于准备好的dom，初始化echarts图表
										var myChart14 = ec.init(document.getElementById('biaoge14'));
										var option = {
     tooltip: {
        trigger: "axis"
    },
    legend: {
        data: ["测试1", "测试2", "测试3", "测试4", "测试5", "测试6", "测试7"],
        y: "bottom"
    },
    toolbox: {
        show: false,
        feature: {
            mark: {
                show: true
            },
            dataView: {
                show: true,
                readOnly: true
            },
            magicType: {
                show: false,
                type: ["line", "bar"]
            },
            restore: {
                show: true
            },
            saveAsImage: {
                show: true
            }
        }
    },
    calculable: true,
    xAxis: [
        {
            type: "category",
            boundaryGap: false,
            data: ["00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"]
        }
    ],
    yAxis: [
        {
            type: "value",
            name: "%"
        }
    ],
    series: [
        {
            name: "测试1",
            type: "line",
            data: [11, 11, 15, 13, 12, 13, 10, 12, 32, 43, 54, 64, 23, 54, 23, 4, 54, 34, 45, 23, 43, 13, 23, 43]
        },
        {
            name: "测试2",
            type: "line",
            data: [1, 2, 2, 5, 3, 2, 4, 23, 53, 23, 54, 23, 34, 43, 23, 43, 43, 32, 43, 23, 23, 43, 12, 43]
        },
        {
            type: "line",
            name: "测试3",
            data: [12, 34, 33, 45, 54, 23, 14, 54, 65, 34, 54, 34, 54, 56, 76, 86, 34, 56, 67, 45, 34, 45, 56, 34]
        },
        {
            type: "line",
            name: "测试4",
            data: [23, 23, 45, 54, 56, 34, 24, 32, 45, 45, 34, 34, 45, 56, 34, 34, 55, 21, 34, 13, 34, 45, 23, 54]
        },
        {
            type: "line",
            name: "测试5",
            data: [24, 24, 23, 53, 34, 234, 34, 56, 45, 23, 45, 45, 32, 3, 34, 45, 54, 32, 21, 43, 45, 45, 32, 54]
        },
        {
            type: "line",
            name: "测试6",
            data: [24, 43, 54, 54, 32, 43, 53, 45, 43, 45, 56, 23, 5, 45, 45, 45, 23, 4, 45, 34, 54, 23, 45, 23]
        },
        {
            type: "line",
            name: "测试7",
            data: [14, 43, 24, 23, 45, 45, 32, 54, 45, 5, 43, 23, 54, 45, 23, 43, 45, 45, 23, 45, 23, 54, 65, 32]
        }
    
    ]
};
										myChart14.setOption(option);

									}
								);
								
require(
									[
										'echarts',
										'echarts/chart/line' // 使用柱状图就加载bar模块，按需加载
									],
									function(ec) {
										// 基于准备好的dom，初始化echarts图表
										var myChart15 = ec.init(document.getElementById('biaoge15'));
										var option = {
     tooltip: {
        trigger: "axis"
    },
    legend: {
        data: ["测试1", "测试2", "测试3", "测试4", "测试5", "测试6", "测试7"],
        y: "bottom"
    },
    toolbox: {
        show: false,
        feature: {
            mark: {
                show: true
            },
            dataView: {
                show: true,
                readOnly: true
            },
            magicType: {
                show: false,
                type: ["line", "bar"]
            },
            restore: {
                show: true
            },
            saveAsImage: {
                show: true
            }
        }
    },
    calculable: true,
    xAxis: [
        {
            type: "category",
            boundaryGap: false,
            data: ["00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"]
        }
    ],
    yAxis: [
        {
            type: "value",
            name: "次"
        }
    ],
    series: [
        {
            name: "测试1",
            type: "line",
            data: [11, 11, 15, 13, 12, 13, 10, 12, 32, 43, 54, 64, 23, 54, 23, 4, 54, 34, 45, 23, 43, 13, 23, 43]
        },
        {
            name: "测试2",
            type: "line",
            data: [1, 2, 2, 5, 3, 2, 4, 23, 53, 23, 54, 23, 34, 43, 23, 43, 43, 32, 43, 23, 23, 43, 12, 43]
        },
        {
            type: "line",
            name: "测试3",
            data: [12, 34, 33, 45, 54, 23, 14, 54, 65, 34, 54, 34, 54, 56, 76, 86, 34, 56, 67, 45, 34, 45, 56, 34]
        },
        {
            type: "line",
            name: "测试4",
            data: [23, 23, 45, 54, 56, 34, 24, 32, 45, 45, 34, 34, 45, 56, 34, 34, 55, 21, 34, 13, 34, 45, 23, 54]
        },
        {
            type: "line",
            name: "测试5",
            data: [24, 24, 23, 53, 34, 234, 34, 56, 45, 23, 45, 45, 32, 3, 34, 45, 54, 32, 21, 43, 45, 45, 32, 54]
        },
        {
            type: "line",
            name: "测试6",
            data: [24, 43, 54, 54, 32, 43, 53, 45, 43, 45, 56, 23, 5, 45, 45, 45, 23, 4, 45, 34, 54, 23, 45, 23]
        },
        {
            type: "line",
            name: "测试7",
            data: [14, 43, 24, 23, 45, 45, 32, 54, 45, 5, 43, 23, 54, 45, 23, 43, 45, 45, 23, 45, 23, 54, 65, 32]
        }
    
    ]
};
										myChart15.setOption(option);

									}
							);
							