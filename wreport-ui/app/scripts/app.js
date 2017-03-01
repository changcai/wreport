'use strict';

angular
  .module('wreportApp', [
    'ngResource', 'ngRoute','ui.bootstrap'
  ])
  .config(function ($locationProvider, $routeProvider, $resourceProvider) {
    $locationProvider.hashPrefix('!');
    $routeProvider
      .when('/main', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl',
        controllerAs: 'Main'
      })
      .otherwise({
        redirectTo: '/main'
      });
    $resourceProvider.defaults.actions = {
      create: {method: 'POST'},
      get:    {method: 'GET'},
      getAll: {method: 'GET', isArray:true},
      update: {method: 'PUT'},
      delete: {method: 'DELETE'}
    };
  })
  .constant("server_url", "http://localhost:8888/wreport-server");
