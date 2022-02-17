public class FuncionarioMes {

    private FuncionarioMes() {
    };
    private static FuncionarioMes instance = new FuncionarioMes();
    public static FuncionarioMes getInstance() {
        return instance;
    }

    private String mes;
    private String nomeFuncionario;

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
}