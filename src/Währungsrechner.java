public class Währungsrechner {
    private double wechselkurs;

    public Währungsrechner(double wechselkurs) {
        this.wechselkurs = wechselkurs;
    }

    public double inFremd(double euroBetrag) {
        return euroBetrag / wechselkurs;
    }

    public double inEuro(double fremdBetrag) {
        return fremdBetrag * wechselkurs;
    }
}
