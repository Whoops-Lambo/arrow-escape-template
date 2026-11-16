package defpackage;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001b\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfq2;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Loy;", "", "message", "Lc91;", "coroutine", "<init>", "(Ljava/lang/String;Lc91;)V", "(Ljava/lang/String;)V", InneractiveMediationDefs.GENDER_FEMALE, "()Lfq2;", "a", "Lc91;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class fq2 extends CancellationException implements oy {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final transient c91 coroutine;

    @Override // defpackage.oy
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public fq2 d() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        fq2 fq2Var = new fq2(message, this.coroutine);
        fq2Var.initCause(this);
        return fq2Var;
    }

    public fq2(@NotNull String str, @Nullable c91 c91Var) {
        super(str);
        this.coroutine = c91Var;
    }

    public fq2(@NotNull String str) {
        this(str, null);
    }
}
