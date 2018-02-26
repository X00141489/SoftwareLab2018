
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*3.1*/("""





"""),_display_(/*9.2*/main("Add Product",user)/*9.26*/ {_display_(Seq[Any](format.raw/*9.28*/("""
    """),format.raw/*10.5*/("""<p class="lead">Add a new product</p>
    """),_display_(/*11.6*/form(action = routes.HomeController.addProductSubmit(), 'class -> "form-horiontal",'role->"form",'enctype -> "mutlipart/form-data")/*11.137*/{_display_(Seq[Any](format.raw/*11.138*/("""
        """),format.raw/*12.37*/("""
        """),_display_(/*13.10*/CSRF/*13.14*/.formField),format.raw/*13.24*/("""

        """),_display_(/*15.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*15.85*/("""
        """),_display_(/*16.10*/select(
            productForm("category.id"),
            options(Category.options),
            '_label -> "Category", '_default -> "-- Choose a category --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*21.10*/("""
        """),_display_(/*22.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*22.99*/("""
        """),_display_(/*23.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*23.87*/("""
        """),_display_(/*24.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*24.87*/("""

        """),_display_(/*26.10*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*26.74*/("""

 """),format.raw/*28.2*/("""<label>Image Upload</label>
 <input class = "btn-sm btn-default" type = "file" name = "upload">
 <br><br>

        <div class="actions">
            <input type="submit" value="Add/Update Product" class="btn btn-primary">
            <a href=""""),_display_(/*34.23*/routes/*34.29*/.HomeController.index(0)),format.raw/*34.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*38.6*/("""
""")))}),format.raw/*39.2*/("""

"""))
      }
    }
  }

  def render(productForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 26 17:24:29 GMT 2018
                  SOURCE: /home/wdd/webapps/SoftwareLab2018/app/views/addProduct.scala.html
                  HASH: 710a7398a198ad96d0f4d1ff3aeb03cb7b2635dc
                  MATRIX: 985->1|1118->63|1163->61|1190->79|1222->86|1254->110|1293->112|1325->117|1394->160|1535->291|1575->292|1612->329|1649->339|1662->343|1693->353|1731->364|1827->439|1864->449|2121->685|2158->695|2268->784|2305->794|2403->871|2440->881|2538->958|2576->969|2661->1033|2691->1036|2962->1280|2977->1286|3022->1310|3170->1428|3202->1430
                  LINES: 28->1|31->2|34->1|35->3|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|45->13|45->13|45->13|47->15|47->15|48->16|53->21|54->22|54->22|55->23|55->23|56->24|56->24|58->26|58->26|60->28|66->34|66->34|66->34|70->38|71->39
                  -- GENERATED --
              */
          