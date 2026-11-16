package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Connector;
import com.unity3d.services.UnityAdsConstants;
import defpackage.jc1;
import defpackage.vk3;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "", "Companion", "value", "Ldy2;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Color {
    public static final long b = ColorKt.c(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final /* synthetic */ int j = 0;
    public final long a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public static final boolean c(long j2, long j3) {
        return j2 == j3;
    }

    public static final float d(long j2) {
        float fZ;
        float f2;
        if ((63 & j2) == 0) {
            fZ = (float) vk3.z((j2 >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fZ = (float) vk3.z((j2 >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fZ / f2;
    }

    public static final float e(long j2) {
        return (63 & j2) == 0 ? ((float) vk3.z((j2 >>> 32) & 255)) / 255.0f : Float16.b((short) ((j2 >>> 16) & 65535));
    }

    public static final ColorSpace f(long j2) {
        float[] fArr = ColorSpaces.a;
        return ColorSpaces.u[(int) (j2 & 63)];
    }

    public static final float g(long j2) {
        return (63 & j2) == 0 ? ((float) vk3.z((j2 >>> 40) & 255)) / 255.0f : Float16.b((short) ((j2 >>> 32) & 65535));
    }

    public static final float h(long j2) {
        return (63 & j2) == 0 ? ((float) vk3.z((j2 >>> 48) & 255)) / 255.0f : Float16.b((short) ((j2 >>> 48) & 65535));
    }

    public static String i(long j2) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j2));
        sb.append(", ");
        sb.append(g(j2));
        sb.append(", ");
        sb.append(e(j2));
        sb.append(", ");
        sb.append(d(j2));
        sb.append(", ");
        return jc1.q(sb, f(j2).a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Color) {
            return this.a == ((Color) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }

    public /* synthetic */ Color(long j2) {
        this.a = j2;
    }

    public static final long a(long j2, ColorSpace colorSpace) {
        colorSpace.getClass();
        if (colorSpace.equals(f(j2))) {
            return j2;
        }
        Connector connectorD = ColorSpaceKt.d(f(j2), colorSpace, 2);
        float[] fArr = {h(j2), g(j2), e(j2), d(j2)};
        connectorD.a(fArr);
        return ColorKt.a(fArr[0], fArr[1], fArr[2], fArr[3], colorSpace);
    }

    public static long b(long j2, float f2) {
        return ColorKt.a(h(j2), g(j2), e(j2), f2, f(j2));
    }

    static {
        ColorKt.c(4282664004L);
        c = ColorKt.c(4287137928L);
        ColorKt.c(4291611852L);
        d = ColorKt.c(4294967295L);
        e = ColorKt.c(4294901760L);
        ColorKt.c(4278255360L);
        f = ColorKt.c(4278190335L);
        g = ColorKt.c(4294967040L);
        ColorKt.c(4278255615L);
        ColorKt.c(4294902015L);
        h = ColorKt.b(0);
        float[] fArr = ColorSpaces.a;
        i = ColorKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ColorSpaces.s);
    }
}
