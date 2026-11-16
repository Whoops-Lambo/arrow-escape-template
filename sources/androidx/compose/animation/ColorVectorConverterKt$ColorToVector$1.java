package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import com.unity3d.services.UnityAdsConstants;
import defpackage.rc1;
import defpackage.tb5;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/AnimationVector4D;", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class ColorVectorConverterKt$ColorToVector$1 extends rc1 implements wr0 {
    public static final ColorVectorConverterKt$ColorToVector$1 i = new ColorVectorConverterKt$ColorToVector$1(1);

    /* JADX INFO: renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector4D;", "color", "Landroidx/compose/ui/graphics/Color;", "invoke-8_81llA", "(J)Landroidx/compose/animation/core/AnimationVector4D;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass1 extends rc1 implements wr0 {
        public static final AnonymousClass1 i = new AnonymousClass1(1);

        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            long j = ((Color) obj).a;
            long jA = Color.a(j, ColorSpaces.q);
            float fH = Color.h(jA);
            float fG = Color.g(jA);
            float fE = Color.e(jA);
            float[] fArr = ColorVectorConverterKt.b;
            return new AnimationVector4D(Color.d(j), (float) Math.pow(ColorVectorConverterKt.a(0, fH, fG, fE, fArr), 0.3333333432674408d), (float) Math.pow(ColorVectorConverterKt.a(1, fH, fG, fE, fArr), 0.3333333432674408d), (float) Math.pow(ColorVectorConverterKt.a(2, fH, fG, fE, fArr), 0.3333333432674408d));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/Color;", "it", "Landroidx/compose/animation/core/AnimationVector4D;", "invoke-vNxB06k", "(Landroidx/compose/animation/core/AnimationVector4D;)J"}, k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass2 extends rc1 implements wr0 {
        public final /* synthetic */ ColorSpace i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ColorSpace colorSpace) {
            super(1);
            this.i = colorSpace;
        }

        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            AnimationVector4D animationVector4D = (AnimationVector4D) obj;
            animationVector4D.getClass();
            float fPow = (float) Math.pow(animationVector4D.b, 3.0d);
            float fPow2 = (float) Math.pow(animationVector4D.c, 3.0d);
            float fPow3 = (float) Math.pow(animationVector4D.d, 3.0d);
            float[] fArr = ColorVectorConverterKt.c;
            return new Color(Color.a(ColorKt.a(tb5.f(ColorVectorConverterKt.a(0, fPow, fPow2, fPow3, fArr), -2.0f, 2.0f), tb5.f(ColorVectorConverterKt.a(1, fPow, fPow2, fPow3, fArr), -2.0f, 2.0f), tb5.f(ColorVectorConverterKt.a(2, fPow, fPow2, fPow3, fArr), -2.0f, 2.0f), tb5.f(animationVector4D.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), ColorSpaces.q), this.i));
        }
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ColorSpace colorSpace = (ColorSpace) obj;
        colorSpace.getClass();
        return VectorConvertersKt.a(AnonymousClass1.i, new AnonymousClass2(colorSpace));
    }
}
