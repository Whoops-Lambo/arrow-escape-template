package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.compose.ui.util.MathHelpersKt;
import defpackage.d;
import defpackage.e32;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SpanStyleKt {
    public static final long a = TextUnitKt.c(14);
    public static final long b = TextUnitKt.c(0);
    public static final long c;
    public static final long d;
    public static final /* synthetic */ int e = 0;

    public static final Object a(float f, Object obj, Object obj2) {
        return ((double) f) < 0.5d ? obj : obj2;
    }

    static {
        int i = Color.j;
        c = Color.h;
        d = Color.b;
    }

    public static final long b(long j, float f, long j2) {
        if (!TextUnitKt.d(j) && !TextUnitKt.d(j2)) {
            if (!TextUnitKt.d(j) && !TextUnitKt.d(j2)) {
                if (TextUnitType.a(TextUnit.b(j), TextUnit.b(j2))) {
                    return TextUnitKt.e(1095216660480L & j, MathHelpersKt.a(TextUnit.c(j), TextUnit.c(j2), f));
                }
                StringBuilder sb = new StringBuilder("Cannot perform operation for ");
                sb.append((Object) TextUnitType.b(TextUnit.b(j)));
                e32.k(sb, " and ", TextUnitType.b(TextUnit.b(j2)));
                return 0L;
            }
            d.r("Cannot perform operation for Unspecified type.");
            return 0L;
        }
        return ((TextUnit) a(f, new TextUnit(j), new TextUnit(j2))).a;
    }
}
