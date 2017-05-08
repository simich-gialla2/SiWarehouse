(function () {
    'use strict';

    angular.module('BlurAdmin.pages.user', [])
        .factory('userService', ['$resource', function ($resource) {
            return $resource('http://localhost:8080/api/user/:id', {id: '@id'}, {
                update: {method: 'PUT', params: {call: 'user'}},
                post: {method: 'POST', params: {call: 'user'}},
                getSingleResult: {method: 'GET', params: {call: 'id'}}
            })
        }]);
})();