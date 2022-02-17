import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioMesTest {

    @Test
    public void deveRetornarMes() {
        FuncionarioMes.getInstance().setMes("Janeiro");
        assertEquals("Janeiro", FuncionarioMes.getInstance().getMes());
    }

    @Test
    public void deveRetornarNomeFuncionario() {
        FuncionarioMes.getInstance().setNomeFuncionario("Miguel");
        assertEquals("Miguel", FuncionarioMes.getInstance().getNomeFuncionario());
    }
}