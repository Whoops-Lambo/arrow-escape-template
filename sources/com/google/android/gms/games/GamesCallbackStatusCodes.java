package com.google.android.gms.games;

import androidx.annotation.NonNull;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class GamesCallbackStatusCodes {

    @Deprecated
    public static final int CLIENT_RECONNECT_REQUIRED = 2;
    public static final int INTERNAL_ERROR = 1;
    public static final int OK = 0;

    @NonNull
    public static String getStatusCodeString(int i) {
        if (i == 0) {
            return "OK";
        }
        if (i == 1) {
            return "INTERNAL_ERROR";
        }
        if (i == 2) {
            return "CLIENT_RECONNECT_REQUIRED";
        }
        if (i == 6003) {
            return "MULTIPLAYER_DISABLED";
        }
        if (i == 7004) {
            return "REAL_TIME_ROOM_NOT_JOINED";
        }
        if (i != 7000) {
            return i != 7001 ? pv1.l(i, "unknown games callback status code: ", new StringBuilder(String.valueOf(i).length() + 36)) : "REAL_TIME_MESSAGE_SEND_FAILED";
        }
        return "REAL_TIME_CONNECTION_FAILED";
    }

    private GamesCallbackStatusCodes() {
    }
}
