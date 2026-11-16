package com.inmobi.media;

import defpackage.n30;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Xc implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        String strHeader;
        chain.getClass();
        Response responseProceed = chain.proceed(chain.request());
        if (responseProceed.isRedirect()) {
            if (responseProceed.isRedirect()) {
                strHeader = responseProceed.header("Location");
            } else {
                strHeader = null;
            }
            if (strHeader != null) {
                try {
                    new URL(strHeader);
                    return responseProceed;
                } catch (MalformedURLException unused) {
                }
            }
            chain.call().cancel();
            throw new MalformedURLException(n30.y("Invalid URL in Location header: ", strHeader));
        }
        return responseProceed;
    }
}
