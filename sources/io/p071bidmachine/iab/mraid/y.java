package io.p071bidmachine.iab.mraid;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class y {
    public static final y a;
    public static final y b;
    public static final /* synthetic */ y[] c;

    static {
        y yVar = new y("Static", 0);
        a = yVar;
        y yVar2 = new y("Video", 1);
        y yVar3 = new y("Rewarded", 2);
        b = yVar3;
        c = new y[]{yVar, yVar2, yVar3};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) c.clone();
    }
}
