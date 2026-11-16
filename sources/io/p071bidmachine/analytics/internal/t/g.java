package io.p071bidmachine.analytics.internal.t;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class g {
    private final int a;
    private final StringBuffer b;
    private Long c;

    public final void a(String str) throws IOException {
        if (str.length() + this.b.length() < this.a) {
            this.b.append((CharSequence) str).append('\n');
            this.c = Long.valueOf(System.currentTimeMillis());
        }
    }

    public String toString() {
        return this.b.toString();
    }

    public g(int i, int i2) {
        this.a = i2;
        this.b = new StringBuffer(i);
    }

    public final Long a() {
        return this.c;
    }
}
