package com.firstproject;

import java.io.File;
import java.util.Scanner;

public class lockedme {

	public static void main(String[] args)
	
{
		
		System.out.println("******WELCOME TO LOCKME.COM******");
		System.out.println("***********FILE MANAGEMENT SYSTEM******* ");
		System.out.println("********** Developed by G.Harish Reddy *********");
		Scanner scan=new Scanner(System.in);
		Registration reg = new Registration();
		login log=new login();
	
		try {	
		while(true)
		{
						System.out.println(" 1.Registration \n 2.Login ");
						int choice=scan.nextInt();
						
						
					switch(choice)
					{
					case 1:System.out.println("******WELCOME TO LOCKME.COM******");
						System.out.println("USER NAME:user name should have 5 letter in lower case and 3 numbers after the letter");
						System.out.println("PASSWORD:Password should be less than 5and more than 9 characters in length.should contain upper case,lower case,number,special character");
						  //regstrt reg=new regstrt();
						   System.out.print("user name  :");
						   reg.setUsername(scan.next());
						   System.out.println("password  :");
						   reg.setPassword(scan.next());
						   System.out.println(reg.getUsername());
						   System.out.println(reg.getPassword());
						   Directory cd=new Directory();
						   reg.PasswordValidation();
						 //  System.out.println("enter the user name of the folder to store Files");
						  cd.setPath(reg.getUsername());
						  
						   break;
					case 2:System.out.println("Login");
						

							log.setPass(reg.getPassword());
							log.setUser(reg.getUsername());
							log.login();
							while(true) {
								System.out.println("MENU");
								System.out.println("3.Add  4.Search 5.View 6.Delete 7.Close Application ");
								int op = scan.nextInt();
								System.out.print("Enter your choice");
								
								switch(op) {
								case 3:System.out.println("View the file");
								Addfile.main(null);
								break;
							
								case 4:
								Searchfile.main(null);	
								break;
								
								case 5: 
								Viewfile.main(null);
								break;
								
								case 6:
								Deletefile.main(null);	break;
								
								case 7:
									System.out.println("Close the Application");
									break;
								}
							}
							
					default:System.out.println("Select valid number");
					break;
			}
		}

}
	catch(Exception ex)
	{
	System.out.println(ex.getMessage());
		
}
	
	}	
	}