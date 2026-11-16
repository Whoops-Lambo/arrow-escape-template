package com.adsurge.adn.E1;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ValueCallback;
import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class i implements p {
    public final k a;
    public final h c;
    public final boolean d;
    public final String e;
    public boolean f;
    public final m g = new m();
    public final g b = new g();

    @Override // com.adsurge.adn.E1.p
    public void b() {
        this.f = true;
        if (this.d) {
            y.a().a(this.c, this.e);
        } else {
            this.c.destroy();
        }
    }

    @Override // com.adsurge.adn.E1.p
    public void a(l lVar) {
        this.g.b(lVar);
        this.g.a(this.c.g());
        this.a.a(this.g);
        this.b.a(this.g);
    }

    @Override // com.adsurge.adn.E1.p
    public void addJavascriptInterface(Object obj, String str) {
        this.c.addJavascriptInterface(obj, str);
    }

    @Override // com.adsurge.adn.E1.p
    public void c(boolean z) {
        this.a.a(z);
    }

    @Override // com.adsurge.adn.E1.p
    public boolean canGoBack() {
        return this.c.canGoBack();
    }

    @Override // com.adsurge.adn.E1.p
    public void d(boolean z) {
        this.a.b(z);
    }

    @Override // com.adsurge.adn.E1.p
    public void e(boolean z) {
        this.c.e(z);
    }

    @Override // com.adsurge.adn.E1.p
    public void goBack() {
        this.c.goBack();
    }

    @Override // com.adsurge.adn.E1.p
    public void loadUrl(String str) {
        this.c.loadUrl(str);
        this.g.a(str);
    }

    @Override // com.adsurge.adn.E1.p
    public void onPause() {
        h hVar = this.c;
        if (hVar == null) {
            return;
        }
        try {
            hVar.getClass().getMethod(C4664b4.i.t0, null).invoke(this.c, null);
        } catch (Exception unused) {
        }
    }

    @Override // com.adsurge.adn.E1.p
    public void onResume() {
        h hVar = this.c;
        if (hVar == null) {
            return;
        }
        try {
            hVar.getClass().getMethod(C4664b4.i.u0, null).invoke(this.c, null);
        } catch (Exception unused) {
        }
    }

    @Override // com.adsurge.adn.E1.p
    public void setFocusable(boolean z) {
        this.c.setFocusable(z);
    }

    @Override // com.adsurge.adn.E1.p
    public void setFocusableInTouchMode(boolean z) {
        this.c.setFocusableInTouchMode(z);
    }

    public i(com.adsurge.adn.u1.c cVar, Context context, String str, boolean z, d dVar) {
        h hVar;
        h hVarA;
        this.a = new k(this, cVar, dVar);
        this.d = z;
        this.e = str;
        if (z && !TextUtils.isEmpty(str)) {
            hVarA = y.a().a(context, str);
        } else {
            try {
                hVar = new h(context);
            } catch (Resources.NotFoundException unused) {
                hVar = new h(context.getApplicationContext());
            }
            hVarA = hVar;
        }
        if (hVarA != null) {
            hVarA.a(this.a);
            hVarA.a(this.b);
            hVarA.a(cVar);
        }
        this.c = hVarA;
        this.a.a();
    }

    public void finalize() {
        try {
            super.finalize();
        } catch (Throwable unused) {
        }
    }

    @Override // com.adsurge.adn.E1.p
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            str2 = n.a(str2);
        } catch (Exception unused) {
        }
        this.c.loadDataWithBaseURL(str, str2, str3, str4, str5);
        this.g.a(str);
    }

    @Override // com.adsurge.adn.E1.p
    public View c() {
        return this.c;
    }

    @Override // com.adsurge.adn.E1.p
    public void b(boolean z) {
        this.c.b(z);
    }

    @Override // com.adsurge.adn.E1.p
    public void a(com.adsurge.adn.F1.g gVar) {
        this.a.a(gVar);
        this.b.a(gVar);
        this.c.a(gVar);
    }

    @Override // com.adsurge.adn.E1.p
    public void a(boolean z) {
        this.c.setHorizontalScrollBarEnabled(z);
        this.c.setVerticalScrollBarEnabled(z);
    }

    @Override // com.adsurge.adn.E1.z
    public void a(String str) {
        a(str, null);
    }

    public void a(String str, ValueCallback valueCallback) {
        if (this.c.h()) {
            return;
        }
        try {
            this.c.a(str, valueCallback);
        } catch (Exception unused) {
        }
    }

    @Override // com.adsurge.adn.E1.p
    public A a() {
        return this.c.a();
    }
}
