package io.p071bidmachine.media3.datasource;

import androidx.annotation.Nullable;
import defpackage.pv1;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class t extends r {
    public final int d;

    @Nullable
    public final String e;
    public final Map<String, List<String>> f;
    public final byte[] g;

    public t(int i, @Nullable String str, @Nullable IOException iOException, Map<String, List<String>> map, k kVar, byte[] bArr) {
        super(pv1.k(i, "Response code: "), iOException, kVar, 2004, 1);
        this.d = i;
        this.e = str;
        this.f = map;
        this.g = bArr;
    }
}
