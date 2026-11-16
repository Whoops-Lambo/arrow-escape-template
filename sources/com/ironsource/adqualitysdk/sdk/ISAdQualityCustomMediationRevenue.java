package com.ironsource.adqualitysdk.sdk;

import com.ironsource.adqualitysdk.sdk.i.AbstractC1125;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class ISAdQualityCustomMediationRevenue {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final JSONObject f37;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String f38;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final double f39;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ISAdQualityAdType f40;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final ISAdQualityMediationNetwork f41;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Deprecated
    public static class Builder {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public JSONObject f42;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public String f43;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public double f44;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public ISAdQualityMediationNetwork f46 = ISAdQualityMediationNetwork.UNKNOWN;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public ISAdQualityAdType f45 = ISAdQualityAdType.UNKNOWN;

        @Deprecated
        public ISAdQualityCustomMediationRevenue build() {
            return new ISAdQualityCustomMediationRevenue(this.f46, this.f45, this.f44, this.f43, this.f42);
        }

        @Deprecated
        public Builder setAdType(ISAdQualityAdType iSAdQualityAdType) {
            this.f45 = iSAdQualityAdType;
            return this;
        }

        @Deprecated
        public Builder setCustomData(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f42 = AbstractC1125.m833(jSONObject, false);
            }
            return this;
        }

        @Deprecated
        public Builder setMediationNetwork(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
            this.f46 = iSAdQualityMediationNetwork;
            return this;
        }

        @Deprecated
        public Builder setPlacement(String str) {
            this.f43 = str;
            return this;
        }

        @Deprecated
        public Builder setRevenue(double d) {
            this.f44 = d;
            return this;
        }

        @Deprecated
        public Builder() {
        }
    }

    @Deprecated
    public ISAdQualityAdType getAdType() {
        return this.f40;
    }

    @Deprecated
    public JSONObject getCustomData() {
        return this.f37;
    }

    @Deprecated
    public ISAdQualityMediationNetwork getMediationNetwork() {
        return this.f41;
    }

    @Deprecated
    public String getPlacement() {
        return this.f38;
    }

    @Deprecated
    public double getRevenue() {
        return this.f39;
    }

    public ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d, String str, JSONObject jSONObject) {
        this.f41 = iSAdQualityMediationNetwork;
        this.f40 = iSAdQualityAdType;
        this.f39 = d;
        this.f38 = str;
        this.f37 = jSONObject;
    }
}
