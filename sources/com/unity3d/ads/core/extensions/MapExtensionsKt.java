package com.unity3d.ads.core.extensions;

import defpackage.er;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"sizeInKb", "", "", "", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MapExtensionsKt {
    public static final int sizeInKb(@NotNull Map<String, String> map) {
        map.getClass();
        Iterator<T> it = map.entrySet().iterator();
        int length = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Charset charset = er.a;
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            int length2 = bytes.length;
            byte[] bytes2 = str2.getBytes(charset);
            bytes2.getClass();
            length += length2 + bytes2.length;
        }
        return length / 1024;
    }
}
