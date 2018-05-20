ctrlModule.controller('homeMainCtrl',['$rootScope','$scope','$http',function($rootScope,$scope,$http){
	$scope.pageList = "商品列表页面";
	$scope.page = "home页面";
   $scope.getGoodsListHome= function(){
   		$http({  
			     url:"/api/homeInit",           //请求的url路径  
			     method:"POST",    //GET/DELETE/HEAD/JSONP/POST/PUT  
			     data: {id:123}        //包含了将被当做消息体发送给服务器的数据，通常在POST请求时使用  
			}).success(function(response, status, header, config, statusText){  
			 	console.log('success',response)
			}).error(function(data,header,config,status){  
			 	console.log('error',data)
			});  
   	}
}]);