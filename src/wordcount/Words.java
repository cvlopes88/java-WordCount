package wordcount;

public class Words {

    private String humanRights;

    public Words(String humanRights){
        this.humanRights = humanRights;
    }

    public String getHumanRights(){
        return humanRights;
    }
    public void setHumanRights(String humanRights){
        this.humanRights = humanRights;
    }


    
    @Override
    public String toString()
    {
        return "Words{" +
                "humanRights='" + humanRights + '\'' +
                
                '}';
    }
}
