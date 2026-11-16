package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class z40 implements Closeable {
    public q02 a;
    public u61 b;
    public q02 c;
    public qi0 d;
    public q02 e;
    public q02 f;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((pi0) this.e.get()).close();
    }
}
