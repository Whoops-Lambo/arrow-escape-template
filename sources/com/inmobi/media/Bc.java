package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Bc {
    public static final Ac a(String str) {
        str.getClass();
        if (str.equalsIgnoreCase("DEBUG")) {
            return Ac.DEBUG;
        }
        if (str.equalsIgnoreCase("ERROR")) {
            return Ac.ERROR;
        }
        if (str.equalsIgnoreCase("INFO")) {
            return Ac.INFO;
        }
        if (str.equalsIgnoreCase("STATE")) {
            return Ac.STATE;
        }
        return Ac.ERROR;
    }
}
