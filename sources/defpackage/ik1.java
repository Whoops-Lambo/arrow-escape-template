package defpackage;

import android.media.MediaParser;
import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;
import com.google.android.exoplayer2.analytics.PlayerId;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ik1 {
    @DoNotInline
    public static void a(MediaParser mediaParser, PlayerId playerId) {
        LogSessionId logSessionId = playerId.getLogSessionId();
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            mediaParser.setLogSessionId(logSessionId);
        }
    }
}
