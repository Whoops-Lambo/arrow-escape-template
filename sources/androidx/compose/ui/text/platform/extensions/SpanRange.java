package androidx.compose.ui.text.platform.extensions;

import android.text.style.MetricAffectingSpan;
import defpackage.h50;
import defpackage.jc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/platform/extensions/SpanRange;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final /* data */ class SpanRange {
    public final MetricAffectingSpan a;
    public final int b;
    public final int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpanRange)) {
            return false;
        }
        SpanRange spanRange = (SpanRange) obj;
        return this.a.equals(spanRange.a) && this.b == spanRange.b && this.c == spanRange.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + jc1.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanRange(span=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        return h50.l(sb, this.c, ')');
    }

    public SpanRange(MetricAffectingSpan metricAffectingSpan, int i, int i2) {
        this.a = metricAffectingSpan;
        this.b = i;
        this.c = i2;
    }
}
