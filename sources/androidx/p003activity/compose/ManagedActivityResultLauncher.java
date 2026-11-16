package androidx.p003activity.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.p003activity.result.ActivityResultLauncher;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/activity/compose/ManagedActivityResultLauncher;", "I", "O", "Landroidx/activity/result/ActivityResultLauncher;", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ManagedActivityResultLauncher<I, O> extends ActivityResultLauncher<I> {
    @Override // androidx.p003activity.result.ActivityResultLauncher
    public final void a(Object obj) {
        throw null;
    }

    @Override // androidx.p003activity.result.ActivityResultLauncher
    public final void b() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
