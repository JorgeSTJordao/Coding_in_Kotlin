import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    @DisplayName("Teste metodo xxoo")
    fun testCountXO(){
        Assertions.assertTrue(countXO("xxoo"))
        Assertions.assertTrue(countXO("xxoo"))
        Assertions.assertTrue(countXO("xxOo"))
        Assertions.assertTrue(countXO("xxoox"))

        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxoox"))},
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertTrue(countXO("xxOo"))},
            {Assertions.assertTrue(countXO("Xxoo"))},

            )
    }


}