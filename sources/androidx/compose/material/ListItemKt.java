package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.eu;
import defpackage.h50;
import defpackage.hg0;
import defpackage.nj;
import defpackage.sr0;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ListItemKt {
    public static final void a(final List list, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        ComposerImpl composerImplT = composer.t(1631148337);
        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final MeasureResult a(MeasureScope measureScope, List list2, long j) {
                int iF0;
                measureScope.getClass();
                list2.getClass();
                long jA = Constraints.a(0, j, 0, 0, Integer.MAX_VALUE, 3);
                List list3 = list2;
                ArrayList arrayList = new ArrayList(eu.f(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Measurable) it.next()).Y(jA));
                }
                int size = arrayList.size();
                int iMax = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    iMax = Math.max(iMax, ((Placeable) obj).a);
                }
                int size2 = arrayList.size();
                Integer[] numArr = new Integer[size2];
                for (int i3 = 0; i3 < size2; i3++) {
                    numArr[i3] = 0;
                }
                int size3 = arrayList.size();
                int i4 = 0;
                for (int i5 = 0; i5 < size3; i5++) {
                    Placeable placeable = (Placeable) arrayList.get(i5);
                    if (i5 > 0) {
                        int i6 = i5 - 1;
                        iF0 = ((Placeable) arrayList.get(i6)).b - ((Placeable) arrayList.get(i6)).f0(AlignmentLineKt.b);
                    } else {
                        iF0 = 0;
                    }
                    int iMax2 = Math.max(0, (measureScope.mo1roundToPx0680j_4(((Dp) list.get(i5)).a) - placeable.f0(AlignmentLineKt.a)) - iF0);
                    numArr[i5] = Integer.valueOf(iMax2 + i4);
                    i4 += iMax2 + placeable.b;
                }
                return measureScope.C(iMax, i4, hg0.a, new ListItemKt$BaselinesOffsetColumn$1$measure$2(arrayList, numArr));
            }
        };
        composerImplT.B(-1323940314);
        Density density = (Density) composerImplT.v(CompositionLocalsKt.e);
        LayoutDirection layoutDirection = (LayoutDirection) composerImplT.v(CompositionLocalsKt.k);
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerImplT.v(CompositionLocalsKt.o);
        ComposeUiNode.X8.getClass();
        sr0 sr0Var = ComposeUiNode.Companion.b;
        ComposableLambdaImpl composableLambdaImplA = LayoutKt.a(modifier);
        int i2 = (((((i >> 6) & 14) | (i & 112)) << 9) & 7168) | 6;
        composerImplT.g();
        if (composerImplT.K) {
            composerImplT.E(sr0Var);
        } else {
            composerImplT.d();
        }
        composerImplT.x = false;
        Updater.a(ComposeUiNode.Companion.e, composerImplT, measurePolicy);
        Updater.a(ComposeUiNode.Companion.d, composerImplT, density);
        Updater.a(ComposeUiNode.Companion.f, composerImplT, layoutDirection);
        nj.u(0, composableLambdaImplA, h50.g(composerImplT, viewConfiguration, ComposeUiNode.Companion.g, composerImplT), composerImplT, 2058660585);
        composableLambdaImpl.invoke(composerImplT, Integer.valueOf((i2 >> 9) & 14));
        composerImplT.R(false);
        composerImplT.R(true);
        composerImplT.R(false);
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new ListItemKt$BaselinesOffsetColumn$2(list, modifier, composableLambdaImpl, i);
    }

    public static final void b(final float f, Modifier modifier, zr0 zr0Var, Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        ComposerImpl composerImplT = composer.t(-1062692685);
        if ((i & 14) == 0) {
            if (composerImplT.n(f)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (composerImplT.l(modifier)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i & 896) == 0) {
            if (composerImplT.l(zr0Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i3 & 731) == 146 && composerImplT.b()) {
            composerImplT.h();
        } else {
            if (i7 != 0) {
                modifier = Modifier.Companion.a;
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final MeasureResult a(MeasureScope measureScope, List list, long j) {
                    int iMax;
                    int iMo1roundToPx0680j_4;
                    measureScope.getClass();
                    list.getClass();
                    Placeable placeableY = ((Measurable) list.get(0)).Y(Constraints.a(0, j, 0, 0, 0, 11));
                    int iF0 = placeableY.f0(AlignmentLineKt.a);
                    if (iF0 != Integer.MIN_VALUE) {
                        iMo1roundToPx0680j_4 = measureScope.mo1roundToPx0680j_4(f) - iF0;
                        iMax = Math.max(Constraints.i(j), placeableY.b + iMo1roundToPx0680j_4);
                    } else {
                        iMax = Math.max(Constraints.i(j), placeableY.b);
                        long jA = Alignment.Companion.e.a(0L, IntSizeKt.a(0, iMax - placeableY.b), measureScope.getA());
                        int i8 = IntOffset.c;
                        iMo1roundToPx0680j_4 = (int) (jA & 4294967295L);
                    }
                    return measureScope.C(placeableY.a, iMax, hg0.a, new ListItemKt$OffsetToBaselineOrCenter$1$measure$1(iMo1roundToPx0680j_4, placeableY));
                }
            };
            int i8 = (i3 & 112) | ((i3 >> 6) & 14);
            composerImplT.B(-1323940314);
            Density density = (Density) composerImplT.v(CompositionLocalsKt.e);
            LayoutDirection layoutDirection = (LayoutDirection) composerImplT.v(CompositionLocalsKt.k);
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerImplT.v(CompositionLocalsKt.o);
            ComposeUiNode.X8.getClass();
            sr0 sr0Var = ComposeUiNode.Companion.b;
            ComposableLambdaImpl composableLambdaImplA = LayoutKt.a(modifier);
            int i9 = ((i8 << 9) & 7168) | 6;
            composerImplT.g();
            if (composerImplT.K) {
                composerImplT.E(sr0Var);
            } else {
                composerImplT.d();
            }
            composerImplT.x = false;
            Updater.a(ComposeUiNode.Companion.e, composerImplT, measurePolicy);
            Updater.a(ComposeUiNode.Companion.d, composerImplT, density);
            Updater.a(ComposeUiNode.Companion.f, composerImplT, layoutDirection);
            nj.u(0, composableLambdaImplA, h50.g(composerImplT, viewConfiguration, ComposeUiNode.Companion.g, composerImplT), composerImplT, 2058660585);
            zr0Var.invoke(composerImplT, Integer.valueOf((i9 >> 9) & 14));
            composerImplT.R(false);
            composerImplT.R(true);
            composerImplT.R(false);
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new ListItemKt$OffsetToBaselineOrCenter$2(f, modifier2, zr0Var, i, i2);
    }
}
