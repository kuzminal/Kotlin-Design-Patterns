package structural

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AdapterTest {
    @Test
    fun adaptPlug() {
        val chargerOne = charger(
                usPowerOutlet().toEUPlug()
        )
        val chargerTwo = charger(euPowerOutlet())
        //две зарядки, первая с адаптером
        assertEquals(chargerOne.hasPower, chargerTwo.hasPower)
        //две зарядки те же, но обе с доп адаптером к TypeC
        assertEquals(chargerOne.toUsbTypeC().hasPower, chargerTwo.toUsbTypeC().hasPower)
    }
}