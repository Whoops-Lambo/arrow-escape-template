package com.vungle.ads.internal.network;

import com.safedk.android.internal.partials.LiftoffMonetizeNetworkBridge;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.Okio;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class j extends ResponseBody {
    public final ResponseBody a;
    public final BufferedSource b;
    public IOException c;

    public final void a() throws IOException {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return this.a.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        return this.a.contentType();
    }

    @Override // okhttp3.ResponseBody
    public final BufferedSource source() {
        return this.b;
    }

    public j(ResponseBody responseBody) {
        responseBody.getClass();
        this.a = responseBody;
        this.b = Okio.buffer(new i(this, LiftoffMonetizeNetworkBridge.retrofitExceptionCatchingRequestBody_source(responseBody)));
    }

    public final void a(IOException iOException) {
        this.c = iOException;
    }
}
