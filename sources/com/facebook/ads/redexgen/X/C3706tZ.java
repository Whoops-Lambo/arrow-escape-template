package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.tZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C3706tZ {
    public static String[] A07 = {"FOFLIt4izaDLaQDOMIXk8qYNT283z5pM", "oiToeohcscvINDKXEsytRf9HFldaqPXB", "4ipPd9h88IiL3d99rWL92oIsRR1k6HBA", "hPx", "0GhefH5NzI2ypbPnqUG75Cq8VmhNX1", "2b6", "snO0JYp8WiAdMwbOevXppfTs6iFhTSIS", "awSLBYFe7Md8cHgboMT9P3Pgh1wlsZGE"};
    public final String A00 = C3706tZ.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<InterfaceC2737df> A03;
    public final WeakReference<InterfaceC3707ta> A04;
    public final WeakReference<C2636c2> A05;
    public final WeakReference<C1991Ev> A06;

    public C3706tZ(C1991Ev c1991Ev, InterfaceC3707ta interfaceC3707ta, C2636c2 c2636c2, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C2055Hi c2055Hi) {
        this.A06 = new WeakReference<>(c1991Ev);
        this.A04 = new WeakReference<>(interfaceC3707ta);
        this.A05 = new WeakReference<>(c2636c2);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c2055Hi.A0F());
    }

    private InterfaceC2737df A00() {
        InterfaceC2737df funnel = this.A03.get();
        if (funnel == null) {
            return new C2194Mx();
        }
        return funnel;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return AbstractC3489q4.A01(C3233lp.A02());
    }

    @JavascriptInterface
    public void logFunnel(int i, String str) {
        A00().AMB(i, str);
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AMC();
        if (this.A06.get() == null || this.A01.get() == null || this.A02.get() == null) {
            return;
        }
        boolean z = this.A02.get().get();
        String[] strArr = A07;
        if (strArr[4].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A07[1] = "xXjDpbk5Vvc7CvrBd08NYXaJ46SIZN7q";
        if (z) {
            this.A01.get().set(true);
            A00().AMD();
            if (this.A06.get().isShown()) {
                A00().AME();
                new Handler(Looper.getMainLooper()).post(new C1993Ex(this.A05));
            }
            InterfaceC3707ta interfaceC3707ta = this.A04.get();
            if (interfaceC3707ta != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC3705tY(this, interfaceC3707ta));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        C1991Ev webView = this.A06.get();
        if (webView == null || webView.A0J()) {
            A00().AMF(true);
            return;
        }
        InterfaceC3707ta listener = this.A04.get();
        if (listener == null) {
            A00().AMF(true);
        } else {
            A00().AMF(false);
            listener.AGD();
        }
    }
}
