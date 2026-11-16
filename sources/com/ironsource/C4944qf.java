package com.ironsource;

import android.content.Context;
import defpackage.e80;
import defpackage.n30;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.qf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4944qf implements G3 {

    @NotNull
    public static final a d = new a(null);
    public static final int e = -1;
    public static final long f = -1;

    @NotNull
    private final Context a;

    @NotNull
    private final String b;

    @NotNull
    private final O8 c;

    /* JADX INFO: renamed from: com.ironsource.qf$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        private a() {
        }
    }

    public C4944qf(@NotNull Context context, @NotNull String str, @NotNull O8 o8) {
        context.getClass();
        str.getClass();
        o8.getClass();
        this.a = context;
        this.b = str;
        this.c = o8;
    }

    @Override // com.ironsource.G3
    @Nullable
    public Long a(@NotNull String str) {
        str.getClass();
        return a(Long.valueOf(this.c.b(this.a, new C4979sf(str, n30.m(this.b, ".show_count_threshold")).a(), -1L)));
    }

    @Override // com.ironsource.G3
    @Nullable
    public Long b(@NotNull String str) {
        str.getClass();
        return a(Long.valueOf(this.c.b(this.a, new C4979sf(str, n30.m(this.b, ".pacing_last_show_time")).a(), -1L)));
    }

    @Override // com.ironsource.G3
    @Nullable
    public Integer c(@NotNull String str) {
        str.getClass();
        return a(Integer.valueOf(this.c.b(this.a, new C4979sf(str, n30.m(this.b, ".show_count_show_counter")).a(), -1)));
    }

    public /* synthetic */ C4944qf(Context context, String str, O8 o8, int i, e80 e80Var) {
        this(context, str, (i & 4) != 0 ? new Pe() : o8);
    }

    @Override // com.ironsource.G3
    public void a(@NotNull String str, long j) {
        str.getClass();
        this.c.a(this.a, new C4979sf(str, n30.m(this.b, ".pacing_last_show_time")).a(), j);
    }

    @Override // com.ironsource.G3
    public void b(@NotNull String str, long j) {
        str.getClass();
        this.c.a(this.a, new C4979sf(str, n30.m(this.b, ".show_count_threshold")).a(), j);
    }

    @Override // com.ironsource.G3
    public void a(@NotNull String str, int i) {
        str.getClass();
        this.c.a(this.a, new C4979sf(str, n30.m(this.b, ".show_count_show_counter")).a(), i);
    }

    private final Long a(Long l) {
        if (l != null && l.longValue() == -1) {
            return null;
        }
        return l;
    }

    private final Integer a(Integer num) {
        if (num != null && num.intValue() == -1) {
            return null;
        }
        return num;
    }
}
