package defpackage;

import com.google.android.gms.internal.ads.zzapr;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class uu3 implements Comparable {
    public final int a;
    public final zzapr b;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.a, ((uu3) obj).a);
    }

    public uu3(int i, zzapr zzaprVar) {
        this.a = i;
        this.b = zzaprVar;
    }
}
