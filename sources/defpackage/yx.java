package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class yx extends ay {
    public final KSerializer a;

    public final boolean equals(Object obj) {
        return (obj instanceof yx) && ((yx) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public yx(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    @Override // defpackage.ay
    public final KSerializer a(List list) {
        list.getClass();
        return this.a;
    }
}
