package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo
@UnstableApi
public interface SuitableOutputChecker {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Callback {
        void onSelectedOutputSuitabilityChanged(boolean z);
    }

    void disable();

    void enable(Callback callback, Context context, Looper looper, Looper looper2, Clock clock);

    boolean isSelectedOutputSuitableForPlayback();
}
