package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class y implements Serializable {
    public final HashMap a;

    private final Object readResolve() throws ObjectStreamException {
        return new z(this.a);
    }

    public y(HashMap map) {
        map.getClass();
        this.a = map;
    }
}
