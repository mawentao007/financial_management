
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
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[scala.Tuple2[String, String]],Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[(String,String)])(implicit flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.54*/("""

"""),format.raw/*3.1*/("""<html>
    <head>
        <title>Zentasks</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png")),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*7.70*/routes/*7.76*/.Assets.at("stylesheets/login.css")),format.raw/*7.111*/("""">
    </head>
    <body>
        
       """),format.raw/*13.20*/("""


        """),_display_(/*16.10*/helper/*16.16*/.form(routes.Application.authenticate)/*16.54*/ {_display_(Seq[Any](format.raw/*16.56*/("""

            """),format.raw/*18.13*/("""<h1>Sign in</h1>

            """),_display_(/*20.14*/form/*20.18*/.globalError.map/*20.34*/ { error =>_display_(Seq[Any](format.raw/*20.45*/("""
                """),format.raw/*21.17*/("""<p class="error">
                    """),_display_(/*22.22*/error/*22.27*/.message),format.raw/*22.35*/("""
                """),format.raw/*23.17*/("""</p>
            """)))}),format.raw/*24.14*/("""

            """),_display_(/*26.14*/flash/*26.19*/.get("success").map/*26.38*/ { message =>_display_(Seq[Any](format.raw/*26.51*/("""
                """),format.raw/*27.17*/("""<p class="success">
                    """),_display_(/*28.22*/message),format.raw/*28.29*/("""
                """),format.raw/*29.17*/("""</p>
            """)))}),format.raw/*30.14*/("""

            """),format.raw/*32.13*/("""<p>
                <input type="userName" name="userName" placeholder="userName" id="userName" value=""""),_display_(/*33.101*/form("userName")/*33.117*/.value),format.raw/*33.123*/("""">
            </p>
            <p>
                <input type="password" name="password" id="password" placeholder="Password">
            </p>
            <p>
                <button type="submit" id="loginbutton">Login</button>
            </p>

        """)))}),format.raw/*42.10*/("""

       """),format.raw/*47.14*/("""

        
        """),format.raw/*50.9*/("""<p class="note">
            Try <em>guillaume@sample.com</em> with <em>secret</em> as password.
        </p>
            
    </body>
</html>
    


"""))}
  }

  def render(form:Form[scala.Tuple2[String, String]],flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(form)(flash)

  def f:((Form[scala.Tuple2[String, String]]) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (form) => (flash) => apply(form)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Nov 13 19:21:25 CST 2015
                  SOURCE: /home/marvin/InterestingProject/financial/app/views/login.scala.html
                  HASH: 90ae0286bd2e2c66e40c9dd1894340894f0d514c
                  MATRIX: 539->1|679->53|707->55|841->163|855->169|907->201|1005->273|1019->279|1075->314|1145->433|1184->445|1199->451|1246->489|1286->491|1328->505|1386->536|1399->540|1424->556|1473->567|1518->584|1584->623|1598->628|1627->636|1672->653|1721->671|1763->686|1777->691|1805->710|1856->723|1901->740|1969->781|1997->788|2042->805|2091->823|2133->837|2265->941|2291->957|2319->963|2609->1222|2646->1399|2692->1418
                  LINES: 19->1|22->1|24->3|27->6|27->6|27->6|28->7|28->7|28->7|32->13|35->16|35->16|35->16|35->16|37->18|39->20|39->20|39->20|39->20|40->21|41->22|41->22|41->22|42->23|43->24|45->26|45->26|45->26|45->26|46->27|47->28|47->28|48->29|49->30|51->32|52->33|52->33|52->33|61->42|63->47|66->50
                  -- GENERATED --
              */
          