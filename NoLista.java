public class NoLista{
    private String item;
    private NoLista proximoNo;

    public NoLista(){
    }

    public NoLista(String item){
        this.item = item;
    }

    public NoLista(String item, NoLista no){
        this.item = item;
        this.proximoNo = no;
    }
    
    public String getItem() {
        return item;
    }

    public NoLista getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoLista no) {
        this.proximoNo = no;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String toString(){
        return item;
    }    
}