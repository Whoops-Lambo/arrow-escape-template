package com.adsurge.adn.E1;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class v extends e {
    public final com.adsurge.adn.Y0.c a;
    public com.adsurge.adn.u1.c b;
    public String c = null;
    public boolean d = false;
    public boolean e = false;
    public long f = 0;
    public long g = -1;
    public final Deque h = new LinkedList();

    public final void a(int i, String str, int i2, String str2) {
        JSONObject jSONObject;
        if (i == 2) {
            try {
                if (!this.h.isEmpty() && (jSONObject = (JSONObject) this.h.peekLast()) != null && TextUtils.equals(jSONObject.getString("url"), str) && jSONObject.getInt("result") == 1) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        JSONObject jSONObjectPut = new JSONObject().put("t", com.adsurge.adn.N.d.b().a()).put("result", i).put("url", str);
        if (i == 1) {
            jSONObjectPut.put(IronSourceConstants.EVENTS_ERROR_CODE, i2).put("errorMsg", str2);
        }
        this.h.offerLast(jSONObjectPut);
    }

    @Override // com.adsurge.adn.E1.e, com.adsurge.adn.E1.l
    public void c(String str) {
        if (!this.e) {
            this.e = true;
            com.adsurge.adn.w1.b.a(6001002, this.a, Integer.valueOf(this.b.u0()), new com.adsurge.adn.V.h().a(SystemClock.elapsedRealtime() - this.g));
        }
        a(2, str);
    }

    @Override // com.adsurge.adn.E1.e, com.adsurge.adn.E1.l.a
    public void n() {
        com.adsurge.adn.w1.b.a(6001005, this.a, Integer.valueOf((int) (SystemClock.elapsedRealtime() - this.f)));
    }

    @Override // com.adsurge.adn.E1.l.a
    public void onDestroy() {
        if (!this.e) {
            com.adsurge.adn.w1.b.a(6001001, this.a, Integer.valueOf(this.b.u0()), (Integer) 10001, (com.adsurge.adn.Y0.d) new com.adsurge.adn.V.h().a(this.c));
        }
        com.adsurge.adn.w1.b.a(6001004, this.a, Integer.valueOf(this.b.u0()), new com.adsurge.adn.V.h().b(new JSONArray((Collection) this.h).toString()));
        if (this.d) {
            return;
        }
        com.adsurge.adn.w1.b.a(6001006, this.a, Integer.valueOf(this.b.u0()), null, new com.adsurge.adn.V.h().a(this.c), false, Integer.valueOf((int) (SystemClock.elapsedRealtime() - this.f)), null);
    }

    public v(com.adsurge.adn.u1.c cVar) {
        this.a = com.adsurge.adn.Y0.c.a(cVar);
        this.b = cVar;
    }

    @Override // com.adsurge.adn.E1.e, com.adsurge.adn.E1.l
    public void a(String str, Bitmap bitmap) {
        if (!this.d) {
            this.d = true;
            this.g = SystemClock.elapsedRealtime();
            com.adsurge.adn.w1.b.b(6001000, this.a, Integer.valueOf(this.b.u0()));
        }
        a(0, str);
    }

    @Override // com.adsurge.adn.E1.e, com.adsurge.adn.E1.l
    public void a(int i, String str, String str2) {
        if (!this.e) {
            this.e = true;
            com.adsurge.adn.w1.b.a(6001001, this.a, Integer.valueOf(this.b.u0()), Integer.valueOf(i), new com.adsurge.adn.V.h().a(str2));
        }
        a(1, str2, i, str);
    }

    @Override // com.adsurge.adn.E1.e, com.adsurge.adn.E1.l.a
    public void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest == null || webResourceRequest.isForMainFrame()) {
            int statusCode = webResourceResponse == null ? 0 : webResourceResponse.getStatusCode();
            String string = "";
            String reasonPhrase = webResourceResponse == null ? "" : webResourceResponse.getReasonPhrase();
            if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                string = webResourceRequest.getUrl().toString();
            }
            if (!this.e) {
                this.e = true;
                com.adsurge.adn.w1.b.a(6001001, this.a, Integer.valueOf(this.b.u0()), Integer.valueOf(statusCode), new com.adsurge.adn.V.h().a(string));
            }
            a(1, string, statusCode, reasonPhrase);
        }
    }

    public final void a(int i, String str) {
        a(i, str, 0, "");
    }

    @Override // com.adsurge.adn.E1.e, com.adsurge.adn.E1.l.a
    public void a(String str) {
        this.c = str;
        this.f = SystemClock.elapsedRealtime();
    }
}
