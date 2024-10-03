
package it2dlabajo.phm;

import java.util.Scanner;


public class IT2DLABAJOPHM {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String response;
       
        
        
        
        do{
        System.out.println("1.ADD");
        System.out.println("2. VIEW");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
        
        
        System.out.println("Enter Action:");
        int action = sc.nextInt();
        
        IT2DLABAJOPHM patient = new IT2DLABAJOPHM();
        switch (action){
            case 1:
              patient.addPatients();
                
             break;
            case 2:
            patient.viewPatient();
            
            break;
            
            
            
            
        }
            System.out.print("Do you want to continue? (yes/no):");
            response = sc.next();
        }while(response.equalsIgnoreCase("yes"));
        System.out.println("Thankyou,See you soonest");
        
        
            
        }
         public void addPatients(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        System.out.print("Patient First Name: ");
        String fname = sc.next();
        System.out.print("Patient Last Name: ");
        String lname = sc.next();
        System.out.print("Patient Address: ");
        String address = sc.next();
        System.out.print("Patient Contact Number: ");
        String contactno = sc.next();
      

        String sql = "INSERT INTO tbl_patient (p_firstname, p_lastname, p_address, p_contactno) VALUES (?, ?, ?, ?)";


        conf.addRecord(sql, fname, lname, address, contactno);


    }private void viewPatient() {
        
        config conf = new config();
        String votersQuery = "SELECT * FROM tbl_patient";
        String[] votersHeaders = {"Patient Id", "First Name", "Lat Name", "Address", "Contactno"};
        String[] votersColumns = {"p_id", "p_firstname", "p_lastname", "p_address", "p_contactno"};

        conf.viewRecords(votersQuery, votersHeaders, votersColumns);
    }
        
    }


