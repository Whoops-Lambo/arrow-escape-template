package androidx.media3.common;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public class FrameInfo {
    public final Format format;
    public final long offsetToAddUs;

    public FrameInfo(Format format, long j) {
        boolean z;
        boolean z2;
        if (format.colorInfo != null) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z, "format colorInfo must be set");
        if (format.width > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkArgument(z2, "format width must be positive, but is: " + format.width);
        Assertions.checkArgument(format.height > 0, "format height must be positive, but is: " + format.height);
        this.format = format;
        this.offsetToAddUs = j;
    }
}
