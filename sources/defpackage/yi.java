package defpackage;

import okio.Buffer;
import okio.ForwardingSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class yi extends ForwardingSource {
    public Exception b;

    @Override // okio.ForwardingSource, okio.Source
    public final long read(Buffer buffer, long j) throws Exception {
        try {
            return super.read(buffer, j);
        } catch (Exception e) {
            this.b = e;
            throw e;
        }
    }
}
