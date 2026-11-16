package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import defpackage.gg0;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PointerInputChange {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final boolean g;
    public final int h;
    public final long i;
    public final ArrayList j;
    public ConsumedData k;

    public final void a() {
        ConsumedData consumedData = this.k;
        consumedData.b = true;
        consumedData.a = true;
    }

    public final boolean b() {
        ConsumedData consumedData = this.k;
        return consumedData.b || consumedData.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) PointerId.b(this.a));
        sb.append(", uptimeMillis=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append((Object) Offset.h(this.c));
        sb.append(", pressed=");
        sb.append(this.d);
        sb.append(", previousUptimeMillis=");
        sb.append(this.e);
        sb.append(", previousPosition=");
        sb.append((Object) Offset.h(this.f));
        sb.append(", previousPressed=");
        sb.append(this.g);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        sb.append((Object) PointerType.a(this.h));
        sb.append(", historical=");
        Object obj = this.j;
        if (obj == null) {
            obj = gg0.a;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) Offset.h(this.i));
        sb.append(')');
        return sb.toString();
    }

    public PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = z2;
        this.h = i;
        this.i = j6;
        ConsumedData consumedData = new ConsumedData();
        consumedData.a = z3;
        consumedData.b = z3;
        this.k = consumedData;
    }

    public PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6) {
        this(j, j2, j3, z, j4, j5, z2, false, i, j6);
        this.j = arrayList;
    }
}
