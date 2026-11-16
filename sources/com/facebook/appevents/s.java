package com.facebook.appevents;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class s {
    public static final s a;
    public static final s b;
    public static final s c;
    public static final /* synthetic */ s[] d;

    static {
        s sVar = new s("SUCCESS", 0);
        a = sVar;
        s sVar2 = new s("SERVER_ERROR", 1);
        b = sVar2;
        s sVar3 = new s("NO_CONNECTIVITY", 2);
        c = sVar3;
        d = new s[]{sVar, sVar2, sVar3, new s("UNKNOWN_ERROR", 3)};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) d.clone();
    }
}
