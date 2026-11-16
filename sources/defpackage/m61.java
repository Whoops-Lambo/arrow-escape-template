package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class m61 implements gd1, Serializable {
    public final Object a;

    @Override // defpackage.gd1
    public final boolean isInitialized() {
        return true;
    }

    @Override // defpackage.gd1
    public final Object getValue() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }

    public m61(Object obj) {
        this.a = obj;
    }
}
