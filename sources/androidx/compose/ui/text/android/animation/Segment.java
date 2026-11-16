package androidx.compose.ui.text.android.animation;

import androidx.compose.ui.text.android.InternalPlatformTextApi;
import defpackage.jc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/animation/Segment;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class Segment {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof Segment);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + jc1.d(0, jc1.d(0, jc1.d(0, jc1.d(0, Integer.hashCode(0) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "Segment(startOffset=0, endOffset=0, left=0, top=0, right=0, bottom=0)";
    }
}
