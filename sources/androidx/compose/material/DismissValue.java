package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DismissValue;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DismissValue {
    public static final DismissValue a;
    public static final DismissValue b;
    public static final DismissValue c;
    public static final /* synthetic */ DismissValue[] d;

    static {
        DismissValue dismissValue = new DismissValue("Default", 0);
        a = dismissValue;
        DismissValue dismissValue2 = new DismissValue("DismissedToEnd", 1);
        b = dismissValue2;
        DismissValue dismissValue3 = new DismissValue("DismissedToStart", 2);
        c = dismissValue3;
        d = new DismissValue[]{dismissValue, dismissValue2, dismissValue3};
    }

    public static DismissValue valueOf(String str) {
        return (DismissValue) Enum.valueOf(DismissValue.class, str);
    }

    public static DismissValue[] values() {
        return (DismissValue[]) d.clone();
    }
}
