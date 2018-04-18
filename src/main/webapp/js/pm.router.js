pmApp.config(['$stateProvider', '$urlRouterProvider',function($stateProvider, $urlRouterProvider) {
	//默认路由状态
    $urlRouterProvider.otherwise('/goodsList/home');

    $stateProvider
        .state('goodsList', {	//商品列表
            url: '/goodsList',
            //若只有单个ui-view可以不命名、不指定views
            templateUrl: 'modules/goodsList/temp/goodsListMain.html'	
        })
        .state('goodsList.home', {	//商品列表.首页
            url: '/home',		//二级路由URL会自动拼接到对应的一级路由URL后面
            views: {			//views只需指定二级路由路由中的ui-view
                'listNav': {
                    templateUrl: 'modules/goodsList/temp/goodsList.home.html'
                },
            }
        })
        .state('goodsList.market', {	//商品列表.熊猫超市
            url: '/market',
            views: {
                'listNav': {
                    templateUrl: 'modules/goodsList/temp/goodsList.market.html'
                },
            }
        })
        .state('goodsList.international', {	//商品列表.熊猫国际
            url: '/international',
            views: {
                'listNav': {
                    templateUrl: 'modules/goodsList/temp/goodsList.international.html'
                },
            }
        })
        .state('goodsList.onSale', {	//商品列表.熊猫特惠
            url: '/onSale',
            views: {
                'listNav': {
                    templateUrl: 'modules/goodsList/temp/goodsList.onSale.html'
                },
            }
        })
        .state('goodsList.rank', {	//商品列表.排行榜
            url: '/rank',
            views: {
                'listNav': {
                    templateUrl: 'modules/goodsList/temp/goodsList.rank.html'
                },
            }
        })
        .state('goodsList.brand', {	//商品列表.品牌团
            url: '/brand',
            views: {
                'listNav': {
                    templateUrl: 'modules/goodsList/temp/goodsList.brand.html'
                },
            }
        })
        .state('login', {	//登录
            url: '/login',
            templateUrl: 'modules/loginVSregister/temp/login.html'	
        })
        .state('register', {	//注册
            url: '/register',
            templateUrl: 'modules/loginVSregister/temp/register.html'	
        })
        .state('myOrders', {	//我的订单
            url: '/myOrders',
            templateUrl: 'modules/myOrders/temp/myOrdersMain.html'	
        })
        .state('cart', {	//购物车
            url: '/cart',
            templateUrl: 'modules/cart/temp/cartMain.html'	
        })
        .state('helpCenter', {	//帮助中心
            url: '/helpCenter',
            templateUrl: 'modules/helpCenter/temp/helpCenterMain.html'	
        })
        .state('sellerCenter', {	//卖家中心
            url: '/sellerCenter',
            templateUrl: 'modules/sellerCenter/temp/sellerCenterMain.html'	
        })
}]);
