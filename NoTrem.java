public class NoTrem{
    private String item;
    private NoTrem proximoNo;

    public NoTrem(){
    }

    public NoTrem(String item){
        this.item = item;
    }

    public NoTrem(String item, NoTrem no){
        this.item = item;
        this.proximoNo = no;
    }
    
    public String getItem() {
        return item;
    }

    public NoTrem getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoTrem no) {
        this.proximoNo = no;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String toString(){
        return item;
    }    
}