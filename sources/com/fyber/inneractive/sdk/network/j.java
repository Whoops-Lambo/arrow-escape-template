package com.fyber.inneractive.sdk.network;

import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import java.io.FilterInputStream;
import java.net.HttpURLConnection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends l {
    public final HttpURLConnection g;

    @Override // com.fyber.inneractive.sdk.network.l
    public final void a() {
        try {
            HttpURLConnection httpURLConnection = this.g;
            if (httpURLConnection != null) {
                DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            }
        } catch (Throwable unused) {
        }
        super.a();
    }

    public j(HttpURLConnection httpURLConnection, int i, FilterInputStream filterInputStream, Map map, String str) {
        this.g = httpURLConnection;
        this.a = i;
        this.c = filterInputStream;
        this.d = map;
        this.e = str;
    }
}
