
package projeto_a3;

public class Pesquisador extends Usuario{
    
    private int id_pesquisador;
    private boolean licenca;
    
    public Pesquisador(int id_usuario, String nome, String telefone, String email, int id_pesquisador, boolean licenca) {
        super(id_usuario, nome, telefone, email);
        this.id_pesquisador = id_pesquisador;
        this.licenca = licenca;
    }

    public int getId_pesquisador() {
        return id_pesquisador;
    }

    public void setId_pesquisador(int id_pesquisador) {
        this.id_pesquisador = id_pesquisador;
    }

    public boolean isLicenca() {
        return licenca;
    }

    public void setLicenca(boolean licenca) {
        this.licenca = licenca;
    }
    
    
    
    public void inserirDados(){
        
    }
    
    public void alterarDados(){
        
    }
    
}
    

    

    
