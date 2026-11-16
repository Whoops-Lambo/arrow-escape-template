package io.p071bidmachine.media3.extractor.text.cea;

import io.p071bidmachine.media3.extractor.text.i;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class g extends i implements Comparable {
    public long k;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (d(4) != gVar.d(4)) {
            return d(4) ? 1 : -1;
        }
        long j = this.g - gVar.g;
        if (j == 0) {
            j = this.k - gVar.k;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
