package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@RestrictTo
public class PreferenceUtils {
    public final WorkDatabase a;

    /* JADX INFO: renamed from: androidx.work.impl.utils.PreferenceUtils$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    class AnonymousClass1 implements Function<Long, Long> {
        @Override // androidx.arch.core.util.Function
        public final Object apply(Object obj) {
            Long l = (Long) obj;
            return Long.valueOf(l != null ? l.longValue() : 0L);
        }
    }

    public PreferenceUtils(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }
}
