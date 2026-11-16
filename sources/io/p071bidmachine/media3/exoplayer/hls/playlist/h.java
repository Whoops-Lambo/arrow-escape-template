package io.p071bidmachine.media3.exoplayer.hls.playlist;

import defpackage.d31;
import defpackage.y32;
import defpackage.z21;
import io.p071bidmachine.media3.common.DrmInitData;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class h extends i {
    public final String l;
    public final d31 m;

    public h(String str, h hVar, String str2, long j, int i, long j2, DrmInitData drmInitData, String str3, String str4, long j3, long j4, boolean z, List list) {
        super(str, hVar, j, i, j2, drmInitData, str3, str4, j3, j4, z);
        this.l = str2;
        this.m = d31.A(list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(String str, long j, long j2, String str2, String str3) {
        this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, y32.e);
        z21 z21Var = d31.b;
    }
}
