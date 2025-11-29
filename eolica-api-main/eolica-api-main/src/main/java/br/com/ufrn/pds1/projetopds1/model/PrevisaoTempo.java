package br.com.ufrn.pds1.projetopds1.model;

import java.util.Date;

public class PrevisaoTempo {
    //@ spec_public
    private Date data;

    //@ spec_public
    private String local;

    //@ spec_public
    private Double previsaoTemperatura;

    //@ spec_public
    private Double previsaoVento;

    //@ spec_public
    private Double tempMax;

    //@ spec_public
    private Double tempMaxPrevisao;

    //@ spec_public
    private Double tempMedia;

    //@ spec_public
    private Double tempMin;

    //@ spec_public
    private Double tempMinPrevisao;

    //@ spec_public
    private Double velVento10m;

    /*@ public invariant data != null;
      @ public invariant local != null;
      @ public invariant previsaoTemperatura != null;
      @ public invariant previsaoVento != null;
      @ public invariant tempMax != null;
      @ public invariant tempMaxPrevisao != null;
      @ public invariant tempMedia != null;
      @ public invariant tempMin != null;
      @ public invariant tempMinPrevisao != null;
      @ public invariant velVento10m != null;
      @*/

    /*@
      @ requires d != null && l != null && tTemp != null && tVento != null
      @          && tMax != null && tMaxPrev != null
      @          && tMed != null && tMin != null && tMinPrev != null
      @          && v10m != null;
      @ ensures this.data == d;
      @ ensures this.local == l;
      @ ensures this.previsaoTemperatura == tTemp;
      @ ensures this.previsaoVento == tVento;
      @ ensures this.tempMax == tMax;
      @ ensures this.tempMaxPrevisao == tMaxPrev;
      @ ensures this.tempMedia == tMed;
      @ ensures this.tempMin == tMin;
      @ ensures this.tempMinPrevisao == tMinPrev;
      @ ensures this.velVento10m == v10m;
      @*/
    public PrevisaoTempo(Date d, String l, Double tTemp, Double tVento,
                         Double tMax, Double tMaxPrev, Double tMed,
                         Double tMin, Double tMinPrev, Double v10m) {
        this.data = d;
        this.local = l;
        this.previsaoTemperatura = tTemp;
        this.previsaoVento = tVento;
        this.tempMax = tMax;
        this.tempMaxPrevisao = tMaxPrev;
        this.tempMedia = tMed;
        this.tempMin = tMin;
        this.tempMinPrevisao = tMinPrev;
        this.velVento10m = v10m;
    }

    public Date getData() { return data; }
    public String getLocal() { return local; }
    public Double getPrevisaoTemperatura() { return previsaoTemperatura; }
    public Double getPrevisaoVento() { return previsaoVento; }
    public Double getTempMax() { return tempMax; }
    public Double getTempMaxPrevisao() { return tempMaxPrevisao; }
    public Double getTempMedia() { return tempMedia; }
    public Double getTempMin() { return tempMin; }
    public Double getTempMinPrevisao() { return tempMinPrevisao; }
    public Double getVelVento10m() { return velVento10m; }

    /*@ requires d != null;
      @ ensures this.data == d;
      @*/
    public void setData(Date d) { this.data = d; }

    /*@ requires l != null;
      @ ensures this.local == l;
      @*/
    public void setLocal(String l) { this.local = l; }

    /*@ requires t != null;
      @ ensures this.previsaoTemperatura == t;
      @*/
    public void setPrevisaoTemperatura(Double t) { this.previsaoTemperatura = t; }

    /*@ requires v != null;
      @ ensures this.previsaoVento == v;
      @*/
    public void setPrevisaoVento(Double v) { this.previsaoVento = v; }

    /*@ requires t != null;
      @ ensures this.tempMax == t;
      @*/
    public void setTempMax(Double t) { this.tempMax = t; }

    /*@ requires t != null;
      @ ensures this.tempMaxPrevisao == t;
      @*/
    public void setTempMaxPrevisao(Double t) { this.tempMaxPrevisao = t; }

    /*@ requires t != null;
      @ ensures this.tempMedia == t;
      @*/
    public void setTempMedia(Double t) { this.tempMedia = t; }

    /*@ requires t != null;
      @ ensures this.tempMin == t;
      @*/
    public void setTempMin(Double t) { this.tempMin = t; }

    /*@ requires t != null;
      @ ensures this.tempMinPrevisao == t;
      @*/
    public void setTempMinPrevisao(Double t) { this.tempMinPrevisao = t; }

    /*@ requires v != null;
      @ ensures this.velVento10m == v;
      @*/
    public void setVelVento10m(Double v) { this.velVento10m = v; }
}
