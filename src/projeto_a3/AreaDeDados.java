package projeto_a3;

public class AreaDeDados {
    
    public String pesquisa;
    public int anoDePesquisa;
    public String regiao;

    public AreaDeDados(String pesquisa, int anoDePesquisa, String regiao) {
        this.pesquisa = pesquisa;
        this.anoDePesquisa = anoDePesquisa;
        this.regiao = regiao;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public int getAnoDePesquisa() {
        return anoDePesquisa;
    }

    public void setAnoDePesquisa(int anoDePesquisa) {
        this.anoDePesquisa = anoDePesquisa;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String get_email() {
        return "";
    }

    public void set_email(String email) {
    }
}
