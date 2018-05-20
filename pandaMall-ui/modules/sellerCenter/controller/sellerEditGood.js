ctrlModule.controller('sellerEditGood',['$rootScope','$scope',function($rootScope,$scope){
	$scope.item={
		id:12,
		name:"name",
		url:"img/logo.jpg",
		price:"10",
		currency:"￥",
		productionPlace:"中国",
		salesCount:"5",
		salesAmount:"50",
		introduce:"这是一个神奇的商品",
	}
   	$scope.saveGood=function(form){
   		// alert(123)
   		console.log(form)
   	}
   	// alert(22)
}]);