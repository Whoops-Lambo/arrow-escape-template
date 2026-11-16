package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import androidx.collection.ArrayMap;
import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzlg {
    public static final ArrayMap a = new ArrayMap(0);

    public static synchronized Uri a() {
        ArrayMap arrayMap = a;
        Uri uri = (Uri) arrayMap.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        arrayMap.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }

    public static String b(Context context, String str) {
        if (str.contains("#")) {
            defpackage.d.r("The passed in package cannot already have a subpackage: ".concat(str));
            return null;
        }
        String packageName = context.getPackageName();
        return jc1.o(str, "#", new StringBuilder(str.length() + 1 + String.valueOf(packageName).length()), packageName);
    }
}
