package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory23;", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "Landroidx/compose/ui/text/android/StaticLayoutParams;", "params", "Landroid/text/StaticLayout;", "a", "(Landroidx/compose/ui/text/android/StaticLayoutParams;)Landroid/text/StaticLayout;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class StaticLayoutFactory23 implements StaticLayoutFactoryImpl {
    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    @DoNotInline
    @NotNull
    public StaticLayout a(@NotNull StaticLayoutParams params) {
        params.getClass();
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(params.a, 0, params.b, params.c, params.d);
        builderObtain.setTextDirection(params.e);
        builderObtain.setAlignment(params.f);
        builderObtain.setMaxLines(params.g);
        builderObtain.setEllipsize(params.h);
        builderObtain.setEllipsizedWidth(params.i);
        builderObtain.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        builderObtain.setIncludePad(params.k);
        builderObtain.setBreakStrategy(0);
        builderObtain.setHyphenationFrequency(0);
        builderObtain.setIndents(null, null);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            StaticLayoutFactory26.a.a(builderObtain, params.j);
        }
        if (i >= 28) {
            StaticLayoutFactory28.a.a(builderObtain, true);
        }
        StaticLayout staticLayoutBuild = builderObtain.build();
        staticLayoutBuild.getClass();
        return staticLayoutBuild;
    }
}
