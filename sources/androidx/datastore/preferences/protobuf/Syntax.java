package androidx.datastore.preferences.protobuf;

import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public enum Syntax implements Internal.EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);

    public final int a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Syntax$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 implements Internal.EnumLiteMap<Syntax> {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class SyntaxVerifier implements Internal.EnumVerifier {
        @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            Syntax syntax;
            if (i == 0) {
                syntax = Syntax.SYNTAX_PROTO2;
            } else if (i != 1) {
                syntax = i != 2 ? null : Syntax.SYNTAX_EDITIONS;
            } else {
                syntax = Syntax.SYNTAX_PROTO3;
            }
            return syntax != null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        d.r("Can't get the number of an unknown enum value.");
        return 0;
    }

    Syntax(int i) {
        this.a = i;
    }
}
