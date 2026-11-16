package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class r implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float f = ((s) obj).c;
        float f2 = ((s) obj2).c;
        if (f < f2) {
            return -1;
        }
        return f2 < f ? 1 : 0;
    }
}
