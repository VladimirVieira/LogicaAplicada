package br.com.ufrn.pds1.projetopds1.model;

public class DadosLocalComparativo {

    //@ public invariant identificador != null;
    //@ public invariant mediaVentoTrimestre1 != null && mediaVentoTrimestre1 >= 0;
    //@ public invariant mediaVentoTrimestre2 != null && mediaVentoTrimestre2 >= 0;
    //@ public invariant mediaVentoTrimestre3 != null && mediaVentoTrimestre3 >= 0;
    //@ public invariant mediaVentoTrimestre4 != null && mediaVentoTrimestre4 >= 0;

    //@ spec_public
    private String identificador;

    //@ spec_public
    private Double mediaVentoTrimestre1;

    //@ spec_public
    private Double mediaVentoTrimestre2;

    //@ spec_public
    private Double mediaVentoTrimestre3;

    //@ spec_public
    private Double mediaVentoTrimestre4;

    /*@
      requires identificador != null;
      requires mediaVentoTrimestre1 != null && mediaVentoTrimestre1 >= 0;
      requires mediaVentoTrimestre2 != null && mediaVentoTrimestre2 >= 0;
      requires mediaVentoTrimestre3 != null && mediaVentoTrimestre3 >= 0;
      requires mediaVentoTrimestre4 != null && mediaVentoTrimestre4 >= 0;

      ensures this.identificador == identificador;
      ensures this.mediaVentoTrimestre1 == mediaVentoTrimestre1;
      ensures this.mediaVentoTrimestre2 == mediaVentoTrimestre2;
      ensures this.mediaVentoTrimestre3 == mediaVentoTrimestre3;
      ensures this.mediaVentoTrimestre4 == mediaVentoTrimestre4;
    @*/
    public DadosLocalComparativo(String identificador,
                                 Double mediaVentoTrimestre1,
                                 Double mediaVentoTrimestre2,
                                 Double mediaVentoTrimestre3,
                                 Double mediaVentoTrimestre4) {

        this.identificador = identificador;
        this.mediaVentoTrimestre1 = mediaVentoTrimestre1;
        this.mediaVentoTrimestre2 = mediaVentoTrimestre2;
        this.mediaVentoTrimestre3 = mediaVentoTrimestre3;
        this.mediaVentoTrimestre4 = mediaVentoTrimestre4;
    }

    //@ ensures \result == identificador;
    public String getIdentificador() { return identificador; }

    //@ ensures \result == mediaVentoTrimestre1;
    public Double getMediaVentoTrimestre1() { return mediaVentoTrimestre1; }

    //@ ensures \result == mediaVentoTrimestre2;
    public Double getMediaVentoTrimestre2() { return mediaVentoTrimestre2; }

    //@ ensures \result == mediaVentoTrimestre3;
    public Double getMediaVentoTrimestre3() { return mediaVentoTrimestre3; }

    //@ ensures \result == mediaVentoTrimestre4;
    public Double getMediaVentoTrimestre4() { return mediaVentoTrimestre4; }
}
