package defpackage;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ldn1;", "Lba2;", "", "", "missingFields", "message", "", "cause", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V", "serialName", "(Ljava/util/List;Ljava/lang/String;)V", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class dn1 extends ba2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<String> missingFields;

    @NotNull
    public final List<String> d() {
        return this.missingFields;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public dn1(@NotNull List<String> list, @NotNull String str) {
        String strP;
        list.getClass();
        str.getClass();
        if (list.size() == 1) {
            strP = pv1.p(new StringBuilder("Field '"), list.get(0), "' is required for type with serial name '", str, "', but it was missing");
        } else {
            strP = "Fields " + list + " are required for type with serial name '" + str + "', but they were missing";
        }
        this(list, strP, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn1(@NotNull List<String> list, @Nullable String str, @Nullable Throwable th) {
        super(str, th);
        list.getClass();
        this.missingFields = list;
    }
}
