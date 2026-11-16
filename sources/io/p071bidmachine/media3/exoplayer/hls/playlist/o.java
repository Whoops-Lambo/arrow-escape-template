package io.p071bidmachine.media3.exoplayer.hls.playlist;

import io.p071bidmachine.media3.exoplayer.offline.a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class o implements a {
    public final String a;
    public final List b;
    public final boolean c;

    public o(String str, List list, boolean z) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }
}
