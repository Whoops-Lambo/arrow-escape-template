package com.adsurge.adn.M1;

import android.view.MotionEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.adsurge.adn.E1.e;
import com.adsurge.adn.N.d;
import com.adsurge.adn.V.g;
import com.adsurge.adn.u1.c;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class a extends e {
    public c a;
    public float b;
    public boolean c = false;
    public long d = 0;
    public float e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public final List h = new ArrayList();
    public final List i = new ArrayList();

    @Override // com.adsurge.adn.E1.e, com.adsurge.adn.E1.l
    public void c(String str) {
        this.c = true;
    }

    public a(c cVar) {
        float fFloatValue;
        Float fA = com.adsurge.adn.J.a.d().c().a();
        if (fA != null) {
            fFloatValue = fA.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        this.b = fFloatValue;
        if (fFloatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.b = 1.0f;
        }
        this.a = cVar;
    }

    public void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return;
                    }
                } else {
                    float x = motionEvent.getX() - this.e;
                    float y = motionEvent.getY() - this.f;
                    this.g += (float) Math.sqrt((y * y) + (x * x));
                    this.e = motionEvent.getX();
                    this.f = motionEvent.getY();
                    return;
                }
            }
            long jA = d.b().a();
            long j = this.d;
            a(j, this.g / this.b, jA - j);
            return;
        }
        this.d = d.b().a();
        this.e = motionEvent.getX();
        this.f = motionEvent.getY();
        this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.adsurge.adn.E1.e, com.adsurge.adn.E1.l.a
    public void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest.isForMainFrame()) {
            this.c = false;
        }
    }

    public void a(com.adsurge.adn.Y0.c cVar) {
        if (this.h.isEmpty() && this.i.isEmpty()) {
            return;
        }
        g gVar = new g();
        if (!this.h.isEmpty()) {
            gVar.b(new JSONArray((Collection) this.h).toString());
        }
        if (!this.i.isEmpty()) {
            gVar.a(new JSONArray((Collection) this.i).toString());
        }
        com.adsurge.adn.w1.b.a(6001003, cVar, gVar);
    }

    @Override // com.adsurge.adn.E1.e, com.adsurge.adn.E1.l
    public void a(int i, String str, String str2) {
        this.c = false;
    }

    public final void a(long j, float f, long j2) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("ts", j).put("ds", Math.round(f)).put("du", j2);
            if (this.c) {
                this.h.add(jSONObjectPut);
                Objects.toString(jSONObjectPut);
                com.adsurge.adn.r1.a.a(this.a.h(), j2);
            } else {
                this.i.add(jSONObjectPut);
                Objects.toString(jSONObjectPut);
            }
        } catch (Exception unused) {
        }
    }
}
