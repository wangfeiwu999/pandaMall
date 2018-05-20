var ctrlModule = angular.module('ctrlModule', []);  
//根控制器
ctrlModule.controller('rootCtrl', function($rootScope) {
    $rootScope.welcomeHander = "欢迎访问熊猫商城";
});