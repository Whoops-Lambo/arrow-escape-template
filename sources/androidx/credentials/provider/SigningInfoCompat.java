package androidx.credentials.provider;

import defpackage.jc1;
import defpackage.pv1;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/provider/SigningInfoCompat;", "", "Companion", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SigningInfoCompat {
    public final List a;
    public final List b;
    public final Collection c;
    public final int d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/SigningInfoCompat$Companion;", "", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SigningInfoCompat)) {
            return false;
        }
        SigningInfoCompat signingInfoCompat = (SigningInfoCompat) obj;
        return this.a.equals(signingInfoCompat.a) && this.b.equals(signingInfoCompat.b) && this.c.equals(signingInfoCompat.c) && this.d == signingInfoCompat.d && this.e == signingInfoCompat.e && this.f == signingInfoCompat.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + jc1.f((((this.c.hashCode() + pv1.e(this.a.hashCode() * 31, 31, this.b)) * 31) + this.d) * 31, 31, this.e);
    }

    public SigningInfoCompat(List list, List list2, Collection collection, int i, boolean z, boolean z2) {
        this.a = list;
        this.b = list2;
        this.c = collection;
        this.d = i;
        this.e = z;
        this.f = z2;
    }
}
