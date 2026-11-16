package androidx.constraintlayout.core.parser;

import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class CLParsingException extends Exception {
    private final String a;
    private final int b;
    private final String c;

    public String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.c);
        sb.append(" at line ");
        return nj.l(this.b, ")", sb);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + d();
    }
}
