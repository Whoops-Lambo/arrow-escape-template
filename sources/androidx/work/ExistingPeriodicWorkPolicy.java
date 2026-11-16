package androidx.work;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/ExistingPeriodicWorkPolicy;", "", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ExistingPeriodicWorkPolicy {
    public static final /* synthetic */ ExistingPeriodicWorkPolicy[] a = {new ExistingPeriodicWorkPolicy("REPLACE", 0), new ExistingPeriodicWorkPolicy("KEEP", 1), new ExistingPeriodicWorkPolicy("UPDATE", 2), new ExistingPeriodicWorkPolicy("CANCEL_AND_REENQUEUE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    ExistingPeriodicWorkPolicy EF5;

    public static ExistingPeriodicWorkPolicy valueOf(String str) {
        return (ExistingPeriodicWorkPolicy) Enum.valueOf(ExistingPeriodicWorkPolicy.class, str);
    }

    public static ExistingPeriodicWorkPolicy[] values() {
        return (ExistingPeriodicWorkPolicy[]) a.clone();
    }
}
