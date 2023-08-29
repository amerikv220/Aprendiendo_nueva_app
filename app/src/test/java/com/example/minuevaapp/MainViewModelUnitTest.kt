package com.example.minuevaapp


import org.junit.Test
import org.junit.Before




class MainViewModelUnitTest {

    // Clase que vamos a probar
    private lateinit var viewModel: MainViewModel

    @Before
    fun setup() {
        // Inicializamos el ViewModel
        viewModel = MainViewModel()
    }

    @Test
    fun testCompareTextsEqual() {
     
        val text1 = "Hola"
        val text2 = "Hola"

   
        val result = viewModel.compareTexts(text1, text2)

        assert(result)
    }

    @Test
    fun testCompareTextsDifferent() {
        // Preparar el escenario de prueba
        val text1 = "Hola"
        val text2 = "Adiós"

    
        val result = viewModel.compareTexts(text1, text2)

     
        assert(!result)
    }
}
