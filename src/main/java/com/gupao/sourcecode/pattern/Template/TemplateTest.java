package main.java.com.gupao.sourcecode.pattern.Template;

import java.sql.SQLException;

/**
 * @ClassName
 * @Description
 * @Author wangjianjun
 **/
public class TemplateTest {

    public static void main(String[] args) {
        StudentDao dao = new StudentDao();
        try {
            dao.findAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
