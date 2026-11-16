package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.C4687c9;
import com.ironsource.C4950r4;
import com.ironsource.Db;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class AdInfo {

    @Nullable
    private final C4687c9 impressionData;

    @Nullable
    private final Db loadArmData;

    @NotNull
    public final String getAb() {
        C4687c9 c4687c9 = this.impressionData;
        return (c4687c9 == null || c4687c9.a() == null) ? "" : this.impressionData.a();
    }

    @NotNull
    public final String getAdNetwork() {
        C4687c9 c4687c9 = this.impressionData;
        return (c4687c9 == null || c4687c9.c() == null) ? "" : this.impressionData.c();
    }

    @NotNull
    public final String getAuctionId() {
        C4687c9 c4687c9 = this.impressionData;
        return (c4687c9 == null || c4687c9.e() == null) ? "" : this.impressionData.e();
    }

    @NotNull
    public final String getCountry() {
        C4687c9 c4687c9 = this.impressionData;
        return (c4687c9 == null || c4687c9.f() == null) ? "" : this.impressionData.f();
    }

    @NotNull
    public final String getEncryptedCPM() {
        C4687c9 c4687c9 = this.impressionData;
        return (c4687c9 == null || c4687c9.h() == null) ? "" : this.impressionData.h();
    }

    @NotNull
    public final String getInstanceId() {
        C4687c9 c4687c9 = this.impressionData;
        return (c4687c9 == null || c4687c9.i() == null) ? "" : this.impressionData.i();
    }

    @NotNull
    public final String getInstanceName() {
        C4687c9 c4687c9 = this.impressionData;
        return (c4687c9 == null || c4687c9.j() == null) ? "" : this.impressionData.j();
    }

    @NotNull
    public final String getPrecision() {
        Db db = this.loadArmData;
        if (db != null) {
            return db.c();
        }
        C4687c9 c4687c9 = this.impressionData;
        return (c4687c9 == null || c4687c9.n() == null) ? "" : this.impressionData.n();
    }

    public final double getRevenue() {
        Db db = this.loadArmData;
        if (db != null) {
            return db.d();
        }
        C4687c9 c4687c9 = this.impressionData;
        if (c4687c9 == null) {
            return 0.0d;
        }
        c4687c9.o();
        return this.impressionData.o();
    }

    @NotNull
    public final String getSegmentName() {
        C4687c9 c4687c9 = this.impressionData;
        return (c4687c9 == null || c4687c9.p() == null) ? "" : this.impressionData.p();
    }

    public AdInfo(@Nullable C4687c9 c4687c9, @Nullable Db db) {
        this.impressionData = c4687c9;
        this.loadArmData = db;
    }

    @NotNull
    public String toString() {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("auctionId", getAuctionId());
            jSONObjectJsonObjectInit.put("country", getCountry());
            jSONObjectJsonObjectInit.put("ab", getAb());
            jSONObjectJsonObjectInit.put("segmentName", getSegmentName());
            jSONObjectJsonObjectInit.put("adNetwork", getAdNetwork());
            jSONObjectJsonObjectInit.put("instanceName", getInstanceName());
            jSONObjectJsonObjectInit.put("instanceId", getInstanceId());
            jSONObjectJsonObjectInit.put("revenue", getRevenue());
            jSONObjectJsonObjectInit.put("precision", getPrecision());
            jSONObjectJsonObjectInit.put("encryptedCPM", getEncryptedCPM());
        } catch (Exception e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error("error while parsing ad info " + e.getMessage());
        }
        String string = jSONObjectJsonObjectInit.toString();
        string.getClass();
        return string;
    }
}
