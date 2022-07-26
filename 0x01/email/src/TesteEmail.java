import org.junit.Test;

import static org.junit.Assert.*;

public class TesteEmail {
    @Test
    public boolean testar_email_com_arroba(){
        boolean resultado = Pessoa.emailValid("email_teste@dominio.com.br");
        assertTrue(resultado);
        return resultado;
    }

    @Test
    public boolean testar_email_sem_arroba(){
        boolean resultado = Pessoa.emailValid("email_testedominio.com.br");
        assertFalse(resultado);
        return resultado;
    }

    @Test
    public boolean testar_email_mais_50_caracteres(){
        boolean resultado = Pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br");
        assertEquals(resultado, false);
        return resultado;
    }
}
