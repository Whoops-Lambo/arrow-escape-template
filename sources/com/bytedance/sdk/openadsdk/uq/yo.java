package com.bytedance.sdk.openadsdk.uq;

import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class yo {
    private long ahm;
    private long ct;
    private long kgy;
    private long rz;
    private long uq;

    public void ahm(long j) {
        if (this.ahm <= 0) {
            this.ahm = j;
        }
    }

    public void ct(long j) {
        if (this.ct <= 0) {
            this.ct = j;
        }
    }

    public JSONObject kgy(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "euoenQyrXc6NTw==", "XOs5tAePYciXft5QiQ==", 143);
                return jSONObject;
            }
        }
        long j = this.kgy;
        if (j > 0) {
            jSONObject.put("show_start", j);
            long j2 = this.ahm;
            if (j2 > 0) {
                jSONObject.put("show_firstQuartile", j2);
                long j3 = this.rz;
                if (j3 > 0) {
                    jSONObject.put("show_mid", j3);
                    long j4 = this.uq;
                    if (j4 > 0) {
                        jSONObject.put("show_thirdQuartile", j4);
                        long j5 = this.ct;
                        if (j5 > 0) {
                            jSONObject.put("show_full", j5);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    public void rz(long j) {
        if (this.rz <= 0) {
            this.rz = j;
        }
    }

    public void uq(long j) {
        if (this.uq <= 0) {
            this.uq = j;
        }
    }

    public JSONObject ahm() {
        return kgy((JSONObject) null);
    }

    public boolean kgy() {
        return this.kgy > 0;
    }

    public void kgy(long j, float f) {
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            kgy(j);
        }
        double d = f;
        if (d >= 0.25d) {
            kgy(j);
            ahm(j);
        }
        if (d >= 0.5d) {
            kgy(j);
            ahm(j);
            rz(j);
        }
        if (d >= 0.75d) {
            kgy(j);
            ahm(j);
            rz(j);
            uq(j);
        }
        if (f >= 1.0f) {
            kgy(j);
            ahm(j);
            rz(j);
            uq(j);
            ct(j);
        }
    }

    public void kgy(long j) {
        if (this.kgy <= 0) {
            this.kgy = j;
        }
    }
}
