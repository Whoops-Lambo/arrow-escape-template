package defpackage;

import android.content.Context;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.nearby.zzkf;
import com.google.android.gms.internal.nearby.zzlt;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zo4 extends zzkf implements yl4 {
    public final Context a;
    public final zzlt d;
    public final ArrayMap c = new ArrayMap(0);
    public final ListenerHolder b = (ListenerHolder) Preconditions.checkNotNull(null);

    @Override // defpackage.yl4
    public final synchronized void zzf() {
        try {
            for (Map.Entry entry : this.c.entrySet()) {
                this.b.notifyListener(new lo4(((po4) entry.getKey()).a, (PayloadTransferUpdate) entry.getValue()));
            }
            this.c.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public zo4(Context context, zzlt zzltVar) {
        this.a = (Context) Preconditions.checkNotNull(context);
        this.d = zzltVar;
    }
}
