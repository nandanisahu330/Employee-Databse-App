try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","Nandani@26");
            Statement smt =con.createStatement();
            String n= t1.getText();
            String s=t2.getText();
            String m=t3.getText();
            String a=t4.getText();
            String q="Update employee3 set NAME='"+n+"',SALARY='"+s+"',MOBILE_NUM='"+m+"',ADDRESS='"+a+"'";
          int rs=  smt.executeUpdate(q);
          if(rs!=0){
              System.out.println("UPDATE");
          }
            con.close();
            System.out.println("SAVE");
        }
        catch(Exception e){
            System.out.println(e);
        }
