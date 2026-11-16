package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class a extends c {
    public final long R0;
    public final ArrayList S0;
    public final ArrayList T0;

    public final a b(int i) {
        int size = this.T0.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = (a) this.T0.get(i2);
            if (aVar.a == i) {
                return aVar;
            }
        }
        return null;
    }

    public final b c(int i) {
        int size = this.S0.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) this.S0.get(i2);
            if (bVar.a == i) {
                return bVar;
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c
    public final String toString() {
        return c.a(this.a) + " leaves: " + Arrays.toString(this.S0.toArray()) + " containers: " + Arrays.toString(this.T0.toArray());
    }

    public a(int i, long j) {
        super(i);
        this.R0 = j;
        this.S0 = new ArrayList();
        this.T0 = new ArrayList();
    }
}
