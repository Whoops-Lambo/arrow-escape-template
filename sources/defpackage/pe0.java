package defpackage;

import android.media.MediaDrmResetException;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class pe0 {
    @DoNotInline
    public static boolean a(@Nullable Throwable th) {
        return th instanceof MediaDrmResetException;
    }
}
