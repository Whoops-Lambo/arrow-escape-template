package androidx.datastore.core.okio;

import androidx.datastore.core.WriteScope;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.fy;
import defpackage.wz2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/core/okio/OkioWriteScope;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/okio/OkioReadScope;", "Landroidx/datastore/core/WriteScope;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkioWriteScope<T> extends OkioReadScope<T> implements WriteScope<T> {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.WriteScope
    public final Object b(Object obj, fy fyVar) {
        OkioWriteScope$writeData$1 okioWriteScope$writeData$1;
        if (fyVar instanceof OkioWriteScope$writeData$1) {
            okioWriteScope$writeData$1 = (OkioWriteScope$writeData$1) fyVar;
            int i = okioWriteScope$writeData$1.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                okioWriteScope$writeData$1.t = i - Integer.MIN_VALUE;
            } else {
                okioWriteScope$writeData$1 = new OkioWriteScope$writeData$1(this, fyVar);
            }
        } else {
            okioWriteScope$writeData$1 = new OkioWriteScope$writeData$1(this, fyVar);
        }
        Object obj2 = okioWriteScope$writeData$1.r;
        int i2 = okioWriteScope$writeData$1.t;
        if (i2 == 0) {
            wz2.a0(obj2);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            wz2.a0(obj2);
            throw null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
