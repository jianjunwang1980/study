package main.java.com.gupao.sourcecode.pattern.Template;

import java.sql.ResultSet;

/**
 * @InterfaceName
 * @Description
 * @Author wangjianjun
 **/
public interface RowMapper<T> {

    T mapping(ResultSet rs);

}
