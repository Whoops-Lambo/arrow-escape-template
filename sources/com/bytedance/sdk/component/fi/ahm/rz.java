package com.bytedance.sdk.component.fi.ahm;

import android.text.TextUtils;
import com.bytedance.sdk.component.ahm.kgy.at;
import com.bytedance.sdk.component.ahm.kgy.nu;
import com.inmobi.media.core.config.models.CrashConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class rz {
    private List<String> ahm;
    String ct;
    protected com.bytedance.sdk.openadsdk.um.uq gf;
    int noq;
    protected nu rz;
    protected String uq = null;
    protected final Map<String, String> yo = new HashMap();
    protected String fi = null;
    private String kgy = null;
    private long nu = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
    protected boolean ra = false;

    public abstract com.bytedance.sdk.component.fi.ahm kgy();

    public abstract void kgy(com.bytedance.sdk.component.fi.kgy.kgy kgyVar);

    public void ahm() {
        nu nuVar;
        if (this.uq == null || (nuVar = this.rz) == null) {
            return;
        }
        com.bytedance.sdk.component.ahm.kgy.uq uqVarAhm = nuVar.ahm();
        synchronized (uqVarAhm) {
            try {
                for (com.bytedance.sdk.component.ahm.kgy.ahm ahmVar : uqVarAhm.rz()) {
                    if (this.uq.equals(ahmVar.kgy().rz())) {
                        ahmVar.rz();
                    }
                }
                for (com.bytedance.sdk.component.ahm.kgy.ahm ahmVar2 : uqVarAhm.uq()) {
                    if (this.uq.equals(ahmVar2.kgy().rz())) {
                        ahmVar2.rz();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void fi() {
        if (this.gf == null) {
            return;
        }
        try {
            nu nuVar = this.rz;
            if (nuVar == null || nuVar.kgy() == null) {
                return;
            }
            this.rz.kgy().ahm(this.gf);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4IUtGZe9iiWFqhm1Q==", "des5sBu5atKURcU=", "SesumhG4WtKDSdJOnw==", Sdk.SDKError.Reason.AD_EXPIRED_VALUE);
        }
    }

    public void gf() {
        if (this.gf == null) {
            return;
        }
        try {
            nu nuVar = this.rz;
            if (nuVar == null || nuVar.kgy() == null) {
                return;
            }
            this.rz.kgy().rz(this.gf);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4IUtGZe9iiWFqhm1Q==", "des5sBu5atKURcU=", "SesumhG4T8aJRg==", Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE);
        }
    }

    public String noq() {
        return this.fi;
    }

    public String rz() {
        return this.kgy;
    }

    public void uq(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.yo.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void yo() {
        if (this.gf == null) {
            return;
        }
        try {
            nu nuVar = this.rz;
            if (nuVar == null || nuVar.kgy() == null) {
                return;
            }
            this.rz.kgy().kgy(this.gf);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4IUtGZe9iiWFqhm1Q==", "des5sBu5atKURcU=", "SesumhG4WtOBWMM=", 289);
        }
    }

    public rz(nu nuVar) {
        this.rz = nuVar;
        try {
            uq(UUID.randomUUID().toString());
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4IUtGZe9iiWFqhm1Q==", "des5sBu5atKURcU=", "B+cjnBfi", 93);
            th.getMessage();
        }
    }

    public final com.bytedance.sdk.component.fi.ahm ct() {
        com.bytedance.sdk.component.fi.ahm ahmVarKgy;
        yo();
        try {
            ahmVarKgy = kgy();
            if (ahmVarKgy != null) {
                try {
                    if (ahmVarKgy.noq()) {
                        fi();
                        return ahmVarKgy;
                    }
                } catch (Throwable th) {
                    th = th;
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4IUtGZe9iiWFqhm1Q==", "des5sBu5atKURcU=", "XvYolhaobA==", 169);
                    gf();
                    return ahmVarKgy;
                }
            }
            gf();
            return ahmVarKgy;
        } catch (Throwable th2) {
            th = th2;
            ahmVarKgy = null;
        }
    }

    public void kgy(at.kgy kgyVar) {
        if (com.bytedance.sdk.component.fi.kgy.noq()) {
            List<String> list = this.ahm;
            if (list != null && !list.isEmpty()) {
                kgyVar.kgy(this.ahm);
            }
            kgyVar.kgy(this.nu);
        }
    }

    public void rz(String str) {
        this.fi = str;
    }

    public void kgy(com.bytedance.sdk.openadsdk.um.uq uqVar) {
        this.gf = uqVar;
    }

    public void kgy(List<String> list) {
        this.ahm = list;
    }

    public void kgy(long j, TimeUnit timeUnit) {
        this.nu = timeUnit.toMillis(j);
    }

    public void kgy(String str) {
        this.kgy = str;
    }

    public void kgy(int i) {
        this.noq = i;
    }

    public void uq(String str) {
        this.uq = str;
    }

    public String uq() {
        return this.uq;
    }

    public void ahm(String str, String str2) {
        this.yo.put(str, str2);
    }

    public void ahm(String str) {
        this.ct = str;
    }

    public final void ahm(final com.bytedance.sdk.component.fi.kgy.kgy kgyVar) {
        yo();
        kgy(new com.bytedance.sdk.component.fi.kgy.kgy() { // from class: com.bytedance.sdk.component.fi.ahm.rz.1
            @Override // com.bytedance.sdk.component.fi.kgy.kgy
            public void kgy(rz rzVar, com.bytedance.sdk.component.fi.ahm ahmVar) {
                if (ahmVar == null || !ahmVar.noq()) {
                    rz.this.gf();
                } else {
                    rz.this.fi();
                }
                com.bytedance.sdk.component.fi.kgy.kgy kgyVar2 = kgyVar;
                if (kgyVar2 != null) {
                    kgyVar2.kgy(rzVar, ahmVar);
                }
            }

            @Override // com.bytedance.sdk.component.fi.kgy.kgy
            public void kgy(rz rzVar, IOException iOException) {
                rz.this.gf();
                com.bytedance.sdk.component.fi.kgy.kgy kgyVar2 = kgyVar;
                if (kgyVar2 != null) {
                    kgyVar2.kgy(rzVar, iOException);
                }
            }
        });
    }

    public void ahm(at.kgy kgyVar) {
        if (kgyVar != null && this.yo.size() > 0) {
            for (Map.Entry<String, String> entry : this.yo.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    kgyVar.ahm(key, value);
                }
            }
        }
    }
}
