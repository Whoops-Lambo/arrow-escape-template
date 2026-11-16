package androidx.p003activity;

import android.window.BackEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÁ\u0002\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/activity/Api34Impl;", "", "", "touchX", "touchY", NotificationCompat.CATEGORY_PROGRESS, "", "swipeEdge", "Landroid/window/BackEvent;", "a", "(FFFI)Landroid/window/BackEvent;", "backEvent", "b", "(Landroid/window/BackEvent;)F", "d", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "c", "(Landroid/window/BackEvent;)I", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Api34Impl {
    public static final Api34Impl a = new Api34Impl();

    @DoNotInline
    @NotNull
    public final BackEvent a(float touchX, float touchY, float progress, int swipeEdge) {
        return new BackEvent(touchX, touchY, progress, swipeEdge);
    }

    @DoNotInline
    public final float b(@NotNull BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getProgress();
    }

    @DoNotInline
    public final int c(@NotNull BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getSwipeEdge();
    }

    @DoNotInline
    public final float d(@NotNull BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getTouchX();
    }

    @DoNotInline
    public final float e(@NotNull BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getTouchY();
    }
}
