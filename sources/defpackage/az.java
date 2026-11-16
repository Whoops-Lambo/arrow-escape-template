package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class az {
    public static final az a;
    public static final az b;
    public static final az c;
    public static final az d;
    public static final az e;
    public static final /* synthetic */ az[] f;

    static {
        az azVar = new az("CPU_ACQUIRED", 0);
        a = azVar;
        az azVar2 = new az("BLOCKING", 1);
        b = azVar2;
        az azVar3 = new az("PARKING", 2);
        c = azVar3;
        az azVar4 = new az("DORMANT", 3);
        d = azVar4;
        az azVar5 = new az("TERMINATED", 4);
        e = azVar5;
        f = new az[]{azVar, azVar2, azVar3, azVar4, azVar5};
    }

    public static az valueOf(String str) {
        return (az) Enum.valueOf(az.class, str);
    }

    public static az[] values() {
        return (az[]) f.clone();
    }
}
