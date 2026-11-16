package androidx.work;

import android.annotation.SuppressLint;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"AddedAbstractMethod"})
public abstract class WorkManager {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class UpdateResult {
        public static final /* synthetic */ UpdateResult[] a = {new UpdateResult("NOT_APPLIED", 0), new UpdateResult("APPLIED_IMMEDIATELY", 1), new UpdateResult("APPLIED_FOR_NEXT_RUN", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        UpdateResult EF5;

        public static UpdateResult valueOf(String str) {
            return (UpdateResult) Enum.valueOf(UpdateResult.class, str);
        }

        public static UpdateResult[] values() {
            return (UpdateResult[]) a.clone();
        }
    }

    public abstract Operation b(List list);

    public final Operation a(WorkRequest workRequest) {
        return b(Collections.singletonList(workRequest));
    }
}
