package com.ironsource;

import defpackage.e80;
import defpackage.ek2;
import defpackage.jh0;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.z4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC5094z4 {
    IADS("iads"),
    UADS("uads"),
    SHARED("shared"),
    NONE("none");


    @NotNull
    private final String a;
    private static final /* synthetic */ jh0 h = ek2.m(a());

    @NotNull
    public static final a b = new a(null);

    /* JADX INFO: renamed from: com.ironsource.z4$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b  */
        /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
        @NotNull
        public final EnumC5094z4 a(@Nullable String str) {
            for (EnumC5094z4 enumC5094z4 : EnumC5094z4.values()) {
                if (s71.b(enumC5094z4.c(), str)) {
                    if (enumC5094z4 == null) {
                        return EnumC5094z4.NONE;
                    }
                    return enumC5094z4;
                }
            }
            enumC5094z4 = null;
            if (enumC5094z4 == null) {
                return EnumC5094z4.NONE;
            }
            return enumC5094z4;
        }

        private a() {
        }
    }

    @NotNull
    public static jh0 b() {
        return h;
    }

    @NotNull
    public final String c() {
        return this.a;
    }

    EnumC5094z4(String str) {
        this.a = str;
    }

    @NotNull
    public static final EnumC5094z4 a(@Nullable String str) {
        return b.a(str);
    }
}
