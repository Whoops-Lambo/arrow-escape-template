package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import defpackage.e80;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Le implements N8, N8.a {

    @NotNull
    private final Me a;

    @NotNull
    private final Ce b;

    @NotNull
    private final InterfaceC4986t4 c;
    private int d;
    private long e;

    private final int b(Context context, Me me) {
        int iB = me.b(context, 0) + 1;
        me.a(context, iB);
        return iB;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {

        @NotNull
        public static final a a = new a();
        public static final int b = -1;
        public static final int c = 0;
        public static final long d = -1;

        private a() {
        }
    }

    private final long a(Context context, Me me) {
        long jA = me.a(context, -1L);
        if (this.b.a(context) || jA != -1) {
            return jA;
        }
        long jA2 = this.c.a();
        IronLog.INTERNAL.verbose("set first session timestamp = " + jA2);
        me.b(context, jA2);
        return jA2;
    }

    @Override // com.ironsource.N8
    public int c() {
        return this.d;
    }

    public Le(@NotNull Me me, @NotNull Ce ce, @NotNull InterfaceC4986t4 interfaceC4986t4) {
        me.getClass();
        ce.getClass();
        interfaceC4986t4.getClass();
        this.a = me;
        this.b = ce;
        this.c = interfaceC4986t4;
        this.d = -1;
        this.e = -1L;
    }

    @Override // com.ironsource.N8
    @NotNull
    public String b() {
        String strD = IronSourceUtils.d();
        strD.getClass();
        return strD;
    }

    public /* synthetic */ Le(Me me, Ce ce, InterfaceC4986t4 interfaceC4986t4, int i, e80 e80Var) {
        this(me, (i & 2) != 0 ? new De() : ce, (i & 4) != 0 ? new InterfaceC4986t4.a() : interfaceC4986t4);
    }

    @Override // com.ironsource.N8.a
    public void a(@NotNull Context context) {
        context.getClass();
        this.d = b(context, this.a);
        this.e = a(context, this.a);
    }

    @Override // com.ironsource.N8
    public long a() {
        return this.e;
    }
}
