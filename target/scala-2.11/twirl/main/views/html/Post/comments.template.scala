
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

/**/
object comments extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(commentList:List[String]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.28*/("""
"""),_display_(/*2.2*/for(comment <- commentList) yield /*2.29*/{_display_(Seq[Any](format.raw/*2.30*/("""
    """),format.raw/*3.5*/("""<p>"""),_display_(/*3.9*/comment),format.raw/*3.16*/("""</p>
""")))}))}
  }

  def render(commentList:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(commentList)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (commentList) => apply(commentList)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Nov 13 19:21:25 CST 2015
                  SOURCE: /home/marvin/InterestingProject/financial/app/views/Post/comments.scala.html
                  HASH: ab66fccd1c617bab5073dcf8863ad51c1a210ac8
                  MATRIX: 519->1|633->27|660->29|702->56|740->57|771->62|800->66|827->73
                  LINES: 19->1|22->1|23->2|23->2|23->2|24->3|24->3|24->3
                  -- GENERATED --
              */
          