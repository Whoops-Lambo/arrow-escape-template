package com.inmobi.media;

import java.util.Objects;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.inmobi.media.d3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C3954d3 implements Interceptor {
    public static final C3954d3 a = new C3954d3();

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws Exception {
        chain.getClass();
        Request request = chain.request();
        AbstractC3981e3.a.getClass();
        Objects.toString(request);
        try {
            Response responseProceed = chain.proceed(request);
            Objects.toString(responseProceed);
            request.getClass();
            request.toString();
            Objects.toString(responseProceed);
            responseProceed.getClass();
            return responseProceed;
        } catch (Exception e) {
            Objects.toString(request);
            request.getClass();
            throw e;
        }
    }
}
