package JDBC;

import javax.xml.transform.Result;
import java.sql.*;

public class StudentSores {
    public static void main(String[] args) {
//1.ע������
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("ע�������ɹ�");
        } catch (ClassNotFoundException e) {
            System.out.println("ע������ʧ��");
            e.printStackTrace();
        }
//2.����
            String url="jdbc:mysql://localhost:3306/book";
            String username="root";
            String password="20020101";
            String sql="select *from study";
            String sql1="INSERT into study(reader_name,book_name) values('����','5+3')";
            String sql2="delete from study where study.reader_name = '������'";
            String sql3="update study set reader_name='������'";
        try {
            Connection connection= DriverManager.getConnection(url,username,password);
            System.out.println("���ݿ����ӳɹ�");
            Statement ste=connection.createStatement();
            ste.executeUpdate(sql1);
            ste.executeUpdate(sql2);
            ste.executeUpdate(sql3);
            ResultSet res=ste.executeQuery(sql);

//            ����(��ѯ)
            while (res.next()){
                System.out.println("��������:"+res.getString("reader_name")+" "+"�鱾����:"+res.getString("book_name"));
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
//            ����

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("���ݿ�����ʧ��");
        }
//3.SQL���



    }
}
