public class Währungsrechner {
    private double wechselkurs;
    private String währungsbezeichnung;

    public Währungsrechner(double wechselkurs, String währungsbezeichnung) {
        this.wechselkurs = wechselkurs;
        this.währungsbezeichnung = währungsbezeichnung;
    }

    public double inFremd(double euroBetrag) {
        return euroBetrag / wechselkurs;
    }

    public double inEuro(double fremdBetrag) {
        return fremdBetrag * wechselkurs;
    }

    public String getWährungsbezeichnung() {
        return währungsbezeichnung;
    }
}
