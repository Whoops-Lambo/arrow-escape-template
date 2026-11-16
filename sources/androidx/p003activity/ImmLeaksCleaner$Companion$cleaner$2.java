package androidx.p003activity;

import android.view.inputmethod.InputMethodManager;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/activity/ImmLeaksCleaner$Cleaner;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class ImmLeaksCleaner$Companion$cleaner$2 extends rc1 implements sr0 {
    public static final ImmLeaksCleaner$Companion$cleaner$2 i = new ImmLeaksCleaner$Companion$cleaner$2(0);

    @Override // defpackage.sr0
    public final Object invoke() {
        try {
            InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
            InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
            InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
            return new ImmLeaksCleaner.ValidCleaner();
        } catch (NoSuchFieldException unused) {
            return ImmLeaksCleaner.FailedInitialization.a;
        }
    }
}
