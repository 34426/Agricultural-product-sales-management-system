
var projectName = '农产品销售管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的订单',
	url: '../shop-order/list.html'
},

{
	name: '我的地址',
	url: '../shop-address/list.html'
},

{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '店铺',
	url: './pages/dianpu/list.html'
}, 
{
	name: '商品',
	url: './pages/shangpin/list.html'
}, 
{
	name: '扶贫政策',
	url: './pages/fupinzhengce/list.html'
}, 
{
	name: '爱心箱',
	url: './pages/aixinxiang/list.html'
}, 

{
	name: '自然风光介绍',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springboot333w4/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


cartFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"店家","menuJump":"列表","tableName":"dianjia"}],"menu":"店家管理"},{"child":[{"buttons":["查看","修改","删除","查看评论"],"menu":"店铺","menuJump":"列表","tableName":"dianpu"}],"menu":"店铺管理"},{"child":[{"buttons":["查看","修改","删除","查看评论"],"menu":"商品","menuJump":"列表","tableName":"shangpin"}],"menu":"商品管理"},{"child":[{"buttons":["查看","修改","删除","新增"],"menu":"商品分类","menuJump":"列表","tableName":"shangpinfenlei"}],"menu":"商品分类管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"生产地分类","menuJump":"列表","tableName":"shengchandifenlei"}],"menu":"生产地分类管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"爱心捐赠","menuJump":"列表","tableName":"aixinjuanzeng"}],"menu":"爱心捐赠管理"},{"child":[{"buttons":["查看","修改","删除","审核","信息登记"],"menu":"贫困店家申请","menuJump":"列表","tableName":"pinkundianjiashenqing"}],"menu":"贫困店家申请管理"},{"child":[{"buttons":["查看","修改","删除","创建爱心箱"],"menu":"贫困店家信息","menuJump":"列表","tableName":"pinkundianjiaxinxi"}],"menu":"贫困店家信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"扶贫政策","menuJump":"列表","tableName":"fupinzhengce"}],"menu":"扶贫政策管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"爱心箱","menuJump":"列表","tableName":"aixinxiang"}],"menu":"爱心箱管理"},{"child":[{"buttons":["审核"],"menu":"退货申请","menuJump":"列表","tableName":"tuihuoshenqing"}],"menu":"退货申请管理"},{"child":[{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"自然风光介绍","tableName":"news"}],"menu":"系统管理"},{"child":[{"buttons":["查看"],"menu":"已支付订单","tableName":"orders/已支付"},{"buttons":["查看"],"menu":"已退款订单","tableName":"orders/已退款"},{"buttons":["查看"],"menu":"已完成订单","tableName":"orders/已完成"},{"buttons":["查看"],"menu":"已发货订单","tableName":"orders/已发货"},{"buttons":["查看"],"menu":"未支付订单","tableName":"orders/未支付"},{"buttons":["查看"],"menu":"已取消订单","tableName":"orders/已取消"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"店铺列表","menuJump":"列表","tableName":"dianpu"}],"menu":"店铺模块"},{"child":[{"buttons":["查看"],"menu":"商品列表","menuJump":"列表","tableName":"shangpin"}],"menu":"商品模块"},{"child":[{"buttons":["查看"],"menu":"扶贫政策列表","menuJump":"列表","tableName":"fupinzhengce"}],"menu":"扶贫政策模块"},{"child":[{"buttons":["查看","爱心捐赠"],"menu":"爱心箱列表","menuJump":"列表","tableName":"aixinxiang"}],"menu":"爱心箱模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","修改","删除","支付"],"menu":"爱心捐赠","menuJump":"列表","tableName":"aixinjuanzeng"}],"menu":"爱心捐赠管理"},{"child":[{"buttons":["查看","新增","修改","删除"],"menu":"退货申请","menuJump":"列表","tableName":"tuihuoshenqing"}],"menu":"退货申请管理"},{"child":[{"buttons":["查看"],"menu":"已完成订单","tableName":"orders/已完成"},{"buttons":["查看","确认收货"],"menu":"已发货订单","tableName":"orders/已发货"},{"buttons":["查看"],"menu":"未支付订单","tableName":"orders/未支付"},{"buttons":["查看"],"menu":"已取消订单","tableName":"orders/已取消"},{"buttons":["查看"],"menu":"已支付订单","tableName":"orders/已支付"},{"buttons":["查看"],"menu":"已退款订单","tableName":"orders/已退款"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"店铺列表","menuJump":"列表","tableName":"dianpu"}],"menu":"店铺模块"},{"child":[{"buttons":["查看"],"menu":"商品列表","menuJump":"列表","tableName":"shangpin"}],"menu":"商品模块"},{"child":[{"buttons":["查看"],"menu":"扶贫政策列表","menuJump":"列表","tableName":"fupinzhengce"}],"menu":"扶贫政策模块"},{"child":[{"buttons":["查看","爱心捐赠"],"menu":"爱心箱列表","menuJump":"列表","tableName":"aixinxiang"}],"menu":"爱心箱模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["查看","修改","删除","查看评论"],"menu":"店铺","menuJump":"列表","tableName":"dianpu"}],"menu":"店铺管理"},{"child":[{"buttons":["新增","查看","修改","删除","上架店铺","查看评论"],"menu":"商品","menuJump":"列表","tableName":"shangpin"}],"menu":"商品管理"},{"child":[{"buttons":["新增","查看"],"menu":"商品分类","menuJump":"列表","tableName":"shangpinfenlei"}],"menu":"商品分类管理"},{"child":[{"buttons":["新增","查看"],"menu":"生产地分类","menuJump":"列表","tableName":"shengchandifenlei"}],"menu":"生产地分类管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"贫困店家申请","menuJump":"列表","tableName":"pinkundianjiashenqing"}],"menu":"贫困店家申请管理"},{"child":[{"buttons":["查看"],"menu":"已完成订单","tableName":"orders/已完成"},{"buttons":["查看"],"menu":"已发货订单","tableName":"orders/已发货"},{"buttons":["查看"],"menu":"未支付订单","tableName":"orders/未支付"},{"buttons":["查看"],"menu":"已取消订单","tableName":"orders/已取消"},{"buttons":["查看","发货"],"menu":"已支付订单","tableName":"orders/已支付"},{"buttons":["查看"],"menu":"已退款订单","tableName":"orders/已退款"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"店铺列表","menuJump":"列表","tableName":"dianpu"}],"menu":"店铺模块"},{"child":[{"buttons":["查看"],"menu":"商品列表","menuJump":"列表","tableName":"shangpin"}],"menu":"商品模块"},{"child":[{"buttons":["查看"],"menu":"扶贫政策列表","menuJump":"列表","tableName":"fupinzhengce"}],"menu":"扶贫政策模块"},{"child":[{"buttons":["查看","爱心捐赠"],"menu":"爱心箱列表","menuJump":"列表","tableName":"aixinxiang"}],"menu":"爱心箱模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"店家","tableName":"dianjia"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
