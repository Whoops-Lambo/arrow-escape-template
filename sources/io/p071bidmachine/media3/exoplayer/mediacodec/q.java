package io.p071bidmachine.media3.exoplayer.mediacodec;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q implements Comparator {
    public final /* synthetic */ v a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        v vVar = this.a;
        return vVar.getScore(obj2) - vVar.getScore(obj);
    }
}
