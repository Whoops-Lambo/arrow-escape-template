package defpackage;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class pr0 {
    @DoNotInline
    public static boolean a(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }

    @DoNotInline
    public static void b(MediaDrm mediaDrm, byte[] bArr, PlayerId playerId) {
        LogSessionId logSessionId = playerId.getLogSessionId();
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            e6.i(Assertions.checkNotNull(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionId);
        }
    }
}
