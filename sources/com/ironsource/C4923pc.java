package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import defpackage.e80;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.pc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4923pc {

    @NotNull
    public static final a e = new a(null);

    @Nullable
    private static volatile C4923pc f;

    @Nullable
    private Nd a;

    @NotNull
    private final AtomicBoolean b;

    @NotNull
    private String c;

    @Nullable
    private S3 d;

    /* JADX INFO: renamed from: com.ironsource.pc$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        @NotNull
        public final InterfaceC4715e1 a(@NotNull IronSource.a aVar) {
            S3 s3B;
            aVar.getClass();
            C4923pc c4923pc = C4923pc.f;
            Nd ndE = null;
            if (c4923pc != null) {
                s3B = c4923pc.b();
            } else {
                s3B = null;
            }
            C4923pc c4923pc2 = C4923pc.f;
            if (c4923pc2 != null) {
                ndE = c4923pc2.e();
            }
            if (s3B != null && ndE != null) {
                return new C4932q3(s3B, ndE, aVar);
            }
            return new C4880n5();
        }

        private a() {
        }

        @NotNull
        public final C4923pc a() {
            C4923pc c4923pc;
            C4923pc c4923pc2 = C4923pc.f;
            if (c4923pc2 != null) {
                return c4923pc2;
            }
            synchronized (this) {
                c4923pc = C4923pc.f;
                if (c4923pc == null) {
                    c4923pc = new C4923pc(null);
                    C4923pc.f = c4923pc;
                }
            }
            return c4923pc;
        }
    }

    @NotNull
    public static final C4923pc d() {
        return e.a();
    }

    @Nullable
    public final S3 b() {
        return this.d;
    }

    @NotNull
    public final AtomicBoolean c() {
        return this.b;
    }

    @Nullable
    public final Nd e() {
        return this.a;
    }

    @NotNull
    public final String f() {
        return this.c;
    }

    public final void g() {
        this.b.set(true);
    }

    private C4923pc() {
        this.b = new AtomicBoolean(false);
        this.c = "";
    }

    public final void a(@NotNull String str) {
        str.getClass();
        this.c = str;
    }

    public final void a(@Nullable Nd nd) {
        this.a = nd;
    }

    public final void a(@Nullable S3 s3) {
        this.d = s3;
    }

    public /* synthetic */ C4923pc(e80 e80Var) {
        this();
    }
}
