package main.java.com.gupao.sourcecode.pattern.Template;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName
 * @Description
 * @Author wangjianjun
 **/
public class StudengMapping implements RowMapper<Student> {
    @Override
    public Student mapping(ResultSet rs) {
        Student student = new Student();
        try {
            student.setName(rs.getString("name"));
            student.setAge(rs.getInt("age"));
            return student;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
