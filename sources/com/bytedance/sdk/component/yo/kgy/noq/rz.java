package com.bytedance.sdk.component.yo.kgy.noq;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.yo.kgy.yo;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class rz implements ahm {
    private final ct ahm;
    private final Context kgy;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @SuppressLint({"StaticFieldLeak"})
    public class kgy extends com.bytedance.sdk.component.yo.kgy.ct.ct {
        private final uq ahm;
        private final String rz;
        private final Map<String, String> uq;

        private kgy(uq uqVar, String str, Map<String, String> map) {
            super("AdsStats");
            this.ahm = uqVar;
            this.rz = str;
            this.uq = map;
        }

        private String rz(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("{TS}") || str.contains("__TS__")) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    str = str.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
                }
                if ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(this.rz)) {
                    return str.replace("{UID}", this.rz).replace("__UID__", this.rz);
                }
            }
            return str;
        }

        public String ahm(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    str = str.replace("[ss_random]", String.valueOf(rz.rz().nextLong()));
                    return str.replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
                } catch (Exception unused) {
                }
            }
            return str;
        }

        public boolean kgy(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (str.startsWith(d.v) || str.startsWith("https://")) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.yo.kgy.ct.uq uqVarKgy;
            com.bytedance.sdk.component.yo.kgy.ct ctVarVs = yo.noq().vs();
            if (ctVarVs != null && yo.noq().ct() != null && ctVarVs.rz() && kgy(this.ahm.ahm())) {
                if (this.ahm.uq() >= ctVarVs.rz(this.ahm.noq())) {
                    rz.this.ahm.rz(this.ahm);
                    return;
                }
                try {
                    if (this.ahm.nu()) {
                        rz.this.ahm.kgy(this.ahm);
                    }
                    if (ctVarVs.kgy(rz.this.kgy())) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        String strAhm = this.ahm.ahm();
                        if (ctVarVs.noq() == 0) {
                            strAhm = rz(this.ahm.ahm());
                            if (this.ahm.rz()) {
                                strAhm = ahm(strAhm);
                            }
                        }
                        com.bytedance.sdk.component.yo.kgy.ct.rz rzVarRa = ctVarVs.ra();
                        if (rzVarRa != null) {
                            rzVarRa.kgy(Command.HTTP_HEADER_USER_AGENT, ctVarVs.gf());
                            rzVarRa.kgy("csj_client_source_from", "1");
                            if (this.uq != null) {
                                JSONObject jSONObject = new JSONObject();
                                for (Map.Entry<String, String> entry : this.uq.entrySet()) {
                                    jSONObject.put(entry.getKey(), entry.getValue());
                                }
                                rzVarRa.kgy("csj_extra_info", jSONObject.toString());
                            }
                            rzVarRa.kgy(strAhm);
                            try {
                                uqVarKgy = rzVarRa.kgy();
                                try {
                                    uqVarKgy.kgy();
                                } catch (Throwable unused) {
                                }
                            } catch (Throwable unused2) {
                                uqVarKgy = null;
                            }
                            uq uqVar = this.ahm;
                            uqVar.kgy(uqVar.uq() + 1);
                            if (uqVarKgy != null && uqVarKgy.kgy()) {
                                rz.this.ahm.rz(this.ahm);
                                this.ahm.ahm();
                                ctVarVs.kgy(true, 200, System.currentTimeMillis() - jCurrentTimeMillis, this.ahm);
                                return;
                            }
                            if (uqVarKgy != null) {
                                this.ahm.ahm(uqVarKgy.ahm());
                                this.ahm.rz(uqVarKgy.rz());
                            }
                            if (uqVarKgy != null && uqVarKgy.ahm() == 8848) {
                                uqVarKgy.rz();
                                rz.this.ahm.rz(this.ahm);
                            } else {
                                this.ahm.ahm();
                                int iUq = this.ahm.uq();
                                int iRz = ctVarVs.rz(this.ahm.noq());
                                rz rzVar = rz.this;
                                if (iUq >= iRz) {
                                    rzVar.ahm.rz(this.ahm);
                                    this.ahm.ahm();
                                } else {
                                    rzVar.ahm.ahm(this.ahm);
                                }
                            }
                            ctVarVs.kgy(false, this.ahm.fi(), System.currentTimeMillis() - jCurrentTimeMillis, this.ahm);
                        }
                    }
                } catch (Throwable unused3) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Random rz() {
        if (Build.VERSION.SDK_INT < 26) {
            return new SecureRandom();
        }
        try {
            return SecureRandom.getInstanceStrong();
        } catch (Throwable unused) {
            return new SecureRandom();
        }
    }

    public rz(Context context, ct ctVar) {
        this.kgy = context;
        this.ahm = ctVar;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.noq.ahm
    public void kgy(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        com.bytedance.sdk.component.yo.kgy.ct ctVarVs = yo.noq().vs();
        if (ctVarVs != null && yo.noq().ct() != null && ctVarVs.uq() != null && ctVarVs.rz() && list != null && list.size() != 0) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                ctVarVs.uq().execute(new kgy(new uq(UUID.randomUUID().toString() + "_" + System.currentTimeMillis(), it.next(), z, i, str2), str, map));
            }
        }
    }

    public Context kgy() {
        Context context = this.kgy;
        return context == null ? yo.noq().ct() : context;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.noq.ahm
    public Runnable kgy(final uq uqVar, final String str, final Map<String, String> map) {
        if (uqVar == null || TextUtils.isEmpty(uqVar.kgy())) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.yo.kgy.noq.rz.1
            @Override // java.lang.Runnable
            public void run() {
                if (rz.this.ahm.kgy(uqVar.kgy()) != null) {
                    new kgy(uqVar, str, map).run();
                }
            }
        };
    }

    @Override // com.bytedance.sdk.component.yo.kgy.noq.ahm
    public void kgy(final String str, final boolean z) {
        com.bytedance.sdk.component.yo.kgy.ct ctVarVs = yo.noq().vs();
        if (ctVarVs == null || yo.noq().ct() == null || !ctVarVs.rz()) {
            return;
        }
        com.bytedance.sdk.component.yo.kgy.ct.ct ctVar = new com.bytedance.sdk.component.yo.kgy.ct.ct("trackFailedUrls") { // from class: com.bytedance.sdk.component.yo.kgy.noq.rz.2
            @Override // java.lang.Runnable
            public void run() {
                rz.this.kgy(rz.this.ahm.kgy(), str, z);
            }
        };
        ctVar.kgy(1);
        if (ctVarVs.uq() != null) {
            ctVarVs.uq().execute(ctVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kgy(List<uq> list, String str, boolean z) {
        rz rzVar;
        String str2;
        if (list == null || list.size() == 0) {
            return;
        }
        com.bytedance.sdk.component.yo.kgy.ct ctVarVs = yo.noq().vs();
        for (uq uqVar : list) {
            if (ctVarVs == null || ctVarVs.uq() == null) {
                rzVar = this;
                str2 = str;
            } else {
                uqVar.kgy(z);
                rzVar = this;
                str2 = str;
                ctVarVs.uq().execute(new kgy(uqVar, str2, null));
            }
            this = rzVar;
            str = str2;
        }
    }
}
