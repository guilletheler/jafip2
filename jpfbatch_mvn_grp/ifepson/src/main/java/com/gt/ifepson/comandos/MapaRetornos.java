/*
 * To change this license header, TipoRetorno.ESENCIALES, choose License Headers in Project Properties.
 * To change this template file, TipoRetorno.ESENCIALES, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.ifepson.comandos;

import com.gt.ifepson.comandos.TipoRetorno;
import java.util.HashMap;

/**
 *
 * @author guillermot
 */
public class MapaRetornos extends HashMap<Integer, Retorno> {

    public MapaRetornos() {
        // Retornos Escenciales
        this.put(0x0, new Retorno(0x0, TipoRetorno.ESENCIALES, "Resultado exitoso"));

        this.put(0x0001, new Retorno(0x0001, TipoRetorno.ESENCIALES, "Error interno"));
        this.put(0x0002, new Retorno(0x0002, TipoRetorno.ESENCIALES, "Error de inicialización del equipo"));
        this.put(0x0003, new Retorno(0x0003, TipoRetorno.ESENCIALES, "Error de proceso interno"));

        // Retornos Genericos
        this.put(0x0101, new Retorno(0x0101, TipoRetorno.COMANDOS_GENERICOS, "Comando inválido para el estado actual"));
        this.put(0x0102, new Retorno(0x0102, TipoRetorno.COMANDOS_GENERICOS, "Comando inválido para el documento actual"));
        this.put(0x0103, new Retorno(0x0103, TipoRetorno.COMANDOS_GENERICOS, "Comando sólo aceptado en modo técnico"));
        this.put(0x0104, new Retorno(0x0104, TipoRetorno.COMANDOS_GENERICOS, "Comando sólo aceptado sin Jumper de Servicio"));
        this.put(0x0105, new Retorno(0x0105, TipoRetorno.COMANDOS_GENERICOS, "Comando sólo aceptado con Jumper de Servicio"));
        this.put(0x0106, new Retorno(0x0106, TipoRetorno.COMANDOS_GENERICOS, "Comando sólo aceptado sin Jumper de Uso Interno"));
        this.put(0x0107, new Retorno(0x0107, TipoRetorno.COMANDOS_GENERICOS, "Comando sólo aceptado con Jumper de Uso Interno"));
        this.put(0x0108, new Retorno(0x0108, TipoRetorno.COMANDOS_GENERICOS, "Sub estado inválido"));
        this.put(0x0109, new Retorno(0x0109, TipoRetorno.COMANDOS_GENERICOS, "Límite de intervenciones técnicas alcanzado"));
        this.put(0x010C, new Retorno(0x010C, TipoRetorno.COMANDOS_GENERICOS, "Secuencia de descarga inválida"));

        // Retornos sobre campos del protocolo 2
        this.put(0x0201, new Retorno(0x0201, TipoRetorno.CAMPOS_PROTOCOLO, "El frame no contiene el largo mínimo aceptado"));
        this.put(0x0202, new Retorno(0x0202, TipoRetorno.CAMPOS_PROTOCOLO, "Comando inválido"));
        this.put(0x0203, new Retorno(0x0203, TipoRetorno.CAMPOS_PROTOCOLO, "Campos en exceso"));
        this.put(0x0204, new Retorno(0x0204, TipoRetorno.CAMPOS_PROTOCOLO, "Campos en defecto"));
        this.put(0x0205, new Retorno(0x0205, TipoRetorno.CAMPOS_PROTOCOLO, "Campo no opcional"));
        this.put(0x0206, new Retorno(0x0206, TipoRetorno.CAMPOS_PROTOCOLO, "Campo alfanumérico inválido"));
        this.put(0x0207, new Retorno(0x0207, TipoRetorno.CAMPOS_PROTOCOLO, "Campo alfabético inválido"));
        this.put(0x0208, new Retorno(0x0208, TipoRetorno.CAMPOS_PROTOCOLO, "Campo numérico inválido"));
        this.put(0x0209, new Retorno(0x0209, TipoRetorno.CAMPOS_PROTOCOLO, "Campo binario inválido"));
        this.put(0x020A, new Retorno(0x020A, TipoRetorno.CAMPOS_PROTOCOLO, "Campo imprimible inválido"));
        this.put(0x020B, new Retorno(0x020B, TipoRetorno.CAMPOS_PROTOCOLO, "Campo hexadecimal inválido"));
        this.put(0x020C, new Retorno(0x020C, TipoRetorno.CAMPOS_PROTOCOLO, "Campo fecha inválido"));
        this.put(0x020D, new Retorno(0x020D, TipoRetorno.CAMPOS_PROTOCOLO, "Campo hora inválido"));
        this.put(0x020E, new Retorno(0x020E, TipoRetorno.CAMPOS_PROTOCOLO, "Campo fiscal rich text inválido"));
        this.put(0x020F, new Retorno(0x020F, TipoRetorno.CAMPOS_PROTOCOLO, "Campo booleano inválido"));
        this.put(0x0210, new Retorno(0x0210, TipoRetorno.CAMPOS_PROTOCOLO, "Largo del campo inválido"));
        this.put(0x0211, new Retorno(0x0211, TipoRetorno.CAMPOS_PROTOCOLO, "Extensión del comando inválida"));
        this.put(0x0212, new Retorno(0x0212, TipoRetorno.CAMPOS_PROTOCOLO, "Código de barra no permitido"));
        this.put(0x0213, new Retorno(0x0213, TipoRetorno.CAMPOS_PROTOCOLO, "Atributos de impresión no permitidos"));
        this.put(0x0214, new Retorno(0x0214, TipoRetorno.CAMPOS_PROTOCOLO, "Atributo de impresión inválido"));
        this.put(0x0215, new Retorno(0x0215, TipoRetorno.CAMPOS_PROTOCOLO, "Código de barra incorrectamente definido"));
        this.put(0x0216, new Retorno(0x0216, TipoRetorno.CAMPOS_PROTOCOLO, "Combinación de la palabra ‘total’ no aceptada"));
        this.put(0x0219, new Retorno(0x0219, TipoRetorno.CAMPOS_PROTOCOLO, "Uno de dos campos es estrictamente opcional, TipoRetorno.ESENCIALES, nunca los dos juntos. Al enviar un ítem nunca pueden estar los dos campos: Código del item MTX y Código interno"));
        this.put(0x0250, new Retorno(0x0250, TipoRetorno.CAMPOS_PROTOCOLO, "Error al descargar el reporte de eventos"));
        this.put(0x0251, new Retorno(0x0251, TipoRetorno.CAMPOS_PROTOCOLO, "Secuencia de descarga del reporte de eventos inválida"));

        // Retorno de Problemas de Hardware
        this.put(0X0301, new Retorno(0X0301, TipoRetorno.PROBLEMAS_HARDWARE, "Error de hardware"));
        this.put(0X0302, new Retorno(0X0302, TipoRetorno.PROBLEMAS_HARDWARE, "Impresora fuera de línea"));
        this.put(0X0303, new Retorno(0X0303, TipoRetorno.PROBLEMAS_HARDWARE, "Error de Impresión"));
        this.put(0X0304, new Retorno(0X0304, TipoRetorno.PROBLEMAS_HARDWARE, "Problemas de papel, no se encuentra en condiciones para realizar la acción requerida, verificar si hay papel en rollo, slip o validación al mismo tiempo"));
        this.put(0X0305, new Retorno(0X0305, TipoRetorno.PROBLEMAS_HARDWARE, "Poco papel disponible"));
        this.put(0X0306, new Retorno(0X0306, TipoRetorno.PROBLEMAS_HARDWARE, "Error en carga o expulsión de papel"));
        this.put(0X0307, new Retorno(0X0307, TipoRetorno.PROBLEMAS_HARDWARE, "Característica de impresora no soportada"));
        this.put(0x0308, new Retorno(0x0308, TipoRetorno.PROBLEMAS_HARDWARE, "Error de display"));
        this.put(0x0309, new Retorno(0x0309, TipoRetorno.PROBLEMAS_HARDWARE, "Secuencia de scan inválida"));
        this.put(0x030A, new Retorno(0x030A, TipoRetorno.PROBLEMAS_HARDWARE, "Número de área de recorte (crop area) inválido"));
        this.put(0x030B, new Retorno(0x030B, TipoRetorno.PROBLEMAS_HARDWARE, "Scanner no preparado"));
        this.put(0x030C, new Retorno(0x030C, TipoRetorno.PROBLEMAS_HARDWARE, "Resolución de logotipo de la empresa no permitida"));
        this.put(0x030D, new Retorno(0x030D, TipoRetorno.PROBLEMAS_HARDWARE, "Imposible imprimir documento en estación térmica"));

        //Retornos de Inicializacion
        this.put(0X0401, new Retorno(0X0401, TipoRetorno.INICIALIZACION, "Número de serie inválido"));
        this.put(0X0402, new Retorno(0X0402, TipoRetorno.INICIALIZACION, "Deben configurarse los datos de fiscalización"));
        this.put(0X0404, new Retorno(0X0404, TipoRetorno.INICIALIZACION, "Aun no se realizó al menos uno de los dos tipo de descargas requeridas para las jornadas fiscales. Descarga completa o descarga de documentos tipo A"));
        this.put(0X0405, new Retorno(0X0405, TipoRetorno.INICIALIZACION, "Las jornadas fiscales descargadas no se encuentran borradas"));
        this.put(0X0430, new Retorno(0X0430, TipoRetorno.INICIALIZACION, "Secuencia de solicicitud de certificado digital inválida"));
        this.put(0X0436, new Retorno(0X0436, TipoRetorno.INICIALIZACION, "Secuencia de carga de certificado digital inválida"));
        this.put(0X0437, new Retorno(0X0437, TipoRetorno.INICIALIZACION, "No se puede generar archivo CSR"));
        this.put(0X0438, new Retorno(0X0438, TipoRetorno.INICIALIZACION, "No se puede guardar archivo CRT"));
        this.put(0X0439, new Retorno(0X0439, TipoRetorno.INICIALIZACION, "Error interno en validación de certificado digital"));
        this.put(0X0440, new Retorno(0X0440, TipoRetorno.INICIALIZACION, "Certificado aún no vigente"));
        this.put(0X043A, new Retorno(0X043A, TipoRetorno.INICIALIZACION, "Tipo de certificado digital inválido"));
        this.put(0X043B, new Retorno(0X043B, TipoRetorno.INICIALIZACION, "No se puede validar el certificado digital"));
        this.put(0X043C, new Retorno(0X043C, TipoRetorno.INICIALIZACION, "Certificado AFIP no encontrado"));
        this.put(0X043D, new Retorno(0X043D, TipoRetorno.INICIALIZACION, "Cadena de certificados no encontrada"));
        this.put(0X043E, new Retorno(0X043E, TipoRetorno.INICIALIZACION, "Certificado Digital CF aún válido (CF.:Controlador Fiscal) "));
        this.put(0X043F, new Retorno(0X043F, TipoRetorno.INICIALIZACION, "Certificado Digital CF vencido (CF.:Controlador Fiscal) "));
        this.put(0X0441, new Retorno(0X0441, TipoRetorno.INICIALIZACION, "Secuencia de descarga SAF inválida"));
        this.put(0X0442, new Retorno(0X0442, TipoRetorno.INICIALIZACION, "Falla al crear archivo SAF"));
        this.put(0X0450, new Retorno(0X0450, TipoRetorno.INICIALIZACION, "Error en el XML"));
        this.put(0x0451, new Retorno(0x0451, TipoRetorno.INICIALIZACION, "Número de bajas fiscales no coincide"));
        this.put(0x0452, new Retorno(0x0452, TipoRetorno.INICIALIZACION, "Demasiados cambios de CUIT"));
        this.put(0x0453, new Retorno(0x0453, TipoRetorno.INICIALIZACION, "Imposible descargar el archivo de solicitud de baja fiscal (SFB), ya que no existe una baja fiscal previamente"));
        this.put(0x0454, new Retorno(0x0454, TipoRetorno.INICIALIZACION, "Ocurrió algún error al intentar descargar el archivo de solicitud de baja fiscal (SFB)"));
        this.put(0x0455, new Retorno(0x0455, TipoRetorno.INICIALIZACION, "Imposible copiar certificado de cadena ya instalado al directorio temporal"));
        this.put(0x0456, new Retorno(0x0456, TipoRetorno.INICIALIZACION, "Certificado/s de cadena no instalado/s"));

        //5 - Configuracion
        this.put(0X0501, new Retorno(0X0501, TipoRetorno.CONFIGURACION, "Fecha / Hora no configurada	"));
        this.put(0X0502, new Retorno(0X0502, TipoRetorno.CONFIGURACION, "Error en cambio de fecha	"));
        this.put(0X0503, new Retorno(0X0503, TipoRetorno.CONFIGURACION, "Fecha fuera de rango"));
        this.put(0X0505, new Retorno(0X0505, TipoRetorno.CONFIGURACION, "Número de caja inválido"));
        this.put(0X0506, new Retorno(0X0506, TipoRetorno.CONFIGURACION, "CUIT inválido"));
        this.put(0X0507, new Retorno(0X0507, TipoRetorno.CONFIGURACION, "Responsabilidad frente al IVA inválida"));
        this.put(0X0508, new Retorno(0X0508, TipoRetorno.CONFIGURACION, "Número de línea de Encabezado/Cola inválido"));
        this.put(0X0509, new Retorno(0X0509, TipoRetorno.CONFIGURACION, "Demasiadas fiscalizaciones"));
        this.put(0X050A, new Retorno(0X050A, TipoRetorno.CONFIGURACION, "Demasiados cambios de situación tributaria"));
        this.put(0X050B, new Retorno(0X050B, TipoRetorno.CONFIGURACION, "Demasiados cambios de datos de fiscalización"));
        this.put(0X0513, new Retorno(0X0513, TipoRetorno.CONFIGURACION, "Logo de usuario inválido"));
        this.put(0X0514, new Retorno(0X0514, TipoRetorno.CONFIGURACION, "Secuencia de definición de logos de usuario inválida"));
        this.put(0X0515, new Retorno(0X0515, TipoRetorno.CONFIGURACION, "Configuración de Display inválida"));
        this.put(0X0516, new Retorno(0X0516, TipoRetorno.CONFIGURACION, "Tipo de letra de MICR inválida"));
        this.put(0X0518, new Retorno(0X0518, TipoRetorno.CONFIGURACION, "Líneas de establecimiento no configuradas"));
        this.put(0X0519, new Retorno(0X0519, TipoRetorno.CONFIGURACION, "Datos fiscales no configurados"));
        this.put(0X0520, new Retorno(0X0520, TipoRetorno.CONFIGURACION, "Situación tributaria no configurada"));
        this.put(0X0521, new Retorno(0X0521, TipoRetorno.CONFIGURACION, "Tasa de IVA estándar no configurada"));
        this.put(0X0522, new Retorno(0X0522, TipoRetorno.CONFIGURACION, "Límite de tique-factura no configurado"));
        this.put(0X0524, new Retorno(0X0524, TipoRetorno.CONFIGURACION, "Monto máximo de tique-factura no permitido"));
        this.put(0X0525, new Retorno(0X0525, TipoRetorno.CONFIGURACION, "Largo del logotipo de la empresa no permitido"));
        this.put(0X0526, new Retorno(0X0526, TipoRetorno.CONFIGURACION, "Posición del logotipo de la empresa inválido"));
        this.put(0X0527, new Retorno(0X0527, TipoRetorno.CONFIGURACION, "El tamaño del logotipo de la empresa excede el máximo"));
        this.put(0X0550, new Retorno(0X0550, TipoRetorno.CONFIGURACION, "Identificador tributario ya estaba configurado"));
        this.put(0X0555, new Retorno(0X0555, TipoRetorno.CONFIGURACION, "Cambio de horario de verano no permitido"));
        this.put(0X0556, new Retorno(0X0556, TipoRetorno.CONFIGURACION, "Formato o rango, de la línea de inicio de actividades, inválido"));

        //6 - Retornos sobre Memoria de Transacciones 
        this.put(0x0601, new Retorno(0x0601, TipoRetorno.MEMORIA_TRANSACCIONES, "Memoria de transacciones llena"));
        this.put(0x0604, new Retorno(0x0604, TipoRetorno.MEMORIA_TRANSACCIONES, "Rango de auditoría solicitado sin datos"));

        //8 - Retornos sobre Jornada
        this.put(0x0801, new Retorno(0x0801, TipoRetorno.JORNADA, "Requiere período de actividades iniciado"));
        this.put(0x0802, new Retorno(0x0802, TipoRetorno.JORNADA, "Require un Cierre Z"));
        this.put(0x0803, new Retorno(0x0803, TipoRetorno.JORNADA, "Memoria fiscal llena"));
        this.put(0x0804, new Retorno(0x0804, TipoRetorno.JORNADA, "equiere jornada fiscal abierta"));
        this.put(0x0807, new Retorno(0x0807, TipoRetorno.JORNADA, "Período auditado sin datos"));
        this.put(0x0808, new Retorno(0x0808, TipoRetorno.JORNADA, "Rango auditado inválido"));
        this.put(0x0809, new Retorno(0x0809, TipoRetorno.JORNADA, "Restan datos por auditar/descargar"));
        this.put(0x080A, new Retorno(0x080A, TipoRetorno.JORNADA, "No hay más datos a descargar"));
        this.put(0x080B, new Retorno(0x080B, TipoRetorno.JORNADA, "No es posible abrir la jornada fiscal"));
        this.put(0x080C, new Retorno(0x080C, TipoRetorno.JORNADA, "No es posible cerrar la jornada fiscal"));
        this.put(0x0810, new Retorno(0x0810, TipoRetorno.JORNADA, "Tipo de documento solicitado inválido"));
        this.put(0x0811, new Retorno(0x0811, TipoRetorno.JORNADA, "Número de documento solicitado inválido"));
        this.put(0x0812, new Retorno(0x0812, TipoRetorno.JORNADA, "Documento solicitado no existente"));
        this.put(0x0813, new Retorno(0x0813, TipoRetorno.JORNADA, "La copia del documento solicitado fue borrada"));
        this.put(0x0814, new Retorno(0x0814, TipoRetorno.JORNADA, "Tipo de documento no soportado"));
        this.put(0x0815, new Retorno(0x0815, TipoRetorno.JORNADA, "Registrado para emitir documentos ‘normales’"));
        this.put(0x0816, new Retorno(0x0816, TipoRetorno.JORNADA, "Registrado para emitir documentos ‘M’"));
        this.put(0x0817, new Retorno(0x0817, TipoRetorno.JORNADA, "Falta descargar jornadas previas"));
        this.put(0x0818, new Retorno(0x0818, TipoRetorno.JORNADA, "Sólo se puede imprimir el cambio una única vez dentro de la jornada"));
        this.put(0x0819, new Retorno(0x0819, TipoRetorno.JORNADA, "Requiere que se encuentre establecida la línea de inicio de actividades"));

        //9 - Retornos sobre Transacciones Genericas
        this.put(0x0901, new Retorno(0x0901, TipoRetorno.TRANSACCIONES_GENERICAS, "Overflow"));
        this.put(0x0902, new Retorno(0x0902, TipoRetorno.TRANSACCIONES_GENERICAS, "Underflow"));
        this.put(0x0903, new Retorno(0x0903, TipoRetorno.TRANSACCIONES_GENERICAS, "Demasiados ítems involucrados en la transacción"));
        this.put(0x0904, new Retorno(0x0904, TipoRetorno.TRANSACCIONES_GENERICAS, "Demasiadas tasas de impuesto utilizadas"));
        this.put(0x0905, new Retorno(0x0905, TipoRetorno.TRANSACCIONES_GENERICAS, "Demasiados descuentos / ajustes sobre subtotal involucradasen la transacción"));
        this.put(0x0906, new Retorno(0x0906, TipoRetorno.TRANSACCIONES_GENERICAS, "Demasiados pagos involucrados en la transacción"));
        this.put(0x0907, new Retorno(0x0907, TipoRetorno.TRANSACCIONES_GENERICAS, "Item no encontrado"));
        this.put(0x0908, new Retorno(0x0908, TipoRetorno.TRANSACCIONES_GENERICAS, "Pago no encontrado"));
        this.put(0x0909, new Retorno(0x0909, TipoRetorno.TRANSACCIONES_GENERICAS, "El total debe ser mayor a cero"));
        this.put(0x090A, new Retorno(0x090A, TipoRetorno.TRANSACCIONES_GENERICAS, "Se permite sólo un tipo de impuestos internos"));
        this.put(0x090B, new Retorno(0x090B, TipoRetorno.TRANSACCIONES_GENERICAS, "Impuesto interno no aceptado"));
        this.put(0x090F, new Retorno(0x090F, TipoRetorno.TRANSACCIONES_GENERICAS, "Tasa de IVA no encontrada"));
        this.put(0x0910, new Retorno(0x0910, TipoRetorno.TRANSACCIONES_GENERICAS, "Tasa de IVA inválida"));
        this.put(0x091E, new Retorno(0x091E, TipoRetorno.TRANSACCIONES_GENERICAS, "Período descargado demasiado grande"));

        //0A - Retornos sobre Tique Fiscal
        this.put(0x0A01, new Retorno(0x0A01, TipoRetorno.TIQUE_FISCAL, "No permitido luego de descuentos / ajustes sobre el subtotal"));
        this.put(0x0A02, new Retorno(0x0A02, TipoRetorno.TIQUE_FISCAL, "No permitido luego de iniciar la fase de pago"));
        this.put(0x0A03, new Retorno(0x0A03, TipoRetorno.TIQUE_FISCAL, "Tipo de ítem inválido"));
        this.put(0x0A04, new Retorno(0x0A04, TipoRetorno.TIQUE_FISCAL, "Línea de descripción en blanco"));
        this.put(0x0A05, new Retorno(0x0A05, TipoRetorno.TIQUE_FISCAL, "Cantidad resultante menor que cero"));
        this.put(0x0A06, new Retorno(0x0A06, TipoRetorno.TIQUE_FISCAL, "Cantidad resultante mayor a lo permitido"));
        this.put(0x0A07, new Retorno(0x0A07, TipoRetorno.TIQUE_FISCAL, "Precio total del ítem mayor al permitido"));
        this.put(0x0A0A, new Retorno(0x0A0A, TipoRetorno.TIQUE_FISCAL, "Fase de pago finalizada"));
        this.put(0x0A0B, new Retorno(0x0A0B, TipoRetorno.TIQUE_FISCAL, "Monto de pago no permitido"));
        this.put(0x0A0C, new Retorno(0x0A0C, TipoRetorno.TIQUE_FISCAL, "Monto de descuento / ajuste no permitido"));
        this.put(0x0A0F, new Retorno(0x0A0F, TipoRetorno.TIQUE_FISCAL, "No permitido antes de un ítem"));
        this.put(0x0A10, new Retorno(0x0A10, TipoRetorno.TIQUE_FISCAL, "Demasiadas descripciones extras"));
        this.put(0x0A31, new Retorno(0x0A31, TipoRetorno.TIQUE_FISCAL, "Código de tipo de pago inválido"));
        this.put(0x0A32, new Retorno(0x0A32, TipoRetorno.TIQUE_FISCAL, "Imposible aplicar el descuento/ajuste particular. No se encontró un ítem que corresponda a la misma tasa de IVA y código de condición frente al IVA"));
        this.put(0x0A33, new Retorno(0x0A33, TipoRetorno.TIQUE_FISCAL, "Operación no permitida luego de Otros tributos"));
        this.put(0x0A34, new Retorno(0x0A34, TipoRetorno.TIQUE_FISCAL, "Otros tributos del tipo percepciones no soportado en Tique y Tique Nota de Crédito"));

        //0B - Retornos sobre Tique-FacturaFiscal/Nota de Débito/Nota de Crédito 
        this.put(0x0B01, new Retorno(0x0B01, TipoRetorno.TFNCD, "Tipo de documento del comprador inválido"));
        this.put(0x0B02, new Retorno(0x0B02, TipoRetorno.TFNCD, "Máximo valor aceptado fue superado"));
        this.put(0x0B03, new Retorno(0x0B03, TipoRetorno.TFNCD, "CUIT/CUIL inválido"));
        this.put(0x0B04, new Retorno(0x0B04, TipoRetorno.TFNCD, "Tipo de otros tributo inválido"));
        this.put(0x0B05, new Retorno(0x0B05, TipoRetorno.TFNCD, "Exceso en la cantidad de líneas de separación de la firma"));
        this.put(0x0B06, new Retorno(0x0B06, TipoRetorno.TFNCD, "Monto cero de otros tributos no permitido"));
        this.put(0x0B07, new Retorno(0x0B07, TipoRetorno.TFNCD, "Demasiados Otros Tributos involucradas en la transacción"));
        this.put(0x0B08, new Retorno(0x0B08, TipoRetorno.TFNCD, "Otro tributo no encontrado"));
        this.put(0x0B09, new Retorno(0x0B09, TipoRetorno.TFNCD, "Operación no permitida luego de Otros Tributos"));
        this.put(0x0B0A, new Retorno(0x0B0A, TipoRetorno.TFNCD, "Exceso de operaciones dentro del documento con triplicado"));
        this.put(0x0B0B, new Retorno(0x0B0B, TipoRetorno.TFNCD, "Tique factura del turista solo es aceptado en tique-factura B"));
        this.put(0x0B0C, new Retorno(0x0B0C, TipoRetorno.TFNCD, "Datos del turista inválidos"));
        this.put(0x0B0D, new Retorno(0x0B0D, TipoRetorno.TFNCD, "Número de documento inválido"));
        this.put(0x0B0E, new Retorno(0x0B0E, TipoRetorno.TFNCD, "Documento no soportado por el mecanismo de impresión"));
        this.put(0x0B11, new Retorno(0x0B11, TipoRetorno.TFNCD, "Tipo de documento asociado inválido"));
        this.put(0x0B12, new Retorno(0x0B12, TipoRetorno.TFNCD, "Punto de venta de documento asociado inválido"));
        this.put(0x0B13, new Retorno(0x0B13, TipoRetorno.TFNCD, "Número de documento asociado inválido"));
        this.put(0x0B14, new Retorno(0x0B14, TipoRetorno.TFNCD, "Otros tributos no soportado en Donaciones y Remito X/R"));
        this.put(0x0B15, new Retorno(0x0B15, TipoRetorno.TFNCD, "Número (#) de otros tributos con valor cero no permitido"));
        this.put(0x0B16, new Retorno(0x0B16, TipoRetorno.TFNCD, "Número (#) de otros tributos inválido"));
        this.put(0x0B17, new Retorno(0x0B17, TipoRetorno.TFNCD, "No existen otros tributos"));
        this.put(0x0B18, new Retorno(0x0B18, TipoRetorno.TFNCD, "Número de CUIT inválido para transportista, al emitir Remito X/R"));
        this.put(0x0B19, new Retorno(0x0B19, TipoRetorno.TFNCD, "Tipo de documento del tercero inválido"));
        this.put(0x0B1A, new Retorno(0x0B1A, TipoRetorno.TFNCD, "CUIT/CUIL del tercero inválido"));
        this.put(0x0B1B, new Retorno(0x0B1B, TipoRetorno.TFNCD, "Tipo de documento del beneficiario/chofer inválido"));
        this.put(0x0B1C, new Retorno(0x0B1C, TipoRetorno.TFNCD, "CUIT/CUIL del beneficiario/chofer inválido"));
        this.put(0x0B1D, new Retorno(0x0B1D, TipoRetorno.TFNCD, "Responsabilidad frente al IVA del tercero inválida"));

        //0E - Retornos sobre Documento No Fiscal
        this.put(0x0E02, new Retorno(0x0E02, TipoRetorno.DNF, "Exceso de código de barras dentro del documento"));

        //10 - Retornos sobre Documento No Fiscal Homologado
        this.put(0x1003, new Retorno(0x1003, TipoRetorno.DNFH, "Error interno al sumar monto de importe en un DNFH"));
        this.put(0x1004, new Retorno(0x1004, TipoRetorno.DNFH, "Pagos no soportado en DNFH Presupuesto X, Remito R/X"));
        this.put(0x1005, new Retorno(0x1005, TipoRetorno.DNFH, "Tipo de ítem no soportado en DNFH Remito R/X, Recibo X o Donaciones "));
        this.put(0x1006, new Retorno(0x1006, TipoRetorno.DNFH, "Descuentos/Recargos no permitido en DNFH Remito R/X, Recibo X o Donaciones"));
        this.put(0x1007, new Retorno(0x1007, TipoRetorno.DNFH, "Solamente se soporta un único ítem en Donaciones"));
        this.put(0x1008, new Retorno(0x1008, TipoRetorno.DNFH, "La cantidad del item debe ser uno en Donaciones y Recibo X"));
        this.put(0x1014, new Retorno(0x1014, TipoRetorno.DNFH, "Otros tributos no soportado en Donaciones y Remito X/R"));
        this.put(0x1015, new Retorno(0x1015, TipoRetorno.DNFH, "La razón social, el domicilio y el tipo y número de documento del beneficiario, son requeridos en Donaciones"));

        //20 - Otros Retornos
        this.put(0x2005, new Retorno(0x2005, TipoRetorno.OTROS_RETORNOS, "Código de unidad de medida reservado"));
        this.put(0x2006, new Retorno(0x2006, TipoRetorno.OTROS_RETORNOS, "Código de condición frente al IVA inválido"));
        this.put(0x2007, new Retorno(0x2007, TipoRetorno.OTROS_RETORNOS, "Sólo se permite una Condición frente al IVA del tipo Gravado (observar que la tasa de IVA es distinto de Cero)"));
        this.put(0x2008, new Retorno(0x2008, TipoRetorno.OTROS_RETORNOS, "Código de otros tributos inválido"));
        this.put(0x2009, new Retorno(0x2009, TipoRetorno.OTROS_RETORNOS, "Código de otros tributos no permitido"));

        //70 - Configuracion de Ethernet
        this.put(0x7001, new Retorno(0x7001, TipoRetorno.CONFIGURACION_ETHERNET, "Cable de red desconectado"));
        this.put(0x7002, new Retorno(0x7002, TipoRetorno.CONFIGURACION_ETHERNET, "Dirección IP inválida"));
        this.put(0x7003, new Retorno(0x7003, TipoRetorno.CONFIGURACION_ETHERNET, "Máscara de red inválida"));
        this.put(0x7004, new Retorno(0x7004, TipoRetorno.CONFIGURACION_ETHERNET, "Dirección de puerta de enlace predeterminada inválida"));
        this.put(0x7005, new Retorno(0x7005, TipoRetorno.CONFIGURACION_ETHERNET, "Error en DHCP"));
        this.put(0x7006, new Retorno(0x7006, TipoRetorno.CONFIGURACION_ETHERNET, "Error al aplicar la configuración"));

        //FF - Otros
        this.put(0xFFFF, new Retorno(0xFFFF, TipoRetorno.OTROS, "Error desconocido"));
    }

}
