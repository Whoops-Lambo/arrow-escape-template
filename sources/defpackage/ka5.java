package defpackage;

import com.google.android.gms.internal.measurement.zzwv;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ka5 extends zzwv {
    public y32 a;
    public y32 b;
    public UUID c;
    public long d;
    public byte e;

    public final la5 a() {
        y32 y32Var;
        y32 y32Var2;
        UUID uuid;
        if (this.e == 1 && (y32Var = this.a) != null && (y32Var2 = this.b) != null && (uuid = this.c) != null) {
            return new la5(y32Var, y32Var2, uuid, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" spansNames");
        }
        if (this.b == null) {
            sb.append(" extras");
        }
        if (this.c == null) {
            sb.append(" rootTraceId");
        }
        if (this.e == 0) {
            sb.append(" rootDurationMs");
        }
        e32.i("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
