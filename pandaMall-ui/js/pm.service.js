var servicelModule = angular.module('servicelModule', []);  
//通用服务
// servicelModule.service('ajaxService', function($http,$q) {
    // this.name = "service";
    // this.myFunc = function (x) {
    //     return x.toString(16);//转16进制
    // }
    // this.getData = function(){
    //     var d = $q.defer();
    //     $http.get("ursl")//读取数据的函数。
    //         .success(function(response) {
    //         d.resolve(response);
    //     })
    //         .error(function(){
    //         alert(0)
    //         d.reject("error");
    //     });
    //     return d.promise;
    // }
 
 //    this.pm_ajax=function(option){
	//     $http({  
	// 	     url:"/api/homeInit",           //请求的url路径  
	// 	     method:"POST",    //GET/DELETE/HEAD/JSONP/POST/PUT  
	// 	     data: {id:123}        //包含了将被当做消息体发送给服务器的数据，通常在POST请求时使用  
	// 	}).success(function(response, status, header, config, statusText){  
	// 	 	console.log('success',response)
	// 	}).error(function(data,header,config,status){  
	// 	 	console.log('error',data)
	// 	}); 
	// } 
// });