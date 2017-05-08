(function () {
    'use strict';

    angular.module('BlurAdmin.pages.user', [])
        .config(routeConfig);

    /** @ngInject */
    function routeConfig($stateProvider) {
        $stateProvider
            .state('usersList', {
                url: '/usersList',
                templateUrl: 'app/pages/user/users-list.html',
                title: 'UsersList',
                sidebarMeta: {
                    order: 800
                },
                controller: 'userController'
            });
    }
})();