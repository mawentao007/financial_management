(function() {
  var DeleteUserCtrl;

  DeleteUserCtrl = (function() {
    function DeleteUserCtrl($log, $location, $routeParams, UserService) {
      this.$log = $log;
      this.$location = $location;
      this.$routeParams = $routeParams;
      this.UserService = UserService;
      this.$log.debug("constructing DeleteUserController");
      this.deleteUser();
    }

    DeleteUserCtrl.prototype.deleteUser = function() {
      var email, userName;
      this.$log.debug("deleteUser()");
      userName = this.$routeParams.userName;
      this.$log.debug("" + this.$routeParams);
      email = this.$routeParams.email;
      return this.UserService.deleteUser(userName, email).then((function(_this) {
        return function(data) {
          _this.$log.debug("Promise returned " + data + " User");
          return _this.$location.path("/");
        };
      })(this), (function(_this) {
        return function(error) {
          _this.$log.error("Unable to delete User: " + error);
          alert(error);
          return _this.$location.path("/");
        };
      })(this));
    };

    return DeleteUserCtrl;

  })();

  controllersModule.controller('DeleteUserCtrl', DeleteUserCtrl);

}).call(this);

//# sourceMappingURL=DeleteUserCtrl.js.map
