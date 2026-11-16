package com.adsurge.adn.y1;

import android.text.TextUtils;
import com.adsurge.adn.I0.h;
import com.adsurge.adn.N.d;
import com.adsurge.adn.x1.l;
import defpackage.n30;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b {
    public static File a(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, n30.m(str, "_complete"));
        if (!file2.exists()) {
            return null;
        }
        File file3 = new File(file, str);
        if (file3.exists()) {
            long jA = d.b().a();
            file3.setLastModified(jA);
            file2.setLastModified(jA);
            file3.getName();
            return file3;
        }
        file2.delete();
        return null;
    }

    public static File b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(a(str), l.i());
    }

    public static String a(String str) {
        return h.a(str);
    }
}
