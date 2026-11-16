package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource;
import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ChunkedTrackBlacklistUtil {
    public static final long DEFAULT_TRACK_BLACKLIST_MS = 60000;
    private static final String TAG = "ChunkedTrackBlacklist";

    public static boolean shouldBlacklist(Exception exc) {
        if (!(exc instanceof HttpDataSource.InvalidResponseCodeException)) {
            return false;
        }
        int i = ((HttpDataSource.InvalidResponseCodeException) exc).responseCode;
        return i == 404 || i == 410;
    }

    private ChunkedTrackBlacklistUtil() {
    }

    public static boolean maybeBlacklistTrack(TrackSelection trackSelection, int i, Exception exc, long j) {
        if (shouldBlacklist(exc)) {
            boolean zBlacklist = trackSelection.blacklist(i, j);
            int i2 = ((HttpDataSource.InvalidResponseCodeException) exc).responseCode;
            if (zBlacklist) {
                Log.w(TAG, "Blacklisted: duration=" + j + ", responseCode=" + i2 + ", format=" + trackSelection.getFormat(i));
                return zBlacklist;
            }
            StringBuilder sbS = jc1.s(i2, "Blacklisting failed (cannot blacklist last enabled track): responseCode=", ", format=");
            sbS.append(trackSelection.getFormat(i));
            Log.w(TAG, sbS.toString());
            return zBlacklist;
        }
        return false;
    }

    public static boolean maybeBlacklistTrack(TrackSelection trackSelection, int i, Exception exc) {
        return maybeBlacklistTrack(trackSelection, i, exc, 60000L);
    }
}
