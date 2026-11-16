package defpackage;

import android.net.Uri;
import androidx.media3.datasource.DataSourceBitmapLoader;
import com.facebook.internal.j0;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.vungle.ads.internal.executor.g;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j6 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return AndroidDiagnosticEventRepository.flush$lambda$7((AndroidDiagnosticEventRepository) obj2, (List) obj);
            case 1:
                return ((DataSourceBitmapLoader) obj2).lambda$decodeBitmap$1((byte[]) obj);
            case 2:
                return ((DataSourceBitmapLoader) obj2).lambda$loadBitmap$2((Uri) obj);
            case 3:
                j0 j0Var = (j0) obj2;
                bo boVar = (bo) obj;
                CountDownLatch countDownLatch = (CountDownLatch) j0Var.b;
                try {
                    j0Var.c = boVar.call();
                } finally {
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                    }
                }
            default:
                return g.a((Callable) obj2, (sr0) obj);
        }
    }
}
