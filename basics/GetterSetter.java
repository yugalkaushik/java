public class GetterSetter {
    private String Name;

    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }
    public static void main(String[] args){
        GetterSetter obj = new GetterSetter();
        obj.setName("Yugal");
        String Name = obj.getName();
        System.out.print(Name);
    }
}

