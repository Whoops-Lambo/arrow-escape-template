package androidx.media3.decoder;

import androidx.annotation.CallSuper;
import androidx.media3.common.C;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public abstract class Buffer {
    private int flags;

    @CallSuper
    public void clear() {
        this.flags = 0;
    }

    public final boolean isEndOfStream() {
        return getFlag(4);
    }

    public final boolean isKeyFrame() {
        return getFlag(1);
    }

    public final void addFlag(int i) {
        this.flags = i | this.flags;
    }

    public final void clearFlag(int i) {
        this.flags = (~i) & this.flags;
    }

    public final boolean getFlag(int i) {
        return (this.flags & i) == i;
    }

    public final boolean hasSupplementalData() {
        return getFlag(268435456);
    }

    public final boolean isFirstSample() {
        return getFlag(134217728);
    }

    public final boolean isLastSample() {
        return getFlag(536870912);
    }

    public final boolean notDependedOn() {
        return getFlag(C.BUFFER_FLAG_NOT_DEPENDED_ON);
    }

    public final void setFlags(int i) {
        this.flags = i;
    }
}
