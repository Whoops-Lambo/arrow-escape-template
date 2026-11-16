package com.adsurge.adn.oversea_ad;

import android.text.TextUtils;
import com.ironsource.C4664b4;
import com.singular.sdk.internal.UserDetailsUtils;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.private, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class Cprivate {
    public final String a;
    public final int b;
    public final k c;

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(a(this.a));
        sb.append("_");
        sb.append(this.b);
        sb.append("_");
        k kVar = this.c;
        if (kVar == null) {
            return sb.toString();
        }
        sb.append(kVar.a);
        sb.append(":");
        sb.append(this.c.b);
        sb.append(":");
        Iterator it = this.c.c.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            sb.append(lVar.a);
            sb.append(",,,");
            Locale locale = Locale.SIMPLIFIED_CHINESE;
            String strReplaceAll = String.format(locale, "%.5f", Float.valueOf(lVar.d));
            if (strReplaceAll.indexOf(UserDetailsUtils.UserDetailsLiterals.DOT) > 0) {
                strReplaceAll = strReplaceAll.replaceAll("0+?$", "").replaceAll("[.]$", "");
            }
            sb.append(strReplaceAll);
            sb.append(",");
            String strReplaceAll2 = String.format(locale, "%.5f", Float.valueOf(lVar.e));
            if (strReplaceAll2.indexOf(UserDetailsUtils.UserDetailsLiterals.DOT) > 0) {
                strReplaceAll2 = strReplaceAll2.replaceAll("0+?$", "").replaceAll("[.]$", "");
            }
            sb.append(strReplaceAll2);
            if (it.hasNext()) {
                sb.append(";");
            }
        }
        sb.append(":");
        sb.append(this.c.d);
        return sb.toString();
    }

    public Cprivate(String str, int i, k kVar) {
        this.a = str;
        this.b = i;
        this.c = kVar;
    }

    public static String a(String str) {
        if (str == null) {
            str = "";
        }
        b bVar = c.a;
        if (!TextUtils.isEmpty(str)) {
            str = str.replace(":", "%3A");
        }
        if (!TextUtils.isEmpty(str)) {
            str = str.replace(";", "%3B");
        }
        if (!TextUtils.isEmpty(str)) {
            str = str.replace("_", "%5F");
        }
        if (!TextUtils.isEmpty(str)) {
            str = str.replace(",", "%54");
        }
        return !TextUtils.isEmpty(str) ? str.replace(C4664b4.j.c, "%0A") : str;
    }
}
