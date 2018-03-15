/**
 * All package definitions which require tiles support must either extend the tiles-default package
 * or must register the Tiles Result type definition.
 * <p>
 * Via struts.xml :
 * <pre>
 *      <result-types>
 *          <result-type name="tiles" class="org.apache.struts2.views.tiles.TilesResult"/>
 *      </result-types>
 * </pre>
 * </p>
 */
@ParentPackage("tiles-default")
package io.microsamples.strutstiles.action.test;

import org.apache.struts2.convention.annotation.ParentPackage;