package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/SnackbarResult;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SnackbarResult {
    public static final SnackbarResult a;
    public static final SnackbarResult b;
    public static final /* synthetic */ SnackbarResult[] c;

    static {
        SnackbarResult snackbarResult = new SnackbarResult("Dismissed", 0);
        a = snackbarResult;
        SnackbarResult snackbarResult2 = new SnackbarResult("ActionPerformed", 1);
        b = snackbarResult2;
        c = new SnackbarResult[]{snackbarResult, snackbarResult2};
    }

    public static SnackbarResult valueOf(String str) {
        return (SnackbarResult) Enum.valueOf(SnackbarResult.class, str);
    }

    public static SnackbarResult[] values() {
        return (SnackbarResult[]) c.clone();
    }
}
