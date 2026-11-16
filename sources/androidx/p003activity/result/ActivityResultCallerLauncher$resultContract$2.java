package androidx.p003activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.p003activity.result.contract.ActivityResultContract;
import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0005*\u0001\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "androidx/activity/result/ActivityResultCallerLauncher$resultContract$2$1", "I", "O", "invoke", "()Landroidx/activity/result/ActivityResultCallerLauncher$resultContract$2$1;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class ActivityResultCallerLauncher$resultContract$2 extends rc1 implements sr0 {

    /* JADX INFO: renamed from: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003"}, d2 = {"androidx/activity/result/ActivityResultCallerLauncher$resultContract$2$1", "Landroidx/activity/result/contract/ActivityResultContract;", "Laz2;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class AnonymousClass1 extends ActivityResultContract<az2, Object> {
        @Override // androidx.p003activity.result.contract.ActivityResultContract
        public final Object c(int i, Intent intent) {
            throw null;
        }

        @Override // androidx.p003activity.result.contract.ActivityResultContract
        public final Intent a(Context context, Object obj) {
            ((az2) obj).getClass();
            throw null;
        }
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        return new AnonymousClass1();
    }
}
