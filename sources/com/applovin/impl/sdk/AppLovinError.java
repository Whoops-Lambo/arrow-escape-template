package com.applovin.impl.sdk;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class AppLovinError {
    public static final AppLovinError NO_FILL = new AppLovinError(204, "No Fill");
    private final int a;
    private final String b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppLovinError)) {
            return false;
        }
        AppLovinError appLovinError = (AppLovinError) obj;
        if (!appLovinError.canEqual(this) || getCode() != appLovinError.getCode()) {
            return false;
        }
        String message = getMessage();
        String message2 = appLovinError.getMessage();
        return message != null ? message.equals(message2) : message2 == null;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof AppLovinError;
    }

    public int getCode() {
        return this.a;
    }

    @Nullable
    public String getMessage() {
        return this.b;
    }

    public String toString() {
        return "AppLovinError(code=" + getCode() + ", message=" + getMessage() + ")";
    }

    public AppLovinError(int i, @Nullable String str) {
        this.a = i;
        this.b = str;
    }

    public int hashCode() {
        int iHashCode;
        int code = getCode() + 59;
        String message = getMessage();
        int i = code * 59;
        if (message == null) {
            iHashCode = 43;
        } else {
            iHashCode = message.hashCode();
        }
        return i + iHashCode;
    }
}
