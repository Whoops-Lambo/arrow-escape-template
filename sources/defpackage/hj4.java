package defpackage;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzfyp;
import com.google.android.gms.internal.ads.zzfzq;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class hj4 extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzfyp b;

    public /* synthetic */ hj4(zzfyp zzfypVar, int i) {
        this.a = i;
        this.b = zzfypVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i = this.a;
        zzfyp zzfypVar = this.b;
        switch (i) {
            case 0:
                zzfypVar.g(webView, renderProcessGoneDetail);
                break;
            default:
                zzfypVar.g(webView, renderProcessGoneDetail);
                break;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
            case 0:
                return zzfzq.a(webResourceRequest.getUrl().toString());
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.a) {
            case 0:
                return zzfzq.a(str);
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }
}
