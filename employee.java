/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprogramsstart;


    public class employee {
    public static void main(String[] args) {
   
     
    employe e1=new employe(100,"madhu","chandha",10000);
    System.out.println(e1.getid());//get id
    System.out.println(e1.getfirstname()); //get firstname
    System.out.println(e1.getlastname()); //get last name
    System.out.println(e1.getfullname()); //get full name
    System.out.println(e1.getsalary());  //get salary
    e1.setsalary(15000);
    System.out.println(e1.getsalary());
    System.out.println(e1.getannualsalary());
    System.out.println(e1);
    
       }
    }
    
    class employe
    {
        int id;
        String firstname;
        String lastname;
        int salary;
        employe(int i,String fn,String ln,int s)
        {
            id=i;
            firstname=fn;
            lastname=ln;
            salary=s;
            
        }
        int getid()
        {
            return id;
        }
        String getfirstname()
        {
            return firstname;
        }
        String getlastname()
        {
           return lastname;
        }
        String getfullname()
        {
            return (""+firstname+ ""+lastname);
        }
        int getsalary()
        {
           return salary;
        }
        void setsalary(int s1)
        {
            salary=s1;
        }
        int getannualsalary()
        {
            return salary*12;
        }
        int raisesalary(int p1)
        {
            return(salary*p1)/100+salary;
        }
        String to_String(){
        return "\nID: "+Id+"\nName: "+FirstName+LastName+"\nSALARY: "+Salary;
    }
        
    }
    
    
    
    
                
    
    
    
    
