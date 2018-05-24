ctrlModule.controller('sellerMainCtrl',['$rootScope','$scope','$http',function($rootScope,$scope,$http){
	// 商品列表
	$scope.items=[]
	//请求卖家的所有商品
	$http({  
		     url:"/api/SellerCenter/getGoodsList", 
		     method:"POST",
		     data: {good:{id:1}}        //这种传参方式在POST请求时使用  
		}).success(function(response){  
			if(response.result=="SUCCESS"){
				$scope.items=response.dataList;
				console.log('items',$scope.items)
			}
		}).error(function(data,header,config,status){  
		 	console.log('error',data)
		});


   	// 下架商品
   	$scope.unShelveGood= function(item){
   		alert("deleteGood") 
   	}
   	
}]);