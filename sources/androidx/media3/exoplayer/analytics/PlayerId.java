package androidx.media3.exoplayer.analytics;

import android.media.metrics.LogSessionId;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class PlayerId {
    public static final PlayerId UNSET = new PlayerId("");

    @Nullable
    private final Object equalityToken;

    @Nullable
    private final LogSessionIdApi31 logSessionIdApi31;
    public final String name;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static final class LogSessionIdApi31 {
        public LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;

        public void setLogSessionId(LogSessionId logSessionId) {
            LogSessionId logSessionId2 = this.logSessionId;
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
            Assertions.checkState(logSessionId2.equals(LogSessionId.LOG_SESSION_ID_NONE));
            this.logSessionId = logSessionId;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerId)) {
            return false;
        }
        PlayerId playerId = (PlayerId) obj;
        return Objects.equals(this.name, playerId.name) && Objects.equals(this.logSessionIdApi31, playerId.logSessionIdApi31) && Objects.equals(this.equalityToken, playerId.equalityToken);
    }

    @RequiresApi
    public synchronized LogSessionId getLogSessionId() {
        return ((LogSessionIdApi31) Assertions.checkNotNull(this.logSessionIdApi31)).logSessionId;
    }

    @RequiresApi
    public synchronized void setLogSessionId(LogSessionId logSessionId) {
        ((LogSessionIdApi31) Assertions.checkNotNull(this.logSessionIdApi31)).setLogSessionId(logSessionId);
    }

    public int hashCode() {
        return Objects.hash(this.name, this.logSessionIdApi31, this.equalityToken);
    }

    public PlayerId(String str) {
        LogSessionIdApi31 logSessionIdApi31;
        this.name = str;
        if (Build.VERSION.SDK_INT >= 31) {
            logSessionIdApi31 = new LogSessionIdApi31();
        } else {
            logSessionIdApi31 = null;
        }
        this.logSessionIdApi31 = logSessionIdApi31;
        this.equalityToken = new Object();
    }
}
