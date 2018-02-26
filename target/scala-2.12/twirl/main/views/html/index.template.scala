
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Product],List[models.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.120*/("""

"""),_display_(/*3.2*/main("Products",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*5.1*/("""<p class="lead">Product Catalogue</p>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Categories</h4>
    <div class="list-group">
      <a href=""""),_display_(/*11.17*/routes/*11.23*/.HomeController.index(0)),format.raw/*11.47*/("""" class="list-group-item">All Categories</a>
      """),_display_(/*12.8*/for(c <- categories) yield /*12.28*/ {_display_(Seq[Any](format.raw/*12.30*/("""
        """),format.raw/*13.9*/("""<a href=""""),_display_(/*13.19*/routes/*13.25*/.HomeController.index(c.getId)),format.raw/*13.55*/("""" class="list-group-item">"""),_display_(/*13.82*/c/*13.83*/.getName),format.raw/*13.91*/("""
          """),format.raw/*14.11*/("""<span class="badge">"""),_display_(/*14.32*/c/*14.33*/.getProducts.size()),format.raw/*14.52*/("""</span>
        </a>
      """)))}),format.raw/*16.8*/("""
    """),format.raw/*17.5*/("""</div>
  </div>
  <div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*21.8*/if(flash.containsKey("success"))/*21.40*/ {_display_(Seq[Any](format.raw/*21.42*/("""
        """),format.raw/*22.9*/("""<div class="alert alert-success">
          """),_display_(/*23.12*/flash/*23.17*/.get("success")),format.raw/*23.32*/("""
        """),format.raw/*24.9*/("""</div>
      """)))}),format.raw/*25.8*/("""
      """),format.raw/*26.7*/("""<thead>
        <tr>
          <th>Image</th>
          <th>ID</th>
          <th>Name</th>
          <th>Category</th>
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>
             
        </tr>
      </thead>

      <tbody>
        """),format.raw/*40.60*/("""
        """),_display_(/*41.10*/for(p<-products) yield /*41.26*/ {_display_(Seq[Any](format.raw/*41.28*/("""
          """),format.raw/*42.11*/("""<tr>
            if(env.resource("public/images/productImages/thumbnails"+p.getId+".jpg").isDefined)"""),format.raw/*43.96*/("""{"""),format.raw/*43.97*/("""
              """),format.raw/*44.15*/("""<td><img src = "/assets/images/productImages/thumbnails/"""),_display_(/*44.72*/(p.getId+".jpg")),format.raw/*44.88*/(""""/></td>
            """),format.raw/*45.13*/("""}"""),format.raw/*45.14*/("""else"""),format.raw/*45.18*/("""{"""),format.raw/*45.19*/("""
              """),format.raw/*46.15*/("""<td> <img src = "/assets/images/productImages/thumbnails/noImage.jpg"/></td>
            """),format.raw/*47.13*/("""}"""),format.raw/*47.14*/("""
            
            """),format.raw/*49.13*/("""<td>"""),_display_(/*49.18*/p/*49.19*/.getName),format.raw/*49.27*/("""</td>
            <td>"""),_display_(/*50.18*/p),format.raw/*50.19*/("""..getName</td>        
            <td>"""),_display_(/*51.18*/p/*51.19*/.getDescription),format.raw/*51.34*/("""</td>
            <td  class="numeric">"""),_display_(/*52.35*/p/*52.36*/.getStock),format.raw/*52.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*53.37*/("%.2f".format(p.getPrice))),format.raw/*53.64*/("""</td>
            <td>
              <a href=""""),_display_(/*55.25*/routes/*55.31*/.HomeController.updateProduct(p.getId)),format.raw/*55.69*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*59.25*/routes/*59.31*/.HomeController.deleteProduct(p.getId)),format.raw/*59.69*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*64.10*/("""
      """),format.raw/*65.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*70.17*/routes/*70.23*/.HomeController.addProduct()),format.raw/*70.51*/("""">
        <button class="btn btn-primary">Add a product</button>
      </a>
    </p>
  </div>
</div>
""")))}),format.raw/*76.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[models.Product],List[models.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 26 13:22:54 GMT 2018
                  SOURCE: /home/wdd/webapps/SoftwareLab2018/app/views/index.scala.html
                  HASH: 6802523fe8abf7cbfb6781664c276793d9d004ab
                  MATRIX: 1023->1|1237->119|1265->122|1294->143|1333->145|1361->147|1543->302|1558->308|1603->332|1681->384|1717->404|1757->406|1793->415|1830->425|1845->431|1896->461|1950->488|1960->489|1989->497|2028->508|2076->529|2086->530|2126->549|2184->577|2216->582|2360->700|2401->732|2441->734|2477->743|2549->788|2563->793|2599->808|2635->817|2679->831|2713->838|3008->1156|3045->1166|3077->1182|3117->1184|3156->1195|3284->1295|3313->1296|3356->1311|3440->1368|3477->1384|3526->1405|3555->1406|3587->1410|3616->1411|3659->1426|3776->1515|3805->1516|3859->1542|3891->1547|3901->1548|3930->1556|3980->1579|4002->1580|4069->1620|4079->1621|4115->1636|4182->1676|4192->1677|4222->1686|4291->1728|4339->1755|4413->1802|4428->1808|4487->1846|4684->2016|4699->2022|4758->2060|4978->2249|5012->2256|5087->2304|5102->2310|5151->2338|5284->2441
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|72->40|73->41|73->41|73->41|74->42|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|77->45|78->46|79->47|79->47|81->49|81->49|81->49|81->49|82->50|82->50|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|87->55|87->55|87->55|91->59|91->59|91->59|96->64|97->65|102->70|102->70|102->70|108->76
                  -- GENERATED --
              */
          