package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lld0;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lby0;", NotificationCompat.CATEGORY_CALL, "<init>", "(Lby0;)V", "", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ld0 extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String message;

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    public ld0(@NotNull by0 by0Var) {
        by0Var.getClass();
        this.message = "Response already received: " + by0Var;
    }
}
