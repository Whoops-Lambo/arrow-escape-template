package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class M0 extends AbstractC1149 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static final String f180 = StringFog.decrypt("zDuRyrtJ7gX/FpLytkD8Ng==\n", "m17znNIsmUQ=\n");

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public V0 f182;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public Y0 f184;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public boolean f185;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public boolean f186;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public String f187;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public List f188;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final WeakHashMap f183 = new WeakHashMap();

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public final ArrayList f181 = new ArrayList();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract Object mo353(WebView webView);

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            if (view instanceof WebView) {
                WebView webView = (WebView) view;
                if (this.f183.containsKey(webView)) {
                    m351(webView);
                }
            }
        } catch (Throwable th) {
            AbstractC1290.m905(f180, StringFog.decrypt("fAXSzbzxWXAZGM7ur6hfa000yMOgtlU=\n", "OXegos7RMB4=\n"), th, false);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1149, com.ironsource.adqualitysdk.sdk.i.InterfaceC0696
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void mo350(JSONObject jSONObject, View view, Object obj) {
        jSONObject.remove(AbstractC1219.f3710);
        super.mo350(jSONObject, (WebView) view, obj);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m351(WebView webView) {
        Y0 y0 = (Y0) this.f183.get(webView);
        if (this.f186 && y0.f299.f199) {
            if (!(i1.m383(webView) instanceof P0)) {
                y0.m360();
            }
            V0 v0 = this.f182;
            v0.getClass();
            try {
                AbstractC4631n.m402(new U0(v0, webView));
            } catch (Exception e) {
                AbstractC0509.m488(V0.f216, StringFog.decrypt("dNofHrNtr/9bzQ4FqCOhsVvbTQWubbH0U/4EFLZ35g==\n", "MahtccFNxpE=\n") + e.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m355(WebView webView) {
        if (webView == null || this.f183.containsKey(webView)) {
            return;
        }
        String strDecrypt = StringFog.decrypt("uaKbO78mFh/3\n", "2Mb4V91NLDA=\n");
        WeakHashMap weakHashMap = Y0.f297;
        Y0 y0 = (Y0) weakHashMap.get(webView);
        if (y0 == null) {
            y0 = new Y0(webView, strDecrypt);
            weakHashMap.put(webView, y0);
        }
        if (this.f184 == null) {
            this.f184 = y0;
        }
        this.f183.put(webView, y0);
        L0 l0 = new L0(this);
        this.f181.add(l0);
        y0.f298.add(l0);
        m351(webView);
        webView.addOnLayoutChangeListener(this);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m349(M0 m0, String str) {
        m0.getClass();
        try {
            String strDecode = URLDecoder.decode(str, StringFog.decrypt("5x1DS0Y=\n", "skkFZn6BYyA=\n"));
            if (!TextUtils.isEmpty(strDecode)) {
                return IronSourceNetworkBridge.jsonObjectInit(strDecode);
            }
        } catch (Exception e) {
            String str2 = f180;
            AbstractC0509.m497(str2, str2, StringFog.decrypt("T5fJfp4nUDh+kdJ/iydTPH6E\n", "CuW7EewHN10=\n"), e, null, false);
        }
        return IronSourceNetworkBridge.jsonObjectInit();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1149
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String mo354(Object obj) {
        return this.f187;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1149, com.ironsource.adqualitysdk.sdk.i.InterfaceC0696
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo352(JSONObject jSONObject, WebView webView, Object obj) {
        if (webView != null) {
            try {
                jSONObject.put(AbstractC1219.f3667, webView.getWindowToken() != null);
            } catch (JSONException unused) {
            }
        }
        super.mo352(jSONObject, webView, obj);
    }
}
