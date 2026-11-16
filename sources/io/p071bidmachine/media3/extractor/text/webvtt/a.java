package io.p071bidmachine.media3.extractor.text.webvtt;

import io.p071bidmachine.media3.common.util.q;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final q a = new q();
    public final StringBuilder b = new StringBuilder();

    public static String a(q qVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = qVar.b;
        int i2 = qVar.c;
        while (i < i2 && !z) {
            char c2 = (char) qVar.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        qVar.G(i - qVar.b);
        return sb.toString();
    }

    public static void c(q qVar) {
        while (true) {
            for (boolean z = true; qVar.a() > 0 && z; z = false) {
                int i = qVar.b;
                byte[] bArr = qVar.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    qVar.G(1);
                } else {
                    int i2 = qVar.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            qVar.G(i2 - qVar.b);
                        }
                    }
                }
            }
            return;
        }
    }

    public static String b(q qVar, StringBuilder sb) {
        c(qVar);
        if (qVar.a() == 0) {
            return null;
        }
        String strA = a(qVar, sb);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) qVar.t());
    }
}
