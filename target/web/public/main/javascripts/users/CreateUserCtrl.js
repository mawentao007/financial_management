(function() {
  var CreateUserCtrl;

  CreateUserCtrl = (function() {

    /*$window可以刷新页面 */
    function CreateUserCtrl($window, $log, $location, UserService) {
      this.$window = $window;
      this.$log = $log;
      this.$location = $location;
      this.UserService = UserService;
      this.$log.debug("constructing CreateUserController");
      this.user = {};
    }

    CreateUserCtrl.prototype.createUser = function() {
      this.$log.debug("createUser()");
      return this.UserService.createUser(this.user).then((function(_this) {
        return function(data) {
          _this.$log.debug("Promise returned " + data + " User");
          _this.user = data;
          return _this.$location.path("/");
        };
      })(this), (function(_this) {
        return function(error) {
          _this.$log.error("Unable to create User: " + error);
          return _this.$window.location.href = '/login';
        };
      })(this));
    };

    return CreateUserCtrl;

  })();

  controllersModule.controller('CreateUserCtrl', CreateUserCtrl);

}).call(this);

//# sourceMappingURL=CreateUserCtrl.js.map
