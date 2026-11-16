package com.bytedance.sdk.openadsdk.core.twf.ahm;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.jpc;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.utils.ftg;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class rz {
    private EnumC0265rz ct;
    private boolean noq;
    private final String rz;
    private final boolean uq;
    private static final Map<String, ahm> kgy = new ConcurrentHashMap();
    private static final AtomicBoolean ahm = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        private final String kgy;
        private EnumC0265rz ahm = EnumC0265rz.TRACKING_URL;
        private boolean rz = false;

        public rz kgy() {
            return new rz(this.kgy, this.ahm, Boolean.valueOf(this.rz));
        }

        public kgy(String str) {
            this.kgy = str;
        }

        public kgy kgy(boolean z) {
            this.rz = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.twf.ahm.rz$rz, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum EnumC0265rz {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    public void p_() {
        this.noq = true;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ahm {
        String ahm;
        final ioy kgy;
        float rz;

        public ahm(String str, ioy ioyVar, float f) {
            this.ahm = str;
            this.kgy = ioyVar;
            this.rz = f;
        }

        public String toString() {
            return super.toString();
        }

        public ahm(String str, ioy ioyVar) {
            this(str, ioyVar, -1.0f);
        }
    }

    static {
        jpc.kgy(new jpc.kgy() { // from class: com.bytedance.sdk.openadsdk.core.twf.ahm.rz.1
            @Override // com.bytedance.sdk.component.utils.jpc.kgy
            public void kgy(Context context, Intent intent, boolean z, int i) {
                if (i == 0 || rz.kgy.size() <= 0) {
                    return;
                }
                rz.yo();
            }
        }, xh.kgy());
    }

    public static List<com.bytedance.sdk.openadsdk.core.twf.ahm.ahm> ahm(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new com.bytedance.sdk.openadsdk.core.twf.ahm.ahm.kgy(jSONObjectOptJSONObject.optString("content"), (float) jSONObjectOptJSONObject.optDouble("trackingFraction", 0.0d)).kgy());
                }
            }
        }
        return arrayList;
    }

    public static List<String> kgy(ioy ioyVar, @NonNull List<rz> list, @Nullable com.bytedance.sdk.openadsdk.core.twf.kgy.kgy kgyVar, @Nullable long j, @Nullable String str, String str2) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (rz rzVar : list) {
            if (rzVar != null && (!rzVar.uq() || rzVar.rz())) {
                arrayList.add(rzVar.ahm());
                rzVar.p_();
            }
        }
        return arrayList.isEmpty() ? arrayList : new com.bytedance.sdk.openadsdk.core.twf.rz.rz(arrayList, ioyVar).kgy(kgyVar).kgy(j).ahm(str).kgy(str2).kgy();
    }

    public static List<com.bytedance.sdk.openadsdk.core.twf.ahm.kgy> rz(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new com.bytedance.sdk.openadsdk.core.twf.ahm.kgy.C0264kgy(jSONObjectOptJSONObject.optString("content"), jSONObjectOptJSONObject.optLong("trackingMilliseconds", 0L)).kgy());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void yo() {
        if (ahm.compareAndSet(false, true)) {
            Map<String, ahm> map = kgy;
            HashSet<Map.Entry> hashSet = new HashSet(map.entrySet());
            map.clear();
            for (Map.Entry entry : hashSet) {
                if (entry != null) {
                    kgy((String) entry.getKey(), (ahm) entry.getValue(), true);
                }
            }
            ahm.set(false);
        }
    }

    public boolean uq() {
        return this.noq;
    }

    public rz(String str, EnumC0265rz enumC0265rz, Boolean bool) {
        this.rz = str;
        this.ct = enumC0265rz;
        this.uq = bool.booleanValue();
    }

    public boolean rz() {
        return this.uq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ahm(final boolean z, final String str, final String str2, final ahm ahmVar, final String str3, final boolean z2) {
        ioy ioyVar;
        if (ahmVar == null || (ioyVar = ahmVar.kgy) == null) {
            return;
        }
        final boolean zUg = ioyVar.ug();
        final String str4 = zUg ? "dsp_track_link_result" : "track_link_result";
        com.bytedance.sdk.openadsdk.uq.rz.kgy(new com.bytedance.sdk.component.gf.ahm.rz(str4) { // from class: com.bytedance.sdk.openadsdk.core.twf.ahm.rz.3
            @Override // java.lang.Runnable
            public void run() {
                final JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", ahmVar.ahm);
                    jSONObject.put("success", z);
                    jSONObject.put("url", str3);
                    if (zUg) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put(TTContentsEventConstants.Params.EVENT_PROPERTY_DESCRIPTION, str);
                        }
                        float f = ahmVar.rz;
                        if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, ((double) Math.round(f * 100.0f)) / 100.0d);
                        }
                    }
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+CyGF/J91YFJ3Fie", "be8+gTeuaMSLT8UZ3w==", "Sfsj", Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
                }
                com.bytedance.sdk.openadsdk.uq.rz.kgy(System.currentTimeMillis(), ahmVar.kgy, str2, str4, new com.bytedance.sdk.openadsdk.dg.ahm.kgy() { // from class: com.bytedance.sdk.openadsdk.core.twf.ahm.rz.3.1
                    @Override // com.bytedance.sdk.openadsdk.dg.ahm.kgy, com.bytedance.sdk.openadsdk.dg.ahm.ahm
                    public JSONObject kgy() {
                        if (!z2) {
                            return null;
                        }
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("retry", true);
                            return jSONObject2;
                        } catch (Throwable th2) {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+CyGF/J91YFJ3Fie", "be8+gTeuaMSLT8UZ31Xx", "XOs5pQK7Q9SPRPNcmBA=", 243);
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.dg.ahm.kgy, com.bytedance.sdk.openadsdk.dg.ahm.ahm
                    public JSONObject rz() {
                        return jSONObject;
                    }
                });
            }
        });
    }

    public static void ahm(ioy ioyVar, @NonNull List<rz> list, @Nullable com.bytedance.sdk.openadsdk.core.twf.kgy.kgy kgyVar, @Nullable long j, @Nullable String str, String str2) {
        kgy(ioyVar, list, kgyVar, j, str, null, str2);
    }

    public String ahm() {
        return this.rz;
    }

    public static boolean kgy(ioy ioyVar, @NonNull List<rz> list, @Nullable com.bytedance.sdk.openadsdk.core.twf.kgy.kgy kgyVar, @Nullable long j, @Nullable String str, ahm ahmVar, @Nullable String str2) {
        List<String> listKgy = kgy(ioyVar, list, kgyVar, j, str, str2);
        kgy(listKgy, ahmVar);
        return !listKgy.isEmpty();
    }

    public static void kgy(List<String> list, ahm ahmVar) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (!TextUtils.isEmpty(str)) {
                kgy(str, ahmVar, false);
            }
        }
    }

    private static void kgy(final String str, final ahm ahmVar, final boolean z) {
        com.bytedance.sdk.component.fi.ahm.ahm ahmVarRz = com.bytedance.sdk.openadsdk.sx.ahm.ahm().rz().rz();
        if (ahmVarRz == null) {
            return;
        }
        ahmVarRz.kgy(true);
        ahmVarRz.rz(str);
        ahmVarRz.ahm(new com.bytedance.sdk.component.fi.kgy.kgy() { // from class: com.bytedance.sdk.openadsdk.core.twf.ahm.rz.2
            @Override // com.bytedance.sdk.component.fi.kgy.kgy
            public void kgy(com.bytedance.sdk.component.fi.ahm.rz rzVar, com.bytedance.sdk.component.fi.ahm ahmVar2) {
                String str2;
                boolean z2;
                ahm ahmVar3 = ahmVar;
                if (ahmVar3 == null || ahmVar3.kgy == null) {
                    return;
                }
                String str3 = null;
                if (ahmVar2 == null || !ahmVar2.noq()) {
                    if (ahmVar2 != null) {
                        str3 = ahmVar2.kgy() + ":" + ahmVar2.ahm();
                        if (!z && (ahmVar2.kgy() <= 300 || ahmVar2.kgy() >= 400)) {
                            rz.kgy.put(str, ahmVar);
                        }
                    }
                    str2 = str3;
                    z2 = false;
                } else {
                    str2 = null;
                    z2 = true;
                }
                rz.ahm(z2, str2, ftg.rz(ahmVar.kgy.uju()), ahmVar, str, z);
                if (!z2 || rz.kgy.isEmpty()) {
                    return;
                }
                rz.yo();
            }

            @Override // com.bytedance.sdk.component.fi.kgy.kgy
            public void kgy(com.bytedance.sdk.component.fi.ahm.rz rzVar, IOException iOException) {
                ioy ioyVar;
                ahm ahmVar2 = ahmVar;
                if (ahmVar2 != null && (ioyVar = ahmVar2.kgy) != null) {
                    rz.ahm(false, iOException != null ? iOException.getMessage() : null, ftg.rz(ioyVar.uju()), ahmVar, str, z);
                }
                if (z || ahmVar == null) {
                    return;
                }
                rz.kgy.put(str, ahmVar);
            }
        });
    }

    public static List<rz> kgy(JSONArray jSONArray) {
        return kgy(jSONArray, false);
    }

    public static List<rz> kgy(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(new kgy(strOptString).kgy(z).kgy());
                }
            }
        }
        return arrayList;
    }
}
