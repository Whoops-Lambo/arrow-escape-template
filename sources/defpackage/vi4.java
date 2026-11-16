package defpackage;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzfve;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class vi4 {
    public final String a;
    public final AdFormat b;
    public final String c;

    public final String a() {
        AdFormat adFormat = this.b;
        return adFormat == null ? "unknown" : adFormat.name().toLowerCase(Locale.ENGLISH);
    }

    public final boolean equals(Object obj) {
        AdFormat adFormat;
        AdFormat adFormat2;
        if (obj instanceof vi4) {
            vi4 vi4Var = (vi4) obj;
            if (this.a.equals(vi4Var.a) && (adFormat = this.b) != null && (adFormat2 = vi4Var.b) != null && adFormat.equals(adFormat2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public /* synthetic */ vi4(zzfve zzfveVar) {
        this.a = zzfveVar.a;
        this.b = zzfveVar.b;
        this.c = zzfveVar.c;
    }
}
