public class Developers extends Employee{
        private String pLanguage;
        private float YOE;
        
        public Developers(String name, int empID, double salary, String pLanguage, float YOE){
            super(name,empID,salary);
            this.pLanguage = pLanguage;
            this.YOE = YOE;
        }

        public String getPlanguage(){
            return pLanguage;
        }
        public float getYOE(){
            return YOE;
        }

        public void setPlanguage(String pLanguage){
            this.pLanguage = pLanguage;
        }
        public void setYOE(float YOE){
            this.YOE = YOE;
        }

        @Override
        public void displayInfo(){
            super.displayInfo();
            System.out.println(getPlanguage());
            System.out.println(getYOE());
        }
        public void displayAsEmployee(){
            super.displayInfo();
        }

        public static void main(String[] args){
            Developers yugal = new Developers("Yugal", 1485, 500000, "java", 2);
            yugal.displayInfo();
            yugal.displayAsEmployee();
        }
}