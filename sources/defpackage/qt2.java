package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qt2 {

    @NotNull
    public static final pt2 Companion = new pt2();
    public final lt2 a;
    public final lt2 b;
    public final lt2 c;
    public final lt2 d;
    public final lt2 e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt2)) {
            return false;
        }
        qt2 qt2Var = (qt2) obj;
        return this.a.equals(qt2Var.a) && this.b.equals(qt2Var.b) && this.c.equals(qt2Var.c) && this.d.equals(qt2Var.d) && this.e.equals(qt2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "UCButtonTheme(acceptAll=" + this.a + ", denyAll=" + this.b + ", manage=" + this.c + ", save=" + this.d + ", ok=" + this.e + ")";
    }

    public qt2(lt2 lt2Var, lt2 lt2Var2, lt2 lt2Var3, lt2 lt2Var4, lt2 lt2Var5) {
        this.a = lt2Var;
        this.b = lt2Var2;
        this.c = lt2Var3;
        this.d = lt2Var4;
        this.e = lt2Var5;
    }
}
