package com.example.minuevaapp


import org.junit.Test
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */



class MainViewModelUnitTest {

    // Clase que vamos a probar
    private lateinit var viewModel: MainViewModel

    @Before
    fun setup() {
        // Inicializar el ViewModel
        viewModel = MainViewModel()
    }

    @Test
    fun testCompareTextsEqual() {
        // Preparar el escenario de prueba
        val text1 = "Hola"
        val text2 = "Hola"

        // Ejecutar la función que queremos probar
        val result = viewModel.compareTexts(text1, text2)

        // Verificar el resultado
        assert(result)
    }

    @Test
    fun testCompareTextsDifferent() {
        // Preparar el escenario de prueba
        val text1 = "Hola"
        val text2 = "Adiós"

        // Ejecutar la función que queremos probar
        val result = viewModel.compareTexts(text1, text2)

        // Verificar el resultado
        assert(!result)
    }
}