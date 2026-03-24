package abstracao;

public abstract class Endereco {
    private String rua;
    private String cidade;
    private String numero;
    private String estado;
    private String CEP;

    public Endereco() {

    }

    public Endereco(String rua, String cidade, String numero, String estado, String CEP) {
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
        this.estado = estado;
        this.CEP = CEP;
    }

    public Endereco(String rua, String cidade, String estado, String CEP) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.CEP = CEP;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public void mostrarEndereco(){
        System.out.println("Endereco " + rua + ", " + numero + ", " + estado + ", " + CEP);
    }
}
