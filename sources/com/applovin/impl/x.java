package com.applovin.impl;

import com.amazon.device.ads.DTBAdSize;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class x {
    private final String a;
    private final DTBAdSize b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum a {
        VIDEO,
        DISPLAY,
        INTERSTITIAL
    }

    private DTBAdSize a(int i, MaxAdFormat maxAdFormat, String str) {
        try {
            if (a.VIDEO.ordinal() == i) {
                return new DTBAdSize.DTBVideo(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 480, str);
            }
            if (a.DISPLAY.ordinal() == i) {
                return new DTBAdSize(maxAdFormat.getSize().getWidth(), maxAdFormat.getSize().getHeight(), str);
            }
            if (a.INTERSTITIAL.ordinal() == i) {
                return new DTBAdSize.DTBInterstitialAdSize(str);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public x(String str, JSONObject jSONObject, MaxAdFormat maxAdFormat) {
        this.a = str;
        this.b = a(JsonUtils.getInt(jSONObject, "type", a(maxAdFormat).ordinal()), maxAdFormat, str);
    }

    private a a(MaxAdFormat maxAdFormat) {
        return maxAdFormat.isAdViewAd() ? a.DISPLAY : a.INTERSTITIAL;
    }

    public DTBAdSize a() {
        return this.b;
    }
}
