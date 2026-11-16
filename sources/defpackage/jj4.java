package defpackage;

import com.google.android.gms.internal.games_v2.zzhi;
import com.google.android.gms.internal.games_v2.zzhy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class jj4 implements zzhy {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhy) {
            return ((zzhi) this).zzc().equals(((zzhy) obj).zzc());
        }
        return false;
    }

    public final int hashCode() {
        return ((zzhi) this).zzc().hashCode();
    }

    public final String toString() {
        return ((zzhi) this).zzc().toString();
    }
}
