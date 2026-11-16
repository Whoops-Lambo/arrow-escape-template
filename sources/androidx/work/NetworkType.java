package androidx.work;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/NetworkType;", "", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NetworkType {
    public static final NetworkType a;
    public static final NetworkType b;
    public static final NetworkType c;
    public static final NetworkType d;
    public static final NetworkType e;
    public static final NetworkType f;
    public static final /* synthetic */ NetworkType[] g;

    static {
        NetworkType networkType = new NetworkType("NOT_REQUIRED", 0);
        a = networkType;
        NetworkType networkType2 = new NetworkType("CONNECTED", 1);
        b = networkType2;
        NetworkType networkType3 = new NetworkType("UNMETERED", 2);
        c = networkType3;
        NetworkType networkType4 = new NetworkType("NOT_ROAMING", 3);
        d = networkType4;
        NetworkType networkType5 = new NetworkType("METERED", 4);
        e = networkType5;
        NetworkType networkType6 = new NetworkType("TEMPORARILY_UNMETERED", 5);
        f = networkType6;
        g = new NetworkType[]{networkType, networkType2, networkType3, networkType4, networkType5, networkType6};
    }

    public static NetworkType valueOf(String str) {
        return (NetworkType) Enum.valueOf(NetworkType.class, str);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) g.clone();
    }
}
