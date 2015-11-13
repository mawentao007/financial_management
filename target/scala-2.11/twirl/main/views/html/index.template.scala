
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userName:String ):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*2.1*/("""<!doctype html>
<html lang="en" ng-app="myApp">
<head>
    <meta charset="utf-8">
    <title>The Special One</title>
    <!-- Latest compiled and minified Bootstrap CSS -->
    <link rel="stylesheet" href='"""),_display_(/*8.35*/routes/*8.41*/.Assets.at("lib/bootstrap/css/bootstrap.css")),format.raw/*8.86*/("""'>
    <link rel="stylesheet" href='"""),_display_(/*9.35*/routes/*9.41*/.Assets.at("lib/bootstrap/css/bootstrap-theme.css")),format.raw/*9.92*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(/*10.50*/routes/*10.56*/.Assets.at("stylesheets/main.css")),format.raw/*10.90*/("""'>

</head>
<body>
    <header>
        <dl id="user">
            """),_display_(/*16.14*/if(userName == "anonymous")/*16.41*/{_display_(Seq[Any](format.raw/*16.42*/("""
                """),format.raw/*17.17*/("""<dd>
                    <a href='"""),_display_(/*18.31*/routes/*18.37*/.Application.login),format.raw/*18.55*/("""' target="_self">Login</a>
                </dd>
            """)))}/*20.14*/else/*20.18*/{_display_(Seq[Any](format.raw/*20.19*/("""
                """),format.raw/*21.17*/("""<dt>"""),_display_(/*21.22*/userName),format.raw/*21.30*/("""</dt>
                <dd>
                    <a href='"""),_display_(/*23.31*/routes/*23.37*/.Application.logout),format.raw/*23.56*/("""' target="_self">Logout</a>
                </dd>
            """)))}),format.raw/*25.14*/("""
        """),format.raw/*26.9*/("""</dl>
    </header>

<!-- Fixed navbar -->
<nav class="navbar navbar-inverse navbar-static-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar">first</span>
                <span class="icon-bar">second</span>
                <span class="icon-bar">third</span>
            </button>
            <a class="navbar-brand" href="/">首页</a>
        </div>
    </div>
</nav>

<div class="container-fluid">

    <div class="row">
        <div class="col-sm-12" ng-view></div>
    </div>

</div>

<footer>
    <hr/>
    <div>
        <span>&copy; """),_display_(/*55.23*/Messages("application.name")),format.raw/*55.51*/("""</span>
        </div>
    <div>
        <span app-version></span>
    </div>
</footer>

</body>

<script src='"""),_display_(/*64.15*/routes/*64.21*/.Assets.at("lib/angularjs/angular.js")),format.raw/*64.59*/("""' type="text/javascript"></script>
<script src='"""),_display_(/*65.15*/routes/*65.21*/.Assets.at("lib/angularjs/angular-route.js")),format.raw/*65.65*/("""' type="text/javascript"></script>
<script src='"""),_display_(/*66.15*/routes/*66.21*/.Assets.at("lib/angular-ui-bootstrap/ui-bootstrap-tpls.js")),format.raw/*66.80*/("""' type="text/javascript"></script>

<!-- Coffee script compilled resources-->
<script src='"""),_display_(/*69.15*/routes/*69.21*/.Assets.at("javascripts/app.js")),format.raw/*69.53*/("""' type="text/javascript"></script><script src='"""),_display_(/*69.101*/routes/*69.107*/.Assets.at("javascripts/app.js")),format.raw/*69.139*/("""' type="text/javascript"></script>
<script src='"""),_display_(/*70.15*/routes/*70.21*/.Assets.at("javascripts/common/Config.js")),format.raw/*70.63*/("""' type="text/javascript"></script>
<script src='"""),_display_(/*71.15*/routes/*71.21*/.Assets.at("javascripts/directives/AppVersion.js")),format.raw/*71.71*/("""' type="text/javascript"></script>

<script src='"""),_display_(/*73.15*/routes/*73.21*/.Assets.at("javascripts/users/UserService.js")),format.raw/*73.67*/("""' type="text/javascript"></script>
<script src='"""),_display_(/*74.15*/routes/*74.21*/.Assets.at("javascripts/users/UserCtrl.js")),format.raw/*74.64*/("""' type="text/javascript"></script>
<script src='"""),_display_(/*75.15*/routes/*75.21*/.Assets.at("javascripts/users/CreateUserCtrl.js")),format.raw/*75.70*/("""' type="text/javascript"></script>
<script src='"""),_display_(/*76.15*/routes/*76.21*/.Assets.at("javascripts/users/UpdateUserCtrl.js")),format.raw/*76.70*/("""' type="text/javascript"></script>
<script src='"""),_display_(/*77.15*/routes/*77.21*/.Assets.at("javascripts/users/DeleteUserCtrl.js")),format.raw/*77.70*/("""' type="text/javascript"></script>
</html>"""))}
  }

  def render(userName:String): play.twirl.api.HtmlFormat.Appendable = apply(userName)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (userName) => apply(userName)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Nov 13 19:21:25 CST 2015
                  SOURCE: /home/marvin/InterestingProject/financial/app/views/index.scala.html
                  HASH: 1fd29f6c3946f89dbabd66bd8d16732f766c5f23
                  MATRIX: 505->1|611->19|638->20|871->227|885->233|950->278|1013->315|1027->321|1098->372|1177->424|1192->430|1247->464|1342->532|1378->559|1417->560|1462->577|1524->612|1539->618|1578->636|1659->698|1672->702|1711->703|1756->720|1788->725|1817->733|1901->790|1916->796|1956->815|2050->878|2086->887|2907->1681|2956->1709|3095->1821|3110->1827|3169->1865|3245->1914|3260->1920|3325->1964|3401->2013|3416->2019|3496->2078|3615->2170|3630->2176|3683->2208|3759->2256|3775->2262|3829->2294|3905->2343|3920->2349|3983->2391|4059->2440|4074->2446|4145->2496|4222->2546|4237->2552|4304->2598|4380->2647|4395->2653|4459->2696|4535->2745|4550->2751|4620->2800|4696->2849|4711->2855|4781->2904|4857->2953|4872->2959|4942->3008
                  LINES: 19->1|22->1|23->2|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|37->16|37->16|37->16|38->17|39->18|39->18|39->18|41->20|41->20|41->20|42->21|42->21|42->21|44->23|44->23|44->23|46->25|47->26|76->55|76->55|85->64|85->64|85->64|86->65|86->65|86->65|87->66|87->66|87->66|90->69|90->69|90->69|90->69|90->69|90->69|91->70|91->70|91->70|92->71|92->71|92->71|94->73|94->73|94->73|95->74|95->74|95->74|96->75|96->75|96->75|97->76|97->76|97->76|98->77|98->77|98->77
                  -- GENERATED --
              */
          