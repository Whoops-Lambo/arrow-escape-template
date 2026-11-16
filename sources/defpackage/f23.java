package defpackage;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public enum f23 {
    ACCEPT_ALL_SERVICES("onAcceptAllServices"),
    DENY_ALL_SERVICES("onDenyAllServices"),
    ESSENTIAL_CHANGE("onEssentialChange"),
    INITIAL_PAGE_LOAD("onInitialPageLoad"),
    NON_EU_REGION("onNonEURegion"),
    SESSION_RESTORED("onSessionRestored"),
    TCF_STRING_CHANGE("onTcfStringChange"),
    UPDATE_SERVICES("onUpdateServices");


    @NotNull
    public static final e23 Companion = new e23();
    public final String a;

    f23(String str) {
        this.a = str;
    }

    public final h23 d() {
        int iOrdinal = ordinal();
        h23 h23Var = h23.b;
        h23 h23Var2 = h23.a;
        switch (iOrdinal) {
            case 0:
            case 1:
                return h23Var2;
            case 2:
            case 3:
            case 4:
            case 5:
                return h23Var;
            case 6:
            case 7:
                return h23Var2;
            default:
                e.b();
                return null;
        }
    }
}
