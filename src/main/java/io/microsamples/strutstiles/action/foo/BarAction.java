package io.microsamples.strutstiles.action.foo;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.tiles.annotation.TilesDefinition;

/**
 * URL : /foo/bar
 */
@Result(name = "success", type = "tiles")
@TilesDefinition(name = "foo/bar")
public class BarAction
        extends ActionSupport
{

    @Override
    public String execute() throws Exception
    {
        return SUCCESS;
    }

}
