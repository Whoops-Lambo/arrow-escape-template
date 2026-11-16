package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class m1 implements Internal.EnumVerifier {
    public static final m1 a = new m1();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        if (TransactionEventRequestOuterClass.TransactionOrigin.forNumber(i) != null) {
            return true;
        }
        return false;
    }
}
