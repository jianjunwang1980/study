package main.java.com.gupao.sourcecode.pattern.Template;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName
 * @Description
 * @Author wangjianjun
 **/
public class StudentDao<Student> {

    private JdbcTemplate jdbcTemplate;

    public List<Student> findAll() throws SQLException {
        String sql = "select * from t_student";
        return jdbcTemplate.executeQuery(sql, new StudengMapping());
    }
}
