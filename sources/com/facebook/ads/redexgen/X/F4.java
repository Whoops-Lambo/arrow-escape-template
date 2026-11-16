package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Canvas;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class F4 extends AbstractC3704tX {
    public static ValueCallback A08;
    public static boolean A09;
    public static boolean A0A;
    public static byte[] A0B;
    public static final Set<String> A0C;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public C2055Hi A04;
    public C3691tK A05;
    public InterfaceC3696tP A06;
    public C3699tS A07;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0B = new byte[]{49, 45, 45, 41, 4, 24, 24, 28, 31};
    }

    static {
        A06();
        A0C = new HashSet(2);
        A09 = false;
        A0A = false;
        A0C.add(A03(0, 4, 4));
        A0C.add(A03(4, 5, 49));
    }

    public F4(C2055Hi c2055Hi, Activity activity, InterfaceC3696tP interfaceC3696tP) {
        super(activity, c2055Hi);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A08(c2055Hi, interfaceC3696tP);
    }

    public F4(C2055Hi c2055Hi, InterfaceC3696tP interfaceC3696tP) {
        super(c2055Hi);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A08(c2055Hi, interfaceC3696tP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC3704tX
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final C3699tS A0H() {
        return new C3699tS(new WeakReference(this.A04), new WeakReference(this.A06), new WeakReference(this.A05));
    }

    private void A05() {
        if (this.A02 > -1 && this.A00 > -1 && this.A01 > -1) {
            this.A05.A05(false);
        }
    }

    public static void A07(int i, int i2, Intent intent) {
        if (A08 != null && i == 1001) {
            A08.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i2, intent));
            A08 = null;
        }
    }

    private void A08(C2055Hi c2055Hi, InterfaceC3696tP interfaceC3696tP) {
        this.A04 = c2055Hi;
        this.A06 = interfaceC3696tP;
        this.A05 = new C3691tK(this);
        A09 = AbstractC3301mw.A03(this.A04);
        A0A = AbstractC3301mw.A04(this.A04);
        WebSettings settings = getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        setWebChromeClient(A0G());
        this.A07 = A0H();
        setWebViewClient(this.A07);
        AbstractC3523qc.A0H(1114, this);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3704tX
    public final WebChromeClient A0G() {
        return new C3698tR(new WeakReference(this.A04), new WeakReference(this.A06), new WeakReference(this.A05));
    }

    public final void A0K(long j) {
        if (this.A00 < 0) {
            this.A00 = j;
        }
        A05();
    }

    public final void A0L(long j) {
        if (this.A01 < 0) {
            this.A01 = j;
        }
        A05();
    }

    public final void A0M(long j) {
        if (this.A02 < 0) {
            this.A02 = j;
        }
        A05();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3704tX, android.webkit.WebView
    public final void destroy() {
        this.A06 = null;
        AbstractC3710td.A03(this);
        super.destroy();
    }

    public long getDomContentLoadedMs() {
        return this.A00;
    }

    public String getFirstUrl() {
        WebHistoryItem itemAtIndex;
        String url;
        WebBackForwardList webBackForwardListCopyBackForwardList = copyBackForwardList();
        if (webBackForwardListCopyBackForwardList.getSize() > 0 && (itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(0)) != null && (url = itemAtIndex.getUrl()) != null) {
            return url;
        }
        String url2 = getUrl();
        return url2 != null ? url2 : A03(0, 0, 102);
    }

    public long getLoadFinishMs() {
        return this.A01;
    }

    public long getResponseEndMs() {
        return this.A02;
    }

    public long getScrollReadyMs() {
        return this.A03;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A03 < 0 && computeVerticalScrollRange() > getHeight()) {
            this.A03 = System.currentTimeMillis();
        }
    }

    public void setBrowserNavigationListener(InterfaceC3697tQ interfaceC3697tQ) {
        this.A07.A05(new WeakReference<>(interfaceC3697tQ));
    }
}
