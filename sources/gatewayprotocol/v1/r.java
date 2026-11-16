package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class r implements Internal.EnumVerifier {
    public static final r a = new r();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        if (DiagnosticEventRequestOuterClass.DiagnosticAdType.forNumber(i) != null) {
            return true;
        }
        return false;
    }
}
