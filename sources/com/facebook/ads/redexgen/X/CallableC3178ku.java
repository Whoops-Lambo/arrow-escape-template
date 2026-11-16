package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ku, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class CallableC3178ku implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C3183kz A01;

    public CallableC3178ku(C3183kz c3183kz, C3179kv c3179kv) {
        this.A01 = c3183kz;
        new Handler(Looper.getMainLooper()).post(new C2058Hl(this, c3183kz, c3179kv));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C3179kv c3179kv) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2659cP c2659cPA06 = C2659cP.A06(this.A01.A04.A02());
        Uri uriA00 = AbstractC3448pP.A00(c3179kv.A08);
        long jA0Q = c3179kv.A00;
        if (jA0Q == -1) {
            jA0Q = C3300mv.A0Q(this.A01.A04);
        }
        c2659cPA06.A0I(uriA00, new C2057Hk(this, c3179kv, jA0Q, jCurrentTimeMillis), jA0Q);
    }
}
