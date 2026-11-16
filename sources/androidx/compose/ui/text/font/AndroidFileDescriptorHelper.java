package androidx.compose.ui.text.font;

import android.os.ParcelFileDescriptor;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import defpackage.y2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFileDescriptorHelper;", "", "Landroid/os/ParcelFileDescriptor;", "fileDescriptor", "Landroid/graphics/Typeface;", "a", "(Landroid/os/ParcelFileDescriptor;)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class AndroidFileDescriptorHelper {
    @DoNotInline
    @RequiresApi
    @NotNull
    public final android.graphics.Typeface a(@NotNull ParcelFileDescriptor fileDescriptor) {
        fileDescriptor.getClass();
        y2.m();
        android.graphics.Typeface typefaceBuild = y2.f(fileDescriptor.getFileDescriptor()).build();
        typefaceBuild.getClass();
        return typefaceBuild;
    }
}
