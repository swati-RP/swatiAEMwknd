/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.wknd.components.vertical__002d__slider;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class vertical__002d__slider__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_resource = bindings.get("resource");
Collection var_collectionvar0_list_coerced$ = null;
Collection var_collectionvar11_list_coerced$ = null;
out.write("\r\n\r\n<section class=\"cmp-vartical-teaser-contain\">\r\n  <div class=\"swiper cmp-vartical-teaser__swiper\">\r\n    <div class=\"swiper-wrapper cmp-vartical-teaser__swiper-wrapper\">\r\n      ");
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_dynamic_resource, "getChildren");
    {
        long var_size1 = ((var_collectionvar0_list_coerced$ == null ? (var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0)) : var_collectionvar0_list_coerced$).size());
        {
            boolean var_notempty2 = (var_size1 > 0);
            if (var_notempty2) {
                {
                    long var_end5 = var_size1;
                    {
                        boolean var_validstartstepend6 = (((0 < var_size1) && true) && (var_end5 > 0));
                        if (var_validstartstepend6) {
                            if (var_collectionvar0_list_coerced$ == null) {
                                var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                            }
                            long var_index7 = 0;
                            for (Object carousalimages : var_collectionvar0_list_coerced$) {
                                {
                                    boolean var_traversal9 = (((var_index7 >= 0) && (var_index7 <= var_end5)) && true);
                                    if (var_traversal9) {
                                        out.write("\r\n        ");
                                        {
                                            boolean var_testvariable10 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(carousalimages, "name"), "carousal"));
                                            if (var_testvariable10) {
                                                out.write("\r\n          ");
                                                {
                                                    Object var_collectionvar11 = renderContext.getObjectModel().resolveProperty(carousalimages, "getChildren");
                                                    {
                                                        long var_size12 = ((var_collectionvar11_list_coerced$ == null ? (var_collectionvar11_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar11)) : var_collectionvar11_list_coerced$).size());
                                                        {
                                                            boolean var_notempty13 = (var_size12 > 0);
                                                            if (var_notempty13) {
                                                                {
                                                                    long var_end16 = var_size12;
                                                                    {
                                                                        boolean var_validstartstepend17 = (((0 < var_size12) && true) && (var_end16 > 0));
                                                                        if (var_validstartstepend17) {
                                                                            if (var_collectionvar11_list_coerced$ == null) {
                                                                                var_collectionvar11_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar11);
                                                                            }
                                                                            long var_index18 = 0;
                                                                            for (Object carousal : var_collectionvar11_list_coerced$) {
                                                                                {
                                                                                    boolean var_traversal20 = (((var_index18 >= 0) && (var_index18 <= var_end16)) && true);
                                                                                    if (var_traversal20) {
                                                                                        out.write("\r\n            <div class=\"swiper-slide cmp-vartical-teaser__swiper-slide\">\r\n              <div class=\"teaser light vertical-align\">\r\n                <div class=\"cmp-teaser\">\r\n                  <div class=\"cmp-teaser__content\">\r\n                    <h2 class=\"cmp-teaser__title\">");
                                                                                        {
                                                                                            Object var_21 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(carousal, "title"), "text");
                                                                                            out.write(renderContext.getObjectModel().toString(var_21));
                                                                                        }
                                                                                        out.write("</h2>\r\n                    <div class=\"cmp-teaser__description\">\r\n                      <p>");
                                                                                        {
                                                                                            Object var_22 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(carousal, "description"), "text");
                                                                                            out.write(renderContext.getObjectModel().toString(var_22));
                                                                                        }
                                                                                        out.write("</p>\r\n                    </div>\r\n                  </div>\r\n                  <div class=\"cmp-teaser__image\">\r\n                    <div class=\"cmp-image\">\r\n                      <img");
                                                                                        {
                                                                                            Object var_attrvalue23 = renderContext.getObjectModel().resolveProperty(carousal, "images");
                                                                                            {
                                                                                                Object var_attrcontent24 = renderContext.call("xss", var_attrvalue23, "uri");
                                                                                                {
                                                                                                    boolean var_shoulddisplayattr26 = (((null != var_attrcontent24) && (!"".equals(var_attrcontent24))) && ((!"".equals(var_attrvalue23)) && (!((Object)false).equals(var_attrvalue23))));
                                                                                                    if (var_shoulddisplayattr26) {
                                                                                                        out.write(" src");
                                                                                                        {
                                                                                                            boolean var_istrueattr25 = (var_attrvalue23.equals(true));
                                                                                                            if (!var_istrueattr25) {
                                                                                                                out.write("=\"");
                                                                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent24));
                                                                                                                out.write("\"");
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        out.write(" loading=\"lazy\" class=\"cmp-image__image\" alt=\"carousal\"/>\r\n                      <meta itemprop=\"caption\" content=\"carousal\"/>\r\n                    </div>\r\n                  </div>\r\n                </div>\r\n              </div>\r\n            </div>\r\n          ");
                                                                                    }
                                                                                }
                                                                                var_index18++;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    var_collectionvar11_list_coerced$ = null;
                                                }
                                                out.write("\r\n        ");
                                            }
                                        }
                                        out.write("\r\n      ");
                                    }
                                }
                                var_index7++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar0_list_coerced$ = null;
}
out.write("\r\n    </div>\r\n\r\n    <div class=\"swiper-button-next cmp-vartical-teaser__swiper__button-next\">\r\n      <svg viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\">\r\n        <path d=\"m8.5 2.1 9.9 9.9-9.9 9.9\" stroke=\"#353435\" stroke-width=\"2.25\" fill=\"none\" fill-rule=\"evenodd\"></path>\r\n      </svg>\r\n    </div>\r\n    <div class=\"swiper-button-prev cmp-vartical-teaser__swiper__button-prev\">\r\n      <svg viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\">\r\n        <path d=\"M15.5 2.1 5.6 12l9.9 9.9\" stroke=\"#353435\" stroke-width=\"2.25\" fill=\"none\" fill-rule=\"evenodd\"></path>\r\n      </svg>\r\n    </div>\r\n    <div class=\"swiper-pagination cmp-vartical-teaser__swiper__pagination\"></div>\r\n  </div>\r\n</section>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

