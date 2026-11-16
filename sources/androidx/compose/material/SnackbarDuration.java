package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/SnackbarDuration;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SnackbarDuration {
    public static final /* synthetic */ SnackbarDuration[] a = {new SnackbarDuration("Short", 0), new SnackbarDuration("Long", 1), new SnackbarDuration("Indefinite", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    SnackbarDuration EF5;

    public static SnackbarDuration valueOf(String str) {
        return (SnackbarDuration) Enum.valueOf(SnackbarDuration.class, str);
    }

    public static SnackbarDuration[] values() {
        return (SnackbarDuration[]) a.clone();
    }
}
