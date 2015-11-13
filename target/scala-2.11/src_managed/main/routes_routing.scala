// @SOURCE:/home/marvin/InterestingProject/financial/conf/routes
// @HASH:ef3cca5c78bb38c4907d4743bbd2cefc8420ccd3
// @DATE:Fri Nov 13 19:21:24 CST 2015


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:8
private[this] lazy val controllers_Application_login0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_login0_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).login,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Nil,"GET", """ Single endpoint for serving AngularJS""", Routes.prefix + """login"""))
        

// @LINE:9
private[this] lazy val controllers_Application_authenticate1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_authenticate1_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).authenticate,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
        

// @LINE:10
private[this] lazy val controllers_Application_logout2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_Application_logout2_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).logout,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:11
private[this] lazy val controllers_Post_Post_getAllPost3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Post_Post_getAllPost3_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Post.Post]).getAllPost,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Post.Post", "getAllPost", Nil,"GET", """""", Routes.prefix + """"""))
        

// @LINE:13
private[this] lazy val controllers_Application_randomUUID4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("randomUUID"))))
private[this] lazy val controllers_Application_randomUUID4_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).randomUUID,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "randomUUID", Nil,"GET", """""", Routes.prefix + """randomUUID"""))
        

// @LINE:16
private[this] lazy val controllers_Application_index5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin"))))
private[this] lazy val controllers_Application_index5_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """admin""", Routes.prefix + """admin"""))
        

// @LINE:20
private[this] lazy val controllers_Users_findUsers6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users"))))
private[this] lazy val controllers_Users_findUsers6_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Users]).findUsers,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Users", "findUsers", Nil,"GET", """ User management API""", Routes.prefix + """users"""))
        

// @LINE:21
private[this] lazy val controllers_Users_createUser7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user"))))
private[this] lazy val controllers_Users_createUser7_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Users]).createUser,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Users", "createUser", Nil,"POST", """""", Routes.prefix + """user"""))
        

// @LINE:22
private[this] lazy val controllers_Users_updateUser8_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/"),DynamicPart("userName", """[^/]+""",true),StaticPart("/"),DynamicPart("email", """[^/]+""",true))))
private[this] lazy val controllers_Users_updateUser8_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Users]).updateUser(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Users", "updateUser", Seq(classOf[String], classOf[String]),"PUT", """""", Routes.prefix + """user/$userName<[^/]+>/$email<[^/]+>"""))
        

// @LINE:23
private[this] lazy val controllers_Users_deleteUser9_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/"),DynamicPart("userName", """[^/]+""",true),StaticPart("/"),DynamicPart("email", """[^/]+""",true))))
private[this] lazy val controllers_Users_deleteUser9_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Users]).deleteUser(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Users", "deleteUser", Seq(classOf[String], classOf[String]),"DELETE", """""", Routes.prefix + """users/$userName<[^/]+>/$email<[^/]+>"""))
        

// @LINE:26
private[this] lazy val controllers_Post_Post_post10_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("post"))))
private[this] lazy val controllers_Post_Post_post10_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Post.Post]).post,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Post.Post", "post", Nil,"POST", """post 相应的controller必须声明为class，通过global获取injection实例""", Routes.prefix + """post"""))
        

// @LINE:27
private[this] lazy val controllers_Post_Post_getAllPost11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("post"))))
private[this] lazy val controllers_Post_Post_getAllPost11_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Post.Post]).getAllPost,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Post.Post", "getAllPost", Nil,"GET", """""", Routes.prefix + """post"""))
        

// @LINE:28
private[this] lazy val controllers_Post_Post_getPostById12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("post/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Post_Post_getPostById12_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Post.Post]).getPostById(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Post.Post", "getPostById", Seq(classOf[String]),"GET", """""", Routes.prefix + """post/$id<[^/]+>"""))
        

// @LINE:29
private[this] lazy val controllers_Post_Post_deletePostById13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("post/delete/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Post_Post_deletePostById13_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Post.Post]).deletePostById(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Post.Post", "deletePostById", Seq(classOf[String]),"GET", """""", Routes.prefix + """post/delete/$id<[^/]+>"""))
        

// @LINE:32
private[this] lazy val controllers_Post_Comment_makeComment14_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("post/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Post_Comment_makeComment14_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Post.Comment]).makeComment(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Post.Comment", "makeComment", Seq(classOf[String]),"POST", """comments""", Routes.prefix + """post/$id<[^/]+>"""))
        

// @LINE:35
private[this] lazy val controllers_Post_Comment_deleteCommentById15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("comment/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Post_Comment_deleteCommentById15_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Post.Comment]).deleteCommentById(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Post.Comment", "deleteCommentById", Seq(classOf[String]),"GET", """这里用DELETE不可以，我的理解是因为相应的url并不是可以显示的资源，通过这个url无法获取任何东西，因此404.用GET，可以去获取资源，
调用controller，因此可以进行删除。""", Routes.prefix + """comment/$id<[^/]+>"""))
        

// @LINE:38
private[this] lazy val controllers_Assets_at16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at16_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """GET           /comment/post/:id              @controllers.Post.Comment.getCommentByPostId(id:String)
 Map static resources from the /public folder to the /assets URL path assets是object，无法动态注入。""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""@controllers.Application@.login"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""@controllers.Application@.authenticate"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""@controllers.Application@.logout"""),("""GET""", prefix,"""@controllers.Post.Post@.getAllPost"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """randomUUID""","""@controllers.Application@.randomUUID"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin""","""@controllers.Application@.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users""","""@controllers.Users@.findUsers"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user""","""@controllers.Users@.createUser"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/$userName<[^/]+>/$email<[^/]+>""","""@controllers.Users@.updateUser(userName:String, email:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/$userName<[^/]+>/$email<[^/]+>""","""@controllers.Users@.deleteUser(userName:String, email:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """post""","""@controllers.Post.Post@.post"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """post""","""@controllers.Post.Post@.getAllPost"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """post/$id<[^/]+>""","""@controllers.Post.Post@.getPostById(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """post/delete/$id<[^/]+>""","""@controllers.Post.Post@.deletePostById(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """post/$id<[^/]+>""","""@controllers.Post.Comment@.makeComment(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """comment/$id<[^/]+>""","""@controllers.Post.Comment@.deleteCommentById(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:8
case controllers_Application_login0_route(params) => {
   call { 
        controllers_Application_login0_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).login)
   }
}
        

// @LINE:9
case controllers_Application_authenticate1_route(params) => {
   call { 
        controllers_Application_authenticate1_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).authenticate)
   }
}
        

// @LINE:10
case controllers_Application_logout2_route(params) => {
   call { 
        controllers_Application_logout2_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).logout)
   }
}
        

// @LINE:11
case controllers_Post_Post_getAllPost3_route(params) => {
   call { 
        controllers_Post_Post_getAllPost3_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Post.Post]).getAllPost)
   }
}
        

// @LINE:13
case controllers_Application_randomUUID4_route(params) => {
   call { 
        controllers_Application_randomUUID4_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).randomUUID)
   }
}
        

// @LINE:16
case controllers_Application_index5_route(params) => {
   call { 
        controllers_Application_index5_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).index)
   }
}
        

// @LINE:20
case controllers_Users_findUsers6_route(params) => {
   call { 
        controllers_Users_findUsers6_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Users]).findUsers)
   }
}
        

// @LINE:21
case controllers_Users_createUser7_route(params) => {
   call { 
        controllers_Users_createUser7_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Users]).createUser)
   }
}
        

// @LINE:22
case controllers_Users_updateUser8_route(params) => {
   call(params.fromPath[String]("userName", None), params.fromPath[String]("email", None)) { (userName, email) =>
        controllers_Users_updateUser8_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Users]).updateUser(userName, email))
   }
}
        

// @LINE:23
case controllers_Users_deleteUser9_route(params) => {
   call(params.fromPath[String]("userName", None), params.fromPath[String]("email", None)) { (userName, email) =>
        controllers_Users_deleteUser9_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Users]).deleteUser(userName, email))
   }
}
        

// @LINE:26
case controllers_Post_Post_post10_route(params) => {
   call { 
        controllers_Post_Post_post10_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Post.Post]).post)
   }
}
        

// @LINE:27
case controllers_Post_Post_getAllPost11_route(params) => {
   call { 
        controllers_Post_Post_getAllPost11_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Post.Post]).getAllPost)
   }
}
        

// @LINE:28
case controllers_Post_Post_getPostById12_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Post_Post_getPostById12_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Post.Post]).getPostById(id))
   }
}
        

// @LINE:29
case controllers_Post_Post_deletePostById13_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Post_Post_deletePostById13_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Post.Post]).deletePostById(id))
   }
}
        

// @LINE:32
case controllers_Post_Comment_makeComment14_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Post_Comment_makeComment14_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Post.Comment]).makeComment(id))
   }
}
        

// @LINE:35
case controllers_Post_Comment_deleteCommentById15_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Post_Comment_deleteCommentById15_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Post.Comment]).deleteCommentById(id))
   }
}
        

// @LINE:38
case controllers_Assets_at16_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at16_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     