package defpackage;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lim1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "oldVersion", "targetVersion", "<init>", "(II)V", "", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class im1 extends Exception {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String message;

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    public im1(int i, int i2) {
        this.message = nj.i(i, i2, "Failed to find a Migration routine from ", " to ");
    }
}
