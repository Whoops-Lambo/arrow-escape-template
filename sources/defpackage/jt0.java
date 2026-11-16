package defpackage;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Ljt0;", "", "", "message", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "b", "getName", "name", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class jt0 extends Throwable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String message;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String name;

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt0(@NotNull String str, @Nullable Throwable th) {
        super(str, th);
        str.getClass();
        this.message = str;
        this.name = "GVLError";
    }
}
