package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.h50;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/semantics/ScrollAxisRange;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ScrollAxisRange {
    public final sr0 a;
    public final sr0 b;
    public final boolean c;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(((Number) this.a.invoke()).floatValue());
        sb.append(", maxValue=");
        sb.append(((Number) this.b.invoke()).floatValue());
        sb.append(", reverseScrolling=");
        return h50.m(sb, this.c, ')');
    }

    public ScrollAxisRange(sr0 sr0Var, sr0 sr0Var2, boolean z) {
        this.a = sr0Var;
        this.b = sr0Var2;
        this.c = z;
    }
}
