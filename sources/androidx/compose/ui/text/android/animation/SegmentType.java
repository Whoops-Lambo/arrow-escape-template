package androidx.compose.ui.text.android.animation;

import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/animation/SegmentType;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SegmentType {
    public static final /* synthetic */ SegmentType[] a = {new SegmentType("Document", 0), new SegmentType("Paragraph", 1), new SegmentType("Line", 2), new SegmentType("Word", 3), new SegmentType("Character", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    SegmentType EF5;

    public static SegmentType valueOf(String str) {
        return (SegmentType) Enum.valueOf(SegmentType.class, str);
    }

    public static SegmentType[] values() {
        return (SegmentType[]) a.clone();
    }
}
