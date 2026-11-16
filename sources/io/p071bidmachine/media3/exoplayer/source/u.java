package io.p071bidmachine.media3.exoplayer.source;

import android.net.Uri;
import io.p071bidmachine.media3.datasource.k;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class u {
    public static final AtomicLong c = new AtomicLong();
    public final Map a;
    public final long b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(k kVar) {
        this(Collections.EMPTY_MAP, 0L);
        Uri uri = kVar.a;
    }

    public u(Map map, long j) {
        this.a = map;
        this.b = j;
    }
}
