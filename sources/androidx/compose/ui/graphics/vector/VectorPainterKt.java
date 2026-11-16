package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import defpackage.hg0;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class VectorPainterKt {
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:35:0x0173  */
    public static final void a(VectorGroup vectorGroup, Map map, Composer composer, int i, int i2) {
        Map map2;
        VectorGroup.AnonymousClass1 anonymousClass1;
        VectorNode vectorNode;
        VectorGroup.AnonymousClass1 anonymousClass2;
        ComposerImpl composerImplT = composer.t(-446179233);
        int i3 = (composerImplT.l(vectorGroup) ? 4 : 2) | i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 16;
        }
        if (i4 == 2 && (i3 & 91) == 18 && composerImplT.b()) {
            composerImplT.h();
            map2 = map;
        } else {
            composerImplT.r0();
            if ((i & 1) == 0 || composerImplT.X()) {
                if (i4 != 0) {
                    map2 = hg0.a;
                }
                composerImplT.S();
                anonymousClass1 = new VectorGroup.AnonymousClass1(vectorGroup);
                while (anonymousClass1.a.hasNext()) {
                    vectorNode = (VectorNode) anonymousClass1.next();
                    if (vectorNode instanceof VectorPath) {
                        composerImplT.B(-326285835);
                        VectorPath vectorPath = (VectorPath) vectorNode;
                        String str = vectorPath.a;
                        ComposerImpl composerImpl = composerImplT;
                        anonymousClass2 = anonymousClass1;
                        VectorComposeKt.b(vectorPath.b, vectorPath.c, str, vectorPath.d, Float.valueOf(vectorPath.e).floatValue(), vectorPath.f, Float.valueOf(vectorPath.g).floatValue(), Float.valueOf(vectorPath.h).floatValue(), vectorPath.i, vectorPath.j, vectorPath.k, Float.valueOf(vectorPath.l).floatValue(), Float.valueOf(vectorPath.m).floatValue(), Float.valueOf(vectorPath.n).floatValue(), composerImpl, 8);
                        composerImplT = composerImpl;
                        composerImplT.R(false);
                    } else {
                        anonymousClass2 = anonymousClass1;
                        if (vectorNode instanceof VectorGroup) {
                            composerImplT.B(-326283977);
                            VectorGroup vectorGroup2 = (VectorGroup) vectorNode;
                            VectorComposeKt.a(vectorGroup2.a, Float.valueOf(vectorGroup2.b).floatValue(), Float.valueOf(vectorGroup2.c).floatValue(), Float.valueOf(vectorGroup2.d).floatValue(), Float.valueOf(vectorGroup2.e).floatValue(), Float.valueOf(vectorGroup2.f).floatValue(), Float.valueOf(vectorGroup2.g).floatValue(), Float.valueOf(vectorGroup2.h).floatValue(), vectorGroup2.i, ComposableLambdaKt.b(composerImplT, 1450046638, new VectorPainterKt$RenderVectorGroup$1(vectorGroup2, map2)), composerImplT, 939524096);
                            composerImplT.R(false);
                        } else {
                            composerImplT.B(-326282507);
                            composerImplT.R(false);
                        }
                    }
                    anonymousClass1 = anonymousClass2;
                }
            } else {
                composerImplT.h();
            }
            map2 = map;
            composerImplT.S();
            anonymousClass1 = new VectorGroup.AnonymousClass1(vectorGroup);
            while (anonymousClass1.a.hasNext()) {
                vectorNode = (VectorNode) anonymousClass1.next();
                if (vectorNode instanceof VectorPath) {
                    composerImplT.B(-326285835);
                    VectorPath vectorPath2 = (VectorPath) vectorNode;
                    String str2 = vectorPath2.a;
                    ComposerImpl composerImpl2 = composerImplT;
                    anonymousClass2 = anonymousClass1;
                    VectorComposeKt.b(vectorPath2.b, vectorPath2.c, str2, vectorPath2.d, Float.valueOf(vectorPath2.e).floatValue(), vectorPath2.f, Float.valueOf(vectorPath2.g).floatValue(), Float.valueOf(vectorPath2.h).floatValue(), vectorPath2.i, vectorPath2.j, vectorPath2.k, Float.valueOf(vectorPath2.l).floatValue(), Float.valueOf(vectorPath2.m).floatValue(), Float.valueOf(vectorPath2.n).floatValue(), composerImpl2, 8);
                    composerImplT = composerImpl2;
                    composerImplT.R(false);
                } else {
                    anonymousClass2 = anonymousClass1;
                    if (vectorNode instanceof VectorGroup) {
                        composerImplT.B(-326283977);
                        VectorGroup vectorGroup3 = (VectorGroup) vectorNode;
                        VectorComposeKt.a(vectorGroup3.a, Float.valueOf(vectorGroup3.b).floatValue(), Float.valueOf(vectorGroup3.c).floatValue(), Float.valueOf(vectorGroup3.d).floatValue(), Float.valueOf(vectorGroup3.e).floatValue(), Float.valueOf(vectorGroup3.f).floatValue(), Float.valueOf(vectorGroup3.g).floatValue(), Float.valueOf(vectorGroup3.h).floatValue(), vectorGroup3.i, ComposableLambdaKt.b(composerImplT, 1450046638, new VectorPainterKt$RenderVectorGroup$1(vectorGroup3, map2)), composerImplT, 939524096);
                        composerImplT.R(false);
                    } else {
                        composerImplT.B(-326282507);
                        composerImplT.R(false);
                    }
                }
                anonymousClass1 = anonymousClass2;
            }
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new VectorPainterKt$RenderVectorGroup$2(vectorGroup, map2, i, i2);
    }

    public static final VectorPainter b(ImageVector imageVector, Composer composer) {
        ColorFilter colorFilterA;
        composer.B(1413834416);
        float f = imageVector.b;
        float f2 = imageVector.c;
        float f3 = imageVector.d;
        float f4 = imageVector.e;
        String str = imageVector.a;
        long j = imageVector.g;
        int i = imageVector.h;
        boolean z = imageVector.i;
        ComposableLambdaImpl composableLambdaImplB = ComposableLambdaKt.b(composer, 1873274766, new VectorPainterKt$rememberVectorPainter$3(imageVector));
        composer.B(1068590786);
        Density density = (Density) composer.v(CompositionLocalsKt.e);
        float fMo7toPx0680j_4 = density.mo7toPx0680j_4(f);
        float fMo7toPx0680j_5 = density.mo7toPx0680j_4(f2);
        if (Float.isNaN(f3)) {
            f3 = fMo7toPx0680j_4;
        }
        if (Float.isNaN(f4)) {
            f4 = fMo7toPx0680j_5;
        }
        Color color = new Color(j);
        BlendMode blendMode = new BlendMode(i);
        composer.B(511388516);
        boolean zL = composer.l(color) | composer.l(blendMode);
        Object objC = composer.C();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.a;
        if (zL || objC == composer$Companion$Empty$1) {
            if (!Color.c(j, Color.i)) {
                colorFilterA = ColorFilter.Companion.a(i, j);
            } else {
                colorFilterA = null;
            }
            objC = colorFilterA;
            composer.x(objC);
        }
        composer.J();
        ColorFilter colorFilter = (ColorFilter) objC;
        composer.B(-492369756);
        Object objC2 = composer.C();
        if (objC2 == composer$Companion$Empty$1) {
            objC2 = new VectorPainter();
            composer.x(objC2);
        }
        composer.J();
        VectorPainter vectorPainter = (VectorPainter) objC2;
        vectorPainter.f.setValue(new Size(SizeKt.a(fMo7toPx0680j_4, fMo7toPx0680j_5)));
        vectorPainter.g.setValue(Boolean.valueOf(z));
        vectorPainter.h.f.setValue(colorFilter);
        vectorPainter.j(str, f3, f4, composableLambdaImplB, composer, 35840);
        composer.J();
        composer.J();
        return vectorPainter;
    }
}
