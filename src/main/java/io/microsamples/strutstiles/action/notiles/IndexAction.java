package io.microsamples.strutstiles.action.notiles;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * Don't use tiles.
 * URL = /notiles/index
 */
@Action
public class IndexAction
        extends ActionSupport
{

    @Override
    public String execute() throws Exception
    {
        return SUCCESS;
    }

}
