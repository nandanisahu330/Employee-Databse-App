try{
          String a=t1.getText();
          
           Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sun","root","Nandani@26");
          Statement smt =con.createStatement();
          String q="delete from moon where name="+a;
           int  rs = smt.executeUpdate(q);
          if(rs!=0){
              System.out.println("DELETE ");
          }
          con.close();
          System.out.println("SAVED");
          
     }
     catch(Exception e){
         System.out.println(e);
     }
