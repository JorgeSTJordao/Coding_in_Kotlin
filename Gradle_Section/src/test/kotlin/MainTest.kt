import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    @DisplayName("Method xxoo test")
    fun testCountXO(){
        Assertions.assertAll({
            Assertions.assertTrue(countXO("xxoo"))
            Assertions.assertTrue(countXO("xoxxxxooxxoo"))
            Assertions.assertTrue(countXO("xxxxxxoxoo"))
        })
    }
}