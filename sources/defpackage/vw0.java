package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vw0 {
    public ArrayList a;

    public final int a(int i) {
        return ((int[]) this.a.get(i / 768))[i % 768];
    }

    public final void b(int i, int i2) {
        ((int[]) this.a.get(i / 768))[i % 768] = i2;
    }
}
