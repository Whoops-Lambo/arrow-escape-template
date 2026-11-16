package androidx.compose.material;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/Colors;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Colors {
    public final ParcelableSnapshotMutableState a;
    public final ParcelableSnapshotMutableState b;
    public final ParcelableSnapshotMutableState c;
    public final ParcelableSnapshotMutableState d;
    public final ParcelableSnapshotMutableState e;
    public final ParcelableSnapshotMutableState f;
    public final ParcelableSnapshotMutableState g;
    public final ParcelableSnapshotMutableState h;
    public final ParcelableSnapshotMutableState i;
    public final ParcelableSnapshotMutableState j;
    public final ParcelableSnapshotMutableState k;
    public final ParcelableSnapshotMutableState l;
    public final ParcelableSnapshotMutableState m;

    public final long a() {
        return ((Color) this.e.getA()).a;
    }

    public final long b() {
        return ((Color) this.g.getA()).a;
    }

    public final long c() {
        return ((Color) this.k.getA()).a;
    }

    public final long d() {
        return ((Color) this.a.getA()).a;
    }

    public final long e() {
        return ((Color) this.c.getA()).a;
    }

    public final long f() {
        return ((Color) this.f.getA()).a;
    }

    public final boolean g() {
        return ((Boolean) this.m.getA()).booleanValue();
    }

    public final String toString() {
        return "Colors(primary=" + ((Object) Color.i(d())) + ", primaryVariant=" + ((Object) Color.i(((Color) this.b.getA()).a)) + ", secondary=" + ((Object) Color.i(e())) + ", secondaryVariant=" + ((Object) Color.i(((Color) this.d.getA()).a)) + ", background=" + ((Object) Color.i(a())) + ", surface=" + ((Object) Color.i(f())) + ", error=" + ((Object) Color.i(b())) + ", onPrimary=" + ((Object) Color.i(((Color) this.h.getA()).a)) + ", onSecondary=" + ((Object) Color.i(((Color) this.i.getA()).a)) + ", onBackground=" + ((Object) Color.i(((Color) this.j.getA()).a)) + ", onSurface=" + ((Object) Color.i(c())) + ", onError=" + ((Object) Color.i(((Color) this.l.getA()).a)) + ", isLight=" + g() + ')';
    }

    public Colors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        this.a = SnapshotStateKt.c(new Color(j), SnapshotStateKt.k());
        this.b = SnapshotStateKt.c(new Color(j2), SnapshotStateKt.k());
        this.c = SnapshotStateKt.c(new Color(j3), SnapshotStateKt.k());
        this.d = SnapshotStateKt.c(new Color(j4), SnapshotStateKt.k());
        this.e = SnapshotStateKt.c(new Color(j5), SnapshotStateKt.k());
        this.f = SnapshotStateKt.c(new Color(j6), SnapshotStateKt.k());
        this.g = SnapshotStateKt.c(new Color(j7), SnapshotStateKt.k());
        this.h = SnapshotStateKt.c(new Color(j8), SnapshotStateKt.k());
        this.i = SnapshotStateKt.c(new Color(j9), SnapshotStateKt.k());
        this.j = SnapshotStateKt.c(new Color(j10), SnapshotStateKt.k());
        this.k = SnapshotStateKt.c(new Color(j11), SnapshotStateKt.k());
        this.l = SnapshotStateKt.c(new Color(j12), SnapshotStateKt.k());
        this.m = SnapshotStateKt.c(Boolean.valueOf(z), SnapshotStateKt.k());
    }
}
