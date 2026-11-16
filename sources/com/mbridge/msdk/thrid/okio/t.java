package com.mbridge.msdk.thrid.okio;

import defpackage.e32;
import defpackage.jc1;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class t {
    public static final t d = new a();
    private boolean a;
    private long b;
    private long c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a extends t {
        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public void e() throws IOException {
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j, TimeUnit timeUnit) {
            return this;
        }
    }

    public t a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            defpackage.d.r(jc1.l(j, "timeout < 0: "));
            return null;
        }
        if (timeUnit != null) {
            this.c = timeUnit.toNanos(j);
            return this;
        }
        defpackage.d.r("unit == null");
        return null;
    }

    public t b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        e32.i("No deadline");
        return 0L;
    }

    public boolean d() {
        return this.a;
    }

    public long f() {
        return this.c;
    }

    public void e() throws IOException {
        if (!Thread.interrupted()) {
            if (this.a && this.b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        Thread.currentThread().interrupt();
        throw new InterruptedIOException("interrupted");
    }

    public t a(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public t a() {
        this.a = false;
        return this;
    }
}
