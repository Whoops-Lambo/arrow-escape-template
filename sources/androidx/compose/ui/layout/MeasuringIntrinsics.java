package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics;", "", "DefaultIntrinsicMeasurable", "EmptyPlaceable", "IntrinsicMinMax", "IntrinsicWidthHeight", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class MeasuringIntrinsics {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$DefaultIntrinsicMeasurable;", "Landroidx/compose/ui/layout/Measurable;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultIntrinsicMeasurable implements Measurable {
        public final IntrinsicMeasurable a;
        public final IntrinsicMinMax b;
        public final IntrinsicWidthHeight c;

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int F(int i) {
            return this.a.F(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int N(int i) {
            return this.a.N(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int R(int i) {
            return this.a.R(i);
        }

        @Override // androidx.compose.ui.layout.Measurable
        public final Placeable Y(long j) {
            IntrinsicMeasurable intrinsicMeasurable = this.a;
            IntrinsicMinMax intrinsicMinMax = IntrinsicMinMax.b;
            IntrinsicWidthHeight intrinsicWidthHeight = this.c;
            IntrinsicWidthHeight intrinsicWidthHeight2 = IntrinsicWidthHeight.a;
            IntrinsicMinMax intrinsicMinMax2 = this.b;
            if (intrinsicWidthHeight == intrinsicWidthHeight2) {
                return new EmptyPlaceable(intrinsicMinMax2 == intrinsicMinMax ? intrinsicMeasurable.R(Constraints.g(j)) : intrinsicMeasurable.N(Constraints.g(j)), Constraints.g(j));
            }
            return new EmptyPlaceable(Constraints.h(j), intrinsicMinMax2 == intrinsicMinMax ? intrinsicMeasurable.p(Constraints.h(j)) : intrinsicMeasurable.F(Constraints.h(j)));
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final Object a() {
            return this.a.a();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int p(int i) {
            return this.a.p(i);
        }

        public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
            intrinsicMeasurable.getClass();
            this.a = intrinsicMeasurable;
            this.b = intrinsicMinMax;
            this.c = intrinsicWidthHeight;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicMinMax;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class IntrinsicMinMax {
        public static final IntrinsicMinMax a;
        public static final IntrinsicMinMax b;
        public static final /* synthetic */ IntrinsicMinMax[] c;

        static {
            IntrinsicMinMax intrinsicMinMax = new IntrinsicMinMax("Min", 0);
            a = intrinsicMinMax;
            IntrinsicMinMax intrinsicMinMax2 = new IntrinsicMinMax("Max", 1);
            b = intrinsicMinMax2;
            c = new IntrinsicMinMax[]{intrinsicMinMax, intrinsicMinMax2};
        }

        public static IntrinsicMinMax valueOf(String str) {
            return (IntrinsicMinMax) Enum.valueOf(IntrinsicMinMax.class, str);
        }

        public static IntrinsicMinMax[] values() {
            return (IntrinsicMinMax[]) c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicWidthHeight;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class IntrinsicWidthHeight {
        public static final IntrinsicWidthHeight a;
        public static final IntrinsicWidthHeight b;
        public static final /* synthetic */ IntrinsicWidthHeight[] c;

        static {
            IntrinsicWidthHeight intrinsicWidthHeight = new IntrinsicWidthHeight("Width", 0);
            a = intrinsicWidthHeight;
            IntrinsicWidthHeight intrinsicWidthHeight2 = new IntrinsicWidthHeight("Height", 1);
            b = intrinsicWidthHeight2;
            c = new IntrinsicWidthHeight[]{intrinsicWidthHeight, intrinsicWidthHeight2};
        }

        public static IntrinsicWidthHeight valueOf(String str) {
            return (IntrinsicWidthHeight) Enum.valueOf(IntrinsicWidthHeight.class, str);
        }

        public static IntrinsicWidthHeight[] values() {
            return (IntrinsicWidthHeight[]) c.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$EmptyPlaceable;", "Landroidx/compose/ui/layout/Placeable;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class EmptyPlaceable extends Placeable {
        @Override // androidx.compose.ui.layout.Placeable
        public final void t0(long j, float f, wr0 wr0Var) {
        }

        public EmptyPlaceable(int i, int i2) {
            w0(IntSizeKt.a(i, i2));
        }

        @Override // androidx.compose.ui.layout.Measured
        public final int f0(AlignmentLine alignmentLine) {
            alignmentLine.getClass();
            return Integer.MIN_VALUE;
        }
    }
}
