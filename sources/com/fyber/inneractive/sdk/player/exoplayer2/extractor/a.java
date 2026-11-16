package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements q {
    public final long[] a;
    public final long[] b;
    public final long c;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j) {
        return this.a[z.a(this.b, j, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.c;
    }

    public a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr3;
        int length = iArr.length;
        if (length > 0) {
            int i = length - 1;
            this.c = jArr2[i] + jArr3[i];
        } else {
            this.c = 0L;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }
}
