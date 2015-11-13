// @SOURCE:/home/marvin/InterestingProject/financial/conf/routes
// @HASH:ef3cca5c78bb38c4907d4743bbd2cefc8420ccd3
// @DATE:Fri Nov 13 19:21:24 CST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:35
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:11
package controllers.Post {

// @LINE:35
// @LINE:32
class ReverseComment {


// @LINE:32
def makeComment(id:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "post/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

// @LINE:35
def deleteCommentById(id:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "comment/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

}
                          

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:11
class ReversePost {


// @LINE:28
def getPostById(id:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "post/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

// @LINE:26
def post(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "post")
}
                        

// @LINE:29
def deletePostById(id:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "post/delete/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

// @LINE:27
// @LINE:11
def getAllPost(): Call = {
   () match {
// @LINE:11
case ()  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix)
                                         
   }
}
                                                

}
                          
}
                  

// @LINE:38
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
package controllers {

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseUsers {


// @LINE:22
def updateUser(userName:String, email:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "user/" + implicitly[PathBindable[String]].unbind("userName", dynamicString(userName)) + "/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)))
}
                        

// @LINE:20
def findUsers(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users")
}
                        

// @LINE:21
def createUser(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "user")
}
                        

// @LINE:23
def deleteUser(userName:String, email:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[String]].unbind("userName", dynamicString(userName)) + "/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)))
}
                        

}
                          

// @LINE:38
class ReverseAssets {


// @LINE:38
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
class ReverseApplication {


// @LINE:10
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:13
def randomUUID(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "randomUUID")
}
                        

// @LINE:9
def authenticate(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                        

// @LINE:16
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "admin")
}
                        

// @LINE:8
def login(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          
}
                  


// @LINE:35
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:11
package controllers.Post.javascript {
import ReverseRouteContext.empty

// @LINE:35
// @LINE:32
class ReverseComment {


// @LINE:32
def makeComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Post.Comment.makeComment",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "post/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:35
def deleteCommentById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Post.Comment.deleteCommentById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

}
              

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:11
class ReversePost {


// @LINE:28
def getPostById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Post.Post.getPostById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "post/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:26
def post : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Post.Post.post",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "post"})
      }
   """
)
                        

// @LINE:29
def deletePostById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Post.Post.deletePostById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "post/delete/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:27
// @LINE:11
def getAllPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Post.Post.getAllPost",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "post"})
      }
      }
   """
)
                        

}
              
}
        

// @LINE:38
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseUsers {


// @LINE:22
def updateUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.updateUser",
   """
      function(userName,email) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userName", encodeURIComponent(userName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
      }
   """
)
                        

// @LINE:20
def findUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.findUsers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
      }
   """
)
                        

// @LINE:21
def createUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.createUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
      }
   """
)
                        

// @LINE:23
def deleteUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.deleteUser",
   """
      function(userName,email) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userName", encodeURIComponent(userName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
      }
   """
)
                        

}
              

// @LINE:38
class ReverseAssets {


// @LINE:38
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
class ReverseApplication {


// @LINE:10
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:13
def randomUUID : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.randomUUID",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "randomUUID"})
      }
   """
)
                        

// @LINE:9
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:16
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
      }
   """
)
                        

// @LINE:8
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              
}
        


// @LINE:35
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:11
package controllers.Post.ref {


// @LINE:35
// @LINE:32
class ReverseComment {


// @LINE:32
def makeComment(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Post.Comment]).makeComment(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Post.Comment", "makeComment", Seq(classOf[String]), "POST", """comments""", _prefix + """post/$id<[^/]+>""")
)
                      

// @LINE:35
def deleteCommentById(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Post.Comment]).deleteCommentById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Post.Comment", "deleteCommentById", Seq(classOf[String]), "GET", """这里用DELETE不可以，我的理解是因为相应的url并不是可以显示的资源，通过这个url无法获取任何东西，因此404.用GET，可以去获取资源，
调用controller，因此可以进行删除。""", _prefix + """comment/$id<[^/]+>""")
)
                      

}
                          

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:11
class ReversePost {


// @LINE:28
def getPostById(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Post.Post]).getPostById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Post.Post", "getPostById", Seq(classOf[String]), "GET", """""", _prefix + """post/$id<[^/]+>""")
)
                      

// @LINE:26
def post(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Post.Post]).post(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Post.Post", "post", Seq(), "POST", """post 相应的controller必须声明为class，通过global获取injection实例""", _prefix + """post""")
)
                      

// @LINE:29
def deletePostById(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Post.Post]).deletePostById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Post.Post", "deletePostById", Seq(classOf[String]), "GET", """""", _prefix + """post/delete/$id<[^/]+>""")
)
                      

// @LINE:11
def getAllPost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Post.Post]).getAllPost(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Post.Post", "getAllPost", Seq(), "GET", """""", _prefix + """""")
)
                      

}
                          
}
        

// @LINE:38
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
package controllers.ref {


// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseUsers {


// @LINE:22
def updateUser(userName:String, email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Users]).updateUser(userName, email), HandlerDef(this.getClass.getClassLoader, "", "controllers.Users", "updateUser", Seq(classOf[String], classOf[String]), "PUT", """""", _prefix + """user/$userName<[^/]+>/$email<[^/]+>""")
)
                      

// @LINE:20
def findUsers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Users]).findUsers(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Users", "findUsers", Seq(), "GET", """ User management API""", _prefix + """users""")
)
                      

// @LINE:21
def createUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Users]).createUser(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Users", "createUser", Seq(), "POST", """""", _prefix + """user""")
)
                      

// @LINE:23
def deleteUser(userName:String, email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Users]).deleteUser(userName, email), HandlerDef(this.getClass.getClassLoader, "", "controllers.Users", "deleteUser", Seq(classOf[String], classOf[String]), "DELETE", """""", _prefix + """users/$userName<[^/]+>/$email<[^/]+>""")
)
                      

}
                          

// @LINE:38
class ReverseAssets {


// @LINE:38
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """GET           /comment/post/:id              @controllers.Post.Comment.getCommentByPostId(id:String)
 Map static resources from the /public folder to the /assets URL path assets是object，无法动态注入。""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
class ReverseApplication {


// @LINE:10
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:13
def randomUUID(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).randomUUID(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "randomUUID", Seq(), "GET", """""", _prefix + """randomUUID""")
)
                      

// @LINE:9
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).authenticate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:16
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """admin""", _prefix + """admin""")
)
                      

// @LINE:8
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Seq(), "GET", """ Single endpoint for serving AngularJS""", _prefix + """login""")
)
                      

}
                          
}
        
    