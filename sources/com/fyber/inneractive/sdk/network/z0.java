package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends t0 {
    public final String q;
    public final AtomicInteger r;

    public z0(f0 f0Var, String str) {
        super(f0Var, g0.c.a(), null);
        this.r = new AtomicInteger();
        this.q = str;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i) throws n0 {
        try {
            o0 o0Var = new o0();
            o0Var.a = String.valueOf(i);
            InputStream inputStream = lVar.c;
            if (inputStream != null) {
                o0Var.b = com.fyber.inneractive.sdk.util.v.b(inputStream).toString();
            }
            return o0Var;
        } catch (Exception e) {
            IAlog.a("failed parse hit network request", e, new Object[0]);
            throw new n0(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return ((int) Math.pow(2.0d, this.r.get())) * 1000;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return this.q;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return this.r.getAndIncrement() < 4;
    }

    public static void b(String str) {
        IAConfigManager.Q.s.a(new z0(new y0(str, System.currentTimeMillis()), str));
    }
}
