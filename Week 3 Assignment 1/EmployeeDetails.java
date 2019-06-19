public class EmployeeDetails{
  

        private int id;
        private String name;
        private int age;
        private String skills[];
        private int vacation;
    
        public EmployeeDetails(int id, String name, int age){
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public void details(int n, String createSkills[]){
            System.out.println("Your Name: "+name);
            System.out.println("Your Employee: "+id);
            System.out.println("Your age: "+age);
            for(int index = 0; index < n; index++){
            System.out.println("Skill"+index +": " +createSkills[index]);
            }

            
        }



}