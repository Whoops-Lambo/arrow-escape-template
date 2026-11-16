package defpackage;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhr1;", "Ljava/lang/Error;", "Lkotlin/Error;", "", "message", "<init>", "(Ljava/lang/String;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class hr1 extends Error {
    public /* synthetic */ hr1(String str, int i, e80 e80Var) {
        this((i & 1) != 0 ? "An operation is not implemented." : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr1(@NotNull String str) {
        super(str);
        str.getClass();
    }
}
