package io.p071bidmachine.iab.vast;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class g implements Comparable {
    public long a;
    public File b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.a;
        long j2 = ((g) obj).a;
        if (j > j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }
}
