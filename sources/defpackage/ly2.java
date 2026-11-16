package defpackage;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lly2;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "urlString", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ly2 extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly2(@NotNull String str, @NotNull Throwable th) {
        super("Fail to parse url: ".concat(str), th);
        str.getClass();
        th.getClass();
    }
}
