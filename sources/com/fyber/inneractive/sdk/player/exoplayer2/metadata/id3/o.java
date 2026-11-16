package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class o implements Parcelable {
    public final String a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public o(String str) {
        str.getClass();
        this.a = str;
    }
}
