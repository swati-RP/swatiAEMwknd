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
package org.apache.sling.scripting.sightly.apps.wknd.components.column;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class column__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_placeholdertemplate = null;
Collection var_collectionvar3_list_coerced$ = null;
out.write("      ");
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.Column.class.getName(), obj());
_global_placeholdertemplate = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
out.write("\r\n        <div class=\"cmp-column-component-container\">\r\n        <div class=\"cmp-column-content-container\">\r\n          <h2 class=\"cmp-column-title\">");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h2> \r\n          <h3 class=\"cmp-column-subtitle\">");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "subtitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</h3>\r\n          <hr class=\"line1\"/>\r\n          <hr class=\"line2\"/>\r\n          <div class=\"cmp-column-description\">");
{
    Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "description"), "text");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</div>\r\n          <div class=\"cmp-column-features\">\r\n            ");
{
    Object var_collectionvar3 = renderContext.getObjectModel().resolveProperty(_global_model, "feature");
    {
        long var_size4 = ((var_collectionvar3_list_coerced$ == null ? (var_collectionvar3_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar3)) : var_collectionvar3_list_coerced$).size());
        {
            boolean var_notempty5 = (var_size4 > 0);
            if (var_notempty5) {
                {
                    long var_end8 = var_size4;
                    {
                        boolean var_validstartstepend9 = (((0 < var_size4) && true) && (var_end8 > 0));
                        if (var_validstartstepend9) {
                            out.write("<ul class=\"cmp-column-ul\">");
                            if (var_collectionvar3_list_coerced$ == null) {
                                var_collectionvar3_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar3);
                            }
                            long var_index10 = 0;
                            for (Object item : var_collectionvar3_list_coerced$) {
                                {
                                    boolean var_traversal12 = (((var_index10 >= 0) && (var_index10 <= var_end8)) && true);
                                    if (var_traversal12) {
                                        out.write("\r\n            <li>");
                                        {
                                            Object var_13 = renderContext.call("xss", item, "text");
                                            out.write(renderContext.getObjectModel().toString(var_13));
                                        }
                                        out.write("</li>\r\n            ");
                                    }
                                }
                                var_index10++;
                            }
                            out.write("</ul>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar3_list_coerced$ = null;
}
out.write("\r\n          </div>\r\n      <div class=\"cmp-column-container-new\"> \r\n        <div class=\"cmp-column-icon\">\r\n          <img src=\"https://icon-library.com/images/white-phone-icon-png-transparent/white-phone-icon-png-transparent-3.jpg\" alt=\"Mobile Icon\" class=\"cmp-column-mobile-icon\"/>\r\n        </div>\r\n        <div class=\"cmp-column-contact-info\">\r\n        <div class=\"cmp-column-cta-text\">");
{
    Object var_14 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "ctaText"), "text");
    out.write(renderContext.getObjectModel().toString(var_14));
}
out.write("</div>\r\n        <div class=\"cmp-column-mobile-number\">");
{
    Object var_15 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "phoneNumber"), "text");
    out.write(renderContext.getObjectModel().toString(var_15));
}
out.write("</div>\r\n        </div>\r\n      </div>\r\n      <button class=\"cmp-column-button\">Request A Quote</button>\r\n      </div>\r\n        <div class=\"cmp-column-image-container\">\r\n          <img");
{
    Object var_attrvalue16 = renderContext.getObjectModel().resolveProperty(_global_model, "imageCopy");
    {
        Object var_attrcontent17 = renderContext.call("xss", var_attrvalue16, "uri");
        {
            boolean var_shoulddisplayattr19 = (((null != var_attrcontent17) && (!"".equals(var_attrcontent17))) && ((!"".equals(var_attrvalue16)) && (!((Object)false).equals(var_attrvalue16))));
            if (var_shoulddisplayattr19) {
                out.write(" src");
                {
                    boolean var_istrueattr18 = (var_attrvalue16.equals(true));
                    if (!var_istrueattr18) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent17));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"Image\"/>\r\n        </div>\r\n\r\n      </div>\r\n      \r\n\r\n\r\n\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

