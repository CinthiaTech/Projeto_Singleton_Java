package one.dio.gof.Strategy;

public class Robo implements Comportamento {
    protected Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }
    @Override
    public void mover(){
        comportamento.mover();

    }
}
