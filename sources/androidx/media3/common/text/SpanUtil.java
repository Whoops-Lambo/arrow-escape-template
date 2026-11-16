package androidx.media3.common.text;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public final class SpanUtil {
    public static void addInheritedRelativeSizeSpan(Spannable spannable, float f, int i, int i2, int i3) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i, i2, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i && spannable.getSpanEnd(relativeSizeSpan) >= i2) {
                f = relativeSizeSpan.getSizeChange() * f;
            }
            removeIfStartEndAndFlagsMatch(spannable, relativeSizeSpan, i, i2, i3);
        }
        spannable.setSpan(new RelativeSizeSpan(f), i, i2, i3);
    }

    private SpanUtil() {
    }

    public static void addOrReplaceSpan(Spannable spannable, Object obj, int i, int i2, int i3) {
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            removeIfStartEndAndFlagsMatch(spannable, obj2, i, i2, i3);
        }
        spannable.setSpan(obj, i, i2, i3);
    }

    private static void removeIfStartEndAndFlagsMatch(Spannable spannable, Object obj, int i, int i2, int i3) {
        if (spannable.getSpanStart(obj) == i && spannable.getSpanEnd(obj) == i2 && spannable.getSpanFlags(obj) == i3) {
            spannable.removeSpan(obj);
        }
    }
}
