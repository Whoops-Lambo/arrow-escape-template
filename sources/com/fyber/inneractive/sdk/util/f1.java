package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import com.ironsource.C4664b4;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f1 {
    public static String a(String str, HashMap map) {
        StringBuilder sb = new StringBuilder(str);
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            sb.append(z ? "?" : C4664b4.j.c);
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append(Uri.encode((String) entry.getValue()));
            z = false;
        }
        return sb.toString();
    }
}
