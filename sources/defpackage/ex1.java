package defpackage;

import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ex1 {
    public final String a;
    public final String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ex1) && s71.b(this.a, ((ex1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return pv1.n("PredefinedUILanguage(isoCode=", this.a, ")");
    }

    public ex1(String str) {
        String strValueOf;
        str.getClass();
        this.a = str;
        List listF = zu1.a.f(str);
        String str2 = (String) du.d0(0, listF);
        str2 = str2 == null ? "" : str2;
        String str3 = (String) du.d0(1, listF);
        Locale locale = new Locale(str2, str3 != null ? str3 : "");
        String displayName = locale.getDisplayName(locale);
        displayName.getClass();
        if (displayName.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char cCharAt = displayName.charAt(0);
            if (Character.isLowerCase(cCharAt)) {
                String strValueOf2 = String.valueOf(cCharAt);
                strValueOf2.getClass();
                strValueOf = strValueOf2.toUpperCase(locale);
                strValueOf.getClass();
                if (strValueOf.length() > 1) {
                    if (cCharAt != 329) {
                        char cCharAt2 = strValueOf.charAt(0);
                        String lowerCase = strValueOf.substring(1).toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        strValueOf = cCharAt2 + lowerCase;
                    }
                } else {
                    String strValueOf3 = String.valueOf(cCharAt);
                    strValueOf3.getClass();
                    String upperCase = strValueOf3.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    if (strValueOf.equals(upperCase)) {
                        strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
                    }
                }
            } else {
                strValueOf = String.valueOf(cCharAt);
            }
            sb.append((Object) strValueOf);
            sb.append(displayName.substring(1));
            displayName = sb.toString();
        }
        this.b = displayName;
    }
}
