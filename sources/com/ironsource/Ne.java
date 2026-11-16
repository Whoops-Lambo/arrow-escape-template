package com.ironsource;

import android.content.Context;
import defpackage.e80;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Ne implements Me {

    @NotNull
    private final O8 a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {

        @NotNull
        public static final a a = new a();

        @NotNull
        public static final String b = "sessionNumber";

        @NotNull
        public static final String c = "firstSessionTimestamp";

        private a() {
        }
    }

    public /* synthetic */ Ne(O8 o8, int i, e80 e80Var) {
        this((i & 1) != 0 ? new Pe() : o8);
    }

    @Override // com.ironsource.InterfaceC4996te
    public long a(@NotNull Context context, long j) {
        context.getClass();
        return this.a.b(context, "firstSessionTimestamp", j);
    }

    @Override // com.ironsource.Oe
    public int b(@NotNull Context context, int i) {
        context.getClass();
        return this.a.b(context, a.b, i);
    }

    @Override // com.ironsource.Oe
    public void a(@NotNull Context context, int i) {
        context.getClass();
        this.a.a(context, a.b, i);
    }

    @Override // com.ironsource.InterfaceC4996te
    public void b(@NotNull Context context, long j) {
        context.getClass();
        this.a.a(context, "firstSessionTimestamp", j);
    }

    public Ne(@NotNull O8 o8) {
        o8.getClass();
        this.a = o8;
    }

    public Ne() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
