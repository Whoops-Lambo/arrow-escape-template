package defpackage;

import java.io.IOException;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kh2 implements rl {
    public final bk b;

    @Nullable
    private volatile ts closed;

    @Override // defpackage.rl
    public final void a(Throwable th) {
        if (this.closed != null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "Channel was cancelled";
        }
        this.closed = new ts(new IOException(message, th));
    }

    @Override // defpackage.rl
    public final Throwable b() {
        ts tsVar = this.closed;
        if (tsVar != null) {
            return tsVar.a(ss.b);
        }
        return null;
    }

    @Override // defpackage.rl
    public final boolean h() {
        return this.b.exhausted();
    }

    public kh2(bk bkVar) {
        this.b = bkVar;
    }

    @Override // defpackage.rl
    public final bk f() throws Throwable {
        Throwable thB = b();
        if (thB == null) {
            return this.b;
        }
        throw thB;
    }

    @Override // defpackage.rl
    public final Object g(int i, fy fyVar) throws Throwable {
        Throwable thB = b();
        if (thB == null) {
            return Boolean.valueOf(this.b.request(i));
        }
        throw thB;
    }
}
