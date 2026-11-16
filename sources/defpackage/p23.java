package defpackage;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\rB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lp23;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lr23;", "cause", "<init>", "(Lr23;)V", "a", "Lr23;", "d", "()Lr23;", "exception", "Companion", "o23", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class p23 extends Exception {

    @NotNull
    public static final o23 Companion = new o23();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final r23 exception;

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final r23 getException() {
        return this.exception;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p23(@NotNull r23 r23Var) {
        super(r23Var.getMessage(), r23Var);
        r23Var.getClass();
        this.exception = r23Var;
    }
}
