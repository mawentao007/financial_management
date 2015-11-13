
package views.html.Post

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
import models.Post.ModelComment
/**/
object post extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Map[String, List[scala.Tuple2[String, String]]],Option[List[scala.Tuple2[String, reactivemongo.api.gridfs.ReadFile[reactivemongo.bson.BSONValue]]]],Form[ModelComment],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(postIdWithContentList:Map[String,List[(String,String)]],filesWithId:Option[List[(String,reactivemongo.api.gridfs.ReadFile[reactivemongo.bson.BSONValue])]],commentForm:Form[ModelComment]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.189*/("""
"""),format.raw/*3.1*/("""<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>The Special One</title>
            <!-- Latest compiled and minified Bootstrap CSS -->
        <link rel="stylesheet" href='"""),_display_(/*9.39*/routes/*9.45*/.Assets.at("lib/bootstrap/css/bootstrap.css")),format.raw/*9.90*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*10.39*/routes/*10.45*/.Assets.at("lib/bootstrap/css/bootstrap-theme.css")),format.raw/*10.96*/("""'>
        <link rel="stylesheet" media="screen" href='"""),_display_(/*11.54*/routes/*11.60*/.Assets.at("stylesheets/main.css")),format.raw/*11.94*/("""'>

    </head>
    <body>
        <header>

        </header>

            <!-- Fixed navbar -->
        <nav class="navbar navbar-inverse navbar-static-top" role="navigation">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="/">首页</a>
                </div>
            </div>
        </nav>

        <div class="container-fluid">
            """),_display_(/*29.14*/if(filesWithId.isDefined)/*29.39*/ {_display_(Seq[Any](format.raw/*29.41*/("""
                """),_display_(/*30.18*/filesWithId/*30.29*/.get.map/*30.37*/ { file =>_display_(Seq[Any](format.raw/*30.47*/("""
                    """),format.raw/*31.21*/("""<div id="postP" align="center">
                        <img src=""""),_display_(/*32.36*/controllers/*32.47*/.Post.routes.Post.getPostById(file._1)),format.raw/*32.85*/(""""/>
                        <a href=""""),_display_(/*33.35*/controllers/*33.46*/.Post.routes.Post.deletePostById(file._1)),format.raw/*33.87*/("""">delete</a>
                    </div>
                    <div id="postComment">
                        """),_display_(/*36.26*/postIdWithContentList/*36.47*/.get(file._1).map/*36.64*/ { comments =>_display_(Seq[Any](format.raw/*36.78*/("""
                            """),_display_(/*37.30*/comments/*37.38*/.map/*37.42*/{ comment =>_display_(Seq[Any](format.raw/*37.54*/("""
                              """),format.raw/*38.31*/("""<p>"""),_display_(/*38.35*/comment/*38.42*/._2),format.raw/*38.45*/("""</p>
                              <a href=""""),_display_(/*39.41*/controllers/*39.52*/.Post.routes.Comment.deleteCommentById(comment._1)),format.raw/*39.102*/("""" class="delete">删除 </a>
                            """)))}),format.raw/*40.30*/("""
                        """)))}),format.raw/*41.26*/("""
                    """),format.raw/*42.21*/("""</div>
                    """),_display_(/*43.22*/helper/*43.28*/.form(action = controllers.Post.routes.Comment.makeComment(file._1))/*43.96*/ {_display_(Seq[Any](format.raw/*43.98*/("""
                    """),_display_(/*44.22*/helper/*44.28*/.textarea(commentForm("content"))),format.raw/*44.61*/("""
                        """),format.raw/*45.25*/("""<div class="form-actions">
                            <input class="btn btn-primary" type="submit">
                        </div>
                    """)))}),format.raw/*48.22*/("""
                """)))}),format.raw/*49.18*/("""
            """)))}),format.raw/*50.14*/("""


        """),_display_(/*53.10*/helper/*53.16*/.form(action = controllers.Post.routes.Post.post(), 'enctype -> "multipart/form-data")/*53.102*/ {_display_(Seq[Any](format.raw/*53.104*/("""

            """),format.raw/*55.13*/("""<input type="file" name="picture">

            <p>
                <input type="submit">
            </p>

        """)))}),format.raw/*61.10*/("""


        """),format.raw/*64.9*/("""</div>

        <footer>
            <hr/>
            <div>
                <span>&copy; """),_display_(/*69.31*/Messages("application.name")),format.raw/*69.59*/("""</span>
            </div>
            <div>
                <span app-version></span>
            </div>
        </footer>

    </body>

</html>"""))}
  }

  def render(postIdWithContentList:Map[String, List[scala.Tuple2[String, String]]],filesWithId:Option[List[scala.Tuple2[String, reactivemongo.api.gridfs.ReadFile[reactivemongo.bson.BSONValue]]]],commentForm:Form[ModelComment]): play.twirl.api.HtmlFormat.Appendable = apply(postIdWithContentList,filesWithId,commentForm)

  def f:((Map[String, List[scala.Tuple2[String, String]]],Option[List[scala.Tuple2[String, reactivemongo.api.gridfs.ReadFile[reactivemongo.bson.BSONValue]]]],Form[ModelComment]) => play.twirl.api.HtmlFormat.Appendable) = (postIdWithContentList,filesWithId,commentForm) => apply(postIdWithContentList,filesWithId,commentForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Nov 13 19:21:25 CST 2015
                  SOURCE: /home/marvin/InterestingProject/financial/app/views/Post/post.scala.html
                  HASH: b61044a29610a52371d48f55e6cefa0671c103cb
                  MATRIX: 700->34|976->221|1003->222|1245->438|1259->444|1324->489|1392->530|1407->536|1479->587|1562->643|1577->649|1632->683|2092->1116|2126->1141|2166->1143|2211->1161|2231->1172|2248->1180|2296->1190|2345->1211|2439->1278|2459->1289|2518->1327|2583->1365|2603->1376|2665->1417|2800->1525|2830->1546|2856->1563|2908->1577|2965->1607|2982->1615|2995->1619|3045->1631|3104->1662|3135->1666|3151->1673|3175->1676|3247->1721|3267->1732|3339->1782|3424->1836|3481->1862|3530->1883|3585->1911|3600->1917|3677->1985|3717->1987|3766->2009|3781->2015|3835->2048|3888->2073|4072->2226|4121->2244|4166->2258|4205->2270|4220->2276|4316->2362|4357->2364|4399->2378|4547->2495|4585->2506|4703->2597|4752->2625
                  LINES: 19->2|22->2|23->3|29->9|29->9|29->9|30->10|30->10|30->10|31->11|31->11|31->11|49->29|49->29|49->29|50->30|50->30|50->30|50->30|51->31|52->32|52->32|52->32|53->33|53->33|53->33|56->36|56->36|56->36|56->36|57->37|57->37|57->37|57->37|58->38|58->38|58->38|58->38|59->39|59->39|59->39|60->40|61->41|62->42|63->43|63->43|63->43|63->43|64->44|64->44|64->44|65->45|68->48|69->49|70->50|73->53|73->53|73->53|73->53|75->55|81->61|84->64|89->69|89->69
                  -- GENERATED --
              */
          