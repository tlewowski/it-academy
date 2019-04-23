public enum Standard
{
    BASIC (400,200,300), GOLD (900,600,700), PRESTIGE (1500,1000,1200);
    double willa;
    double mieszkanie;
    double biuro;
    Standard(double willa, double mieszkanie, double biuro) {
        this.willa = willa;
        this.mieszkanie = mieszkanie;
        this.biuro = biuro;
    }
}
