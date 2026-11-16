package defpackage;

import java.nio.charset.MalformedInputException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lah1;", "Ljava/nio/charset/MalformedInputException;", "", "message", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "_message", "getMessage", "()Ljava/lang/String;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ah1 extends MalformedInputException {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String _message;

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    @Nullable
    public String getMessage() {
        return this._message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah1(@NotNull String str) {
        super(0);
        str.getClass();
        this._message = str;
    }
}
