package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ie0 {
    @DoNotInline
    public static void a(@NonNull Outline outline, @NonNull Path path) {
        outline.setConvexPath(path);
    }
}
