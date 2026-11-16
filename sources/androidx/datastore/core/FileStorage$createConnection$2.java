package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Laz2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class FileStorage$createConnection$2 extends rc1 implements sr0 {
    public final /* synthetic */ File i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileStorage$createConnection$2(File file) {
        super(0);
        this.i = file;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        Object obj = FileStorage.e;
        File file = this.i;
        synchronized (obj) {
            FileStorage.d.remove(file.getAbsolutePath());
        }
        return az2.a;
    }
}
