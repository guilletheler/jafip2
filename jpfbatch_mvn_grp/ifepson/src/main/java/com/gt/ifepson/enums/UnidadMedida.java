/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.ifepson.enums;

/**
 *
 * @author guillermot
 */
public enum UnidadMedida {
    SIN_DESCRIPCION(0),
    KILOGRAMO(1),
    METROS(2),
    METRO_CUADRADO(3),
    METRO_CUBICO(4),
    LITROS(5),
    UNIDAD(7),
    PAR(8),
    DOCENA(9),
    QUILATE(10),
    MILLAR(11),
    MEGA_U_INTER_ACT_ANTIB(12),
    UNIDAD_INT_ACT_INMUNG(13),
    GRAMO(14),
    MILIMETRO(15),
    MILIMETRO_CUBICO(16),
    KILOMETRO(17),
    HECTOLITRO(18),
    MEGA_UNIDAD_INT_ACT_INMUNG(19),
    CENTIMETRO(20),
    KILOGRAMO_ACTIVO(21),
    GRAMO_ACTIVO(22),
    GRAMO_BASE(23),
    UIACTHOR(24),
    JGO_PQT_MAZO_NAIPES(25),
    MUIACTHOR(26),
    CENTIMETRO_CUBICO(27),
    UIACTANT(28),
    TONELADA(29),
    DECAMETRO_CUBICO(30),
    HECTOMETRO_CUBICO(31),
    KILOMETRO_CUBICO(32),
    MICROGRAMO(33),
    NANOGRAMO(34),
    PICOGRAMO(35),
    MUIACTANT(36),
    UIACTIG(37),
    MILIGRAMO(41),
    MILILITRO(47),
    CURIE(48),
    MILICURIE(49),
    MICROCURIE(50),
    U_INTER_ACT_HORMONAL(51),
    MEGA_U_INTER_ACT_HORMONAL(52),
    KILOGRAMO_BASE(53),
    GRUESA(54),
    MUIACTIG(55),
    KILOGRAMO_BRUTO(61),
    PACK(62),
    HORMA(63);

    int codigo;

    private UnidadMedida(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

}
