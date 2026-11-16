package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import defpackage.dt1;
import defpackage.qh1;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class VisibilityThresholdsKt {
    public static final Rect a;
    public static final Map b;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        a = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        TwoWayConverter twoWayConverter = VectorConvertersKt.b;
        Float fValueOf2 = Float.valueOf(1.0f);
        dt1 dt1Var = new dt1(twoWayConverter, fValueOf2);
        dt1 dt1Var2 = new dt1(VectorConvertersKt.h, fValueOf2);
        int i = IntOffset.c;
        dt1 dt1Var3 = new dt1(VectorConvertersKt.g, fValueOf2);
        dt1 dt1Var4 = new dt1(VectorConvertersKt.a, Float.valueOf(0.01f));
        dt1 dt1Var5 = new dt1(VectorConvertersKt.i, fValueOf);
        int i2 = Size.d;
        dt1 dt1Var6 = new dt1(VectorConvertersKt.e, fValueOf);
        int i3 = Offset.e;
        dt1 dt1Var7 = new dt1(VectorConvertersKt.f, fValueOf);
        TwoWayConverter twoWayConverter2 = VectorConvertersKt.c;
        Float fValueOf3 = Float.valueOf(0.1f);
        dt1 dt1Var8 = new dt1(twoWayConverter2, fValueOf3);
        int i4 = DpOffset.c;
        b = qh1.Y(dt1Var, dt1Var2, dt1Var3, dt1Var4, dt1Var5, dt1Var6, dt1Var7, dt1Var8, new dt1(VectorConvertersKt.d, fValueOf3));
    }
}
