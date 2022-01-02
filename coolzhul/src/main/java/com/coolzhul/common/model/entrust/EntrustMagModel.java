package com.coolzhul.common.model.entrust;

import com.coolzhul.common.enumdic.entrust.EntrustReport;
import com.coolzhul.common.enumdic.entrust.EntrustSort;

public class EntrustMagModel {
    private String planId;
    private EntrustSort entrustSort;
    private EntrustReport entrustReport;

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public EntrustSort getEntrustSort() {
        return entrustSort;
    }

    public void setEntrustSort(EntrustSort entrustSort) {
        this.entrustSort = entrustSort;
    }

    public EntrustReport getEntrustReport() {
        return entrustReport;
    }

    public void setEntrustReport(EntrustReport entrustReport) {
        this.entrustReport = entrustReport;
    }
}
