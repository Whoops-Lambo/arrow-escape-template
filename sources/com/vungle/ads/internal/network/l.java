package com.vungle.ads.internal.network;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class l implements Callback {
    public final /* synthetic */ m a;
    public final /* synthetic */ a b;

    public l(m mVar, a aVar) {
        this.a = mVar;
        this.b = aVar;
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) throws Throwable {
        call.getClass();
        response.getClass();
        try {
            try {
                this.b.a(this.a.a(response));
            } catch (Throwable th) {
                h.a(th);
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("OkHttpCall", "Cannot pass response to callback", th);
            }
        } catch (Throwable th2) {
            boolean z2 = com.vungle.ads.internal.util.u.a;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("[enqueue] Failed to parse response: ");
            sbA.append(th2.getLocalizedMessage());
            com.vungle.ads.internal.util.t.b("OkHttpCall", sbA.toString());
            h.a(th2);
            try {
                this.b.a(th2);
            } catch (Throwable th3) {
                h.a(th3);
                boolean z3 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("OkHttpCall", "Cannot pass failure to callback", th3);
            }
        }
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) throws Throwable {
        call.getClass();
        iOException.getClass();
        try {
            this.b.a(iOException);
        } catch (Throwable th) {
            h.a(th);
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("OkHttpCall", "Cannot pass failure to callback", th);
        }
    }
}
