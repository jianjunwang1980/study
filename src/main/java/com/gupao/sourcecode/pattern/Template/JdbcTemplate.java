package main.java.com.gupao.sourcecode.pattern.Template;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName 模板方法模式
 * @Description
 * @Author wangjianjun
 **/
public class JdbcTemplate<T> {

    private DataSource dataSource;

    /**
     * 执行查询.
     *
     * @param sql
     * @param params
     * @return
     */
    public List<T> executeQuery(String sql,RowMapper rowMapper, Object[]... params) throws SQLException {
        // 1.创建连接
        Connection conn = dataSource.getConnection();
        // 2.创建解析器
        PreparedStatement statement = conn.prepareStatement(sql);
        if(params!=null) {
            for (int i = 0; i < params.length; i++) {
                statement.setObject(i, params[i]);
            }
        }
        ResultSet rs = statement.executeQuery();
        List<T> list = executeQuery(rs,rowMapper);
        //关闭连接
        this.close(conn, statement, rs);
        return list;
    }

    public List<T> executeQuery(ResultSet rs, RowMapper rowMapper) throws  SQLException{
        List<T> list = new ArrayList<T>();
        while (rs.next()){
            list.add((T)rowMapper.mapping(rs));
        }
        return list;
    }

    private void close(Connection conn, PreparedStatement statement, ResultSet rs) throws SQLException {
        if (rs != null) {
            rs.close();
            ;
        }
        if (statement != null) {
            statement.close();
        }
        if (conn != null) {
            conn.close();
        }
    }

}
