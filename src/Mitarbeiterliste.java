class Mitarbeiterliste {
    //Creating properties of Employee class  
    int maNr, gehalt;
    String name, address, department, email;

    //Getter and setters for getting and setting properties  
    public int getmaNr() {
        return maNr;
    }
    public void setmaNr(int maNr) {
        this.maNr = maNr;
    }
    public int getgehalt() {
        return gehalt;
    }
    public void setgehalt(int gehalt) {
        this.gehalt = gehalt;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Employee [maNr = " + maNr + ", gehalt = " + gehalt + ", name = " + name +
                ", department = " + department +"]";
    }

}
 class Employee {
     Mitarbeiterliste emp = new Mitarbeiterliste();

     //Setting values to the properties
     Employee() {
         emp.setmaNr(101);
         emp.setName("Emma Watson");
         emp.setgehalt(15000);

         //Showing Employee details
         System.out.println(emp);

         //Getting gehalt using getter
         int sal = emp.getgehalt();
         int increment = 0;
         //Incrementing gehalt based on condition
         if ((sal >= 1000) && (sal <= 1500)) {
             //incrementing gehalt 2%
             increment += (sal * 2) / 100;
             sal = sal + increment;

             emp.setgehalt(sal);
             System.out.println("\n gehalt is incremented \n");
             System.out.println(emp);

         } else if ((sal >= 1500) && (sal <= 20000)) {
             //incrementing gehalt 5%
             increment += (sal * 5) / 100;
             sal = sal + increment;

             emp.setgehalt(sal);
             System.out.println("\n gehalt is incremented \n");
             System.out.println(emp);
         } else {
             System.out.println("\n gehalt is not incremented \n");
             System.out.println(emp);
         }
     }
 }
