package com.adsurge.adn.p055s;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.adsurge.adn.ads.nativead.NativeAdView;
import com.ironsource.C4664b4;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class e {
    public static final JSONObject a;

    static {
        com.adsurge.adn.I0.e eVar = new com.adsurge.adn.I0.e();
        eVar.a("w", 0);
        eVar.a(CmcdData.STREAMING_FORMAT_HLS, 0);
        eVar.a("p", 0.0d);
        a = eVar.a();
    }

    public static String a(NativeAdView nativeAdView, View view, View view2) {
        com.adsurge.adn.I0.e eVar = new com.adsurge.adn.I0.e();
        if (nativeAdView == null) {
            return "";
        }
        eVar.a("flag", a((ViewGroup) nativeAdView, view2).toString());
        eVar.a("choices", a((ViewGroup) nativeAdView, view).toString());
        eVar.a("title", a((ViewGroup) nativeAdView, nativeAdView.getHeadLineView()).toString());
        eVar.a("content", a((ViewGroup) nativeAdView, nativeAdView.getBodyView()).toString());
        eVar.a("icon", a((ViewGroup) nativeAdView, nativeAdView.getIconView()).toString());
        eVar.a(C4664b4.i.G0, a((ViewGroup) nativeAdView, nativeAdView.getCallToActionView()).toString());
        eVar.a("material", a((ViewGroup) nativeAdView, (View) nativeAdView.getMediaView()).toString());
        return eVar.a().toString();
    }

    public static JSONObject a(ViewGroup viewGroup, View view) {
        if (view == null) {
            return a;
        }
        if (!a((View) viewGroup, view)) {
            return a;
        }
        if (view.getVisibility() == 0 && view.isShown()) {
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect) && rect.width() != 0 && rect.height() != 0) {
                return a(view.getWidth(), view.getHeight(), a(view, rect));
            }
            return a(view.getWidth(), view.getHeight(), 0.0d);
        }
        return a(view.getWidth(), view.getHeight(), 0.0d);
    }

    public static double a(View view, Rect rect) {
        int iHeight = rect.height() * rect.width();
        int height = view.getHeight() * view.getWidth();
        if (height <= 0) {
            return 0.0d;
        }
        return ((double) iHeight) / ((double) height);
    }

    public static JSONObject a(int i, int i2, double d) {
        com.adsurge.adn.I0.e eVar = new com.adsurge.adn.I0.e();
        eVar.a("w", String.valueOf(i));
        eVar.a(CmcdData.STREAMING_FORMAT_HLS, String.valueOf(i2));
        eVar.a("p", String.format(Locale.CHINA, "%.2f", Double.valueOf(d)));
        return eVar.a();
    }

    public static boolean a(View view, View view2) {
        if (view2 != null && view != null) {
            if (view == view2) {
                return true;
            }
            for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    return true;
                }
                if (!(parent instanceof View)) {
                    break;
                }
            }
        }
        return false;
    }
}
