package com.mbridge.msdk.out;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class MBCommonHandler {
    protected Context context;
    protected Map<String, Object> properties;

    public abstract boolean load();

    public abstract void release();

    public MBCommonHandler(Map<String, Object> map, Context context) {
        this.properties = map;
        this.context = context;
    }

    public MBCommonHandler() {
    }
}
