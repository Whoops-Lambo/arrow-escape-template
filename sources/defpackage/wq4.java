package defpackage;

import com.google.android.gms.internal.ads.zzgyo;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class wq4 extends zzgyo {
    @Override // com.google.android.gms.internal.ads.zzgyo
    public final int e() {
        return 0;
    }

    public static final zzgyo f(int i) {
        if (i < 0) {
            return zzgyo.b;
        }
        return i > 0 ? zzgyo.c : zzgyo.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgyo
    public final zzgyo a(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgyo
    public final zzgyo b(int i, int i2) {
        return f(Integer.compare(i, i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgyo
    public final zzgyo c(boolean z, boolean z2) {
        return f(Boolean.compare(z2, z));
    }

    @Override // com.google.android.gms.internal.ads.zzgyo
    public final zzgyo d(boolean z, boolean z2) {
        return f(Boolean.compare(z, z2));
    }
}
