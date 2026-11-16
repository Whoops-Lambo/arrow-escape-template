package com.ironsource.mediationsdk.adquality;

import com.ironsource.C4848l9;
import com.ironsource.EnumC5086ye;
import com.ironsource.R6;
import defpackage.e80;
import defpackage.ek2;
import defpackage.jh0;
import java.util.LinkedHashSet;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    @NotNull
    public static final b a = new b(null);

    @NotNull
    private static EnumC1374a b = EnumC1374a.DONT_INITIALIZE;
    private static boolean c;

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.adquality.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum EnumC1374a {
        DONT_INITIALIZE(0),
        LEVELPLAY_ONLY(1),
        ALL_MEDIATIONS(2),
        OTHER_ONLY(3);

        private final int a;
        private static final /* synthetic */ jh0 h = ek2.m(a());

        @NotNull
        public static final C1375a b = new C1375a(null);

        /* JADX INFO: renamed from: com.ironsource.mediationsdk.adquality.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class C1375a {
            public /* synthetic */ C1375a(e80 e80Var) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0017  */
            /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
            @NotNull
            public final EnumC1374a a(int i) {
                for (EnumC1374a enumC1374a : EnumC1374a.values()) {
                    if (enumC1374a.c() == i) {
                        if (enumC1374a == null) {
                            return EnumC1374a.DONT_INITIALIZE;
                        }
                        return enumC1374a;
                    }
                }
                enumC1374a = null;
                if (enumC1374a == null) {
                    return EnumC1374a.DONT_INITIALIZE;
                }
                return enumC1374a;
            }

            private C1375a() {
            }
        }

        @NotNull
        public static jh0 b() {
            return h;
        }

        public final int c() {
            return this.a;
        }

        EnumC1374a(int i) {
            this.a = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b {
        public /* synthetic */ b(e80 e80Var) {
            this();
        }

        public final void a(@NotNull EnumC1374a enumC1374a) {
            enumC1374a.getClass();
            a.b = enumC1374a;
        }

        public final boolean b() {
            return a.c;
        }

        private b() {
        }

        @NotNull
        public final EnumC1374a a() {
            return a.b;
        }

        public final void a(boolean z) {
            a.c = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC1374a.values().length];
            try {
                iArr[EnumC1374a.LEVELPLAY_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1374a.ALL_MEDIATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1374a.OTHER_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public final void a(int i) {
        b = EnumC1374a.b.a(i);
    }

    public final boolean c() throws JSONException {
        EnumC5086ye enumC5086ye;
        JSONArray jSONArrayOptJSONArray = new C4848l9().a().optJSONArray(R6.g0);
        if (jSONArrayOptJSONArray == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            int i2 = jSONArrayOptJSONArray.getInt(i);
            EnumC5086ye[] enumC5086yeArrValues = EnumC5086ye.values();
            int length2 = enumC5086yeArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    enumC5086ye = null;
                    break;
                }
                enumC5086ye = enumC5086yeArrValues[i3];
                if (enumC5086ye.c() == i2) {
                    break;
                }
                i3++;
            }
            if (enumC5086ye != null) {
                linkedHashSet.add(enumC5086ye);
            }
        }
        int i4 = c.a[b.ordinal()];
        if (i4 == 1) {
            return linkedHashSet.contains(EnumC5086ye.LEVEL_PLAY_INIT);
        }
        if (i4 != 2) {
            if (i4 == 3) {
                return linkedHashSet.contains(EnumC5086ye.EXTERNAL_MEDIATION_INIT);
            }
        } else if (linkedHashSet.contains(EnumC5086ye.LEVEL_PLAY_INIT) || linkedHashSet.contains(EnumC5086ye.EXTERNAL_MEDIATION_INIT)) {
            return true;
        }
        return false;
    }

    public final void b(boolean z) {
        c = z;
    }
}
