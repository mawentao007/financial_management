(function() {
  var UpdateUserCtrl;

  UpdateUserCtrl = (function() {
    function UpdateUserCtrl($log, $location, $routeParams, UserService) {
      this.$log = $log;
      this.$location = $location;
      this.$routeParams = $routeParams;
      this.UserService = UserService;
      this.$log.debug("constructing UpdateUserController");
      this.$log.debug("@");
      this.user = {};
      this.findUser();
      this.$log.debug("？？() " + (angular.toJson(this.user, true)));
    }

    UpdateUserCtrl.prototype.updateUser = function() {
      return this.UserService.updateUser(this.$routeParams.userName, this.$routeParams.email, this.user).then((function(_this) {
        return function(data) {
          _this.$log.debug("Promise returned " + data + " User");
          _this.user = data;
          return _this.$location.path("/");
        };
      })(this), (function(_this) {
        return function(error) {
          return _this.$log.error("Unable to update User: " + error);
        };
      })(this));
    };

    UpdateUserCtrl.prototype.findUser = function() {
      var email, userName;
      userName = this.$routeParams.userName;
      email = this.$routeParams.email;
      this.$log.debug("findUser route params: " + userName + " " + password);
      return this.UserService.listUsers().then((function(_this) {
        return function(data) {
          _this.$log.debug("Promise returned " + data.length + " Users");
          _this.user = (data.filter(function(user) {
            return user.userName === userName && user.email === email;
          }))[0];
          return _this.$log.debug("filter user " + (angular.toJson(_this.user, true)));
        };
      })(this), (function(_this) {
        return function(error) {
          return _this.$log.error("Unable to get Users: " + error);
        };
      })(this));
    };

    return UpdateUserCtrl;

  })();

  controllersModule.controller('UpdateUserCtrl', UpdateUserCtrl);

}).call(this);

//# sourceMappingURL=UpdateUserCtrl.js.map
