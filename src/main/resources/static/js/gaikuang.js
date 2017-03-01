//圆形进度条
$(function(){
        // 进度使用 circliful插件，请确保引入插件后执行下面代码
        $('.am-prgoress-circle').circliful();

    })
//echarts
require(
									[
										'echarts',
										'echarts/chart/line' // 使用柱状图就加载bar模块，按需加载
									],
									function(ec) {
										// 基于准备好的dom，初始化echarts图表
										var myChart9 = ec.init(document.getElementById('biaoge9'));
										var option = {
    tooltip: {
        trigger: "axis"
    },
    legend: {
        data: ["花费", "下载量", "点击量", "曝光量"]
    },
    toolbox: {
        feature: {
            mark: {
                show: true
            },
            dataView: {
                show: true,
                readOnly: false
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
            axisLine: {
                onZero: false
            },
            data: ["1月", "2月", "3月", "4月", "5月", "6月", "7月", "8月", "9月", "10月", "11月", "12月"]
        }
    ],
    grid: {
        y: 70
    },
    yAxis: [
        {
            type: "value",
            name: "数量"
        },
        {
            type: "value",
            name: "价格",
            min: -300,
            max: 150
        }
    ],
    series: [
        {
            name: "花费",
            type: "line",
            data: [2, 4.9, 7, 23.2, 25.6, 76.7, 135.6, 162.2, 32.6, 20, 6.4, 3.3]
        },
        {
            name: "下载量",
            type: "line",
            data: [2.6, 5.9, 9, 26.4, 28.7, 70.7, 175.6, 182.2, 48.7, 18.8, 6, 2.3]
        },
        {
            name: "点击量",
            type: "line",
            yAxisIndex: 1,
            data: [0, 2.9, 2.1, 16.2, 2.4, 51.1, 58.9, 26.6, -129.6, -12.6, -13.6, -3.1]
        },
        {
            name: "曝光量",
            type: "line",
            yAxisIndex: 1,
            data: [0, 3.3, 3.1, 17.4, 2.3, 42, 104.9, 6.6, -133.5, -29.9, -12.8, -3.7]
        }
    ]
};
										myChart9.setOption(option);

									}
								);