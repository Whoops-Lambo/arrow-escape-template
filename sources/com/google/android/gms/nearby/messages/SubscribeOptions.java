package com.google.android.gms.nearby.messages;

import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class SubscribeOptions {
    public final String toString() {
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Builder {
        public Builder() {
            Parcelable.Creator<Strategy> creator = Strategy.CREATOR;
            Parcelable.Creator<MessageFilter> creator2 = MessageFilter.CREATOR;
        }
    }

    static {
        new Builder();
    }
}
