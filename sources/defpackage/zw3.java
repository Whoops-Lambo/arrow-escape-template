package defpackage;

import com.google.android.gms.internal.fido.zzbl;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zw3 extends zzbl {
    public static final zw3 a = new zw3();

    @Override // com.google.android.gms.internal.fido.zzbl
    public final boolean f() {
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final Object d() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    public final int hashCode() {
        return 2040732332;
    }
}
