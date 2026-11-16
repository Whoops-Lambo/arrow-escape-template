package io.p071bidmachine.media3.exoplayer.upstream;

import defpackage.nj;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class k extends IOException {
    public k(Throwable th) {
        StringBuilder sb = new StringBuilder("Unexpected ");
        sb.append(th.getClass().getSimpleName());
        sb.append(th.getMessage() != null ? nj.r(th, new StringBuilder(": ")) : "");
        super(sb.toString(), th);
    }
}
