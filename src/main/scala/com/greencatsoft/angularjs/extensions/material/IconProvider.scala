package com.greencatsoft.angularjs.extensions.material

import com.greencatsoft.angularjs.injectable

import scala.scalajs.js

/** @see https://material.angularjs.org/latest/api/service/$mdIconProvider
  */

@js.native
@injectable("$mdIconProvider")
trait IconProvider extends js.Object{
  def icon(id: String, url: String): this.type = js.native
  def icon(id: String, url: String, viewBoxSize: Int): this.type = js.native
  def iconSet(id: String, url: String): this.type = js.native
  def iconSet(id: String, url: String, viewBoxSize: Int): this.type = js.native
  def defaultIconSet(url: String): this.type = js.native
  def defaultIconSet(url: String, viewBoxSize: Int): this.type = js.native
  def defaultFontSet(name: String): this.type = js.native
  def fontSet(alias: String, className: String): this.type = js.native
  def defaultViewBoxSize: this.type = js.native
  def defaultViewBoxSize(viewBoxSize: Int): this.type = js.native
}
