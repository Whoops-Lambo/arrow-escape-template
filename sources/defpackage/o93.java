package defpackage;

import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o93 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebView b;

    public /* synthetic */ o93(WebView webView, int i) {
        this.a = i;
        this.b = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        WebView webView = this.b;
        switch (i) {
            case 0:
                webView.setVisibility(0);
                break;
            default:
                webView.destroy();
                break;
        }
    }
}
