package defpackage;

import com.google.android.gms.internal.ads.zzgvq;
import com.google.android.gms.internal.ads.zzgvx;
import com.google.android.gms.internal.ads.zzgvz;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class up4 extends zzgvx {
    public final Object a;

    @Override // com.google.android.gms.internal.ads.zzgvx
    public final Object d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof up4) {
            return this.a.equals(((up4) obj).a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgvx
    public final zzgvx f(zzgvq zzgvqVar) {
        Object objApply = zzgvqVar.apply(this.a);
        zzgvz.h(objApply, "the Function passed to Optional.transform() must not return null.");
        return new up4(objApply);
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.a.toString();
        return jc1.o("Optional.of(", string, new StringBuilder(string.length() + 13), ")");
    }

    public up4(Object obj) {
        this.a = obj;
    }
}
