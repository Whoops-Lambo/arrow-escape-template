package defpackage;

import com.ironsource.Ue;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lz42;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Ld01;", Ue.n, "", "cachedResponseText", "<init>", "(Ld01;Ljava/lang/String;)V", "a", "Ld01;", "getResponse", "()Ld01;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class z42 extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final transient d01 response;

    public z42(@NotNull d01 d01Var, @NotNull String str) {
        d01Var.getClass();
        str.getClass();
        StringBuilder sb = new StringBuilder("Bad response: ");
        sb.append(d01Var);
        sb.append(". Text: \"");
        super(jc1.q(sb, str, '\"'));
        this.response = d01Var;
    }
}
