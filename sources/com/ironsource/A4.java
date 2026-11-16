package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.e80;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class A4 implements T8, S8 {

    @NotNull
    private final A7 a;

    public /* synthetic */ A4(A7 a7, int i, e80 e80Var) {
        this((i & 1) != 0 ? new D4() : a7);
    }

    @Override // com.ironsource.S8
    public void a(@NotNull Context context, @NotNull EnumC5094z4 enumC5094z4, @NotNull String str, @NotNull String str2) {
        context.getClass();
        enumC5094z4.getClass();
        str.getClass();
        str2.getClass();
        F4 f4A = this.a.a(context, enumC5094z4);
        if (f4A != null) {
            f4A.b(str, str2);
            return;
        }
        IronLog.INTERNAL.error("Shared storage does not exist for source: " + enumC5094z4);
    }

    public A4(@NotNull A7 a7) {
        a7.getClass();
        this.a = a7;
    }

    public A4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.T8
    @Nullable
    public String a(@NotNull Context context, @NotNull EnumC5094z4 enumC5094z4, @NotNull String str) {
        context.getClass();
        enumC5094z4.getClass();
        str.getClass();
        F4 f4A = this.a.a(context, enumC5094z4);
        if (f4A != null) {
            return F4.a(f4A, str, null, 2, null);
        }
        IronLog.INTERNAL.error("Shared storage does not exist for source: " + enumC5094z4);
        return null;
    }
}
