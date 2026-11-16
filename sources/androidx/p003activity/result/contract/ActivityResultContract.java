package androidx.p003activity.result.contract;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContract;", "I", "O", "", "SynchronousResult", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ActivityResultContract<I, O> {
    public abstract Intent a(Context context, Object obj);

    public SynchronousResult b(Context context, Object obj) {
        return null;
    }

    public abstract Object c(int i, Intent intent);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SynchronousResult<T> {
        public final Serializable a;

        public SynchronousResult(Serializable serializable) {
            this.a = serializable;
        }
    }
}
