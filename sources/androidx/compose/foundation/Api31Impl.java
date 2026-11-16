package androidx.compose.foundation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@RequiresApi
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\bÃ\u0002\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/Api31Impl;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Landroid/widget/EdgeEffect;", "a", "(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/EdgeEffect;", "edgeEffect", "", "deltaDistance", "displacement", "c", "(Landroid/widget/EdgeEffect;FF)F", "b", "(Landroid/widget/EdgeEffect;)F", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class Api31Impl {
    public static final Api31Impl a = new Api31Impl();

    @DoNotInline
    @NotNull
    public final EdgeEffect a(@NotNull Context context, @Nullable AttributeSet attrs) {
        context.getClass();
        try {
            return new EdgeEffect(context, attrs);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    @DoNotInline
    public final float b(@NotNull EdgeEffect edgeEffect) {
        edgeEffect.getClass();
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    @DoNotInline
    public final float c(@NotNull EdgeEffect edgeEffect, float deltaDistance, float displacement) {
        edgeEffect.getClass();
        try {
            return edgeEffect.onPullDistance(deltaDistance, displacement);
        } catch (Throwable unused) {
            edgeEffect.onPull(deltaDistance, displacement);
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }
}
