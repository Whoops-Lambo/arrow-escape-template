package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a44 {
    public static final a44 d = new a44();
    public final Runnable a;
    public final Executor b;
    public a44 c;

    public a44() {
        this.a = null;
        this.b = null;
    }

    public a44(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
