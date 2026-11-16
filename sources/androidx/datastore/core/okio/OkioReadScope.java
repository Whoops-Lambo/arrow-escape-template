package androidx.datastore.core.okio;

import androidx.datastore.core.ReadScope;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.dy;
import defpackage.e32;
import defpackage.fy;
import defpackage.wz2;
import java.io.FileNotFoundException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/okio/OkioReadScope;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/ReadScope;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class OkioReadScope<T> implements ReadScope<T> {
    @Override // androidx.datastore.core.Closeable
    public final void close() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object f(OkioReadScope okioReadScope, fy fyVar) throws Throwable {
        OkioReadScope$readData$1 okioReadScope$readData$1;
        Object obj;
        if (fyVar instanceof OkioReadScope$readData$1) {
            okioReadScope$readData$1 = (OkioReadScope$readData$1) fyVar;
            int i = okioReadScope$readData$1.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                okioReadScope$readData$1.t = i - Integer.MIN_VALUE;
            } else {
                okioReadScope$readData$1 = new OkioReadScope$readData$1(okioReadScope, fyVar);
            }
        } else {
            okioReadScope$readData$1 = new OkioReadScope$readData$1(okioReadScope, fyVar);
        }
        Object obj2 = okioReadScope$readData$1.r;
        int i2 = okioReadScope$readData$1.t;
        Throwable th = null;
        if (i2 == 0) {
            wz2.a0(obj2);
            throw null;
        }
        if (i2 == 1) {
            try {
                wz2.a0(obj2);
                obj = obj2;
                th = null;
            } catch (Throwable th2) {
                th = th2;
                obj = null;
            }
            try {
                if (th != null) {
                    throw th;
                }
                obj.getClass();
                return obj;
            } catch (FileNotFoundException unused) {
                throw null;
            }
        }
        if (i2 != 2) {
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        try {
            wz2.a0(obj2);
        } catch (Throwable th3) {
            th = th3;
            obj2 = null;
        }
        if (th != null) {
            throw th;
        }
        obj2.getClass();
        return obj2;
    }

    @Override // androidx.datastore.core.ReadScope
    public final Object e(dy dyVar) {
        return f(this, (fy) dyVar);
    }
}
