package androidx.p003activity.compose;

import androidx.p003activity.BackEventCompat;
import androidx.p003activity.OnBackPressedCallback;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1", "Landroidx/activity/OnBackPressedCallback;", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 extends OnBackPressedCallback {
    public OnBackInstance d;

    @Override // androidx.p003activity.OnBackPressedCallback
    public final void a() {
        OnBackInstance onBackInstance = this.d;
        if (onBackInstance != null) {
            onBackInstance.a();
        }
        OnBackInstance onBackInstance2 = this.d;
        if (onBackInstance2 == null) {
            return;
        }
        onBackInstance2.a = false;
    }

    @Override // androidx.p003activity.OnBackPressedCallback
    public final void b() {
        OnBackInstance onBackInstance = this.d;
        if (onBackInstance != null && !onBackInstance.a) {
            onBackInstance.a();
            this.d = null;
        }
        this.d.getClass();
        OnBackInstance onBackInstance2 = this.d;
        if (onBackInstance2 != null) {
            onBackInstance2.b.j(null);
        }
        OnBackInstance onBackInstance3 = this.d;
        if (onBackInstance3 == null) {
            return;
        }
        onBackInstance3.a = false;
    }

    @Override // androidx.p003activity.OnBackPressedCallback
    public final void c(BackEventCompat backEventCompat) {
        backEventCompat.getClass();
        OnBackInstance onBackInstance = this.d;
        if (onBackInstance != null) {
            onBackInstance.b.c(backEventCompat);
        }
    }

    @Override // androidx.p003activity.OnBackPressedCallback
    public final void d(BackEventCompat backEventCompat) {
        backEventCompat.getClass();
        OnBackInstance onBackInstance = this.d;
        if (onBackInstance != null) {
            onBackInstance.a();
        }
        throw null;
    }
}
