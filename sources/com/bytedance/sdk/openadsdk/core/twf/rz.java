package com.bytedance.sdk.openadsdk.core.twf;

import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.unity3d.services.UnityAdsConstants;
import defpackage.nj;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class rz {
    protected int ahm;
    private ioy at;
    protected String ct;
    protected String fi;
    protected int kgy;
    protected List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> noq;
    private String ra;
    protected com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy rz;
    protected com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm uq;
    protected List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> yo;
    private final AtomicBoolean nu = new AtomicBoolean(false);
    protected String gf = "endcard_click";

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.twf.rz$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] kgy;

        static {
            int[] iArr = new int[com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm.values().length];
            kgy = iArr;
            try {
                iArr[com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+CyGFw==", "be8+gTG5esiVWNRYyEA=", "B+0hnA21fZk=", -1);
            }
            try {
                kgy[com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+CyGFw==", "be8+gTG5esiVWNRYyEA=", "B+0hnA21fZk=", -1);
            }
            try {
                kgy[com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e3, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+CyGFw==", "be8+gTG5esiVWNRYyEA=", "B+0hnA21fZk=", -1);
            }
        }
    }

    public static rz ahm(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        String strOptString = jSONObject.optString("creativeType", com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy.NONE.toString());
        String strOptString2 = jSONObject.optString("resourceType", com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm.HTML_RESOURCE.toString());
        String strOptString3 = jSONObject.optString("contentUrl");
        String strOptString4 = jSONObject.optString("clickThroughUri");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            arrayList.add(new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.kgy(jSONArrayOptJSONArray.optString(i)).kgy());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
            arrayList2.add(new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.kgy(jSONArrayOptJSONArray2.optString(i2)).kgy());
        }
        return new rz(iOptInt, iOptInt2, com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy.valueOf(strOptString), com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm.valueOf(strOptString2), strOptString3, arrayList, arrayList2, strOptString4);
    }

    private static float kgy(com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm ahmVar, com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy enumC0266kgy) {
        int i = AnonymousClass1.kgy[ahmVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1.2f;
            }
            if (i != 3) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            return 1.0f;
        }
        if (com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy.JAVASCRIPT.equals(enumC0266kgy)) {
            return 1.0f;
        }
        if (com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy.IMAGE.equals(enumC0266kgy)) {
            return 0.8f;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public String ct() {
        return this.ct;
    }

    public String rz() {
        int i = AnonymousClass1.kgy[this.uq.ordinal()];
        if (i == 1) {
            com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy enumC0266kgy = this.rz;
            if (enumC0266kgy == com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy.IMAGE) {
                return nj.q(new StringBuilder("<html><head></head><body style=\"margin:0;padding:0\"><img src=\""), this.ct, "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>");
            }
            if (enumC0266kgy == com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy.JAVASCRIPT) {
                return nj.q(new StringBuilder("<script src=\""), this.ct, "\"></script>");
            }
            return null;
        }
        if (i == 2) {
            return this.ct;
        }
        if (i != 3) {
            return null;
        }
        StringBuilder sb = new StringBuilder("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"");
        sb.append(this.kgy);
        sb.append("\" height=\"");
        sb.append(this.ahm);
        sb.append("\" src=\"");
        return nj.q(sb, this.ct, "\"></iframe>");
    }

    public String uq() {
        if (this.uq == com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm.STATIC_RESOURCE && this.rz == com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy.IMAGE) {
            return this.ct;
        }
        return null;
    }

    public rz(int i, int i2, com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy enumC0266kgy, com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm ahmVar, String str, List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> list, List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> list2, String str2) {
        this.noq = new ArrayList();
        this.yo = new ArrayList();
        this.kgy = i;
        this.ahm = i2;
        this.rz = enumC0266kgy;
        this.uq = ahmVar;
        this.ct = str;
        this.noq = list;
        this.yo = list2;
        this.fi = str2;
    }

    public void kgy(long j) {
        com.bytedance.sdk.openadsdk.core.twf.ahm.rz.kgy(null, this.noq, null, j, this.ra, new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm(this.gf, this.at), null);
    }

    public static float kgy(int i, int i2, int i3, int i4, com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm ahmVar, com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy enumC0266kgy) {
        if (i2 == 0 || i4 == 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f = i;
        float f2 = i3;
        return kgy(ahmVar, enumC0266kgy) / ((Math.abs((f - f2) / f) + Math.abs((f / i2) - (f2 / i4))) + 1.0f);
    }

    public int kgy() {
        return this.kgy;
    }

    public void kgy(String str) {
        this.ra = str;
    }

    public void kgy(ioy ioyVar) {
        this.at = ioyVar;
    }

    public void ahm(long j) {
        if (this.nu.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm((ioy) null, this.yo, (com.bytedance.sdk.openadsdk.core.twf.kgy.kgy) null, j, this.ra, (String) null);
        }
    }

    public int ahm() {
        return this.ahm;
    }
}
