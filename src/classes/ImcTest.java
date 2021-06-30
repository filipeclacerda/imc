package classes;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

class ImcTest {
    Imc imc;
    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
        imc = new Imc();
    }
    @org.junit.jupiter.api.Test
    void calculaImcMasculinoAbaixoDoPeso() {
        imc.setAltura(1);
        imc.setPeso(20.6);
        imc.setSexo("M");
        assertEquals(20.6, imc.calculaImc(), 0);
    }
    @org.junit.jupiter.api.Test
    void calculaImcMasculinoPesoNormal() {
        imc.setAltura(1);
        imc.setPeso(26.3);
        imc.setSexo("M");
        assertEquals(26.3, imc.calculaImc(), 0);
    }
    @org.junit.jupiter.api.Test
    void calculaImcMasculinoMarginalmenteAcimaDoPeso() {
        imc.setAltura(1);
        imc.setPeso(27.1);
        imc.setSexo("M");
        assertEquals(27.1, imc.calculaImc(), 0);
    }
    @org.junit.jupiter.api.Test
    void calculaImcMasculinoAcimaDoPeso() {
        imc.setAltura(1);
        imc.setPeso(31.0);
        imc.setSexo("M");
        assertEquals(31.0, imc.calculaImc(), 0);
    }
    @org.junit.jupiter.api.Test
    void calculaImcMasculinoObeso() {
        imc.setAltura(1);
        imc.setPeso(31.1);
        imc.setSexo("M");
        assertEquals(31.1, imc.calculaImc(), 0);
    }
    @org.junit.jupiter.api.Test
    void calculaImcFemininoAbaixoDoPeso() {
        imc.setAltura(1);
        imc.setPeso(19.0);
        imc.setSexo("F");
        assertEquals(19.0, imc.calculaImc(), 0);
    }
    @org.junit.jupiter.api.Test
    void calculaImcFemininoPesoNormal() {
        imc.setAltura(1);
        imc.setPeso(25.7);
        imc.setSexo("F");
        assertEquals(25.7, imc.calculaImc(), 0);
    }
    @org.junit.jupiter.api.Test
    void calculaImcFemininoMarginalmenteAcimaDoPeso() {
        imc.setAltura(1);
        imc.setPeso(27.2);
        imc.setSexo("F");
        assertEquals(27.2, imc.calculaImc(), 0);
    }
    @org.junit.jupiter.api.Test
    void calculaImcFemininoAcimaDoPeso() {
        imc.setAltura(1);
        imc.setPeso(32.2);
        imc.setSexo("F");
        assertEquals(32.2, imc.calculaImc(), 0);
    }
    @org.junit.jupiter.api.Test
    void calculaImcFemininoObeso() {
        imc.setAltura(1);
        imc.setPeso(32.3);
        imc.setSexo("F");
        assertEquals(32.3, imc.calculaImc(), 0);
    }


    @org.junit.jupiter.api.Test
    void resultadoFinalMasculinoAbaixoDoPeso() {
        Imc imc = new Imc();
        imc.setSexo("M");
        IImc imcMock = createMock(IImc.class);
        expect(imcMock.calculaImc()).andReturn(20.6);
        replay(imcMock);
        assertEquals("Abaixo do peso", imc.resultadoFinal(imcMock));
    }
    @org.junit.jupiter.api.Test
    void resultadoFinalMasculinoPesoNormal() {
        Imc imc = new Imc();
        imc.setSexo("M");
        IImc imcMock = createMock(IImc.class);
        expect(imcMock.calculaImc()).andReturn(26.3);
        replay(imcMock);
        assertEquals("Peso normal", imc.resultadoFinal(imcMock));
    }
    @org.junit.jupiter.api.Test
    void resultadoFinalMasculinoMarginalmenteAcimaDoPeso() {
        Imc imc = new Imc();
        imc.setSexo("M");
        IImc imcMock = createMock(IImc.class);
        expect(imcMock.calculaImc()).andReturn(27.1);
        replay(imcMock);
        assertEquals("Marginalmente acima do peso", imc.resultadoFinal(imcMock));
    }
    @org.junit.jupiter.api.Test
    void resultadoFinalMasculinoAcimaDoPeso() {
        Imc imc = new Imc();
        imc.setSexo("M");
        IImc imcMock = createMock(IImc.class);
        expect(imcMock.calculaImc()).andReturn(31.0);
        replay(imcMock);
        assertEquals("Acima do peso ideal", imc.resultadoFinal(imcMock));
    }
    @org.junit.jupiter.api.Test
    void resultadoFinalMasculinoObeso() {
        Imc imc = new Imc();
        imc.setSexo("M");
        IImc imcMock = createMock(IImc.class);
        expect(imcMock.calculaImc()).andReturn(31.1);
        replay(imcMock);
        assertEquals("Obeso", imc.resultadoFinal(imcMock));
    }
    @org.junit.jupiter.api.Test
    void resultadoFinalFemininoAbaixoDoPeso() {
        Imc imc = new Imc();
        imc.setSexo("F");
        IImc imcMock = createMock(IImc.class);
        expect(imcMock.calculaImc()).andReturn(19.0);
        replay(imcMock);
        assertEquals("Abaixo do peso", imc.resultadoFinal(imcMock));
    }
    @org.junit.jupiter.api.Test
    void resultadoFinalFemininoPesoNormal() {
        Imc imc = new Imc();
        imc.setSexo("F");
        IImc imcMock = createMock(IImc.class);
        expect(imcMock.calculaImc()).andReturn(25.7);
        replay(imcMock);
        assertEquals("Peso normal", imc.resultadoFinal(imcMock));
    }
    @org.junit.jupiter.api.Test
    void resultadoFinalFemininoMarginalmenteAcimaDoPeso() {
        Imc imc = new Imc();
        imc.setSexo("F");
        IImc imcMock = createMock(IImc.class);
        expect(imcMock.calculaImc()).andReturn(27.2);
        replay(imcMock);
        assertEquals("Marginalmente acima do peso", imc.resultadoFinal(imcMock));
    }
    @org.junit.jupiter.api.Test
    void resultadoFinalFemininoAcimaDoPeso() {
        Imc imc = new Imc();
        imc.setSexo("F");
        IImc imcMock = createMock(IImc.class);
        expect(imcMock.calculaImc()).andReturn(32.2);
        replay(imcMock);
        assertEquals("Acima do peso ideal", imc.resultadoFinal(imcMock));
    }
    @org.junit.jupiter.api.Test
    void resultadoFinalFemininoObeso() {
        Imc imc = new Imc();
        imc.setSexo("F");
        IImc imcMock = createMock(IImc.class);
        expect(imcMock.calculaImc()).andReturn(32.3);
        replay(imcMock);
        assertEquals("Obeso", imc.resultadoFinal(imcMock));
    }



}