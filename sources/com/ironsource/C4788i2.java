package com.ironsource;

import defpackage.jc1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.i2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4788i2 {

    @NotNull
    public static final C4788i2 a = new C4788i2();

    @NotNull
    public static final String b = "trials_fail";

    @NotNull
    public static final String c = "parsing";

    @NotNull
    public static final String d = "other";

    @NotNull
    public static final String e = "disabled";

    @NotNull
    public static final String f = "-1";

    @NotNull
    public final String a(boolean z, @Nullable Integer num) {
        if (!z) {
            return e;
        }
        if (num != null && num.intValue() == 1003) {
            return c;
        }
        if (num != null && num.intValue() == 1008) {
            return c;
        }
        if (num != null && num.intValue() == 1002) {
            return c;
        }
        if (num != null && num.intValue() == 1006) {
            return b;
        }
        return (num != null && num.intValue() == 1001) ? b : "other";
    }

    private C4788i2() {
    }

    public static /* synthetic */ String a(C4788i2 c4788i2, boolean z, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return c4788i2.a(z, num);
    }

    @NotNull
    public final String a(boolean z) {
        if (!z) {
            return f;
        }
        return jc1.l(System.currentTimeMillis(), "fallback_");
    }
}
