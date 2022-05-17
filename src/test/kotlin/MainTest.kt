import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    @DisplayName("Testes com menores de idade")
    fun testeIdade(){
        Assertions.assertEquals(portaria(0, "", ""), "Negado.")
        Assertions.assertEquals(portaria(-5, "", ""), "Negado.")
        Assertions.assertEquals(portaria(-5, "comum", "xt"), "Negado.")
    }

    @Test
    @DisplayName("Teste de Convite")
    fun testeConvite(){
        Assertions.assertEquals(portaria(18, "", ""), "Negado.")
        Assertions.assertEquals(portaria(25, "comum", ""), "Negado.")
        Assertions.assertEquals(portaria(25, "premium", ""), "Negado.")
        Assertions.assertEquals(portaria(25, "luxo", ""), "Negado.")
        Assertions.assertEquals(portaria(25, "luxuoso", ""), "Negado.")
    }

    @Test
    @DisplayName("Teste de codigos")
    fun codigos(){
        Assertions.assertEquals(portaria(33, "comum", "xl"), "Negado.")
        Assertions.assertEquals(portaria(18, "comum", "xt"), "Welcome.")
        Assertions.assertEquals(portaria(18, "premium", "xt"), "Negado.")
        Assertions.assertEquals(portaria(18, "premium", "xl"), "Welcome.")
        Assertions.assertEquals(portaria(18, "luxo", "xl"), "Welcome.")
        Assertions.assertEquals(portaria(18, "luxo", "xt"), "Negado.")
    }
}