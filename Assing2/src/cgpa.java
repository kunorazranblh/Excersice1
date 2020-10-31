

public class cgpa {
   double gpa[]= new double [4];
   double cgpa1;
  
   cgpa() {
	    this.gpa= new double[]{3.10,3.22,3.55,3.90};
	    this.cgpa1=3.26;
   }
   
   cgpa(double a[],double b){
	   this.gpa= a;
	   this.cgpa1 = b;
   }
   
  
   public void printCGPA() {
	cgpa obj1= new cgpa();
	cgpa obj2= new cgpa (new double []{3.10,3.22,3.55,3.90}, 3.26);
	   
    System.out.println("Default Constructor");
    double sum=0, finalcgpa=0;
    for(int i=0; i<obj1.gpa.length; i++) {
        sum+= obj1.gpa[i];
        System.out.println("GPA Semester "+i+ " : " +obj1.gpa[i]);
     }
    
    finalcgpa= sum/obj1.gpa.length;
    System.out.println("Average of GPA "+finalcgpa);
    System.out.println("CGPA : "+obj1.cgpa1);

    System.out.println("Constructor With Parameter");
    double sum2=0, finalcgpa2=0;
    for(int i=0; i<obj2.gpa.length; i++) {
       sum2= obj2.gpa[i]+sum2;	
       System.out.println("GPA Semester "+i+ " : "+obj2.gpa[i]);
    }
    finalcgpa2=(sum2/obj1.gpa.length);
    System.out.println("Average of GPA : "+finalcgpa2);
    System.out.println("CGPA : "+ obj2.cgpa1);
 	
 	
 	
 }
}   
	
  



    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

