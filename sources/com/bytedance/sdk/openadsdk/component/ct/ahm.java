package com.bytedance.sdk.openadsdk.component.ct;

import defpackage.jc1;
import java.util.Comparator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ahm {
    public static final Comparator<ahm> kgy = new Comparator<ahm>() { // from class: com.bytedance.sdk.openadsdk.component.ct.ahm.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public int compare(ahm ahmVar, ahm ahmVar2) {
            if (ahmVar.ct() != ahmVar2.ct()) {
                return Long.compare(ahmVar2.ct(), ahmVar.ct());
            }
            return Long.compare(ahmVar2.rz(), ahmVar.rz());
        }
    };
    private final String ahm;
    private final long ct;
    private final long noq;
    private final String rz;
    private final long uq;
    private final String yo;

    public String ahm() {
        return this.rz;
    }

    public long ct() {
        return this.noq;
    }

    public JSONObject kgy() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("rit", this.ahm);
            jSONObject.putOpt("material", this.rz);
            jSONObject.putOpt("expire_time", Long.valueOf(this.uq));
            jSONObject.putOpt("create_time", Long.valueOf(this.ct));
            jSONObject.putOpt("price", Long.valueOf(this.noq));
            jSONObject.putOpt("req_id", this.yo);
            return jSONObject;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erThU4CibF/JkyIRP2w==", "b9oMhROTecKOa9N+jRKoLXXrOg==", "T+EHhgyy", 69);
            return jSONObject;
        }
    }

    public String noq() {
        return this.yo;
    }

    public long rz() {
        return this.uq;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdCache{mRit=");
        sb.append(this.ahm);
        sb.append(", mExpireTime=");
        sb.append(this.uq);
        sb.append(", mCreateTime=");
        sb.append(this.ct);
        sb.append(", mPrice=");
        sb.append(this.noq);
        sb.append(", mReqId='");
        return jc1.q(sb, this.yo, '}');
    }

    public long uq() {
        return this.ct;
    }

    public ahm(String str, String str2, long j, long j2, long j3, String str3) {
        this.ahm = str;
        this.rz = str2;
        this.uq = j;
        this.ct = j2;
        this.noq = j3;
        this.yo = str3;
    }

    public static ahm kgy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new ahm(jSONObject.optString("rit"), jSONObject.optString("material"), jSONObject.optLong("expire_time"), jSONObject.optLong("create_time"), jSONObject.optLong("price"), jSONObject.optString("req_id"));
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erThU4CibF/JkyIRP2w==", "b9oMhROTecKOa9N+jRKoLXXrOg==", "XfwimCmvZsk=", 54);
            return null;
        }
    }
}
