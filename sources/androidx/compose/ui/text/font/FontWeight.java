package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import defpackage.ak1;
import defpackage.eu;
import defpackage.h50;
import defpackage.pv1;
import defpackage.s71;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight;", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FontWeight implements Comparable<FontWeight> {
    public static final FontWeight b;
    public static final FontWeight c;
    public static final FontWeight d;
    public static final FontWeight e;
    public static final FontWeight f;
    public static final FontWeight g;
    public static final FontWeight h;
    public static final List i;
    public final int a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FontWeight) {
            return this.a == ((FontWeight) obj).a;
        }
        return false;
    }

    static {
        FontWeight fontWeight = new FontWeight(100);
        FontWeight fontWeight2 = new FontWeight(200);
        FontWeight fontWeight3 = new FontWeight(300);
        FontWeight fontWeight4 = new FontWeight(400);
        b = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(500);
        c = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(600);
        d = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(700);
        FontWeight fontWeight8 = new FontWeight(800);
        FontWeight fontWeight9 = new FontWeight(900);
        e = fontWeight3;
        f = fontWeight4;
        g = fontWeight5;
        h = fontWeight7;
        i = eu.z(fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9);
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getA() {
        return this.a;
    }

    public final String toString() {
        return h50.l(new StringBuilder("FontWeight(weight="), this.a, ')');
    }

    public FontWeight(int i2) {
        this.a = i2;
        if (1 <= i2 && i2 < 1001) {
            return;
        }
        ak1.n(pv1.k(i2, "Font weight can be in range [1, 1000]. Current value: "));
        throw null;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(FontWeight fontWeight) {
        fontWeight.getClass();
        return s71.h(this.a, fontWeight.a);
    }
}
