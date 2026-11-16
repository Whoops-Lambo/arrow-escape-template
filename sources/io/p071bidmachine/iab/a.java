package io.p071bidmachine.iab;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final a a;
    public static final a b;
    public static final a c;
    public static final /* synthetic */ a[] d;

    static {
        a aVar = new a("FullLoad", 0);
        a = aVar;
        a aVar2 = new a("Stream", 1);
        b = aVar2;
        a aVar3 = new a("PartialLoad", 2);
        c = aVar3;
        d = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) d.clone();
    }
}
