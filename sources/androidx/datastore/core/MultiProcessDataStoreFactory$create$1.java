package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.dn;
import defpackage.rc1;
import defpackage.wr0;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/datastore/core/InterProcessCoordinator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class MultiProcessDataStoreFactory$create$1 extends rc1 implements wr0 {
    public final /* synthetic */ dn i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessDataStoreFactory$create$1(dn dnVar) {
        super(1);
        this.i = dnVar;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        File file = (File) obj;
        file.getClass();
        return new MultiProcessCoordinator(this.i.b, file);
    }
}
