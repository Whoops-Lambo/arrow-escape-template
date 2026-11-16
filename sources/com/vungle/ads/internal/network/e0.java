package com.vungle.ads.internal.network;

import com.ironsource.G5;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.model.q1;
import com.vungle.ads.internal.model.u1;
import com.vungle.ads.internal.model.w2;
import defpackage.du;
import defpackage.ep0;
import defpackage.l93;
import defpackage.p32;
import defpackage.r91;
import defpackage.w32;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class e0 {
    public static final r91 c = l93.b(b0.a);
    public static final w32 d = new w32("[^\\t\\x20-\\x7E]");
    public final Call.Factory a;
    public final com.vungle.ads.internal.network.converters.b b;

    public static Request.Builder a(e0 e0Var, String str, String str2, String str3, Map map, int i) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        e0Var.getClass();
        Request.Builder builderAddHeader = new Request.Builder().url(str2).addHeader(Command.HTTP_HEADER_USER_AGENT, c0.a(str)).addHeader("Vungle-Version", "7.1.0").addHeader("Content-Type", G5.M);
        if (map != null) {
            Headers.Builder builder = new Headers.Builder();
            for (Map.Entry entry : map.entrySet()) {
                try {
                    builder.add((String) entry.getKey(), c0.a((String) entry.getValue()));
                } catch (IllegalArgumentException unused) {
                    boolean z = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.a("VungleApiImpl", d0.a);
                }
            }
            builderAddHeader.headers(builder.build());
        }
        if (str3 != null) {
            builderAddHeader.addHeader("X-Vungle-Placement-Ref-Id", c0.a(str3));
        }
        String strC = f0.c();
        if (strC != null) {
            builderAddHeader.addHeader("X-VUNGLE-APP-VERSION", c0.a(strC));
        }
        String strB = f0.b();
        if (strB != null) {
            builderAddHeader.addHeader("X-Vungle-App-Id", c0.a(strB));
        }
        return builderAddHeader;
    }

    public e0(OkHttpClient okHttpClient) {
        okHttpClient.getClass();
        this.a = okHttpClient;
        this.b = new com.vungle.ads.internal.network.converters.b();
    }

    public final m b(String str, String str2, RequestBody requestBody) {
        str.getClass();
        str2.getClass();
        requestBody.getClass();
        Request.Builder builderAddHeader = new Request.Builder().url(HttpUrl.INSTANCE.get(str2).newBuilder().build()).addHeader(Command.HTTP_HEADER_USER_AGENT, c0.a(str)).addHeader("Vungle-Version", "7.1.0").addHeader("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        String strB = f0.b();
        if (strB != null) {
            builderAddHeader.addHeader("X-Vungle-App-Id", c0.a(strB));
        }
        String strC = f0.c();
        if (strC != null) {
            builderAddHeader.addHeader("X-VUNGLE-APP-VERSION", c0.a(strC));
        }
        return new m(this.a.newCall(builderAddHeader.post(requestBody).build()), this.b);
    }

    public final m c(String str, String str2, u1 u1Var) {
        str.getClass();
        str2.getClass();
        u1Var.getClass();
        try {
            r91 r91Var = c;
            return new m(this.a.newCall(a(this, str, str2, null, null, 12).post(RequestBody.INSTANCE.create(r91Var.b(ep0.A(r91Var.b, p32.d(u1.class)), u1Var), (MediaType) null)).build()), this.b);
        } catch (Exception unused) {
            return null;
        }
    }

    public final m b(String str, String str2, u1 u1Var) {
        str.getClass();
        str2.getClass();
        u1Var.getClass();
        try {
            r91 r91Var = c;
            return new m(this.a.newCall(a(this, str, str2, null, null, 12).post(RequestBody.INSTANCE.create(r91Var.b(ep0.A(r91Var.b, p32.d(u1.class)), u1Var), (MediaType) null)).build()), new com.vungle.ads.internal.network.converters.d(p32.d(w2.class)));
        } catch (Exception unused) {
            return null;
        }
    }

    public final m a(String str, String str2, u1 u1Var) {
        List listA;
        str.getClass();
        str2.getClass();
        u1Var.getClass();
        try {
            r91 r91Var = c;
            String strB = r91Var.b(ep0.A(r91Var.b, p32.d(u1.class)), u1Var);
            q1 q1VarC = u1Var.c();
            return new m(this.a.newCall(a(this, str, str2, (q1VarC == null || (listA = q1VarC.a()) == null) ? null : (String) du.c0(listA), null, 8).post(RequestBody.INSTANCE.create(strB, (MediaType) null)).build()), new com.vungle.ads.internal.network.converters.d(p32.d(i0.class)));
        } catch (Exception unused) {
            return null;
        }
    }

    public final m a(String str, String str2, g gVar, Map map, RequestBody requestBody) {
        Request requestBuild;
        str.getClass();
        str2.getClass();
        gVar.getClass();
        Request.Builder builderA = a(this, str, str2, null, map, 4);
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            requestBuild = builderA.get().build();
        } else {
            if (iOrdinal != 1) {
                io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                return null;
            }
            if (requestBody == null) {
                requestBody = RequestBody.Companion.create$default(RequestBody.INSTANCE, new byte[0], (MediaType) null, 0, 0, 6, (Object) null);
            }
            requestBuild = builderA.post(requestBody).build();
        }
        return new m(this.a.newCall(requestBuild), this.b);
    }

    public final m a(String str, String str2, RequestBody requestBody) {
        str.getClass();
        str2.getClass();
        requestBody.getClass();
        Request.Builder builderAddHeader = new Request.Builder().url(HttpUrl.INSTANCE.get(str2).newBuilder().build()).addHeader(Command.HTTP_HEADER_USER_AGENT, c0.a(str)).addHeader("Vungle-Version", "7.1.0").addHeader("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        String strB = f0.b();
        if (strB != null) {
            builderAddHeader.addHeader("X-Vungle-App-Id", c0.a(strB));
        }
        String strC = f0.c();
        if (strC != null) {
            builderAddHeader.addHeader("X-VUNGLE-APP-VERSION", c0.a(strC));
        }
        return new m(this.a.newCall(builderAddHeader.post(requestBody).build()), this.b);
    }

    public final m a(RequestBody requestBody) {
        requestBody.getClass();
        return new m(this.a.newCall(a(this, "debug", HttpUrl.INSTANCE.get("https://events.ads.vungle.com/rtadebugging").newBuilder().build().getUrl(), null, null, 12).post(requestBody).build()), this.b);
    }
}
