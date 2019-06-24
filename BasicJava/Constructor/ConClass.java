public class conclass {
    private String shoesName;
    public conclass(String name){
        shoesName=name;
    }
    /*public void setName(String name){
        shoesName=name;
    }*/
    public String getName(){
        return shoesName;
    }
    public void say(){
        System.out.println("Your shoes brand was "+getName());
    }
}
