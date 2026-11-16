package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import defpackage.e80;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class V {

    @NotNull
    public static final a q = new a(null);
    public static final int r = -1;

    @NotNull
    private final IronSource.a a;

    @Nullable
    private final String b;

    @Nullable
    private final List<NetworkSettings> c;

    @NotNull
    private final A2 d;
    private int e;
    private final int f;
    private boolean g;
    private final int h;
    private final int i;

    @NotNull
    private final M0 j;

    @NotNull
    private final I0 k;
    private final long l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private boolean p;

    /* JADX WARN: Multi-variable type inference failed */
    public V(@NotNull IronSource.a aVar, @Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull A2 a2, int i, int i2, boolean z, int i3, int i4, @NotNull M0 m0, @NotNull I0 i0, long j, boolean z2, boolean z3, boolean z4, boolean z5) {
        aVar.getClass();
        a2.getClass();
        m0.getClass();
        i0.getClass();
        this.a = aVar;
        this.b = str;
        this.c = list;
        this.d = a2;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.h = i3;
        this.i = i4;
        this.j = m0;
        this.k = i0;
        this.l = j;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = z5;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        private a() {
        }
    }

    @NotNull
    public final IronSource.a b() {
        return this.a;
    }

    public final boolean c() {
        return this.g;
    }

    @NotNull
    public final A2 d() {
        return this.d;
    }

    public final long e() {
        return this.l;
    }

    public final int f() {
        return this.h;
    }

    @NotNull
    public final I0 g() {
        return this.k;
    }

    @NotNull
    public final M0 h() {
        return this.j;
    }

    public final int i() {
        return this.e;
    }

    @Nullable
    public List<NetworkSettings> j() {
        return this.c;
    }

    public final boolean k() {
        return this.m;
    }

    public final boolean l() {
        return this.o;
    }

    public final boolean m() {
        return this.p;
    }

    public final int n() {
        return this.f;
    }

    @Nullable
    public String o() {
        return this.b;
    }

    public final boolean p() {
        return this.n;
    }

    public final boolean q() {
        return this.d.g() > 0;
    }

    @Nullable
    public final NetworkSettings a(@NotNull String str) {
        str.getClass();
        List<NetworkSettings> listJ = j();
        Object obj = null;
        if (listJ == null) {
            return null;
        }
        for (Object obj2 : listJ) {
            if (((NetworkSettings) obj2).getProviderInstanceName().equals(str)) {
                obj = obj2;
                break;
            }
        }
        return (NetworkSettings) obj;
    }

    @NotNull
    public final String r() {
        return String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.ironsource.mediationsdk.d.x, Integer.valueOf(this.e), com.ironsource.mediationsdk.d.y, Boolean.valueOf(this.g), com.ironsource.mediationsdk.d.z, Boolean.valueOf(this.p));
    }

    public final void b(boolean z) {
        this.p = z;
    }

    public /* synthetic */ V(IronSource.a aVar, String str, List list, A2 a2, int i, int i2, boolean z, int i3, int i4, M0 m0, I0 i0, long j, boolean z2, boolean z3, boolean z4, boolean z5, int i5, e80 e80Var) {
        this(aVar, str, list, a2, i, i2, z, i3, i4, m0, i0, j, z2, z3, z4, (i5 & 32768) != 0 ? false : z5);
    }

    public final void a(boolean z) {
        this.g = z;
    }

    public final int a() {
        return this.i;
    }

    public final void a(int i) {
        this.e = i;
    }
}
