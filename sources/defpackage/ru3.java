package defpackage;

import com.google.android.gms.internal.ads.zzey;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ru3 {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final zzey a = new zzey();
    public final StringBuilder b = new StringBuilder();

    public static void a(zzey zzeyVar) {
        while (true) {
            for (boolean z = true; zzeyVar.B() > 0 && z; z = false) {
                int i = zzeyVar.b;
                byte[] bArr = zzeyVar.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    zzeyVar.G(1);
                } else {
                    int i2 = zzeyVar.c;
                    if (i + 2 <= i2) {
                        int i3 = i + 1;
                        if (b == 47) {
                            int i4 = i + 2;
                            if (bArr[i3] == 42) {
                                while (true) {
                                    int i5 = i4 + 1;
                                    if (i5 >= i2) {
                                        break;
                                    }
                                    if (((char) bArr[i4]) == '*' && ((char) bArr[i5]) == '/') {
                                        i2 = i4 + 2;
                                        i4 = i2;
                                    } else {
                                        i4 = i5;
                                    }
                                }
                                zzeyVar.G(i2 - zzeyVar.b);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    public static String c(zzey zzeyVar, StringBuilder sb) {
        char c2;
        sb.setLength(0);
        int i = zzeyVar.b;
        int i2 = zzeyVar.c;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (i < i2 && !z) {
                    c2 = (char) zzeyVar.a[i];
                    if ((c2 >= 'A' && c2 <= 'Z') || ((c2 >= 'a' && c2 <= 'z') || ((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                        break;
                    }
                    z = true;
                } else {
                    break loop0;
                }
            }
            sb.append(c2);
            i++;
        }
        zzeyVar.G(i - zzeyVar.b);
        return sb.toString();
    }

    public static String b(zzey zzeyVar, StringBuilder sb) {
        a(zzeyVar);
        if (zzeyVar.B() == 0) {
            return null;
        }
        String strC = c(zzeyVar, sb);
        if (!strC.isEmpty()) {
            return strC;
        }
        char cK = (char) zzeyVar.K();
        StringBuilder sb2 = new StringBuilder(String.valueOf(cK).length());
        sb2.append(cK);
        return sb2.toString();
    }
}
