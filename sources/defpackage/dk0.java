package defpackage;

import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class dk0 implements Comparable {
    public final PlayerMessage a;
    public int b;
    public long c;
    public Object d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        dk0 dk0Var = (dk0) obj;
        Object obj2 = this.d;
        if ((obj2 == null) != (dk0Var.d == null)) {
            return obj2 != null ? -1 : 1;
        }
        if (obj2 == null) {
            return 0;
        }
        int i = this.b - dk0Var.b;
        return i != 0 ? i : Util.compareLong(this.c, dk0Var.c);
    }

    public dk0(PlayerMessage playerMessage) {
        this.a = playerMessage;
    }
}
