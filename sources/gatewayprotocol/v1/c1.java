package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class c1 implements Internal.EnumVerifier {
    public static final c1 a = new c1();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        if (OperativeEventRequestOuterClass.OperativeEventType.forNumber(i) != null) {
            return true;
        }
        return false;
    }
}
