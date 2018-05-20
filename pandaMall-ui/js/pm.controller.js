var ctrlModule = angular.module('ctrlModule', []);  

ctrlModule.controller('rootCtrl', function($rootScope) {
    $rootScope.welcomeHander = "欢迎访问熊猫商城";
});