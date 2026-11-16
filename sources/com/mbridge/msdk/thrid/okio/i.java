package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class i extends t {
    private t e;

    public final i a(t tVar) {
        if (tVar != null) {
            this.e = tVar;
            return this;
        }
        defpackage.d.r("delegate == null");
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public t b() {
        return this.e.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public long c() {
        return this.e.c();
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public boolean d() {
        return this.e.d();
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public void e() throws IOException {
        this.e.e();
    }

    public final t g() {
        return this.e;
    }

    public i(t tVar) {
        if (tVar != null) {
            this.e = tVar;
        } else {
            defpackage.d.r("delegate == null");
            throw null;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public t a(long j, TimeUnit timeUnit) {
        return this.e.a(j, timeUnit);
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public t a(long j) {
        return this.e.a(j);
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public t a() {
        return this.e.a();
    }
}
