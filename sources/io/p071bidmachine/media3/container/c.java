package io.p071bidmachine.media3.container;

import defpackage.y9;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class c extends y9 {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public c(int i, long j) {
        super(i, 1);
        this.c = j;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final c f(int i) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = (c) arrayList.get(i2);
            if (cVar.b == i) {
                return cVar;
            }
        }
        return null;
    }

    public final d g(int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) arrayList.get(i2);
            if (dVar.b == i) {
                return dVar;
            }
        }
        return null;
    }

    @Override // defpackage.y9
    public final String toString() {
        return y9.c(this.b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.e.toArray());
    }
}
