package androidx.work;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/ExistingWorkPolicy;", "", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ExistingWorkPolicy {
    public static final ExistingWorkPolicy a;
    public static final ExistingWorkPolicy b;
    public static final ExistingWorkPolicy c;
    public static final /* synthetic */ ExistingWorkPolicy[] d;

    /* JADX INFO: Fake field, exist only in values array */
    ExistingWorkPolicy EF0;

    static {
        ExistingWorkPolicy existingWorkPolicy = new ExistingWorkPolicy("REPLACE", 0);
        ExistingWorkPolicy existingWorkPolicy2 = new ExistingWorkPolicy("KEEP", 1);
        a = existingWorkPolicy2;
        ExistingWorkPolicy existingWorkPolicy3 = new ExistingWorkPolicy("APPEND", 2);
        b = existingWorkPolicy3;
        ExistingWorkPolicy existingWorkPolicy4 = new ExistingWorkPolicy("APPEND_OR_REPLACE", 3);
        c = existingWorkPolicy4;
        d = new ExistingWorkPolicy[]{existingWorkPolicy, existingWorkPolicy2, existingWorkPolicy3, existingWorkPolicy4};
    }

    public static ExistingWorkPolicy valueOf(String str) {
        return (ExistingWorkPolicy) Enum.valueOf(ExistingWorkPolicy.class, str);
    }

    public static ExistingWorkPolicy[] values() {
        return (ExistingWorkPolicy[]) d.clone();
    }
}
