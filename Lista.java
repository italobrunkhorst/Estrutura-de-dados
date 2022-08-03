public class Lista{

    private int posicao = 0;
    private NoLista primeiroNo;

    public Lista(){}

    public int qtdaDeElementosLista(){
        return posicao;
    }

    private NoLista getNo(int lugar){

        NoLista aux = primeiroNo;

        for (int i = 0; i < lugar; i++){
            aux = aux.getProximoNo();
        }
        return aux;
    }

    public void incluir(String item){

        NoLista novoNo = new NoLista(item);

        if (posicao == 0){
            primeiroNo = novoNo;
            posicao++;
            return;
        }

        NoLista aux = primeiroNo;
        for (int i = 0; i < posicao - 1; i++){
            aux = aux.getProximoNo();
        }
        
        aux.setProximoNo(novoNo);
        posicao++;
        return;
    }

    public boolean incluirPosicao(String item, int lugar){

        NoLista novoNo = new NoLista(item);

        if (posicao == 0 && lugar == 0)
            primeiroNo = novoNo;
        else if(lugar <= posicao && lugar > 0){
            NoLista aux = getNo(lugar);
            novoNo.setProximoNo(aux);

            aux = getNo(lugar - 1);
            aux.setProximoNo(novoNo);
        }else
            return false;
        posicao++;
        return true;
    }

    public boolean excluir(int lugar){

        if (posicao != 0) {
            if (lugar == 0) {
                primeiroNo = primeiroNo.getProximoNo();

                posicao--;
                return true;
            }else{
                if (lugar <= posicao - 1 && lugar > 0){
                    NoLista aux = getNo(lugar - 1);
                    aux.setProximoNo(aux.getProximoNo().getProximoNo());

                    posicao--;
                    return true;
                }

                return false;
            }
        }
        return false;
    }

    public String listar(){
        String lista = "Lista";

        NoLista aux = primeiroNo;

        for (int i = 0; i < posicao; i++){

            lista += " -> "+aux.getItem();

            aux = aux.getProximoNo();
        }

        return lista;
    }
}