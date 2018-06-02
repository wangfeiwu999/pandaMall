ctrlModule.controller('sellerEditGood',['$rootScope','$scope','FileUploader','$http',
	function($rootScope,$scope,FileUploader,$http){
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
	//文件上传
	$scope.uploader=new FileUploader();
    $scope.uploader.url='/api/pm/upload/uploadGoodPic';/*上传URL*/
    $scope.uploader.onAfterAddingFile = function(fileItem) {
        fileItem.upload()
        console.log(fileItem)
    };
    $scope.uploader.onSuccessItem=function(item, response, status, headers) {
    	console.log(item, response, status, headers)
    	if(response.result=="SUCCESS"){
    		item.preview=response.dataList[0].preview;
    	}
    	
    }

   	$scope.saveGood=function(form){
   		console.log(1,$scope.uploader)
   	}
   	// alert(22)
}]);