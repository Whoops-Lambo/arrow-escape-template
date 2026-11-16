package androidx.work;

import android.content.Context;
import androidx.startup.Initializer;
import androidx.work.impl.WorkManagerImpl;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class WorkManagerInitializer implements Initializer<WorkManager> {
    public static final String a = Logger.g("WrkMgrInitializer");

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.startup.Initializer
    public final Object create(Context context) {
        Logger.e().a(a, "Initializing WorkManager with default configuration.");
        WorkManagerImpl.d(context, new Configuration(new Configuration.Builder()));
        return WorkManagerImpl.c(context);
    }
}
