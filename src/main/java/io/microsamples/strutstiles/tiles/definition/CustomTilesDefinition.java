package io.microsamples.strutstiles.tiles.definition;

import org.apache.struts2.tiles.annotation.TilesDefinition;
import org.apache.struts2.tiles.annotation.TilesPutAttribute;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = { ElementType.TYPE })
@TilesDefinition(extend = "layout",
                 putAttributes = { @TilesPutAttribute(name = "header", value = "/WEB-INF/tiles/header.jsp"),
                         @TilesPutAttribute(name = "body", value = "/WEB-INF/tiles/body.ftl") })
public @interface CustomTilesDefinition
{

}
