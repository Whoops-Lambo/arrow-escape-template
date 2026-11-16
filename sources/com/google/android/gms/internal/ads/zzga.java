package com.google.android.gms.internal.ads;

import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.q63;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzga {
    public final String a;

    public static zzga a(zzey zzeyVar) {
        String str;
        zzeyVar.G(2);
        int iK = zzeyVar.K();
        int i = iK >> 1;
        int i2 = iK & 1;
        int iK2 = zzeyVar.K() >> 3;
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        int i3 = iK2 | (i2 << 5);
        String str2 = UserDetailsUtils.UserDetailsLiterals.DOT;
        String str3 = i < 10 ? ".0" : UserDetailsUtils.UserDetailsLiterals.DOT;
        int length = str3.length() + 4;
        int length2 = String.valueOf(i).length();
        int length3 = String.valueOf(i3).length();
        if (i3 < 10) {
            str2 = ".0";
        }
        StringBuilder sb = new StringBuilder(q63.a(length + length2, length3, str2));
        sb.append(str);
        sb.append(str3);
        sb.append(i);
        sb.append(str2);
        sb.append(i3);
        return new zzga(sb.toString());
    }

    public zzga(String str) {
        this.a = str;
    }
}
