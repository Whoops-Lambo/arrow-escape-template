package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.measurement.zzmk;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u25 implements w8 {
    public static final /* synthetic */ u25 b = new u25(0);
    public static final /* synthetic */ u25 c = new u25(1);
    public final /* synthetic */ int a;

    public /* synthetic */ u25(int i) {
        this.a = i;
    }

    @Override // defpackage.w8
    public final /* synthetic */ ListenableFuture apply(Object obj) {
        switch (this.a) {
            case 0:
                ApiException apiException = (ApiException) obj;
                throw new zzmk(apiException.getStatusCode(), apiException.getMessage(), apiException);
            default:
                return rs0.d("");
        }
    }
}
