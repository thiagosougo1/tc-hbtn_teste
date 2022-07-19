package calculadora;
public class OperacaoBasticaTeste {
    public boolean testar_soma(){
        if(OperacaoBasica.somar(5, 3) == 8){
            return true;
        }
        return false;
    }

    public boolean testar_subtracao(){
        if(OperacaoBasica.subtrair(5, 3) == 2){
            return true;
        }
        return false;
    }
    
    public boolean testar_multiplicacao(){
        if(OperacaoBasica.multiplicar(5, 3) == 15){
            return true;
        }
        return false;
    }

    public boolean testar_divisao(){
        if(OperacaoBasica.dividir(9, 3) == 3){
            return true;
        }
        return false;
    }
}
