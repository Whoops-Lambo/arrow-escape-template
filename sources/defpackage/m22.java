package defpackage;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class m22 implements Closeable {
    public final kc0 a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public m22(kc0 kc0Var) {
        this.a = kc0Var;
    }
}
