package androidx.media3.container;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@UnstableApi
public final class Mp4OrientationData implements Metadata.Entry {
    public final int orientation;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Mp4OrientationData) && this.orientation == ((Mp4OrientationData) obj).orientation;
    }

    public int hashCode() {
        return Integer.hashCode(this.orientation) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
    }

    public String toString() {
        return "Orientation= " + this.orientation;
    }

    public Mp4OrientationData(int i) {
        boolean z;
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            z = false;
        } else {
            z = true;
        }
        Assertions.checkArgument(z, "Unsupported orientation");
        this.orientation = i;
    }
}
