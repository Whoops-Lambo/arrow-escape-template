package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.e80;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.se, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C4978se {

    @NotNull
    public static final a c = new a(null);
    public static final int d = 2070;
    public static final int e = 2080;
    public static final int f = 2090;
    public static final int g = 2100;
    public static final int h = 2110;
    private final int a;

    @NotNull
    private final String b;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4978se)) {
            return false;
        }
        C4978se c4978se = (C4978se) obj;
        return this.a == c4978se.a && s71.b(this.b, c4978se.b);
    }

    /* JADX INFO: renamed from: com.ironsource.se$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        private a() {
        }
    }

    public static /* synthetic */ C4978se a(C4978se c4978se, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c4978se.a;
        }
        if ((i2 & 2) != 0) {
            str = c4978se.b;
        }
        return c4978se.a(i, str);
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    @NotNull
    public final String d() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    @NotNull
    public String toString() {
        return "SdkError(errorCode=" + this.a + ", errorMessage=" + this.b + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4978se(@NotNull IronSourceError ironSourceError) {
        ironSourceError.getClass();
        int errorCode = ironSourceError.getErrorCode();
        String errorMessage = ironSourceError.getErrorMessage();
        errorMessage.getClass();
        this(errorCode, errorMessage);
    }

    @NotNull
    public final C4978se a(int i, @NotNull String str) {
        str.getClass();
        return new C4978se(i, str);
    }

    public C4978se(int i, @NotNull String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    public final int a() {
        return this.a;
    }
}
