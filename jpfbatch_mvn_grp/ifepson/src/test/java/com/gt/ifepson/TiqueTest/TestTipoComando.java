/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.ifepson.TiqueTest;

import com.gt.ifepson.capaFisica.EpsonFiscalDriverJNA;
import com.gt.ifepson.comandos.ComandoFiscal;
import com.gt.ifepson.IFEpsonHelper;
import com.gt.ifepson.comandos.MapaRetornos;
import com.gt.ifepson.comandos.Retorno;
import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.configuracion.ObtenerConfiguracionDeFechaYHora;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author guillermot
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestTipoComando {

    static final Map<Integer, Retorno> RETORNOS = new MapaRetornos();

    EpsonFiscalDriverJNA epsonDriver;

    int[] ultimaEjecucion = new int[]{0, 0, 0, 0};

    public TestTipoComando() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

//        System.out.println("OS Architecture : " + System.getProperty("os.arch"));
//        System.out.println("OS Name : " + System.getProperty("os.name"));
//        System.out.println("OS Version : " + System.getProperty("os.version"));
//        System.out.println("Data Model : " + System.getProperty("sun.arch.data.model"));
//
//        epsonDriver = IFEpsonHelper.newEpsonFiscalDriver();
//
//        int lastComError = IFEpsonHelper.openPort(epsonDriver, 1, 9600);
//
//        System.out.println("OpenPort: " + lastComError);
//
//        assertEquals(lastComError, 0);
//
//        if (lastComError != 0) {
//            System.exit(1);
//        }
    }

    @After
    public void tearDown() {

//        int estado = IFEpsonHelper.closePort(epsonDriver);
//
//        assertEquals(estado, 0);
    }

    @Test
    public void test1_obtenerFechaHora() {

//        ObtenerConfiguracionDeFechaYHora tipoComando = new ObtenerConfiguracionDeFechaYHora();
//
//        ComandoFiscal cf = new ComandoFiscal();
//        cf.setTipoComando(tipoComando);
//
//        this.ejecutar(cf);
    }

//    @Test
//    public void agregaJavaDoc() {
//        final ClassLoader loader = Thread.currentThread().getContextClassLoader();
//
//        try {
//            for (final ClassPath.ClassInfo info : ClassPath.from(loader).getTopLevelClasses()) {
//                if (info.getName().startsWith("com.gt.ifepson.comandos.")) {
//                    final Class<?> clazz = info.load();
//                    if (clazz != TipoComandoFiscal.class && TipoComandoFiscal.class.isAssignableFrom(clazz)) {
//                        try {
//                            TipoComandoFiscal instancia = (TipoComandoFiscal) clazz.newInstance();
//                            String ayuda = instancia.getAyuda();
//
//                            String fileName = "/home/prog/java_mvn/fiscal/version_2/jpfbatch_mvn_grp/ifepson/src/main/java/" + clazz.getName().replace(".", "/") + ".java";
//
//                            String declara = "public class " + clazz.getSimpleName() + " extends TipoComandoFiscal {";
//
//                            ayuda = ayuda.replace("\n", "<br>\n* ");
//
//                            String newDeclara = "/**\n* " + ayuda + "\n*/\n" + declara;
//
//                            //System.out.println("reemplaza " + declara + " por \n " + newDeclara);
//                            Path path = Paths.get(fileName);
//                            Charset charset = StandardCharsets.UTF_8;
//
//                            String content = new String(Files.readAllBytes(path), charset);
//                            content = content.replace(declara, newDeclara);
//                            Files.write(path, content.getBytes(charset));
//
//                        } catch (InstantiationException ex) {
//                            Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.SEVERE, null, ex);
//                            Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.FINE, "No se puede instanciar la clase {0}", clazz.getName());
//                        } catch (IllegalAccessException ex) {
//                            Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.SEVERE, null, ex);
//                            Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.FINE, "No se puede instanciar (acceso) la clase {0}", clazz.getName());
//                        }
//                    }
//                }
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.FINE, "que se yo");
//        }
//    }

