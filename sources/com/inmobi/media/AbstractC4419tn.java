package com.inmobi.media;

import android.os.Build;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.tn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4419tn {
    public static final C3873a6 a(List list) {
        list.getClass();
        if (list.size() != 2) {
            return new C3873a6(0, 0);
        }
        return new C3873a6(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }

    public static final String a(String str) {
        str.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            return URLEncoder.encode(str, Charset.defaultCharset());
        }
        return URLEncoder.encode(str);
    }
}
