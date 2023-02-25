
package com.mycompany.sss;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
      Administration exm1=new Administration( "position1","p101", "turki", "jeddah", "050258836", "turki@gmail.com", 16500);  
      Administration exm2=new Administration( "position2","p102", "saud",  "alriad", "0555336644", "saud@yahoo.com", 11200);  
      Administration exm3=new Administration( "position3","p103", "bandar", "makkah", "0507364130", "bandar@hotmail.com", 14800);  
      Administration []administrations=new Administration[3];
      administrations[0]=exm1;
      administrations[1]=exm2;
      administrations[2]=exm3;
        
        System.out.println("   >>>>>  Hospital   Program   <<<<< ))))");
        Scanner input =new Scanner(System.in);
        Patient []patients=new Patient[5];
        Service []services=new Service[5];
        Doctor [] doctors=new Doctor[5];
        
        int nd=0;
        int np=0;
        int ns=0;
      
      char goout='0';
      while(goout!='1')
      {
        System.out.println("Enter Your Name-> ");
        String admiName=input.next();
        int found=-1;
        for(int i=0;i<administrations.length;i++)
        {
            if(administrations[i].getName().equals(admiName))
            {
                found=i;
                break;
            }
        }
        if(found==-1)
        {
            System.out.println("This Is not Name Found ");     
        }
        else
            goout='1';
      }
        System.out.println("1-Add a doctor ");
        System.out.println("2-Add a service ");
        System.out.println("3-Add a patient");
        System.out.println("4-Print all doctors information ");
        System.out.println("5-Print all patients information");
        System.out.println("6-Display specific doctor data ");
        System.out.println("7-Display specific patient data ");
        System.out.println("8-Print a specific patient’s bill ");
        System.out.println("9-Exit the program");
    
        int finale=0;
        do
        {
            System.out.println("    Enter Number -> ");
            int select=input.nextInt();
            switch(select)
            {
                case 1:
                System.out.println("Enter -> ID,name,address,mobileNumber,email,salary,rank,specialty ");
                String i=input.next();               
                String n=input.next();               
                String dr=input.next();              
                String m=input.next();            
                String e=input.next();
                double l=input.nextDouble();
                String r=input.next();            
                String sp=input.next();
             
                Doctor d1=new Doctor(r,sp,i,n,dr,m,e,l);
                if(nd>=5)
                    System.out.println("Array is Full");
                else
                {
                    doctors[nd]=d1;
                    nd++;
                }
            break;
                case 2:
            
                System.out.println("Enter-> ID,name,type,price ");
                String id=input.next();
                String nsh=input.next();
                char t=input.next().charAt(0);
                double pr=input.nextDouble();
                Service s1=new Service(id,nsh,t,pr);
                if(ns>=5)
                    System.out.println("Array Is Full");
                else
                {
                    services[ns]=s1;
                    ns++;
                }
            break;
                case 3:
                System.out.println("Enter -> ID,name,address,mobileNumber,email");
                String idp=input.next();
                String nsp=input.next();
                String ad=input.next();
                String mp=input.next();
                String ep=input.next();
                Patient p1=new Patient(idp,nsp,ad,mp,ep);
                    for (int j = 0; j < ns; j++) {
                             p1.addService(services[j]);
                    }
                if(np>=5)

System.out.println("Array Is Full");
                else
                {
                    patients[np]=p1;
                    np++;
                }
            break;
                case 4:            
                for(int ii=0;ii<nd;ii++)
                {
                    System.out.println(doctors[ii]);
                }
            break;
            case 5:
            
              for(int i2=0;i2<np;i2++)
                {
                    System.out.println(patients[i2]);
                }  
            break;
            case 6:
                System.out.println("Enter Id Of Doctor->");
            String idk=input.next();
            for(int i6=0;i6<nd;i6++)
                if(idk.equals(doctors[i6].getID()))
                    System.out.println(doctors[i6]);
            break;
            case 7:
            System.out.println("Enter Id Of Patient->");
            String idp2=input.next();
            for(int i7=0;i7<np;i7++)
                if(idp2.equals(patients[i7].getID()))
                    System.out.println(patients[i7]);
        break;
            case 8:
            System.out.println("Enter Id Of Patient->");
            String idp3=input.next();
            for(int i8=0;i8<np;i8++){
                if(idp3.equals(patients[i8].getID()))
                {
                   double sum=0;
                   for(int j=0;j<patients[i8].services.size();j++)
                   {
                     sum=sum+patients[i8].services.get(j).totalPrice();
                   }
                    System.out.println("Total Price-> "+sum);
                    break;
                }
           }
        break;
            case 9:
                System.out.println("....Exit Program...");
              finale =1; break;
            default :System.out.println("error choise");
            }
    }while (finale==0);
}
}