//    @Test
//    public void test2_cierreZ() {
//        TipoComandoFiscal tcf;
//        ComandoFiscal cf;
//        
//        tcf = new CierreDeJornadaFiscal();
//        cf = new ComandoFiscal(tcf);
//        
//        this.ejecutar(cf);
//    }
     
 /*
    @Test
    public void test2_cancelarTique() {
        TipoComandoFiscal tcf;
        ComandoFiscal cf;
        
        tcf = new CancelarTiqueNC();
        cf = new ComandoFiscal(tcf);
        
        this.ejecutar(cf);
    }
     */
 
//    @Test
//    public void test3_tique() {
//
//        TipoComandoFiscal tcf;
//        ComandoFiscal cf;
//
//        tcf = new AbrirTiqueNC();
//        cf = new ComandoFiscal(tcf);
//
//        this.ejecutar(cf);
//
//        tcf = new ItemTiqueNC();
//        cf = new ComandoFiscal(tcf);
//
//        //cf.addExtension("MARCA_ITEM");
//        cf.setValorCampoEntrada(5, "Aca esta el item 1");
//        cf.setValorCampoEntrada(6, "000020000");
//        cf.setValorCampoEntrada(7, "00000152200");
//        cf.setValorCampoEntrada(8, "2100");
//        cf.setValorCampoEntrada(9, "00000000000");
//        cf.setValorCampoEntrada(10, "00000000");
//        cf.setValorCampoEntrada(13, "A22345");
//        cf.setValorCampoEntrada(14, "07");
//        cf.setValorCampoEntrada(15, "7");
//
//        this.ejecutar(cf);
//
//        cf = new ComandoFiscal(tcf);
//
//        //cf.addExtension("MARCA_ITEM");
//        cf.setValorCampoEntrada(5, "Aca esta el item 2");
//        cf.setValorCampoEntrada(6, "000020000");
//        cf.setValorCampoEntrada(7, "00000083200");
//        cf.setValorCampoEntrada(8, "2100");
//        cf.setValorCampoEntrada(9, "00000000000");
//        cf.setValorCampoEntrada(10, "00000000");
//        cf.setValorCampoEntrada(13, "2203");
//        cf.setValorCampoEntrada(14, "07");
//        cf.setValorCampoEntrada(15, "7");
//
//        this.ejecutar(cf);
//
//        cf = new ComandoFiscal(tcf);
//
//        //cf.addExtension("MARCA_ITEM");
//        cf.setValorCampoEntrada(5, "Pollo");
//        cf.setValorCampoEntrada(6, "000030000");
//        cf.setValorCampoEntrada(7, "00000182200");
//        cf.setValorCampoEntrada(8, "2100");
//        cf.setValorCampoEntrada(9, "00000000000");
//        cf.setValorCampoEntrada(10, "00000000");
//        cf.setValorCampoEntrada(13, "2285");
//        cf.setValorCampoEntrada(14, "01");
//        cf.setValorCampoEntrada(15, "7");
//
//        this.ejecutar(cf);
//
//        cf = new ComandoFiscal(tcf);
//
//        //cf.addExtension("MARCA_ITEM");
//        cf.setValorCampoEntrada(5, "pata muslo");
//        cf.setValorCampoEntrada(6, "000035000");
//        cf.setValorCampoEntrada(7, "00000228400");
//        cf.setValorCampoEntrada(8, "2100");
//        cf.setValorCampoEntrada(9, "00000000000");
//        cf.setValorCampoEntrada(10, "00000000");
//        cf.setValorCampoEntrada(13, "2108");
//        cf.setValorCampoEntrada(14, "01");
//        cf.setValorCampoEntrada(15, "7");
//
//        this.ejecutar(cf);
//
//        cf = new ComandoFiscal(tcf);
//
//        //cf.addExtension("MARCA_ITEM");
//        cf.setValorCampoEntrada(5, "Huevo");
//        cf.setValorCampoEntrada(6, "000010000");
//        cf.setValorCampoEntrada(7, "00000250000");
//        cf.setValorCampoEntrada(8, "2100");
//        cf.setValorCampoEntrada(9, "00000000000");
//        cf.setValorCampoEntrada(10, "00000000");
//        cf.setValorCampoEntrada(13, "2308");
//        cf.setValorCampoEntrada(14, "01");
//        cf.setValorCampoEntrada(15, "7");
//
//        this.ejecutar(cf);
//
//        cf = new ComandoFiscal(tcf);
//
//        //cf.addExtension("MARCA_ITEM");
//        cf.setValorCampoEntrada(5, "Aceite");
//        cf.setValorCampoEntrada(6, "000020000");
//        cf.setValorCampoEntrada(7, "00000885000");
//        cf.setValorCampoEntrada(8, "2100");
//        cf.setValorCampoEntrada(9, "00000000000");
//        cf.setValorCampoEntrada(10, "00000000");
//        cf.setValorCampoEntrada(13, "123456");
//        cf.setValorCampoEntrada(14, "07");
//        cf.setValorCampoEntrada(15, "7");
//
//        this.ejecutar(cf);
//
//        cf = new ComandoFiscal(tcf);
//
//        //cf.addExtension("MARCA_ITEM");
//        cf.setValorCampoEntrada(5, "Yogurt");
//        cf.setValorCampoEntrada(6, "000050000");
//        cf.setValorCampoEntrada(7, "00000223000");
//        cf.setValorCampoEntrada(8, "2100");
//        cf.setValorCampoEntrada(9, "00000000000");
//        cf.setValorCampoEntrada(10, "00000000");
//        cf.setValorCampoEntrada(13, "987654");
//        cf.setValorCampoEntrada(14, "07");
//        cf.setValorCampoEntrada(15, "7");
//
//        this.ejecutar(cf);
//
//        tcf = new PagosTiqueNC();
//        cf = new ComandoFiscal(tcf);
//        
//        cf.setValorCampoEntrada(6, "08");
//        cf.setValorCampoEntrada(7, "000000100000");
//        
//        this.ejecutar(cf);
//
//        tcf = new CerrarTiqueNC();
//        cf = new ComandoFiscal(tcf);
//
//        cf.addExtension("DEVUELVE_RESPUESTA_ELECTRONICA");
//        cf.addExtension("CORTAR_PAPEL");
//
//        this.ejecutar(cf);
//    }
     
    private void ejecutar(ComandoFiscal cf) {
        ultimaEjecucion = IFEpsonHelper.ejecutarComando(epsonDriver, cf).getRawReturn();

        for (Map.Entry<TipoCampoFiscal, String> entry : cf.getValoresCampoSalida().entrySet()) {
            System.out.println(entry.getKey().getIndice() + " " + entry.getKey().getDescripcion() + " = " + entry.getValue());
        }

        assertEquals(ultimaEjecucion[0], 0);

        System.out.println("Ejecutando " + cf.getTipoComando().getNames()[0]);

        System.out.println("lastError: " + ultimaEjecucion[0]);
        System.out.println("printerStatus: " + ultimaEjecucion[1]);

        for (String s : IFEpsonHelper.traducirEstadoImpresora(ultimaEjecucion[1])) {
            System.out.println(s);
        }

        System.out.println("fiscalStatus: " + ultimaEjecucion[2]);

        for (String s : IFEpsonHelper.traducirEstadoFiscal(ultimaEjecucion[2])) {
            System.out.println(s);
        }

        if (ultimaEjecucion[3] != 0) {
            Retorno retorno = RETORNOS.get(ultimaEjecucion[3]);
            System.out.println("returnCode: " + ultimaEjecucion[3] + " " + retorno.getDescripcion() + " (" + retorno.getTipoRespuesta() + ")");
        } else {
            System.out.println("returnCode: " + ultimaEjecucion[3]);
        }

    }
}
