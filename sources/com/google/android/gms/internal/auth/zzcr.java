package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.ArrayMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcr {
    public static final ArrayMap a = new ArrayMap(0);

    public static synchronized Uri a() {
        ArrayMap arrayMap = a;
        Uri uri = (Uri) arrayMap.get("com.google.android.gms.auth_account");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        arrayMap.put("com.google.android.gms.auth_account", uri2);
        return uri2;
    }
}
