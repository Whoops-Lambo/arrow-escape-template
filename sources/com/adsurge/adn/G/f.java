package com.adsurge.adn.G;

import android.content.Context;
import android.os.Build;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adsurge.adn.X.AbstractC1629b;
import com.adsurge.adn.p011c0.g;
import com.facebook.login.a0;
import com.ironsource.G5;
import defpackage.mc3;
import defpackage.nj;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class f extends com.adsurge.adn.F.e {
    public final com.adsurge.adn.G.a d = new com.adsurge.adn.G.a();
    public final Set e = new HashSet();
    public final List f = new ArrayList();
    public CountDownLatch g = new CountDownLatch(1);
    public String h;
    public volatile WebView i;
    public volatile boolean j;
    public volatile boolean k;
    public volatile boolean l;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends WebViewClient {
        public a() {
        }

        public final /* synthetic */ void a(WebView webView, String str) {
            if (f.this.l || webView != f.this.i) {
                return;
            }
            boolean zEquals = "true".equals(str);
            f fVar = f.this;
            if (!zEquals) {
                fVar.a(3, "WebView runtime 注入失败: " + str);
            } else {
                fVar.k = true;
                f.this.j = false;
                f.this.g.countDown();
                f.this.i();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(final WebView webView, String str) {
            if (f.this.l || webView != f.this.i) {
                return;
            }
            webView.evaluateJavascript(nj.q(new StringBuilder(), f.this.h, "\n;Boolean(window.__wvjs__);"), new ValueCallback() { // from class: cd3
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    this.a.a(webView, (String) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            f.this.a(4, "WebView 渲染进程已退出，didCrash=" + renderProcessGoneDetail.didCrash() + ", priority=" + renderProcessGoneDetail.rendererPriorityAtExit());
            f.this.h();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b extends WebChromeClient {
        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
                consoleMessage.message();
                consoleMessage.sourceId();
                consoleMessage.lineNumber();
                return true;
            }
            return true;
        }
    }

    @Override // com.adsurge.adn.F.e
    public void e() {
        a((g.a) null, true);
    }

    public final void a(Context context) {
        try {
            String strA = AbstractC1629b.a("-cb54EVyZiMf_C342JULHxzvXJCTFUGeDvAee7S3fzc4n5VyFM6E3va7oXSWd4PbVA9gyN4M61sY4-w4uhjNvI9NXy3_V1prlnIGdRTgeAp_xR_KzdFkyU-VIPslER8A9nweNj0aKiPDDUEAlW-1IoiuCcp_0xiS2exonLqwwazujpUskBWn1gTzk1O__csHFwKi-H2kxtW9tcGKX_ukzrflbo7S-6EcCm2MTq5w9_F9_vQXBUeIb6stXypT9CJleBkp5oS9zKVimzcXnd8DJI3bfilN_1DVTLoWwz47E_LUTVQpmvTlrAZuJ5RyHbG4HUTyM9C_VpYtn8uN6LLWthiiwQQj9udy9U9_041-n385Z3XjyrE-J1yLT0PhHjLEaB-gxxwTo0u0OGgIZZc13WGTREAvey45cKIs8AO46Zm6v1c9uRNX5ym9UJyXdXWnzn7SfmFIn732ZwNv2dUIQPlDwybq6nfdATc86rMs1jUS9hrj9PrWQfBROjZApA3WsdAevCbbGg4sKTjE9qJEId1R-l3vKLkDOf2ipmtbm9M24nUlSmjVTARNcnipedZ05bmdeZqqvZVy5hKm5odroteekVKnbFVRtXWXksDUp0dTWPGAf2eob6LfEMmg2_EeaPNy5u0AHP850PKNZUhB2ld8-r5A2jIHsnHpcG5XPtHYK5gVaJmq9DRqHVfhqoYv7asmN6EPB47hkC4aVHoXR3aC26vnVS6NzbtanMDw7pZFBGuBh_RlsnMWL2IFlDp0lBWL2ss4LSxbW5pILAkxiAdlgnBeOZ8Be0Zom03C99dsJ4rQszbHd8g4ARKwtLMNp0-mXMPAZjZz6nIV--Ub5L_6F6YUC9SZWa0N8uJafwSy6INEOUKQCnPjmUL4jIZl5gr4r6PLuYWxPed8DH4M-LTPN6GqPYuxIm9_gzEciSyV1dahDx3Xq_Ees3Ni3al7Nd9Cahuc0RwSemKM4Yp5tht_hDf-9FuIBNOjdq4E85LK4DXsWCH-0BEn4rW-wIk76N5cdAWhHTrsznNbHmR3Wii1EkfDxFkvoLaGKB2i2GLG2lm0r4kye-a6iGSlsbPMTxJLpKf4-Cp2MDXVQnY10SvxJeEaDBLcFFqBE8NzFDqN38QMYIZmyhPsCydc4mYMOEToxSUwBr9THNULjF9iXfjIGbMAyDT5fN0vDNcD9C-bGxArSfTnOn59gXNBargVRalGUB3T7j2xA0m2GUTa3fELc-MYKvjx67Rwbpe9GGtB0k0W-2Z01esg3XSyI4OWRdBOVNTd1AYJ5w6Iw0hAbHphhrtj5ugDnraC4dJQNCN6ygA_zJE7jborxqiGa3_dQzpkmQmIahBwwrexp4cwmpT7QRyiwT_9GC0nSbk7LqnzetrgOOZxv5446zuKo1qkPuoemX4sEwV0XYePXmEZF8S1_l-0Iay78MNsWFnzsRq6gIWwuKNIOjvqbTWw5DmeZjB1ObRvRdTC9Lu7uFIq-mGsBZ1-9uXv34CuRbkbYJPLm4xMmttcgfYGdCG7LrVOG_84U9HkMlHKtHMBRyyvStg5IuaEkrelwzR2mNDVauFEBvs_zhqN5KkEtn4G-KCLOGU7VIN2t9isFp2ckwS70UfNLwrXiJV7Wgl44JGoIsrinv45IDLhDIzfKBBCD5c9RSoaHAu20hw5RmulwFAo3Yg3tez-KVstjkkkZBKlvw2E_9Hqmmkjytpjvxu2hulmxCn4P38r0KJb4Posp9s6Za74gRFXWdqOFNL1GOrEwiy6QJtBep7okycE4aT1mD5OTLO49xYcW5wsOLnusUy9E_evKSBaiD7l2INc-lohzFKloaGmYtZoTVgCzDOJna6sstIj82XGLUJCBTdh3mC1DkmvxSMRhm2FD1rMFJz791Kt5-H9gWAtuS9cqPk5fPwN5Br-AkgQIVGI0FGtCRUuS4XaijQO4p_9y1rPiyrb8klJiep8YsDFgtu3VAGf5-cYIbCTBdCF2UxWDGc-jnQ9celCtBNIv-Z0SJMdEJsaWKSpXE0ns6E4L9sgUW00O9oo_uSZTyBs-oxRjxp3-QiT_JIyDWeh9EpL5yjJFp0wajRRP8CjU5S-eZ4ITkM8FbhRtWeWrjkO0989shjkkBZcOpqN0UUjfarryytD8Ri4a0cff7PlRqWVlosKGwrhLKJtwTSyLpmZ0KCxlsasWwQNgxnS3LmTHXYIAS-xLzllt0AL2lNL939FIRQtu5u0LDksMqmIlJsOiE-F4PJbcHTTK6U6ppCavVi5rC3i1iEKlsMDyxon-UM1FWjcXDIwAzGCQ9oS6OidBe3sV8I3AdLdaHALB43dRb7Fj1cGv2T7cKDek6bf99MAbo7FTWhk7ySfQb39AB0oh0FSOZDdW5lsIYcNqMkuq2hLCpqaF1tLsdbU0aXe15E5H9epXPOui4ZFZbfwQULa27vKLYLf1zlERycTPw6gqV68sJJS7Vk6ksZsct0XH32-igLumAMTYqjacPGKaepVEXd7INR0p4mQuD2JjDf9ygp7kAQcC1AjEmqlzTMREwnenL_fohS-OM2MfEtw7r8tSE4pfLa5qvoj4Ud5OBHWvhhTZV-Meo20Y9DNBe82iP4wPr11ERK4dn6mecTkRQI7manD8GmUBjOEcA");
            this.h = strA;
            if (strA == null) {
                a(5, "WebView runtime bootstrap 解密失败");
                return;
            }
            WebView webView = new WebView(context);
            webView.getSettings().setJavaScriptEnabled(true);
            if (Build.VERSION.SDK_INT >= 26) {
                webView.setRendererPriorityPolicy(2, false);
            }
            webView.setWebViewClient(new a());
            webView.setWebChromeClient(new b());
            webView.addJavascriptInterface(this.d, "tpljsb");
            this.i = webView;
            webView.loadDataWithBaseURL(null, "<!doctype html><html><body></body></html>", "text/html", G5.O, null);
        } catch (Throwable th) {
            a(2, "无法创建 WebView runtime：" + th);
        }
    }

    public final /* synthetic */ void b(String str, String str2) {
        if (this.d.c(str)) {
            try {
                WebView webView = this.i;
                if (!g() || webView == null) {
                    th = new IllegalStateException("WebView runtime is not ready");
                } else {
                    webView.evaluateJavascript(str2, null);
                    th = null;
                }
            } catch (Throwable th) {
                th = th;
            }
            if (th != null) {
                this.d.a(str, (Object) null, th);
            }
        }
    }

    @Override // com.adsurge.adn.F.e
    public boolean g() {
        return this.k && !this.l;
    }

    public final void i() {
        Iterator it = this.f.iterator();
        if (it.hasNext()) {
            com.adsurge.adn.F.c.a(it.next());
            throw null;
        }
        this.f.clear();
    }

    public final void j() {
        ArrayList arrayList;
        synchronized (this.e) {
            arrayList = new ArrayList(this.e);
            this.e.clear();
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((e) obj).d();
        }
    }

    public final void h() {
        if (!g()) {
            if ((this.j || this.i != null) && !this.l) {
                return;
            }
            this.l = false;
            this.k = false;
            this.j = true;
            if (this.g.getCount() == 0) {
                this.g = new CountDownLatch(1);
            }
            try {
                a(com.adsurge.adn.J.a.d().a().getApplicationContext());
            } catch (Exception e) {
                a(1, "WebView runtime 创建失败: " + e);
            }
        }
    }

    @Override // com.adsurge.adn.F.e
    public boolean b(int i) throws InterruptedException {
        if (g()) {
            return true;
        }
        this.g.await(i, TimeUnit.MILLISECONDS);
        return g();
    }

    public void b(Object obj) {
        a(obj);
    }

    public void b(e eVar) {
        synchronized (this.e) {
            this.e.remove(eVar);
        }
    }

    public final /* synthetic */ void a(g.a aVar) {
        if (g()) {
            if (aVar != null) {
                aVar.a();
            }
        } else {
            if (aVar != null) {
                this.f.add(aVar);
            }
            h();
        }
    }

    @Override // com.adsurge.adn.F.e
    public com.adsurge.adn.F.d a() {
        if (g()) {
            return e.a(this, this.d);
        }
        return null;
    }

    public void a(Object obj, String str) {
        if (this.d.a(obj, str)) {
            return;
        }
        a(obj, new mc3(7, this, str));
    }

    public final /* synthetic */ void a(String str) {
        WebView webView = this.i;
        if (webView != null) {
            webView.evaluateJavascript(str, null);
        }
    }

    public void a(String str, String str2) {
        a((Runnable) new a0(10, this, str, str2));
    }

    public boolean a(e eVar) {
        synchronized (this.e) {
            try {
                if (!g()) {
                    return false;
                }
                this.e.add(eVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(g.a aVar, boolean z) {
        a((Runnable) new mc3(6, this, aVar));
    }

    public final void a(int i, String str) {
        if (this.l) {
            return;
        }
        this.l = true;
        this.j = false;
        this.g.countDown();
        com.adsurge.adn.p048o1.g.a(i, str);
        j();
        WebView webView = this.i;
        this.i = null;
        if (webView != null) {
            webView.removeJavascriptInterface("tpljsb");
            webView.stopLoading();
            webView.destroy();
        }
    }
}
