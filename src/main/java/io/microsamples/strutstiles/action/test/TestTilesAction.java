package io.microsamples.strutstiles.action.test;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.tiles.annotation.TilesDefinition;
import org.apache.struts2.tiles.annotation.TilesPutAttribute;

/**
 * URL = /test/test-tiles
 */
@Result(name = "success", type = "tiles")
@TilesDefinition(extend = "layout",
        putAttributes = {
            @TilesPutAttribute( name = "title", value = "Test")
})
public class TestTilesAction
        extends ActionSupport
{

    @Override
    public String execute() throws Exception
    {
        return SUCCESS;
    }

}
