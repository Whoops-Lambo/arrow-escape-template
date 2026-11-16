package androidx.datastore.core;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.az2;
import defpackage.gv;
import defpackage.rc1;
import defpackage.zr0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/Message$Update;", NotificationCompat.CATEGORY_MESSAGE, "", "ex", "Laz2;", "invoke", "(Landroidx/datastore/core/Message$Update;Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class DataStoreImpl$writeActor$2 extends rc1 implements zr0 {
    public static final DataStoreImpl$writeActor$2 i = new DataStoreImpl$writeActor$2(2);

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        Message.Update update = (Message.Update) obj;
        Throwable cancellationException = (Throwable) obj2;
        update.getClass();
        gv gvVar = update.b;
        if (cancellationException == null) {
            cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        gvVar.a0(cancellationException);
        return az2.a;
    }
}
