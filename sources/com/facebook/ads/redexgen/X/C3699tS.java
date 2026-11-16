package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.tS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C3699tS extends WebViewClient {
    public static byte[] A05;
    public final WeakReference<C2055Hi> A02;
    public final WeakReference<InterfaceC3696tP> A03;
    public final WeakReference<C3691tK> A04;
    public final InterfaceC3695tO A01 = new InterfaceC3695tO() { // from class: com.facebook.ads.redexgen.X.F5
        @Override // com.facebook.ads.redexgen.X.InterfaceC3695tO
        public final boolean ABN(String str) {
            return C3699tS.A04(str);
        }
    };
    public WeakReference<InterfaceC3697tQ> A00 = new WeakReference<>(null);

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{54, 55, 68, 74, 73, 15, 55, 65, 54, 67, 64, 39, 52, 37, 39, 41, 58, 47, 60, 47, 58, 63, 51, 64, 54, 68, 65, 59, 54, 0, 59, 64, 70, 55, 64, 70, 0, 51, 53, 70, 59, 65, 64, 0, 40, 27, 23, 41, 9, 22, 12, 26, 23, 17, 12, -42, 17, 22, 28, 13, 22, 28, -42, 11, 9, 28, 13, 15, 23, 26, 33, -42, -22, -6, -9, -1, -5, -23, -22, -12, -19, 7, 23, 20, 28, 24, 10, 23, 4, 11, 6, 17, 17, 7, 6, 8, 16, 4, 26, 23, 17, -54, -57, -38, -57, 49, 54, 60, 45, 54, 60, -36, -39, -45, -95, -121, -30, -48, -51, -54, -31, -44, -48, -30};
    }

    public C3699tS(WeakReference<C2055Hi> weakReference, WeakReference<InterfaceC3696tP> weakReference2, WeakReference<C3691tK> weakReference3) {
        this.A02 = weakReference;
        this.A03 = weakReference2;
        this.A04 = weakReference3;
    }

    private void A02(String str, C2055Hi c2055Hi) {
        c2055Hi.A08().ABz(A00(11, 11, 101), AbstractC3223lf.A09, new C3224lg(A00(111, 5, 6) + str));
    }

    private boolean A03(WebView webView, String str) {
        Intent intent;
        String strA00 = A00(116, 8, 10);
        C2055Hi c2055Hi = this.A02.get();
        if (c2055Hi != null) {
            if ((F4.A0A && (TextUtils.isEmpty(str) || A00(0, 11, 116).equals(str))) || !this.A01.ABN(str)) {
                return true;
            }
            try {
                Uri uri = AbstractC3448pP.A00(str);
                String scheme = uri.getScheme();
                try {
                    boolean zA13 = C3300mv.A13(c2055Hi);
                    String strA01 = A00(48, 33, 71);
                    String strA02 = A00(22, 26, 113);
                    String strA03 = A00(105, 6, 103);
                    if (zA13) {
                        if (!F4.A0C.contains(scheme) && !A00(101, 4, 5).equals(scheme)) {
                            if (strA03.equalsIgnoreCase(scheme)) {
                                intent = Intent.parseUri(str, 1);
                                intent.setComponent(null);
                                intent.setSelector(null);
                            } else {
                                intent = new Intent(strA02, uri);
                            }
                            intent.addCategory(strA01);
                            if (Build.VERSION.SDK_INT >= 30) {
                                intent.setFlags(268436480);
                            } else {
                                intent.setFlags(268435456);
                            }
                            try {
                                if (!C3434p8.A0F(c2055Hi, intent)) {
                                    A02(str, c2055Hi);
                                }
                                return true;
                            } catch (C3432p6 unused) {
                                if (strA03.equals(scheme)) {
                                    String stringExtra = intent.getStringExtra(A00(81, 20, 68));
                                    if (!TextUtils.isEmpty(stringExtra)) {
                                        if (!C3434p8.A0F(c2055Hi, new Intent(strA02, AbstractC3448pP.A00(stringExtra)))) {
                                            A02(str, c2055Hi);
                                        }
                                        return true;
                                    }
                                }
                                C3224lg c3224lg = new C3224lg(A00(111, 5, 6) + str);
                                c3224lg.A05(1);
                                c2055Hi.A08().AC0(A00(11, 11, 101), AbstractC3223lf.A06, c3224lg);
                                return true;
                            }
                        }
                        return false;
                    }
                    if (!F4.A0A || !strA03.equalsIgnoreCase(scheme)) {
                        if ((F4.A0A && AbstractC3487q2.A04(str)) || !F4.A0C.contains(scheme)) {
                            return C3434p8.A0F(c2055Hi, new Intent(strA02, uri));
                        }
                    } else {
                        Intent uri2 = Intent.parseUri(str, 1);
                        uri2.addCategory(strA01);
                        uri2.setComponent(null);
                        uri2.setSelector(null);
                        PackageManager packageManager = c2055Hi.getPackageManager();
                        if (packageManager != null && packageManager.resolveActivity(uri2, 65536) != null && C3434p8.A0F(c2055Hi, uri2)) {
                            webView.goBack();
                            return true;
                        }
                    }
                    return false;
                } catch (Exception e) {
                    c2055Hi.A08().AC0(strA00, AbstractC3223lf.A2d, new C3224lg(e));
                    c2055Hi.A0F().AAg(e.toString());
                }
            } catch (SecurityException e2) {
                c2055Hi.A08().AC0(strA00, AbstractC3223lf.A2d, new C3224lg(e2));
                return true;
            }
        } else {
            return false;
        }
    }

    public static /* synthetic */ boolean A04(String str) {
        return true;
    }

    public final void A05(WeakReference<InterfaceC3697tQ> weakReference) {
        this.A00 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C3691tK timingLogger = this.A04.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        InterfaceC3696tP interfaceC3696tP = this.A03.get();
        if (interfaceC3696tP != null) {
            interfaceC3696tP.AGC(str);
        }
        InterfaceC3697tQ interfaceC3697tQ = this.A00.get();
        if (interfaceC3697tQ != null) {
            interfaceC3697tQ.AE7(webView.canGoBack());
            interfaceC3697tQ.AF0(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC3696tP listener = this.A03.get();
        if (listener != null) {
            listener.AGE(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C2055Hi c2055Hi = this.A02.get();
        if (c2055Hi != null) {
            StringBuilder sb = new StringBuilder();
            String strA00 = A00(0, 0, 27);
            String errorMessage = AbstractC3487q2.A01(i, sb.append(strA00).append(str).toString(), strA00 + str2);
            c2055Hi.A0F().AAd(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C2055Hi c2055Hi = this.A02.get();
        if (c2055Hi != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb = new StringBuilder();
            String strA00 = A00(0, 0, 27);
            String errorMessage = AbstractC3487q2.A01(errorCode, sb.append(strA00).append((Object) webResourceError.getDescription()).toString(), strA00 + webResourceRequest.getUrl());
            c2055Hi.A0F().AAd(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C2055Hi context = this.A02.get();
        if (context != null) {
            context.A0F().AAe();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C2055Hi context = this.A02.get();
        if (context != null) {
            context.A0F().AAf();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC3704tX.A0D(AbstractC3223lf.A2e);
        InterfaceC3696tP listener = this.A03.get();
        if (listener != null) {
            listener.AGl();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A03(webView, str);
    }
}
