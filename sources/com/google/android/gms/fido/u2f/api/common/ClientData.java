package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class ClientData {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Builder implements Cloneable {
        public final Object clone() {
            return new Builder();
        }

        public Builder() {
            Parcelable.Creator<ChannelIdValue> creator = ChannelIdValue.CREATOR;
        }
    }

    public final int hashCode() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClientData) {
            throw null;
        }
        return false;
    }
}
