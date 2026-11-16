package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/SizeMode;", "", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SizeMode {
    public static final /* synthetic */ SizeMode[] a = {new SizeMode("Wrap", 0), new SizeMode("Expand", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    SizeMode EF5;

    public static SizeMode valueOf(String str) {
        return (SizeMode) Enum.valueOf(SizeMode.class, str);
    }

    public static SizeMode[] values() {
        return (SizeMode[]) a.clone();
    }
}
