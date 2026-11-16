package defpackage;

import androidx.collection.ArraySet;
import androidx.collection.IndexBasedArrayIterator;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.nearby.zzju;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ej4 extends zzju implements yl4 {
    public final ArraySet b = new ArraySet(0);
    public final ArraySet c = new ArraySet(0);
    public final ListenerHolder a = (ListenerHolder) Preconditions.checkNotNull(null);

    @Override // defpackage.yl4
    public final synchronized void zzf() {
        try {
            Iterator it = this.b.iterator();
            while (true) {
                IndexBasedArrayIterator indexBasedArrayIterator = (IndexBasedArrayIterator) it;
                if (!indexBasedArrayIterator.hasNext()) {
                    break;
                }
                this.a.notifyListener(new ti4((String) indexBasedArrayIterator.next(), 0));
            }
            this.b.clear();
            Iterator it2 = this.c.iterator();
            while (true) {
                IndexBasedArrayIterator indexBasedArrayIterator2 = (IndexBasedArrayIterator) it2;
                if (indexBasedArrayIterator2.hasNext()) {
                    this.a.notifyListener(new ti4((String) indexBasedArrayIterator2.next(), 1));
                } else {
                    this.c.clear();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
