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
            name: "数量",
            min: 0,
            max: 1000000000
        },
        {
            type: "value",
            name: "价格",
            min: 0,
            max: 50000
        }
    ],
    series: [
        {
            name: "花费",
            type: "line",
            data: [10000, 20000, 9000, 6000, 3000, 5678, 2345, 9800, 4321, 6654, 6543, 3333]
        },
        {
            name: "下载量",
            type: "line",
            data: [5000, 6000, 9000, 2640, 2870, 7077, 1756, 1822, 487, 188, 6098, 2113]
        },
        {
            name: "点击量",
            type: "line",
            yAxisIndex: 1,
            data: [15000, 26000, 29000, 12640, 42870, 47077, 71756, 61822, 67487, 76188, 76098, 82113]
        },
        {
            name: "曝光量",
            type: "line",
            yAxisIndex: 1,
            data: [45000, 56000, 129000, 122640, 42870, 47077, 71756, 61822, 67487, 76188, 76098, 82113]
        }
    ]
};
										myChart9.setOption(option);

									}
								);