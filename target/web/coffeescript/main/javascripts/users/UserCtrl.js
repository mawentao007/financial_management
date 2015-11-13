(function() {
  var UserCtrl;

  UserCtrl = (function() {
    function UserCtrl($log, UserService) {
      this.$log = $log;
      this.UserService = UserService;
      this.$log.debug("constructing UserController");
      this.users = [];
      this.getAllUsers();
    }

    UserCtrl.prototype.getAllUsers = function() {
      this.$log.debug("getAllUsers()");
      return this.UserService.listUsers().then((function(_this) {
        return function(data) {
          _this.$log.debug("Promise returned " + data.length + " Users");
          return _this.users = data;
        };
      })(this), (function(_this) {
        return function(error) {
          return _this.$log.error("Unable to get Users: " + error);
        };
      })(this));
    };

    UserCtrl.prototype.deleteUser = function(userName, email) {
      this.$log.debug("deleteUser()");
      return this.UserService.deleteUser(userName, email).then((function(_this) {
        return function(data) {
          _this.$log.debug("Promise returned " + data + " User");
          return _this.getAllUsers();
        };
      })(this), (function(_this) {
        return function(error) {
          return _this.$log.error("Unable to delete User: " + error);
        };
      })(this));
    };

    return UserCtrl;

  })();

  controllersModule.controller('UserCtrl', UserCtrl);

}).call(this);

//# sourceMappingURL=UserCtrl.js.map
