package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class mt0 {
    public static final /* synthetic */ mt0[] a = {new mt0("APP_USERS", 0), new mt0("APP_NON_USERS", 1), new mt0("EVERYBODY", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    mt0 EF5;

    public static mt0 valueOf(String str) {
        return (mt0) Enum.valueOf(mt0.class, str);
    }

    public static mt0[] values() {
        return (mt0[]) a.clone();
    }
}
