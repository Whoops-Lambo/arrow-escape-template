package defpackage;

import com.google.android.gms.internal.nearby.zznm;
import com.google.android.gms.internal.nearby.zznp;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.internal.Update;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class y35 extends zznp {
    public final /* synthetic */ List a;

    public y35(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void notifyListener(Object obj) {
        MessageListener messageListener = (MessageListener) obj;
        int i = zznm.a;
        for (Update update : this.a) {
            int i2 = update.b;
            if (Update.d(i2, 1)) {
                messageListener.getClass();
            }
            if (Update.d(i2, 2)) {
                messageListener.getClass();
            }
            if (Update.d(i2, 4) && update.d != null) {
                messageListener.getClass();
            }
            if (Update.d(i2, 8) && update.e != null) {
                messageListener.getClass();
            }
            Update.d(i2, 16);
        }
    }
}
