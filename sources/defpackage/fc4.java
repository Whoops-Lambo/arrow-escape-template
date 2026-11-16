package defpackage;

import com.google.android.gms.internal.ads.zzr;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class fc4 {
    public final Object a;
    public zzr b = new zzr();
    public boolean c;
    public boolean d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fc4.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((fc4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public fc4(Object obj) {
        this.a = obj;
    }
}
