package com.adsurge.adn.E1;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class k extends WebViewClient {
    public final AbstractC1626a a;
    public l b;
    public com.adsurge.adn.F1.g c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.PLAIN_H5.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final void a(int i, String str, String str2) {
        l lVar = this.b;
        if (lVar != null) {
            lVar.a(i, str, str2);
        }
    }

    public void b(boolean z) {
        this.a.b(z);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            sslErrorHandler.cancel();
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        l lVar = this.b;
        if (lVar instanceof l.a) {
            ((l.a) lVar).n();
        }
        return this.a.a(renderProcessGoneDetail) || super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponseA = this.a.a(webResourceRequest);
        if (webResourceRequest != null) {
            webResourceRequest.isForMainFrame();
        }
        if (webResourceRequest != null) {
            webResourceRequest.getUrl();
        }
        return webResourceResponseA == null ? super.shouldInterceptRequest(webView, webResourceRequest) : webResourceResponseA;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean zA = this.a.a(str);
        l lVar = this.b;
        if (lVar != null) {
            lVar.d(str);
        }
        com.adsurge.adn.F1.g gVar = this.c;
        if (gVar != null) {
            gVar.b(str);
        }
        return zA;
    }

    public k(p pVar, com.adsurge.adn.u1.c cVar, d dVar) {
        AbstractC1626a tVar;
        if (a.a[dVar.ordinal()] != 1) {
            if (cVar.N0()) {
                tVar = new c(pVar, cVar);
            } else {
                tVar = new t(pVar, cVar);
            }
            this.a = tVar;
            return;
        }
        this.a = new s(pVar, cVar);
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        this.a.a();
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        l lVar = this.b;
        if (lVar != null) {
            lVar.c(str);
        }
        this.a.b();
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        l lVar = this.b;
        if (lVar != null) {
            lVar.a(str, bitmap);
        }
        this.a.c();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int errorCode;
        String strValueOf;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            if (webResourceError != null) {
                errorCode = webResourceError.getErrorCode();
            } else {
                errorCode = 0;
            }
            String string = null;
            if (webResourceError != null) {
                strValueOf = String.valueOf(webResourceError.getDescription());
            } else {
                strValueOf = null;
            }
            if (webResourceRequest.getUrl() != null) {
                string = webResourceRequest.getUrl().toString();
            }
            a(errorCode, strValueOf, string);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        l lVar = this.b;
        if (lVar != null && (lVar instanceof l.a)) {
            ((l.a) lVar).a(webView, webResourceRequest, webResourceResponse);
        }
    }

    public void a(com.adsurge.adn.F1.g gVar) {
        this.c = gVar;
    }

    public void a(boolean z) {
        this.a.a(z);
    }

    public void a() {
        this.a.a(this);
    }

    public void a(l lVar) {
        this.b = lVar;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
    }
}
