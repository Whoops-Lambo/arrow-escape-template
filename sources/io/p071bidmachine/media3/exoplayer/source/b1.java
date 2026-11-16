package io.p071bidmachine.media3.exoplayer.source;

import com.facebook.internal.j0;
import io.p071bidmachine.media3.decoder.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface b1 {
    int g(j0 j0Var, e eVar, int i);

    boolean isReady();

    void maybeThrowError();

    int skipData(long j);
}
