import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import discussshangpin from '@/views/modules/discussshangpin/list'
    import shangpin from '@/views/modules/shangpin/list'
    import discussaixinxiang from '@/views/modules/discussaixinxiang/list'
    import tuihuoshenqing from '@/views/modules/tuihuoshenqing/list'
    import dianpu from '@/views/modules/dianpu/list'
    import pinkundianjiashenqing from '@/views/modules/pinkundianjiashenqing/list'
    import aixinjuanzeng from '@/views/modules/aixinjuanzeng/list'
    import shengchandifenlei from '@/views/modules/shengchandifenlei/list'
    import discussdianpu from '@/views/modules/discussdianpu/list'
    import yonghu from '@/views/modules/yonghu/list'
    import dianjia from '@/views/modules/dianjia/list'
    import shangpinfenlei from '@/views/modules/shangpinfenlei/list'
    import aixinxiang from '@/views/modules/aixinxiang/list'
    import fupinzhengce from '@/views/modules/fupinzhengce/list'
    import discussfupinzhengce from '@/views/modules/discussfupinzhengce/list'
    import orders from '@/views/modules/orders/list'
    import pinkundianjiaxinxi from '@/views/modules/pinkundianjiaxinxi/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '自然风光介绍',
        component: news
      }
      ,{
	path: '/discussshangpin',
        name: '商品评论',
        component: discussshangpin
      }
      ,{
	path: '/shangpin',
        name: '商品',
        component: shangpin
      }
      ,{
	path: '/discussaixinxiang',
        name: '爱心箱评论',
        component: discussaixinxiang
      }
      ,{
	path: '/tuihuoshenqing',
        name: '退货申请',
        component: tuihuoshenqing
      }
      ,{
	path: '/dianpu',
        name: '店铺',
        component: dianpu
      }
      ,{
	path: '/pinkundianjiashenqing',
        name: '贫困店家申请',
        component: pinkundianjiashenqing
      }
      ,{
	path: '/aixinjuanzeng',
        name: '爱心捐赠',
        component: aixinjuanzeng
      }
      ,{
	path: '/shengchandifenlei',
        name: '生产地分类',
        component: shengchandifenlei
      }
      ,{
	path: '/discussdianpu',
        name: '店铺评论',
        component: discussdianpu
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/dianjia',
        name: '店家',
        component: dianjia
      }
      ,{
	path: '/shangpinfenlei',
        name: '商品分类',
        component: shangpinfenlei
      }
      ,{
	path: '/aixinxiang',
        name: '爱心箱',
        component: aixinxiang
      }
      ,{
	path: '/fupinzhengce',
        name: '扶贫政策',
        component: fupinzhengce
      }
      ,{
	path: '/discussfupinzhengce',
        name: '扶贫政策评论',
        component: discussfupinzhengce
      }
      ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
      ,{
	path: '/pinkundianjiaxinxi',
        name: '贫困店家信息',
        component: pinkundianjiaxinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
