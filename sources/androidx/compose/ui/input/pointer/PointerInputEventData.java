package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import defpackage.jc1;
import defpackage.pv1;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventData;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class PointerInputEventData {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final ArrayList h;
    public final long i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
        return PointerId.a(this.a, pointerInputEventData.a) && this.b == pointerInputEventData.b && Offset.a(this.c, pointerInputEventData.c) && Offset.a(this.d, pointerInputEventData.d) && this.e == pointerInputEventData.e && this.f == pointerInputEventData.f && this.g == pointerInputEventData.g && this.h.equals(pointerInputEventData.h) && Offset.a(this.i, pointerInputEventData.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final int hashCode() {
        int iD = pv1.d(Long.hashCode(this.a) * 31, 31, this.b);
        int i = Offset.e;
        int iD2 = pv1.d(pv1.d(iD, 31, this.c), 31, this.d);
        boolean z = this.e;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        int iD3 = jc1.d(this.f, (iD2 + r3) * 31, 31);
        boolean z2 = this.g;
        return Long.hashCode(this.i) + ((this.h.hashCode() + ((iD3 + (z2 ? 1 : z2)) * 31)) * 31);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.b(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) Offset.h(this.c)) + ", position=" + ((Object) Offset.h(this.d)) + ", down=" + this.e + ", type=" + ((Object) PointerType.a(this.f)) + ", issuesEnterExit=" + this.g + ", historical=" + this.h + ", scrollDelta=" + ((Object) Offset.h(this.i)) + ')';
    }

    public PointerInputEventData(long j, long j2, long j3, long j4, boolean z, int i, boolean z2, ArrayList arrayList, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = i;
        this.g = z2;
        this.h = arrayList;
        this.i = j5;
    }
}
