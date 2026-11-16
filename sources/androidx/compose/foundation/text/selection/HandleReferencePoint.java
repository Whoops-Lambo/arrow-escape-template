package androidx.compose.foundation.text.selection;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/HandleReferencePoint;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HandleReferencePoint {
    public static final HandleReferencePoint a;
    public static final HandleReferencePoint b;
    public static final HandleReferencePoint c;
    public static final /* synthetic */ HandleReferencePoint[] d;

    static {
        HandleReferencePoint handleReferencePoint = new HandleReferencePoint("TopLeft", 0);
        a = handleReferencePoint;
        HandleReferencePoint handleReferencePoint2 = new HandleReferencePoint("TopRight", 1);
        b = handleReferencePoint2;
        HandleReferencePoint handleReferencePoint3 = new HandleReferencePoint("TopMiddle", 2);
        c = handleReferencePoint3;
        d = new HandleReferencePoint[]{handleReferencePoint, handleReferencePoint2, handleReferencePoint3};
    }

    public static HandleReferencePoint valueOf(String str) {
        return (HandleReferencePoint) Enum.valueOf(HandleReferencePoint.class, str);
    }

    public static HandleReferencePoint[] values() {
        return (HandleReferencePoint[]) d.clone();
    }
}
