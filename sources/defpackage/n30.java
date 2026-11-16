package defpackage;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.fragment.app.Fragment;
import com.applovin.shadow.okio.Path;
import com.bytedance.sdk.openadsdk.um.ahm.kgy;
import com.inmobi.media.Ej;
import com.inmobi.media.Z9;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class n30 {
    public static /* synthetic */ int a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i2;
    }

    public static kgy e(String str) {
        kgy kgyVar = new kgy();
        kgyVar.ahm(str);
        return kgyVar;
    }

    public static String g(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String h(Path path, String str) {
        return str + path;
    }

    public static String j(File file, String str) {
        return str + file;
    }

    public static String k(String str, int i, char c) {
        return str + i + c;
    }

    public static String l(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String m(String str, String str2) {
        return str + str2;
    }

    public static String n(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String q(okio.Path path, String str) {
        return str + path;
    }

    public static Map r() {
        return Collections.synchronizedMap(new HashMap());
    }

    public static void v(String str, String str2, Z9 z9, String str3) {
        z9.b(str3, str + str2);
    }

    public static void w(String str, String str2, String str3) {
        q0.b(str3, str + str2);
    }

    public static String y(String str, String str2) {
        return str + str2;
    }

    public static int b(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int c(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static m32 d(Object obj) {
        wz2.a0(obj);
        return new m32();
    }

    public static String f() {
        String string = UUID.randomUUID().toString();
        string.getClass();
        return string;
    }

    public static String i(Ej ej, String str, String str2) {
        str.getClass();
        return str2 + ej;
    }

    public static String o(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    public static String p(Locale locale, String str, Locale locale2) {
        locale.getClass();
        String lowerCase = str.toLowerCase(locale2);
        lowerCase.getClass();
        return lowerCase;
    }

    public static void s(int i, int i2, int i3, int i4, int i5) {
        Key_androidKt.a(i);
        Key_androidKt.a(i2);
        Key_androidKt.a(i3);
        Key_androidKt.a(i4);
        Key_androidKt.a(i5);
    }

    public static void t(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
    }

    public static void u(Number number, Transition.Segment segment, Composer composer, int i) {
        number.intValue();
        segment.getClass();
        composer.B(i);
    }

    public static void x(StringBuilder sb, String str, long j, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }
}
