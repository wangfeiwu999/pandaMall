ctrlModule.controller('sellerMainCtrl',['$rootScope','$scope',function($rootScope,$scope){
	$scope.items=[{
		id:12,
		name:"name",
		url:"img/logo.jpg",
		price:"10",
		currency:"￥",
		productionPlace:"中国",
		salesCount:"5",
		salesAmount:"50",
		introduce:"这是一个神奇的商品",
		crtDate:new Date()
	}]


   	// 下架商品
   	$scope.unShelveGood= function(item){
   		alert("deleteGood") 
   	}
   	
}]);