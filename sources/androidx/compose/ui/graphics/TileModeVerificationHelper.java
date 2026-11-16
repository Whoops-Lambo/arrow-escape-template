package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0006\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/TileModeVerificationHelper;", "", "Landroid/graphics/Shader$TileMode;", "b", "()Landroid/graphics/Shader$TileMode;", "Landroidx/compose/ui/graphics/TileMode;", "a", "()I", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class TileModeVerificationHelper {
    public static final TileModeVerificationHelper a = new TileModeVerificationHelper();

    @DoNotInline
    public final int a() {
        return 3;
    }

    @DoNotInline
    @NotNull
    public final Shader.TileMode b() {
        return Shader.TileMode.DECAL;
    }
}
