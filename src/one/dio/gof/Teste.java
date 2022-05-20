package one.dio.gof;

import one.dio.gof.Facade.Facade;
import one.dio.gof.Singleton.SingletonEager;
import one.dio.gof.Singleton.SingletonLazy;
import one.dio.gof.Singleton.SingletonLazyHolder;
import one.dio.gof.Strategy.*;

public class Teste {
    private static Comportamento normal;

    public static void main(String[] args) {

        /*SINGLETON*/

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        /*STRATEGY*/

        Comportamento Normal = new ComportamentoNormal();
        Comportamento Defensivo = new ComportamentoDefensivo();
        Comportamento Agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(Normal);
        robo.setComportamento(Defensivo);
        robo.mover();
        robo.setComportamento(Agressivo);
        robo.mover();


        /*FACADE*/

        Facade facade = new Facade();
        facade.migrarCliente("Cinthia", "3400030");

    }
}
