package defpackage;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kc0 implements Closeable {
    public final jc0 a;
    public boolean b;
    public final /* synthetic */ mc0 c;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        mc0 mc0Var = this.c;
        synchronized (mc0Var) {
            jc0 jc0Var = this.a;
            int i = jc0Var.h - 1;
            jc0Var.h = i;
            if (i == 0 && jc0Var.f) {
                w32 w32Var = mc0.q;
                mc0Var.G(jc0Var);
            }
        }
    }

    public kc0(mc0 mc0Var, jc0 jc0Var) {
        this.c = mc0Var;
        this.a = jc0Var;
    }
}
