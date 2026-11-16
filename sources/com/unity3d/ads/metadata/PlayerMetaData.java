package com.unity3d.ads.metadata;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class PlayerMetaData extends MetaData {
    public static final String KEY_SERVER_ID = "server_id";

    @Deprecated
    public void setServerId(String str) {
        set(KEY_SERVER_ID, str);
    }

    @Deprecated
    public PlayerMetaData(Context context) {
        super(context);
        setCategory("player");
    }
}
