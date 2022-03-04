package JDBC;

import javax.xml.transform.Result;
import java.sql.*;

public class StudentSores {
    public static void main(String[] args) {
//1.注册驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("注册驱动成功");
        } catch (ClassNotFoundException e) {
            System.out.println("注册驱动失败");
            e.printStackTrace();
        }
//2.连接
            String url="jdbc:mysql://localhost:3306/book";
            String username="root";
            String password="20020101";
            String sql="select *from study";
            String sql1="INSERT into study(reader_name,book_name) values('王五','5+3')";
            String sql2="delete from study where study.reader_name = '李明辉'";
            String sql3="update study set reader_name='赵晓博'";
        try {
            Connection connection= DriverManager.getConnection(url,username,password);
            System.out.println("数据库连接成功");
            Statement ste=connection.createStatement();
            ste.executeUpdate(sql1);
            ste.executeUpdate(sql2);
            ste.executeUpdate(sql3);
            ResultSet res=ste.executeQuery(sql);

//            遍历(查询)
            while (res.next()){
                System.out.println("读者姓名:"+res.getString("reader_name")+" "+"书本名字:"+res.getString("book_name"));
            }
            if (res!=null){
                res.close();
            }
            if (ste!=null){
                ste.close();
            }
            if (connection!=null){
                connection.close();
            }
//            增加

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("数据库连接失败");
        }
//3.SQL语句



    }
}
