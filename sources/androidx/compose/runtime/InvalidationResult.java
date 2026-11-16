package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/InvalidationResult;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class InvalidationResult {
    public static final InvalidationResult a;
    public static final InvalidationResult b;
    public static final InvalidationResult c;
    public static final InvalidationResult d;
    public static final /* synthetic */ InvalidationResult[] e;

    static {
        InvalidationResult invalidationResult = new InvalidationResult("IGNORED", 0);
        a = invalidationResult;
        InvalidationResult invalidationResult2 = new InvalidationResult("SCHEDULED", 1);
        b = invalidationResult2;
        InvalidationResult invalidationResult3 = new InvalidationResult("DEFERRED", 2);
        c = invalidationResult3;
        InvalidationResult invalidationResult4 = new InvalidationResult("IMMINENT", 3);
        d = invalidationResult4;
        e = new InvalidationResult[]{invalidationResult, invalidationResult2, invalidationResult3, invalidationResult4};
    }

    public static InvalidationResult valueOf(String str) {
        return (InvalidationResult) Enum.valueOf(InvalidationResult.class, str);
    }

    public static InvalidationResult[] values() {
        return (InvalidationResult[]) e.clone();
    }
}
