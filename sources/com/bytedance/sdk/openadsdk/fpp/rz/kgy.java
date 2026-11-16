package com.bytedance.sdk.openadsdk.fpp.rz;

import com.bytedance.sdk.openadsdk.fpz.rz;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class kgy {
    public boolean ahm;
    public long ct;
    public boolean kgy;
    public long noq;
    public boolean rz;
    public boolean uq;
    public long yo;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.fpp.rz.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface InterfaceC0271kgy {
        kgy noq();
    }

    public static kgy kgy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        kgy kgyVar = new kgy();
        kgyVar.ahm(jSONObject.optBoolean("isCompleted"));
        kgyVar.rz(jSONObject.optBoolean("isFromVideoDetailPage"));
        kgyVar.uq(jSONObject.optBoolean("isFromDetailPage"));
        kgyVar.kgy(jSONObject.optLong("duration"));
        kgyVar.ahm(jSONObject.optLong("totalPlayDuration"));
        kgyVar.rz(jSONObject.optLong("currentPlayPosition"));
        kgyVar.kgy(jSONObject.optBoolean("isAutoPlay"));
        return kgyVar;
    }

    public kgy ahm(boolean z) {
        this.kgy = z;
        return this;
    }

    public kgy rz(boolean z) {
        this.ahm = z;
        return this;
    }

    public kgy uq(boolean z) {
        this.rz = z;
        return this;
    }

    public kgy ahm(long j) {
        this.noq = j;
        return this;
    }

    public kgy rz(long j) {
        this.yo = j;
        return this;
    }

    public kgy kgy(long j) {
        this.ct = j;
        return this;
    }

    public JSONObject kgy() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.kgy);
            jSONObject.put("isFromVideoDetailPage", this.ahm);
            jSONObject.put("isFromDetailPage", this.rz);
            jSONObject.put("duration", this.ct);
            jSONObject.put("totalPlayDuration", this.noq);
            jSONObject.put("currentPlayPosition", this.yo);
            jSONObject.put("isAutoPlay", this.uq);
            return jSONObject;
        } catch (Exception e) {
            rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+aTbFmw4VG", "becpkAyfZsmUWNhRgBSyDFr6LLgMuGzL", "T+EHhgyyRsWK", 71);
            return jSONObject;
        }
    }

    public kgy kgy(boolean z) {
        this.uq = z;
        return this;
    }
}
