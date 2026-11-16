package androidx.compose.ui.graphics.colorspace;

import defpackage.d;
import defpackage.p32;
import defpackage.pv1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class ColorSpace {
    public final String a;
    public final long b;
    public final int c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace$Companion;", "", "", "MaxId", "I", "MinId", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public abstract float[] a(float[] fArr);

    public abstract float b(int i);

    public abstract float c(int i);

    /* JADX INFO: renamed from: d */
    public boolean getO() {
        return false;
    }

    public abstract float[] e(float[] fArr);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p32.a(getClass()).equals(p32.a(obj.getClass()))) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) obj;
        if (this.c == colorSpace.c && this.a.equals(colorSpace.a)) {
            return ColorModel.a(this.b, colorSpace.b);
        }
        return false;
    }

    public int hashCode() {
        return pv1.d(this.a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) ColorModel.b(this.b)) + ')';
    }

    public ColorSpace(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() != 0) {
            if (i >= -1 && i <= 63) {
                return;
            }
            d.r("The id must be between -1 and 63");
            throw null;
        }
        d.r("The name of a color space cannot be null and must contain at least 1 character");
        throw null;
    }
}
