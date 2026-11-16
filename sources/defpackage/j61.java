package defpackage;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lj61;", "Lr23;", "initializeOnlineError", "<init>", "(Lr23;)V", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j61 extends r23 {
    /* JADX WARN: Illegal instructions before constructor call */
    public j61(@NotNull r23 r23Var) {
        r23Var.getClass();
        String message = r23Var.getMessage();
        super("Usercentrics initialization failed: ".concat(message == null ? "Unknown error" : message), r23Var);
    }
}
