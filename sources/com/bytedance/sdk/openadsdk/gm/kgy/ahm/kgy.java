package com.bytedance.sdk.openadsdk.gm.kgy.ahm;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.openadsdk.core.at;
import com.bytedance.sdk.openadsdk.core.settings.nu;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.dg.ahm;
import com.bytedance.sdk.openadsdk.dg.kgy.uq;
import com.bytedance.sdk.openadsdk.dg.rz;
import com.bytedance.sdk.openadsdk.utils.ft;
import com.bytedance.sdk.openadsdk.utils.mw;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.R6;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.t;
import com.unity3d.ads.BuildConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class kgy {
    private static volatile kgy fi;
    private volatile Boolean kgy = null;
    private AtomicLong ahm = new AtomicLong(0);
    private int rz = 0;
    private String uq = "";
    private final CountDownLatch ct = new CountDownLatch(1);
    private volatile boolean noq = false;
    private String yo = "";

    /* JADX INFO: Access modifiers changed from: private */
    public boolean rz() {
        if (this.kgy == null) {
            synchronized (this) {
                try {
                    if (this.kgy == null) {
                        this.kgy = Boolean.valueOf(((int) ((Math.random() * 100.0d) + 1.0d)) <= rz.ahm("gid_status", 100));
                        if (this.kgy.booleanValue()) {
                            try {
                                this.yo = ft.kgy();
                            } catch (Throwable th) {
                                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MHpTpI6yyGTa9tzM5N1lSI", "euo7kBGoYNSJRNB0iDmlJEvrPw==", "VesokTG5eciSXg==", Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE);
                                this.yo = BuildConfig.FLAVOR;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.kgy.booleanValue();
    }

    public void kgy(boolean z) {
        if (this.rz == 1 || !TextUtils.isEmpty(this.uq)) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (z || this.ahm.get() <= jElapsedRealtime) {
            this.ahm.set(jElapsedRealtime + 300000);
            final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            mw.kgy(new com.bytedance.sdk.component.gf.ahm.rz("pag_gaid") { // from class: com.bytedance.sdk.openadsdk.gm.kgy.ahm.kgy.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v5, types: [com.bytedance.sdk.openadsdk.core.rz] */
                /* JADX WARN: Type inference failed for: r4v1 */
                /* JADX WARN: Type inference failed for: r4v2, types: [int] */
                /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
                @Override // java.lang.Runnable
                public void run() {
                    ?? IsLimitAdTrackingEnabled;
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(xh.kgy());
                        if (advertisingIdInfo != null) {
                            IsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                            if (IsLimitAdTrackingEnabled != 0) {
                                kgy.this.rz = 1;
                                kgy.this.kgy(2, "lmt", SystemClock.elapsedRealtime() - jElapsedRealtime2);
                            }
                            if (IsLimitAdTrackingEnabled == 0) {
                                String id = advertisingIdInfo.getId();
                                String str = kgy.this.uq;
                                boolean zIsEmpty = TextUtils.isEmpty(id);
                                kgy kgyVar = kgy.this;
                                if (zIsEmpty) {
                                    kgyVar.kgy(4, "empty gaid", SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                } else {
                                    kgyVar.uq = id;
                                    kgy.this.kgy(true, SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                }
                                if (!str.equals(id)) {
                                    at.kgy();
                                }
                            }
                        } else {
                            IsLimitAdTrackingEnabled = -1;
                        }
                        if (IsLimitAdTrackingEnabled != -1) {
                            com.bytedance.sdk.openadsdk.core.rz.kgy().kgy("limit_ad_track", IsLimitAdTrackingEnabled);
                        }
                    } catch (Throwable th) {
                        try {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MHpTpI6yyGTa9tzM5N1lSI", "euo7kBGoYNSJRNB0iDmlJEvrP9FS", "Sfsj", 136);
                            kgy.this.rz = 2;
                            kgy.this.kgy(3, th, SystemClock.elapsedRealtime() - jElapsedRealtime2);
                            sx.rz("AdvertisingIdHelper", th.getMessage());
                        } finally {
                            kgy.this.noq = true;
                            kgy.this.ct.countDown();
                            com.bytedance.sdk.openadsdk.core.nu.rz.kgy(kgy.this.uq);
                        }
                    }
                }
            });
        }
    }

    private kgy() {
    }

    public String ahm() {
        if (xh.uq().wbb() == 1) {
            if (mw.noq()) {
                return this.uq;
            }
            try {
                if (!this.noq) {
                    try {
                        this.ct.await(4L, TimeUnit.SECONDS);
                    } catch (InterruptedException e) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MHpTpI6yyGTa9tzM5N1lSI", "euo7kBGoYNSJRNB0iDmlJEvrPw==", "XOs5siKVbfOJR9JymQU=", 81);
                    }
                }
                return this.uq;
            } finally {
                this.noq = true;
                this.ct.countDown();
            }
        }
        return this.uq;
    }

    public static kgy kgy() {
        if (fi == null) {
            synchronized (kgy.class) {
                try {
                    if (fi == null) {
                        fi = new kgy();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return fi;
    }

    public void kgy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(R6.X0, ahm());
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MHpTpI6yyGTa9tzM5N1lSI", "euo7kBGoYNSJRNB0iDmlJEvrPw==", "WuopsiKVTfOPYORyoj6iIl7tOQ==", 158);
        }
    }

    public void kgy(boolean z, long j) {
        kgy(z, 0, "", null, j);
    }

    public void kgy(int i, String str, long j) {
        kgy(false, i, str, null, j);
    }

    public void kgy(int i, Throwable th, long j) {
        kgy(false, i, "", th, j);
    }

    public void kgy(final boolean z, final int i, final String str, final Throwable th, final long j) {
        if ((this.kgy == null || this.kgy.booleanValue()) && xh.kgy() != null) {
            xh.ct().kgy(new ahm() { // from class: com.bytedance.sdk.openadsdk.gm.kgy.ahm.kgy.2
                @Override // com.bytedance.sdk.openadsdk.dg.ahm
                public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                    if (!kgy.this.rz()) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("session_id", kgy.this.yo);
                    jSONObject.put("is_success", z);
                    jSONObject.put(t.d, i);
                    jSONObject.put("error_msg", TextUtils.isEmpty(str) ? kgy.ahm(th) : str);
                    jSONObject.put("duration", j);
                    jSONObject.put("has_setting", nu.ahm().gc() > 0);
                    return uq.ahm().kgy("gid_status").ahm(jSONObject.toString());
                }
            }, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String ahm(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(th.toString());
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb.append("\n\tat ");
                sb.append(stackTraceElement.toString());
            }
            return sb.toString();
        } catch (Throwable th2) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MHpTpI6yyGTa9tzM5N1lSI", "euo7kBGoYNSJRNB0iDmlJEvrPw==", "XOs5phe9asy0WNZeiSK0OlLgKg==", 237);
            return "";
        }
    }
}
