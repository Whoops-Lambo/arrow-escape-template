package com.ironsource;

import defpackage.e80;
import defpackage.ek2;
import defpackage.jh0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.c7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public enum EnumC4685c7 {
    SendEvent(0),
    NativeController(1);

    private final int a;
    private static final /* synthetic */ jh0 f = ek2.m(a());

    @NotNull
    public static final a b = new a(null);

    /* JADX INFO: renamed from: com.ironsource.c7$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        @NotNull
        public final EnumC4685c7 a(int i) {
            for (EnumC4685c7 enumC4685c7 : EnumC4685c7.values()) {
                if (enumC4685c7.c() == i) {
                    if (enumC4685c7 == null) {
                        return EnumC4685c7.SendEvent;
                    }
                    return enumC4685c7;
                }
            }
            enumC4685c7 = null;
            if (enumC4685c7 == null) {
                return EnumC4685c7.SendEvent;
            }
            return enumC4685c7;
        }

        private a() {
        }
    }

    @NotNull
    public static jh0 b() {
        return f;
    }

    public final int c() {
        return this.a;
    }

    EnumC4685c7(int i) {
        this.a = i;
    }
}
