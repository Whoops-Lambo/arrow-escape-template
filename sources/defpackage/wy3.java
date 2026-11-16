package defpackage;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbkc;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class wy3 extends zzbkc {
    public final /* synthetic */ int d;

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final String a(String str, String str2) {
        switch (this.d) {
            case 0:
                return str2;
            case 1:
                return str != null ? str : str2;
            default:
                String strB = b(str);
                String strB2 = b(str2);
                if (TextUtils.isEmpty(strB)) {
                    return strB2;
                }
                if (TextUtils.isEmpty(strB2)) {
                    return strB;
                }
                return jc1.o(strB, ",", new StringBuilder(String.valueOf(strB).length() + 1 + String.valueOf(strB2).length()), strB2);
        }
    }

    public static final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < str.length() && str.charAt(i2) == ',') {
            i2++;
        }
        while (length > 0) {
            int i3 = length - 1;
            if (str.charAt(i3) != ',') {
                break;
            }
            length = i3;
        }
        if (length < i2) {
            return null;
        }
        if (i2 == 0) {
            if (length == str.length()) {
                return str;
            }
        } else {
            i = i2;
        }
        return str.substring(i, length);
    }
}
