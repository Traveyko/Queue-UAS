public class waiting_list {
    private String Name;
    private String Number;

    public waiting_list(String Name, String Number){
        this.Name = Name;
        this. Number = Number;

    }
    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }
    public  String getNumber(){
        return Number;

    }

    public void setNumber(String number) {
        Number = number;
    }
    @Override
    public String toString(){
        return  "Waiting_list{" +
                "Name='" + Name + '\'' +
                ", Number='" + Number + '\'' +
                '}';
    }
}
