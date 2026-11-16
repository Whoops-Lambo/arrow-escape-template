package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Τ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0511 extends AbstractC1149 {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public C0620 f1149;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public M0 f1150;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final WeakHashMap f1151 = new WeakHashMap();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public C0522 f1148 = new C0522();

    /* JADX INFO: renamed from: ﾇ */
    public abstract View mo396(Object obj);

    /* JADX INFO: renamed from: ﾇ */
    public abstract M0 mo397();

    /* JADX INFO: renamed from: ﾇ */
    public abstract void mo398(Object obj, ArrayList arrayList);

    /* JADX INFO: renamed from: ﾒ */
    public abstract InterfaceC0696 mo399();

    static {
        StringFog.decrypt("49XSUEZq3LDAzv9YfWjAscnFzA==\n", "paC+PDUJrtU=\n");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final M0 m502(Object obj) {
        return this.f1148.f1260 ? (M0) this.f1151.get(obj) : this.f1150;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m504(JSONObject jSONObject, Object obj, String str) {
        C0522 c0522 = this.f1148;
        boolean z = c0522.f1265 && !TextUtils.isEmpty(c0522.f1268);
        M0 m0M502 = m502(obj);
        if (m0M502 == null) {
            m0M502 = mo397();
            if (this.f1148.f1260) {
                this.f1151.put(obj, m0M502);
            } else {
                this.f1150 = m0M502;
            }
            m0M502.f3332 = mo399();
        }
        for (WebView webView : m0M502.f183.keySet()) {
            webView.removeOnLayoutChangeListener(m0M502);
            Y0 y0 = (Y0) m0M502.f183.get(webView);
            ArrayList arrayList = m0M502.f181;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                y0.f298.remove((InterfaceC0438) obj2);
            }
        }
        m0M502.f181.clear();
        m0M502.f184 = null;
        m0M502.f183.clear();
        C0522 c0523 = this.f1148;
        String str2 = c0523.f1268;
        List list = c0523.f1267;
        boolean z2 = c0523.f1262;
        boolean z3 = c0523.f1261;
        m0M502.f186 = z;
        m0M502.f182 = new V0(str2, z3);
        m0M502.f185 = z2;
        m0M502.f188 = list;
        m0M502.f187 = str;
        if (!this.f1148.f1263) {
            super.mo352(jSONObject, null, obj);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        mo398(obj, arrayList2);
        List arrayList3 = new ArrayList();
        C0620 c0620 = this.f1149;
        if (c0620 != null) {
            try {
                C1130 c1130 = c0620.f1524;
                C1199 c1199 = c0620.f1522;
                C0890 c0890 = c1199.f3629;
                arrayList3 = (List) c1130.m838(c0890, c0890.f2386, c1199, Collections.singletonList(obj)).f3012;
            } catch (Exception unused) {
                AbstractC0509.m488(StringFog.decrypt("TMD3R/8/hOpSzOlc7jSg/A==\n", "HqWaKItaxY4=\n"), StringFog.decrypt("7WXVlN5XOATcY86Vy1coBMpBzp7bBH8H2njK2w==\n", "qBen+6x3X2E=\n") + c0620.f1523);
                arrayList3 = null;
            }
        }
        String str3 = AbstractC0388.f814;
        HashSet hashSet = new HashSet(arrayList2);
        if (arrayList3 != null) {
            hashSet.addAll(arrayList3);
        }
        ArrayList arrayList4 = new ArrayList(hashSet);
        if (arrayList4.isEmpty() || this.f1148.f1264) {
            View viewMo396 = mo396(obj);
            if (viewMo396 != null) {
                viewMo396.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0547(this, obj));
            }
            if (arrayList4.isEmpty()) {
                super.mo352(jSONObject, null, obj);
                return;
            }
        }
        if (this.f1148.f1259) {
            AbstractC4631n.f410.post(new RunnableC0525(this, obj, arrayList4, jSONObject));
        } else {
            m503(obj, arrayList4);
            super.mo352(jSONObject, (WebView) arrayList4.get(0), obj);
        }
    }

    public AbstractC0511(C0620 c0620) {
        this.f1149 = c0620;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m501(Object obj) {
        WebView webView;
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        Y0 y0 = m502(obj).f184;
        if (y0 != null) {
            webView = (WebView) y0.f299.f201.get();
        } else {
            webView = null;
        }
        mo374(jSONObjectJsonObjectInit, webView, obj);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1149, com.ironsource.adqualitysdk.sdk.i.InterfaceC0696
    /* JADX INFO: renamed from: ｋ */
    public final void mo352(JSONObject jSONObject, View view, Object obj) {
        mo350(jSONObject, (WebView) view, obj);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m500(AbstractC0511 abstractC0511, JSONObject jSONObject, WebView webView, Object obj) {
        super.mo352(jSONObject, webView, obj);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m503(Object obj, ArrayList arrayList) {
        M0 m0M502 = m502(obj);
        m0M502.getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            m0M502.m355((WebView) obj2);
        }
        if (this.f1148.f1266) {
            m502(obj).f187 = Integer.toHexString(((WebView) arrayList.get(0)).hashCode());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1149
    /* JADX INFO: renamed from: ﾒ */
    public final String mo354(Object obj) {
        return m502(obj).f187;
    }
}
