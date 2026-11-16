package com.adsurge.adn.D1;

import com.adsurge.adn.X.w;
import com.adsurge.adn.X.x;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static volatile Boolean a;
    public static volatile Boolean b;
    public static volatile EnumC0069a c = EnumC0069a.NONE;
    public static volatile String d = "unknown";

    /* JADX INFO: renamed from: com.adsurge.adn.D1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum EnumC0069a {
        NONE(0),
        SETTING_OFF(1),
        CLASS_NOT_FOUND(2),
        VERSION_MISMATCH(3),
        INIT_EXCEPTION(4),
        PLAYBACK_ERROR(5);

        public final int a;

        public int b() {
            return this.a;
        }

        EnumC0069a(int i) {
            this.a = i;
        }
    }

    public static String k() {
        String strC;
        try {
            com.adsurge.adn.J.a aVarD = com.adsurge.adn.J.a.d();
            com.adsurge.adn.O.a aVarB = aVarD == null ? null : aVarD.b();
            if (aVarB == null || (strC = aVarB.c()) == null || strC.isEmpty()) {
                return null;
            }
            return strC;
        } catch (Throwable unused) {
        }
    }

    public static int l() {
        String strA;
        try {
            int iA = x.a("adn_exo_disabled", 0);
            if (iA <= 0) {
                return 0;
            }
            String strA2 = x.a("adn_exo_disabled_sdk_ver", (String) null);
            String strA3 = w.a();
            if (strA2 != null && strA2.equals(strA3)) {
                String strK = k();
                if (strK == null || ((strA = x.a("adn_exo_disabled_app_ver", (String) null)) != null && strA.equals(strK))) {
                    return iA;
                }
                b();
                return 0;
            }
            b();
            return 0;
        } catch (Throwable unused) {
        }
    }

    public static void b() {
        try {
            x.a("adn_exo_disabled");
            x.a("adn_exo_disabled_sdk_ver");
            x.a("adn_exo_disabled_app_ver");
            x.a("adn_exo_fail_count");
        } catch (Throwable unused) {
        }
    }

    public static String c(Throwable th) {
        if (th == null) {
            return "null";
        }
        String message = th.getMessage();
        if (message == null) {
            return th.getClass().getSimpleName();
        }
        return th.getClass().getSimpleName() + ": " + message;
    }

    public static int d() {
        return com.adsurge.adn.N.b.a("eefrt", 20);
    }

    public static EnumC0069a e() {
        return c;
    }

    public static int f() {
        try {
            int iA = x.a("adn_exo_fail_count", 0) + 1;
            x.b("adn_exo_fail_count", iA);
            return iA;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean g() {
        Boolean bool = a;
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (a.class) {
            try {
                if (a != null) {
                    return a.booleanValue();
                }
                a = Boolean.valueOf(a());
                return a.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean h() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            Class.forName("androidx.media3.exoplayer.ExoPlayer", false, a.class.getClassLoader());
            z = true;
        } catch (Throwable unused) {
        }
        b = Boolean.valueOf(z);
        return z;
    }

    public static boolean i() {
        return com.adsurge.adn.N.b.a("eexop", 0) == 1;
    }

    public static String j() {
        try {
            Object obj = Class.forName("androidx.media3.common.MediaLibraryInfo", true, a.class.getClassLoader()).getField("VERSION").get(null);
            return obj == null ? "unknown" : obj.toString();
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static boolean a() {
        if (!i()) {
            c = EnumC0069a.SETTING_OFF;
            return false;
        }
        int iL = l();
        if (iL > 0) {
            c = a(iL);
            Objects.toString(c);
            return false;
        }
        if (!h()) {
            c = EnumC0069a.CLASS_NOT_FOUND;
            return false;
        }
        d = j();
        c = EnumC0069a.NONE;
        return true;
    }

    public static void b(Throwable th) {
        a = Boolean.FALSE;
        EnumC0069a enumC0069a = EnumC0069a.INIT_EXCEPTION;
        c = enumC0069a;
        a(enumC0069a);
    }

    public static String c() {
        return d;
    }

    public static void a(int i, Throwable th) {
        int iF = f();
        int iD = d();
        c(th);
        if (iD <= 0 || iF < iD) {
            return;
        }
        a = Boolean.FALSE;
        EnumC0069a enumC0069a = EnumC0069a.PLAYBACK_ERROR;
        c = enumC0069a;
        a(enumC0069a);
    }

    public static void a(Throwable th) {
        a = Boolean.FALSE;
        EnumC0069a enumC0069a = EnumC0069a.CLASS_NOT_FOUND;
        c = enumC0069a;
        a(enumC0069a);
    }

    public static EnumC0069a a(int i) {
        for (EnumC0069a enumC0069a : EnumC0069a.values()) {
            if (enumC0069a.b() == i) {
                return enumC0069a;
            }
        }
        return EnumC0069a.PLAYBACK_ERROR;
    }

    public static void a(EnumC0069a enumC0069a) {
        if (enumC0069a == null) {
            try {
                enumC0069a = EnumC0069a.PLAYBACK_ERROR;
            } catch (Throwable unused) {
                return;
            }
        }
        x.b("adn_exo_disabled", enumC0069a.b());
        x.b("adn_exo_disabled_sdk_ver", w.a());
        String strK = k();
        if (strK != null) {
            x.b("adn_exo_disabled_app_ver", strK);
        }
    }
}
