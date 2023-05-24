package exemplointerface;

public class ExemploInterface {

    public static void main(String[] args) {
        
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        
        carro.acelerar();
        moto.frear();
    }
    
}
