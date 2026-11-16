package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public enum h82 {
    CORE("core"),
    VENDORS_DISCLOSED("vendorsDisclosed"),
    VENDORS_ALLOWED("vendorsAllowed"),
    PUBLISHER_TC("publisherTC");


    @NotNull
    public static final e82 Companion = new e82();
    public final String a;

    h82(String str) {
        this.a = str;
    }
}
