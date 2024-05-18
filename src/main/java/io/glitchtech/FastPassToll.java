package io.glitchtech;

public class FastPassToll {
    private String fastPassId;
    private String stationId;
    private Float amountPaid;
    private String status;

    public FastPassToll() {
    }

    public String getFastPassId() {
        return this.fastPassId;
    }

    public void setFastPassId(String fastPassId) {
        this.fastPassId = fastPassId;
    }

    public String getStationId() {
        return this.stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public Float getAmountPaid() {
        return this.amountPaid;
    }

    public void setAmountPaid(Float amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
