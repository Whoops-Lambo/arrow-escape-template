package androidx.core.app;

import android.app.PendingIntent;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class RemoteActionCompat implements VersionedParcelable {
    public IconCompat a;
    public CharSequence b;
    public CharSequence c;
    public PendingIntent d;
    public boolean e;
    public boolean f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api26Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api28Impl {
    }

    @RestrictTo
    public RemoteActionCompat() {
    }
}
