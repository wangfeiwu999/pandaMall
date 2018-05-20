pmApp.config(['$stateProvider', '$urlRouterProvider',function($stateProvider, $urlRouterProvider) {
	//默认路由状态
    $urlRouterProvider.otherwise('/home');

    $stateProvider
        .state('home', {	//主页
            url: '/home',
            //若只有单个ui-view可以不命名、不指定views
            templateUrl: 'modules/home/temp/homeMain.html'	
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
        .state('sellerMain', {	//卖家中心.主页面
            url: '/sellerMain',
            templateUrl: 'modules/sellerCenter/temp/sellerMain.html'	
        })
        .state('sellerEditGood', {    //卖家中心.添加/编辑商品页面
            url: '/sellerEditGood/:id',
            templateUrl: 'modules/sellerCenter/temp/sellerEditGood.html'    
        })
}]);
