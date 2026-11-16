package androidx.compose.ui;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.h50;
import defpackage.rd1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/BiasAlignment;", "Landroidx/compose/ui/Alignment;", "Horizontal", "Vertical", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class BiasAlignment implements Alignment {
    public final float a;
    public final float b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/BiasAlignment$Horizontal;", "Landroidx/compose/ui/Alignment$Horizontal;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class Horizontal implements Alignment.Horizontal {
        public final float a;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Horizontal) && Float.valueOf(this.a).equals(Float.valueOf(((Horizontal) obj).a));
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return h50.k(new StringBuilder("Horizontal(bias="), this.a, ')');
        }

        public Horizontal(float f) {
            this.a = f;
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public final int a(int i, int i2, LayoutDirection layoutDirection) {
            layoutDirection.getClass();
            float f = (i2 - i) / 2.0f;
            LayoutDirection layoutDirection2 = LayoutDirection.a;
            float f2 = this.a;
            if (layoutDirection != layoutDirection2) {
                f2 *= -1.0f;
            }
            return rd1.p((1.0f + f2) * f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/BiasAlignment$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class Vertical implements Alignment.Vertical {
        public final float a;

        @Override // androidx.compose.ui.Alignment.Vertical
        public final int a(int i, int i2) {
            return rd1.p((1.0f + this.a) * ((i2 - i) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Vertical) && Float.valueOf(this.a).equals(Float.valueOf(((Vertical) obj).a));
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return h50.k(new StringBuilder("Vertical(bias="), this.a, ')');
        }

        public Vertical(float f) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAlignment)) {
            return false;
        }
        BiasAlignment biasAlignment = (BiasAlignment) obj;
        return Float.valueOf(this.a).equals(Float.valueOf(biasAlignment.a)) && Float.valueOf(this.b).equals(Float.valueOf(biasAlignment.b));
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.a);
        sb.append(", verticalBias=");
        return h50.k(sb, this.b, ')');
    }

    public BiasAlignment(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // androidx.compose.ui.Alignment
    public final long a(long j, long j2, LayoutDirection layoutDirection) {
        layoutDirection.getClass();
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.a;
        float f3 = this.a;
        if (layoutDirection != layoutDirection2) {
            f3 *= -1.0f;
        }
        return IntOffsetKt.a(rd1.p((f3 + 1.0f) * f), rd1.p((1.0f + this.b) * f2));
    }
}
