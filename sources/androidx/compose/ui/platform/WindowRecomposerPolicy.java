package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.InternalComposeUiApi;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerPolicy;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@InternalComposeUiApi
public final class WindowRecomposerPolicy {
    public static final AtomicReference a;

    static {
        WindowRecomposerFactory.a.getClass();
        a = new AtomicReference(WindowRecomposerFactory$Companion$LifecycleAware$1.b);
    }
}
