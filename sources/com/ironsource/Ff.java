package com.ironsource;

import androidx.annotation.MainThread;
import defpackage.wr0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface Ff {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {

        @NotNull
        private final Hf.a a;
        private boolean b;

        public final void a() {
            this.a.cancel();
            this.b = true;
        }

        public final boolean b() {
            return this.b;
        }

        public a(@NotNull Hf.a aVar) {
            aVar.getClass();
            this.a = aVar;
        }
    }

    @NotNull
    a a(@MainThread @NotNull Runnable runnable, long j);

    @NotNull
    a b(@InterfaceC5065xb @NotNull Runnable runnable, long j);

    @NotNull
    default <T> a a(@NotNull T t, long j, @InterfaceC5065xb @NotNull wr0 wr0Var) {
        t.getClass();
        wr0Var.getClass();
        return b(Gf.b(t, wr0Var), j);
    }
}
