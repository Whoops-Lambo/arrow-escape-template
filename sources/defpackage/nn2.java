package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lnn2;", "", "", "fieldName", "", "passedValue", NotificationCompat.CATEGORY_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class nn2 extends Throwable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String name;

    public nn2(@NotNull String str, @NotNull Object obj, @NotNull String str2) {
        str.getClass();
        obj.getClass();
        str2.getClass();
        StringBuilder sb = new StringBuilder("invalid value ");
        sb.append(obj);
        super(pv1.p(sb, " passed for ", str, " ", str2));
        this.name = "TCModelError";
    }

    public /* synthetic */ nn2(String str, Object obj, String str2, int i, e80 e80Var) {
        this(str, obj, (i & 4) != 0 ? "" : str2);
    }
}
