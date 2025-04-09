package CapaDomini;

public class Zombi {

    private IEstatZombi estat;
    private int vida;

    private int posicio;

    public Zombi() {
        this.estat = IEstatZombi.getEstatInicial();
        this.vida = 3;
        this.posicio = 0;
    }

    public IEstatZombi getEstat() {
        return this.estat;
    }

    public int getVida() {
        return this.vida;
    }

    public void rebreDany(int dany) {

    }

    public void update(int posicioPersonatge) {

    }
}
