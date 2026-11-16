package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidFontResourceLoaderHelper;", "", "Landroid/content/Context;", "context", "", "resourceId", "Landroid/graphics/Typeface;", "a", "(Landroid/content/Context;I)Landroid/graphics/Typeface;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class AndroidFontResourceLoaderHelper {
    @DoNotInline
    @RequiresApi
    @NotNull
    public final Typeface a(@NotNull Context context, int resourceId) {
        context.getClass();
        Typeface font = context.getResources().getFont(resourceId);
        font.getClass();
        return font;
    }
}
