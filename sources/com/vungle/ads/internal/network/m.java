package com.vungle.ads.internal.network;

import com.safedk.android.internal.partials.LiftoffMonetizeNetworkBridge;
import defpackage.j52;
import defpackage.k52;
import defpackage.nq2;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class m {
    public final Call a;
    public final com.vungle.ads.internal.network.converters.a b;

    static {
        new h();
    }

    public m(Call call, com.vungle.ads.internal.network.converters.a aVar) {
        call.getClass();
        aVar.getClass();
        this.a = call;
        this.b = aVar;
    }

    public final o a(Response response) throws IOException {
        ResponseBody responseBodyOkhttp3Response_body = LiftoffMonetizeNetworkBridge.okhttp3Response_body(response);
        if (responseBodyOkhttp3Response_body == null) {
            return null;
        }
        Response responseBuild = response.newBuilder().body(new k(responseBodyOkhttp3Response_body.get$contentType(), responseBodyOkhttp3Response_body.getContentLength())).build();
        int iCode = responseBuild.code();
        if (iCode >= 200 && iCode < 300) {
            if (iCode != 204 && iCode != 205) {
                j jVar = new j(responseBodyOkhttp3Response_body);
                try {
                    return n.a(this.b.a(jVar), responseBuild);
                } catch (Throwable th) {
                    jVar.a();
                    throw th;
                }
            }
            responseBodyOkhttp3Response_body.close();
            return n.a(null, responseBuild);
        }
        try {
            Buffer buffer = new Buffer();
            LiftoffMonetizeNetworkBridge.retrofitExceptionCatchingRequestBody_source(responseBodyOkhttp3Response_body).readAll(buffer);
            ResponseBody.INSTANCE.create(buffer, responseBodyOkhttp3Response_body.get$contentType(), responseBodyOkhttp3Response_body.getContentLength());
            o oVarA = n.a(responseBuild);
            responseBodyOkhttp3Response_body.close();
            return oVarA;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                nq2.e(responseBodyOkhttp3Response_body, th2);
                throw th3;
            }
        }
    }

    public final void a(a aVar) {
        Call call;
        aVar.getClass();
        synchronized (this) {
            call = this.a;
        }
        LiftoffMonetizeNetworkBridge.okhttp3CallEnqueue(call, new l(this, aVar));
    }

    public final o a() {
        Call call;
        Object j52Var;
        synchronized (this) {
            call = this.a;
        }
        try {
            j52Var = a(LiftoffMonetizeNetworkBridge.okhttp3CallExecute(call));
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        Throwable thB = k52.b(j52Var);
        if (thB != null) {
            boolean z = com.vungle.ads.internal.util.u.a;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("[execute] Failed to parse response:  ");
            sbA.append(thB.getLocalizedMessage());
            com.vungle.ads.internal.util.t.b("OkHttpCall", sbA.toString());
        }
        if (j52Var instanceof j52) {
            j52Var = null;
        }
        return (o) j52Var;
    }
}
