(function () {
    'use strict';

    angular.module('BlurAdmin.pages.user', [])
        .controller('userController', function (userService) {

            userService.query().Promise.then(function (users) {
                console.log("users", users);
                // return users;
            });
        });
})();